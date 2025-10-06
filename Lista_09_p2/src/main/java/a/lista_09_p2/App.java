/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_09_p2;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rua Exemplo 999", "Nome Exemplo");
        
        ContaBancaria conta1 = new ContaBancaria("11223-4", 450, cliente);
        
        conta1.depositar(450);
        conta1.sacar(200);
        conta1.depositar(300);
        
        System.out.println("Movimentações da conta: " + conta1.getMovimentos().get(1).getTipoMovimento());
    }
}