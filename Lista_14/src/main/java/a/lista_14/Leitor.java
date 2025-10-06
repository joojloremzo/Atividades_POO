/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zobol
 */
public class Leitor {
    private BufferedReader reader;
    private FileReader fr;
    private int maiorPop;
    private int menorPop;

    public Leitor(String caminho) {
        try {
            fr = new FileReader(caminho);
            reader = new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void lerArquivo(){
        try {
            int linhaAtual = 0;
            
            String linha = reader.readLine();
            
            int populacao = 0;
            
            this.setMaiorPop(Integer.MIN_VALUE);
            this.setMenorPop(Integer.MAX_VALUE);
            
            while((linha = reader.readLine()) != null) {
                
                if (linha.trim().isEmpty()) {
                    continue;
                }
                
                String[] colunas = linha.split(";");
                
                populacao = Integer.parseInt(colunas[3]);
                
                if (populacao > this.getMaiorPop()) {
                    this.setMaiorPop(populacao);
                }
                
                if (populacao < this.getMenorPop()) {
                    this.setMenorPop(populacao);
                }
                
                System.out.println("\nLinha " + (linhaAtual + 1) + ": ");
                for (int i = 0; i < colunas.length; i++) {
                    System.out.println("Coluna: " + colunas[i].trim());
                }
            linhaAtual += 1;
            
            }
        } catch (IOException ex) {
            Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        try {
            if (reader != null) reader.close();
            if (fr != null) fr.close();
        } catch (IOException ex) {
            Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

    public int getMaiorPop() {
        return maiorPop;
    }

    public void setMaiorPop(int maiorPop) {
        this.maiorPop = maiorPop;
    }

    public int getMenorPop() {
        return menorPop;
    }

    public void setMenorPop(int menorPop) {
        this.menorPop = menorPop;
    }
    
}
