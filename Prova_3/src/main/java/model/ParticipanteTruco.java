/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lorenzo Zoboli
 */
public class ParticipanteTruco extends Participante{
    private double blefe;
    private double ponto;
    private double manilha;

    public ParticipanteTruco(double blefe, double ponto, double manilha, String nome, int idade) {
        super(nome,idade);
        setBlefe(blefe);
        setManilha(manilha);
        setPonto(ponto);
    }
    
    @Override
    public float calcularDesempenho() {
        double desempenho = this.getPonto() + (this.getBlefe() * 4);
        return (float) desempenho;
    }

    public double getBlefe() {
        return blefe;
    }

    public void setBlefe(double blefe) {
        this.blefe = blefe;
    }

    public double getPonto() {
        return ponto;
    }

    public void setPonto(double ponto) {
        this.ponto = ponto;
    }

    public double getManilha() {
        return manilha;
    }

    public void setManilha(double manilha) {
        this.manilha = manilha;
    }
    
    
}
