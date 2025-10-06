/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author Lorenzo Zoboli
 */
public abstract class Participante {
    private String nome;
    private int idade;

    public Participante(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }
    
    public float calcularDesempenho(){
        throw new IllegalArgumentException();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
