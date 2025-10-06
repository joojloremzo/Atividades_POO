/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *Classe que representa uma despesa financeira, herda da classe lançamento
 * 
 * @author Lorenzo Zoboli, Henrique Horn Lenzi, Vinícius Mafezzoli Simplício
 */
public class Despesa extends Lancamento {
    private CategoriaDespesa categoriaDespesa;

    /**
     * Construtor da classe despesa, ele inicia uma despesa com data, valor e categoria
     * 
     * @param data Data da despesa(herda de lançamento)
     * @param valor Valor da despesa (herda de lançamento tbm)
     * @param categoriaDespesa Categoria da despesa
     */
    public Despesa(LocalDate data, double valor, CategoriaDespesa categoriaDespesa) {
        super(data, valor);
        setCategoriaDespesa(categoriaDespesa);
    }

    /**
     * Retorna a categoria da despesa
     * 
     * @return categoria da despesa
     */
    public CategoriaDespesa getCategoriaDespesa() {
        return categoriaDespesa;
    }

    /**
     * Define a categoria da despesa(não podendo ser nulo)
     * 
     * @param categoriaDespesa Nova categoria de despesa
     */
    public void setCategoriaDespesa(CategoriaDespesa categoriaDespesa) {
        if (categoriaDespesa == null) {
            throw new IllegalArgumentException("A categoria não pode ser nula!");
        }
        this.categoriaDespesa = categoriaDespesa;
    }
}
