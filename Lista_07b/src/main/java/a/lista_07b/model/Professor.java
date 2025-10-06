/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_07b.model;

/**
 *
 * @author zobol
 */
public class Professor {
    private String nome;
    private Titulacao titulacao;

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome Invalido");
        }
        this.nome = nome;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        if (titulacao == null) {
            throw new IllegalArgumentException("Titulacao Nula");
        }
        this.titulacao = titulacao;
    }
    
    
}