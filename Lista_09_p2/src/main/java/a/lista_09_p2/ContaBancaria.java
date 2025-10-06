/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.lista_09_p2;

import java.util.ArrayList;

/**
 *
 * @author zobol
 */
public class ContaBancaria {
    private Cliente titular;
    private String numero;
    private double saldo;
    private ArrayList<Movimento> listaMovimentos;
    
    public ContaBancaria(String numero, double saldo, Cliente titular) {
        setTitular(titular);
        setNumero(numero);
        setSaldo(saldo);
        
        listaMovimentos = new ArrayList();
    }

    public ArrayList<Movimento> getMovimentos() {
        return listaMovimentos;
    }

    protected void incluirMovimentos(Movimento m) {
        listaMovimentos.add(m);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor Inválido!");
        }
        saldo = saldo + valor;
        
        Movimento movimento = new Movimento(TipoMovimento.CREDITO,valor);
        incluirMovimentos(movimento);
        
    }
    
    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            throw new IllegalArgumentException("Valor não pode ser maior que o saldo da conta");
        }
        saldo = saldo - valor;
        
        Movimento movimento = new Movimento(TipoMovimento.DEBITO,valor);
        incluirMovimentos(movimento);
    }
    
    public void transferir(ContaBancaria conta2, double valor) {
        this.sacar(valor);
        conta2.depositar(valor);
    }
}
