/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 * Essa classe representa uma receita financeira, ela herda da classe lancamento
 * 
 * @author Lorenzo Zoboli, Henrique Horn Lenzi, Vinícius Mafezzoli Simplício
 */
public class Receita extends Lancamento{
    private CategoriaReceita categoriaReceita;

    /**
     * Construtor da classe, ele inicia uma receita com data, valor e categoria
     * 
     * @param data Data do recebimento, herdado de lancamento
     * @param valor Valor recebido, herdado do lancamento
     * @param categoriaReceita Categoria da receita
     */
    public Receita(LocalDate data, double valor, CategoriaReceita categoriaReceita) {
        super(data, valor);
        setCategoriaReceita(categoriaReceita);
    }

    /**
     * Retorna a categoria da receita
     * 
     * @return Categoria da receita
     */
    public CategoriaReceita getCategoriaReceita() {
        return categoriaReceita;
    }

    /**
     * Define a categorai da receita
     * 
     * @param categoriaReceita Nova cagetoria da receita
     */
    public void setCategoriaReceita(CategoriaReceita categoriaReceita) {
        if (categoriaReceita == null) {
            throw new IllegalArgumentException("A categoria não pode ser nula!");
        }
        this.categoriaReceita = categoriaReceita;
    }
}