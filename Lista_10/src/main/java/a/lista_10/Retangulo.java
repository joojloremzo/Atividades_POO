/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_10;

/**
 *
 * @author zobol
 */
public class Retangulo extends Figura{
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        setAltura(altura);
        setBase(base);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return altura * base;
    }
}
