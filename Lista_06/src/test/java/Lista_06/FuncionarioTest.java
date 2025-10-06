/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Lista_06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }

    @Test
    public void testeFaixa3() {
        double salario = 3000;
        Funcionario funcionario = new Funcionario("nome",salario);
        
        FaixaIrpf esperado = FaixaIrpf.TERCEIRA;
        
        FaixaIrpf resultado = funcionario.identificarFaixaIrpf();
        
        assertEquals(esperado,resultado);
    }
    
    
}
