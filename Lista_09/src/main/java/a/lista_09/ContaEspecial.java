/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_09;

/**
 *
 * @author zobol
 */
public class ContaEspecial extends ContaBancaria{
    private double limiteCredito;
    
    public ContaEspecial(String numero, double saldo, Cliente titular, double limiteCredito) {
        super(numero,saldo,titular);
        setLimiteCredito(limiteCredito);
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    @Override
    public void sacar(double valor) {
        if (valor <= 0 || valor > (super.getSaldo()+limiteCredito)) {
            throw new IllegalArgumentException("Valor Inválido");
        }
        super.setSaldo(super.getSaldo()-valor);
    }
}
