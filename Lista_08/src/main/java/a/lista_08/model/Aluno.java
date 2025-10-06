/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_08.model;

/**
 *
 * @author zobol
 */
public class Aluno {
    private int matricula;
    private String nome;
    private double notaEnem;

    public Aluno(int matricula, String nome, double notaEnem) {
        setMatricula(matricula);
        setNome(nome);
        setNotaEnem(notaEnem);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0) {
            throw new IllegalArgumentException("Matrícula inválida!");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        if (notaEnem <= 0) {
            throw new IllegalArgumentException("Nota inválida!");
        }
        this.notaEnem = notaEnem;
    }
    
}
