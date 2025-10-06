/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorenzo Zoboli
 */
public class App {
    
    public static void main(String[] args) {
        String caminho = "C:\\Users\\zobol\\Downloads\\participantes.csv\\";
    
        ImportadorParticipante ip = new ImportadorParticipante(caminho);
        
        System.out.println(ip.getParticipanteMaiorDesempenho().calcularDesempenho());
    }
}
