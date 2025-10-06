/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lista_04;

/**
 *
 * @author zobol
 */
public class Retangulo {

    int altura;
    int comprimento;
    
    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }
    
    public Retangulo(int altura, int comprimento) {
        setAltura(altura);
        setComprimento(comprimento);
    }
    
    public void setAltura(int altura) {
        
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor inválido para a altura: " + altura);
        }
        this.altura = altura;
    }
    
    public int getAltura() {
        return this.altura;
    }
    
    public void setComprimento(int comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor inválido para a altura: " + comprimento);
        }
        this.comprimento = comprimento;
    }
    
    public int getComprimento() {
        return this.comprimento;
    }
    
    public int calcularPerimetro() {
        return (altura * 2) + (comprimento * 2);
    }
    
    public int calcularArea() {
        return altura * comprimento;
    }
}
