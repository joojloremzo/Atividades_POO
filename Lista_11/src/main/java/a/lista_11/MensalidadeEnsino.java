/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_11;

/**
 *
 * @author zobol
 */
public class MensalidadeEnsino implements Pagavel{
    private int nrCreditos;
    private double precoCredito;

    public MensalidadeEnsino(int nrCreditos, double precoCredito) {
        setNrCreditos(nrCreditos);
        setPrecoCredito(precoCredito);
    }

    @Override
    public double calcularValorPagar() {
        return getNrCreditos() * getPrecoCredito();
    }

    public int getNrCreditos() {
        return nrCreditos;
    }

    public void setNrCreditos(int nrCreditos) {
        this.nrCreditos = nrCreditos;
    }

    public double getPrecoCredito() {
        return precoCredito;
    }

    public void setPrecoCredito(double precoCredito) {
        this.precoCredito = precoCredito;
    }
    
}
