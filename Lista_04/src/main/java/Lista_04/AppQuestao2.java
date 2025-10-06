/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_04;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author zobol
 */
public class AppQuestao2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Retangulo retangulo = new Retangulo();
        
        System.out.println("Altura: ");
        retangulo.setAltura(sc.nextInt());
        
        System.out.println("Comprimento: ");
        retangulo.setComprimento(sc.nextInt());
        
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        System.out.println("Área: " + retangulo.calcularArea());
        
        sc.close();
    }
}
