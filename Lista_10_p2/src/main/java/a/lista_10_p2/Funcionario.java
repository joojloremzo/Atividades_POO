/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_10_p2;

/**
 *
 * @author zobol
 */
public class Funcionario {
    private String nome;
    private double salarioBase;
    
    

    public Funcionario(String nome, double salarioBase) {
        setNome(nome);
        setSalarioBase(salarioBase);
    }
    public double calcularSalario(){
        return getSalarioBase();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
