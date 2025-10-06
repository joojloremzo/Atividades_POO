/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_08.model;

/**
 *
 * @author zobol
 */
public class Professor {
    private String nome;
    private String email;
    private Titulacao titulacao;

    public Professor(String nome, String email, Titulacao titulacao) {
        setEmail(email);
        setNome(nome);
        setTitulacao(titulacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }
}
