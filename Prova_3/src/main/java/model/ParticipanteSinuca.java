/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lorenzo Zoboli
 */
public class ParticipanteSinuca extends Participante{
    private int penalidades;
    private int encacapadas;
    
    public ParticipanteSinuca(String nome, int idade, int penalidades, int encacapadas) {
        super(nome, idade);
        setEncacapadas(encacapadas);
        setPenalidades(penalidades);
    }
    
    @Override
    public float calcularDesempenho() {
        double desempenho = getEncacapadas() / getPenalidades();
        
        return (float) desempenho;
    }

    public int getPenalidades() {
        return penalidades;
    }

    public void setPenalidades(int penalidades) {
        this.penalidades = penalidades;
    }

    public int getEncacapadas() {
        return encacapadas;
    }

    public void setEncacapadas(int encacapadas) {
        this.encacapadas = encacapadas;
    }
    
    
}
