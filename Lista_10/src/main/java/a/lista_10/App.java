/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_10;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(5);
        Retangulo r = new Retangulo(4,5);
        Triangulo t = new Triangulo(4,4,4);
        Circulo c = new Circulo(5);
        
        System.out.println(q.calcularArea());
        System.out.println(r.calcularArea());
        System.out.println(t.calcularArea());
        System.out.println(c.calcularArea());
    }
}
