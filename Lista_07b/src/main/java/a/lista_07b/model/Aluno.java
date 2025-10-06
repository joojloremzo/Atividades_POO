/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_07b.model;

/**
 *
 * @author zobol
 */
public class Aluno {
        private String nome;
        private int matricula;
        
    public Aluno(String nome,int matricula) {
        setNome(nome);
        setMatricula(matricula);
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula < 0) {
            throw new IllegalArgumentException("Matricula Invalida");
        }
        this.matricula = matricula;
    }
}
