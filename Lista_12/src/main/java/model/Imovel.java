/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author zobol
 */
public class Imovel {

    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public Imovel(String endereco, int area, Bairro bairro, Finalidade finalidade) {
        setEndereco(endereco);
        setArea(area);
        setBairro(bairro);
        setFinalidade(finalidade);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("AAAAAAAAAAAAAAAAAA");
        }
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        try {
            if (area <= 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException excecao) {
            System.out.println("Valor inválido, a área não pode ser negativa ou igual a 0!");
        }
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        if (bairro == null) {
            throw new IllegalArgumentException("AAAAAAAAAAAAAAAAAAA");
        }
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    
    public double calcularIptu() {
        
        try {
            switch (getFinalidade()) {
            case Finalidade.RESIDENCIAL -> {
                return calculoResidencial();
                }
            case Finalidade.COMERCIAL -> {
                return calculoComercial();
                }
            case Finalidade.INDUSTRIAL -> {
                return calculoIndustrial();
                }
            case null -> {
                throw new NullPointerException();
            }
        }
        } catch (NullPointerException excecao) {
            System.out.println("A finalidade não foi definida!");
            return 0;
        }
    }
    
    private double calculoResidencial() {
        return area * bairro.getCoeficienteIptu();
    }
    
    private double calculoComercial() {
        if (area < 100) {
            return 500* bairro.getCoeficienteIptu();
        }
        
        if (area <= 400) {
            return 1000 * bairro.getCoeficienteIptu();
        }
        
        return (area * 2.55) * bairro.getCoeficienteIptu();
    }
    
    private double calculoIndustrial() {
        if (area <= 2000) {
            return 1000 * bairro.getCoeficienteIptu();
        }
        return (area * 0.55) * bairro.getCoeficienteIptu();
    }
    
    
    
}
