/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 * Representa um item do extrato, contendo informações das contas 
 * 
 * @author Lorenzo Zoboli, Henrique Horn Lenzi, Vinícius Mafezzoli Simplício
 */
public class ItemExtrato {
    private LocalDate data;
    private String categoria;
    private double valor;
    private String tipo;
    private double saldoAcumulado;

    /**
     * Retorna a data que foi gerado o extrato
     * 
     * @return LocalDate com a data do extrato
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Define a data do extrato
     * 
     * @param data nova data definada para o extrato
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Retorna a categoria do extrato
     * 
     * @return String com a categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do extrato
     * 
     * @param categoria Nova categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Retorna o valor do extrato
     * 
     * @return double com o valor do extrato
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define um novo valor de extrato
     * 
     * @param valor Novo valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Retorna o tipo do extrato
     * 
     * @return String do tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define um novo tipo de extrato
     * 
     * @param tipo Novo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna um saldo acumlado após extrato
     * 
     * @return o Saldo acumulado
     */
    public double getSaldoAcumulado() {
        return saldoAcumulado;
    }

    /**
     * Define um novo saldo acumulado do extrato
     * 
     * @param saldoAcumulado Novo saldo
     */
    public void setSaldoAcumulado(double saldoAcumulado) {
        this.saldoAcumulado = saldoAcumulado;
    }

    /**
     * Construtor da classe, cria um item de extrato
     * 
     * @param data Data do extrato
     * @param categoria Categoria do extrato
     * @param valor Valor do extrato
     * @param tipo Tipo do extrato
     * @param saldoAcumulado Saldo após extrato
     */
    public ItemExtrato(LocalDate data, String categoria, double valor, String tipo, double saldoAcumulado) {
        this.setData(data);
        this.setCategoria(categoria);
        this.setValor(valor);
        this.setTipo(tipo);
        this.setSaldoAcumulado(saldoAcumulado);
    }
    
    
}
