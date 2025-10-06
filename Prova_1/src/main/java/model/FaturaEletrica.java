/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zobol
 */

//LORENZO ZOBOLI

public class FaturaEletrica {
    String titular;
    Consumidor consumidor;
    int kWhMes;
   
    /**
     * contrutor de objeto
     * @param titular nome do titular da fatura
     * @param consumidor tipo de estabelecimento a ser cobrado
     * @param kWhMes consumo mensal em kW/h
     */
    public FaturaEletrica(String titular, Consumidor consumidor, int kWhMes) {
        setTitular(titular);
        setConsumidor(consumidor);
        setKWhMes(kWhMes);
    }
    
    /**
     * método setter para a variável titular
     * @param titular String
     */
    
    public void setTitular(String titular) {
        if (titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Titular inválido");
        }
        this.titular = titular;
    }
    
    /**
     * método getter da variavel titular
     * @return String
     */
    
    public String getTitular() {
        return this.titular;
    }
    
    /**
     * método setter para o tipo de estabelecimento com base no enum Consumidor
     * @param consumidor Consumidor
     */
    
    public void setConsumidor(Consumidor consumidor) {
        if ((consumidor == Consumidor.COMERCIAL || consumidor == Consumidor.INDUSTRIAL || consumidor == Consumidor.RESIDENCIAL) == false) {
            throw new IllegalArgumentException("Consumidor nulo!");
        }
        this.consumidor = consumidor;
    }
    
    /**
     * método getter para o tipo do estabelecimento
     * @return Consumidor
     */
    
    public Consumidor getConsumidor() {
        return this.consumidor;
    }
    
    /**
     * método setter para o consumo mensal
     * @param kWhMes int
     */
    
    public void setKWhMes(int kWhMes) {
        if (kWhMes < 0) {
            throw new IllegalArgumentException("Consumo inválido!");
        }
        this.kWhMes = kWhMes;
    }
    
    /**
     * método getter para o consumo mensal
     * @return int
     */
    
    public int getKWhMes() {
        return this.kWhMes;
    }
    
    /**
     * método que calcula a fatura do titular
     * @return int
     */
    
    public double calcularFatura() {
        if (consumidor == Consumidor.INDUSTRIAL) {
            return kWhMes * 0.85;
        }
        if (consumidor == Consumidor.COMERCIAL) {
            if (kWhMes > 800) {
                double valorFatura = 800 * 0.75;
                kWhMes -= 800;
                valorFatura += kWhMes * 1;
                return valorFatura;
            }
            else {
                return kWhMes * 0.75;
            }
        }
        
        else {
            if (kWhMes > 200) {
                double valorFatura = 200 * 0.5;
                kWhMes -= 200;
                valorFatura += kWhMes * 0.75;
                return valorFatura;
            }
            else {
                return kWhMes * 0.5;
            }
        }   
    }
    
    
}
