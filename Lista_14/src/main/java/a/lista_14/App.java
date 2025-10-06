/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_14;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        String caminhoArquivo = "\\C:\\\\Users\\\\zobol\\\\OneDrive\\\\Área de Trabalho\\\\FURB\\\\Programação Orientada a Objeto\\\\Lista_14 teste\\\\L14_municipios.csv\\";
        
        Leitor leitor = new Leitor(caminhoArquivo);
        
        leitor.lerArquivo();
        System.out.println("Maior: " + leitor.getMaiorPop());
        System.out.println("Menor: " + leitor.getMenorPop());
    }
}
