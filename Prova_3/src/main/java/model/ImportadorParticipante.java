/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorenzo Zoboli
 */
public class ImportadorParticipante {
    private ArrayList<Participante> participantes;
    private String caminhoArquivo;
    
    public ImportadorParticipante(String caminhoArquivo) {
        participantes = new ArrayList();
        setCaminhoArquivo(caminhoArquivo);
        
        try {
            FileReader fr = new FileReader(caminhoArquivo);
            BufferedReader reader = new BufferedReader(fr);
            
            String linha;
            
            try {
                while ((linha = reader.readLine()) != null) {
                    
                    String[] coluna = linha.split(",");
                    
                    String modalidade = coluna[0].trim();
                    String nome = coluna[1];
                    int idade = Integer.parseInt(coluna[2].trim());
                    
                    if (modalidade.equals("S")) {
                        int encacapadas = Integer.parseInt(coluna[3].trim());
                        int penalidades = Integer.parseInt(coluna[4].trim());
                        
                        Participante p = new ParticipanteSinuca(nome,idade,penalidades,encacapadas);
                        incluirParticipante(p);
                    }
                    if (modalidade.equals("T")) {
                        double blefe = Double.parseDouble(coluna[3].trim());
                        double pontos = Double.parseDouble(coluna[4].trim());
                        double manilhas = Double.parseDouble(coluna[5].trim());
                        
                        Participante p = new ParticipanteTruco(blefe,pontos,manilhas,nome,idade);
                        incluirParticipante(p);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ImportadorParticipante.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportadorParticipante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Participante getParticipanteMaisJovem() {
        int menorIdade = Integer.MAX_VALUE;
        
        for (Participante p : participantes) {
            if (p.getIdade() < menorIdade) {
                menorIdade = p.getIdade();
            }    
        }
        
        for (Participante p : participantes) {
            if (p.getIdade() == menorIdade) {
                return p;
            }
        }
        throw new IllegalArgumentException("aaaaaa");
    }
    
    public Participante getParticipanteMaiorDesempenho() {
        double maiorDesempenho = Integer.MIN_VALUE;
        
        for (Participante p: participantes) {
            if (p.calcularDesempenho() > maiorDesempenho) {
                maiorDesempenho = p.calcularDesempenho();
            }
        }
        
        for (Participante p : participantes) {
            if (p.calcularDesempenho() == maiorDesempenho) {
                return p;
            }
        }
        throw new IllegalArgumentException("aaaaaa");
    }
    
    public void incluirParticipante(Participante p) {
        getParticipantes().add(p);
    }
    
    public void removerParticipante(Participante p) {
        getParticipantes().remove(p);
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public String getCaminhoArquivo() {
        return caminhoArquivo;
    }

    public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }
}
