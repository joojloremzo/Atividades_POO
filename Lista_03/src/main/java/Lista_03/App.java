/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_03;

import java.util.Scanner;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Funcionario[] funcionarios = new Funcionario[5];
        
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario();
            
            System.out.println("Nome: ");
            funcionarios[i].setNome(sc.next());
            
            System.out.println("Salário: ");
            funcionarios[i].setSalario(sc.nextDouble());
        }
        
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionario: " + funcionarios[i].getNome() +
                            " Salário: " + funcionarios[i].getSalario() +
                            "IRPF: " + funcionarios[i].calcularIrpf());
    }
            
        }
}