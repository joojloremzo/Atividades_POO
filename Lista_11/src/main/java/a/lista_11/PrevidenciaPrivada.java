/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_11;

/**
 *
 * @author zobol
 */
public class PrevidenciaPrivada implements Pagavel {
    private double valor;
    private Investimento investimento;

    public PrevidenciaPrivada(double valor) {
        setValor(valor);
        
        investimento = new Investimento();
    }
    
    @Override
    public double calcularValorPagar() {
        return this.valor;
    }
    
    public void investir() {
        investimento.setSaldo(investimento.getSaldo() + this.valor);    
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Investimento getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Investimento investimento) {
        this.investimento = investimento;
    }
}
