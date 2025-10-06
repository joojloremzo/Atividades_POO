/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_01_Q2;

import java.util.Scanner;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Insira a altura: ");
        pessoa.altura = sc.nextDouble();
        
        System.out.println("Insira o peso: ");
        pessoa.peso = sc.nextDouble();
        
        System.out.println("Imc calculdado: " + pessoa.calcularImc());
        
        
    }
}
