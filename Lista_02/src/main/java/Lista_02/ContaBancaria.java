/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lista_02;

/**
 *
 * @author zobol
 */
public class ContaBancaria {

    String numero;
    String titular;
    double saldo;
    
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo!");
        }
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor < 0 || valor > this.saldo) {
            throw new IllegalArgumentException("Valor de saque inválido!");
        }
        this.saldo -= valor;
    }
    
    public void transferir(ContaBancaria conta,double valor) {
        sacar(valor);
        conta.depositar(valor);
    }
    
}
