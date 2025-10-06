/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_09;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Reginaldo Souza","Rua de Exemplo 745");
        Cliente cliente2 = new Cliente("Exemplo do Crédito de Moraes", "Rua de Exemplo2 1089");
        
        ContaBancaria titular = new ContaBancaria("1123-5",1000.67,cliente);
        ContaEspecial titular2 = new ContaEspecial("1234-6",1000,cliente2,1000);
        
        titular.sacar(1000);
        titular2.sacar(2000);
        
        System.out.println("Saldo cliente comum: " + titular.getSaldo());
        System.out.println("Saldo cliente especial: " + titular2.getSaldo());
    }
}
