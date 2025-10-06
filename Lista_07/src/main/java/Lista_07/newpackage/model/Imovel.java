/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lista_07.newpackage.model;

/**
 *
 * @author zobol
 */
public class Imovel {

    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

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
        if (area <= 0) {
            throw new IllegalArgumentException("AAAAAAAAAAAAAAAAAA");
        }
        this.area = area;
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
        if (finalidade == null) {
            throw new IllegalArgumentException("AAAAAAAAAAAAAAAA");
        }
        this.finalidade = finalidade;
    }
    
    public double calcularIptu() {
        
        setArea(area);
        setEndereco(endereco);
        setBairro(bairro);
        setFinalidade(finalidade);
        
        switch (finalidade) {
            case RESIDENCIAL:
                return calculoResidencial();
            case COMERCIAL:
                return calculoComercial();
            case INDUSTRIAL:
                return calculoIndustrial();
        }
        return calculoIndustrial();
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
