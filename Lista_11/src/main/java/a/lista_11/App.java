/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_11;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        Contas contas = new Contas();

        // Adicionando diversas contas
        contas.incluirConta(new ContaAgua(10, 5.0));       // 10 m³ * R$ 5,00 = R$ 50,00
        contas.incluirConta(new MensalidadeEnsino(4, 300.0)); // 4 créditos * R$ 300,00 = R$ 1200,00
        contas.incluirConta(new PrevidenciaPrivada(200.0));   // Valor fixo = R$ 200,00

        // Calculando e exibindo o total das contas
        double total = contas.calcularTotalContas();
        System.out.println("Valor total das contas: R$ " + total);

        // Exibindo detalhes de cada conta
        System.out.println("\nDetalhes das contas:");
        for (Pagavel conta : contas.getContas()) {
            System.out.println("- " + conta.getClass().getSimpleName() + ": R$ " + conta.calcularValorPagar());
            
            // Se for PrevidenciaPrivada, exibe o saldo
            if (conta instanceof PrevidenciaPrivada) {
                PrevidenciaPrivada previdencia = (PrevidenciaPrivada) conta;
                System.out.println("  Saldo do investimento: R$ " + previdencia.getInvestimento().getSaldo());
            }
        }
    }
}
