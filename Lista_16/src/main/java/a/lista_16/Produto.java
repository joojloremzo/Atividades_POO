/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.lista_16;

/**
 *
 * @author zobol
 */
public class Produto {
    private String nome;
    private double valor;
    
    public Produto(String nome, double valor) {
        setNome(nome);
        setValor(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
