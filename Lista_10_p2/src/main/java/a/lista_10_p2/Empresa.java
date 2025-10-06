/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.lista_10_p2;

import java.util.ArrayList;

/**
 *
 * @author zobol
 */
public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    
    public double calcularCustosSalarios() {
        double totalSalarios = 0;
        
        for (int i = 0; i < funcionarios.size(); i++) {
            totalSalarios += funcionarios.get(i).calcularSalario();
        }
        
        return totalSalarios;
    }

    public Empresa(String nome) {
        setNome(nome);
        
        
        funcionarios = new ArrayList();
    }
    
    public void removerFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public void incluirFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
