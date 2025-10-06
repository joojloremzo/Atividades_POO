/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.lista_12b;

import java.util.Scanner;

/**
 *
 * @author zobol
 */
public class Teclado {
    private Scanner sc;

    public Teclado() {
        sc = new Scanner(System.in);
    }
    
    public String lerString() {
        System.out.println("Insira o dado:");
        String entrada = sc.next();
        
        return "É uma string" + entrada;
    }
    
    public int lerInt() {
        
        while (true) {
            System.out.print("Insira o dado: ");
            String entrada = sc.next();
            
            try {
                int retorno = Integer.parseInt(entrada);
                System.out.println("O valor digitado é válido!");
                return retorno;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, favor digitar novamente!");
            }
        }
    }
    
    public double lerDouble() {
        
        while (true) {
            System.out.print("Insira o dado: ");
            String entrada = sc.next();
            
            try {
                double retorno = Double.parseDouble(entrada);
                System.out.println("O valor digitado é válido!");
                return retorno;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, favor digitar novamente!");
            }
        }
    }
    
    public boolean lerBoolean() {
        
        while (true) {
            System.out.println("Insira o dado: ");
            String entrada = sc.next();
            try {
                if ((entrada.equalsIgnoreCase("s")) || (entrada.equalsIgnoreCase("sim")) || (entrada.equalsIgnoreCase("verdadeiro")) || (entrada.equalsIgnoreCase("positivo"))) {
                    System.out.println("Entrada válida! " + entrada);
                    return true;
                }
                else if ((entrada.equalsIgnoreCase("n")) || (entrada.equalsIgnoreCase("nao")) || (entrada.equalsIgnoreCase("falso")) || (entrada.equalsIgnoreCase("negativo"))) {
                    System.out.println("Entrada válida! " + entrada);
                    return false;
                }
                else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada inválida, favor digitar novamente!");
            }
        }
    }
    
    
}
