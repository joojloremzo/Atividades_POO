/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista_04;

import javax.swing.JOptionPane;

/**
 *
 * @author zobol
 */
public class AppQuestao2Ui {
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();
        
        retangulo.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Indique a altura")));
        retangulo.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Indique o comprimento")));
        
        JOptionPane.showMessageDialog(null, "Perímetro: " + retangulo.calcularPerimetro() +
                                            " Área: " + retangulo.calcularArea());
        
    }
}
