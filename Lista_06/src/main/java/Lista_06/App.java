/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_06;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Joao",3000);
        
        
        System.out.println("IRPF: " + funcionario.calcularIrpf());
        
    }
}
