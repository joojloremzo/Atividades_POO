/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_12b;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) { 
        
        Teclado teclado = new Teclado();
        
        System.out.println(teclado.lerString());
        System.out.println(teclado.lerInt());
        System.out.println(teclado.lerDouble());
        System.out.println(teclado.lerBoolean());
        
    }
}