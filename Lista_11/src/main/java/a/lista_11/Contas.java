/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.lista_11;

import java.util.ArrayList;

/**
 *
 * @author zobol
 */
public class Contas {
    private ArrayList<Pagavel> contas;
    private Pagavel conta;

    public Contas() {
        contas = new ArrayList();
    }
    
    public double calcularTotalContas() {
        
        double valorTotal = 0;
        
        for (Pagavel p : contas)
            if (p instanceof ContaAgua) {
                valorTotal += p.calcularValorPagar();
            }
            else if (p instanceof MensalidadeEnsino) {
                valorTotal += p.calcularValorPagar();
            }
            else if (p instanceof PrevidenciaPrivada) {
                valorTotal += p.calcularValorPagar();
            }
        
        return valorTotal;
    
    }
    
    public void incluirConta(Pagavel conta) {
        contas.add(conta);
    }
    
    public ArrayList<Pagavel> getContas() {
        return contas;
    }
    
    
}
