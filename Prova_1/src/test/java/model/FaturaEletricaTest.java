/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */

//LORENZO ZOBOLI

public class FaturaEletricaTest {
    
    public FaturaEletricaTest() {
    }

    @org.junit.jupiter.api.Test
    public void testCalcularFatura1() {
        FaturaEletrica teste1 = new FaturaEletrica("Maria Joaquina",Consumidor.RESIDENCIAL,190);
        
        double resultado = teste1.calcularFatura();
        double esperado = 95;
        
        assertEquals(resultado , esperado);
    }
    
    @org.junit.jupiter.api.Test
    public void testCalcularFatura2() {
        FaturaEletrica teste1 = new FaturaEletrica("Homer Simpson",Consumidor.RESIDENCIAL,300);
        
        double resultado = teste1.calcularFatura();
        double esperado = 175;
        
        assertEquals(resultado , esperado);
    }
    
    @org.junit.jupiter.api.Test
    public void testCalcularFatura3() {
        FaturaEletrica teste1 = new FaturaEletrica("Ichiraku Ramen",Consumidor.COMERCIAL,700);
        
        double resultado = teste1.calcularFatura();
        double esperado = 525;
        
        assertEquals(resultado , esperado);
    }
    
    @org.junit.jupiter.api.Test
    public void testCalcularFatura4() {
        FaturaEletrica teste1 = new FaturaEletrica("Aquaberry",Consumidor.COMERCIAL,1000);
        
        double resultado = teste1.calcularFatura();
        double esperado = 800;
        
        assertEquals(resultado , esperado);
    }
    
    @org.junit.jupiter.api.Test
    public void testCalcularFatura5() {
        FaturaEletrica teste1 = new FaturaEletrica("KaibaCorp",Consumidor.INDUSTRIAL,3000);
        
        double resultado = teste1.calcularFatura();
        double esperado = 2550;
        
        assertEquals(resultado , esperado);
    }
    
}
