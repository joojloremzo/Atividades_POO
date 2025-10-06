/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_04;

import java.util.Scanner;

/**
 *
 * @author zobol
 */
public class AppQuestao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Altura: ");
        int altura = sc.nextInt();
        
        System.out.println("Comprimento: ");
        int comprimento = sc.nextInt();
        
        Retangulo retangulo = new Retangulo(altura,comprimento);
        
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        System.out.println("Área: " + retangulo.calcularArea());
        
        sc.close();
    }
}
