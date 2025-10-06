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
public class AppQuestao3Ui {
    public static void main(String[] args) {
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Altura"));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Comprimento"));
        
        Retangulo retangulo = new Retangulo(altura,comprimento);
        
        JOptionPane.showMessageDialog(null, "Perímetro: " + retangulo.calcularPerimetro() + 
                                            " Área: " + retangulo.calcularArea());
    }
}
