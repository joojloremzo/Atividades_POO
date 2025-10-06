/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.lista_13;

import java.io.File;

/**
 *
 * @author zobol
 */
public class Questão1 {
    
    public static long calcularTamanho(File a) {
        long soma = 0;
        if (a.isFile()) {
            return a.length();
        }
        if (a.isDirectory()) {
            for (File arquivo : a.listFiles()) {
                soma += calcularTamanho(arquivo);
            }
        }
        return soma;
    }
    
    public static void main(String[] args) {
        
        File arquivo = new File("C:\\Users\\zobol\\OneDrive\\Área de Trabalho\\PHILIPS Desenvolve\\ATV JAVASCRIPT\\exercício_Lorenzo_Zoboli\\exercício_Lorenzo_Zoboli");
    
        long calcularTamanho = calcularTamanho(arquivo);
        System.out.println(calcularTamanho);
    }
}
