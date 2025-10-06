/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *Classe abstrata que representa um lançamento financeiro de banco
 * 
 * @author Lorenzo Zoboli, Henrique Horn Lenzi, Vinícius Mafezzoli Simplício
 */
public abstract class Lancamento {
    private LocalDate data;
    private double valor;
    private Enum categoria;

    /**
     * Define a categoria do lançamento
     * 
     * @return Enum representando a categoria do lançamento
     */
    public Enum getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do lançamento
     * 
     * @param categoria Nova categoria, não pode ser nula
     */
    public void setCategoria(Enum categoria) {
        if(categoria == null){
            throw new IllegalArgumentException("Categoria invalida!");
        }
        this.categoria = categoria;
    }

    /**
     * Construtor da classe, ele cria um lançamento com data e valor
     * 
     * @param data Data do lançamento
     * @param valor Valor do lançamento(deve ser positivo)
     */
    public Lancamento(LocalDate data, double valor) {
        setData(data);
        setValor(valor);
    }

    /**
     * Retorna a data do lançamento
     * 
     * @return LocalDate com a data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data do lançamento
     * 
     * @param data Nova data, trata data null
     */
    public void setData(LocalDate data) {
        try {
            this.data = data;
        } catch (Exception e) {
            this.data = null;
            System.out.println("Data Inválida!");
        }
    }

    /**
     * Retorna o valor do lançamento
     * 
     * @return Double com o valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor do lançamento
     * 
     * @param valor Novo valor, deve ser positivo
     */
    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saldo inválido!");
        }
        this.valor = valor;
    }
}
