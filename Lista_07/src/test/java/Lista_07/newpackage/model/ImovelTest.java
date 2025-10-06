/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Lista_07.newpackage.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zobol
 */
public class ImovelTest {
    
    public ImovelTest() {
    }

    @Test
    public void testCalcularIptu1() {
        Imovel imovel = new Imovel();
        
        Exception ez = assertThrows(IllegalArgumentException.class,
                ()->(
                        imovel.calcularIptu();
                });
                
        String esperado = "Area Invalida";
        asset
    }
    
}
