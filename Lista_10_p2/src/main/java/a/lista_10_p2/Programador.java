/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_10_p2;

import java.util.ArrayList;

/**
 *
 * @author zobol
 */
public class Programador extends Funcionario{
    private ArrayList<String> linguagens;
        
    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
        
        linguagens = new ArrayList();
    }
    
    @Override
    public double calcularSalario() {
        
        double salario = 0;
        boolean isJava = false;
        
        for (int i = 0; i < linguagens.size(); i++) {
            if (linguagens.get(i).equals("Java")) {
                isJava = true;
            }
        }
        if (isJava) {
            salario = super.getSalarioBase() * 1.2;
        }
        else {
            salario = getSalarioBase();
        }
        
        return salario;
    }
    
    
    public void incluirLinguagens(String linguagem) {
        linguagens.add(linguagem);
    }
    
    public void removerLinguagem(String linguagem) {
        linguagens.remove(linguagem);
    }

    public ArrayList<String> getLinguagens() {
        return linguagens;
    }
        
    
}
