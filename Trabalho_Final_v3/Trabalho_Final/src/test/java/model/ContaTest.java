package model;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.MockedStatic;

public class ContaTest {
    private Conta conta;
    private File mockFile;
    private Receita receitaValida;
    private Despesa despesaValida;

    @BeforeEach
    void setUp() throws Exception {
        mockFile = mock(File.class);
        conta = new Conta("Titular Válido");
        receitaValida = new Receita(LocalDate.now(), 1000.0, CategoriaReceita.SALARIO);
        despesaValida = new Despesa(LocalDate.now(), 500.0, CategoriaDespesa.ALIMENTACAO);

        // Configuração do mock do arquivo
        when(mockFile.getPath()).thenReturn("caminho/ficticio/conta.csv");
        
        // Injeta o mockFile na instância de Conta usando reflexão
        Field fileField = Conta.class.getDeclaredField("file");
        fileField.setAccessible(true);
        fileField.set(conta, mockFile);
    }

    @Test
    void deveLancarExcecaoAoIncluirReceitaNula() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> conta.incluirReceita(null)
        );
        assertEquals("A receita não pode ser nula!", exception.getMessage());
    }

    @Test
    void deveAdicionarReceitaCorretamente() {
        conta.incluirReceita(receitaValida);
        assertFalse(conta.getReceitas().isEmpty());
    }

    @Test
    void deveRemoverReceitaCorretamente() {
        conta.incluirReceita(receitaValida);
        conta.removerReceita(receitaValida);
        assertTrue(conta.getReceitas().isEmpty());
    }

    @Test
    void deveLancarExcecaoAoRemoverReceitaNula() {
        assertThrows(
            IllegalArgumentException.class,
            () -> conta.removerReceita(null)
        );
    }

    @Test
    void deveEscreverDadosReceitaNoArquivo() throws IOException {
        try (MockedStatic<Files> mockedFiles = mockStatic(Files.class)) {
            BufferedWriter mockWriter = mock(BufferedWriter.class);
            
            mockedFiles.when(() -> Files.newBufferedWriter(any(Path.class), any(StandardOpenOption.class)))
                      .thenReturn(mockWriter);

            conta.escreverDadosReceita(receitaValida);

            verify(mockWriter).write(String.valueOf(receitaValida.getValor()) + ";");
            verify(mockWriter).write(receitaValida.getData().getDayOfMonth() + ";");
            verify(mockWriter).write("r;");
            verify(mockWriter).newLine();
            verify(mockWriter).close();
        }
    }

    @Test
    void deveCalcularSaldoTotalCorretamente() {
        conta.incluirReceita(receitaValida);
        conta.incluirDespesa(despesaValida);
        assertEquals(500.0, conta.calcularSaldoTotal());
    }

    @Test
    void saldoTotalDeveSerZeroSemLancamentos() {
        assertEquals(0.0, conta.calcularSaldoTotal());
    }
}