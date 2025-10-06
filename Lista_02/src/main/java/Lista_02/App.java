/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_02;

import java.util.Scanner;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String aux;
        
        ContaBancaria conta1 = new ContaBancaria();
        
        System.out.println("Número da conta: ");
        aux = sc.next();
        conta1.setNumero(aux);
        
        System.out.println("Titular da conta: ");
        aux = sc.next();
        conta1.setTitular(aux);
        
        ContaBancaria conta2 = new ContaBancaria();
        
        System.out.println("Número da conta: ");
        aux = sc.next();
        conta2.setNumero(aux);
        
        System.out.println("Titular da conta: ");
        aux = sc.next();
        conta2.setTitular(aux);
        
        conta1.depositar(1000);
        conta1.depositar(700);
        
        conta2.depositar(5000);
        
        conta2.sacar(3000);
        
        conta2.transferir(conta1 , 1800);
        
        System.out.println("Titular: " + conta1.getTitular() + " Saldo: " + conta1.getSaldo());
        System.out.println("Titular: " + conta2.getTitular() + " Saldo: " + conta2.getSaldo());
    }
}
