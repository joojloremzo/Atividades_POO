/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

import model.Bairro;
import model.Finalidade;
import model.Imovel;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        
        Bairro bairro = new Bairro("Araponguinhas",0);
        
        Imovel imovel = new Imovel("Rua Japão", 500, bairro, Finalidade.COMERCIAL);
        
        System.out.println("Coeficiente IPTU: " + bairro.getCoeficienteIptu());
    }
}
