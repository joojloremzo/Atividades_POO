/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lista_01;

/**
 *
 * @author zobol
 */
public class Pessoa {

    double altura;
    double peso;
    
    public double calcularImc() {
        return peso / (altura * altura);
    }
}
