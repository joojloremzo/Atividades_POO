/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_01_Q3;

import Lista_01_Q2.*;

/**
 *
 * @author zobol
 */
public class Pessoa {
    
    double altura;
    double peso;
    
    public double calcularImc() {
        return peso / (altura * altura);
    }
    
}
