/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_01_Q3;

import java.util.Scanner;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3];
        
        for (int i = 0; i < 3; i++) {
            pessoas[i] = new Pessoa();
            
            System.out.println("Altura: ");
            pessoas[i].altura = sc.nextDouble();
            
            System.out.println("Peso: ");
            pessoas[i].peso = sc.nextDouble();
        }
        
        for (int i = 2; i >= 0; i--) {
            System.out.println("IMC calculado " + i + ": " + pessoas[i].calcularImc());            
        }
        
        sc.close();
    }
}
