/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_09_p2;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author zobol
 */
public class Movimento {
    private LocalDate data;
    private LocalTime hora;
    private TipoMovimento tipoMovimento;
    private double valor;

    public Movimento(TipoMovimento tipoMovimento, double valor) {
        setData();
        setHora();
        setTipoMovimento(tipoMovimento);
        setValor(valor);
    }

    public void setData() {
        this.data = LocalDate.now();
    }

    public void setHora() {
        this.hora = LocalTime.now();
    }

    public void setTipoMovimento(TipoMovimento tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

    public double getValor() {
        return valor;
    }
    
}
