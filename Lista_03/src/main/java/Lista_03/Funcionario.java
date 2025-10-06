/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lista_03;

/**
 *
 * @author zobol
 */
public class Funcionario {

    String nome;
    double salario;
    
    private static final double FAIXA_1_LIMITE_SUP = 1903.98;
    private static final double FAIXA_2_LIMITE_INF = 1903.99;
    private static final double FAIXA_2_LIMITE_SUP = 2826.65;
    private static final double FAIXA_3_LIMITE_INF = 2826.66;
    private static final double FAIXA_3_LIMITE_SUP = 3751.05;
    private static final double FAIXA_4_LIMITE_INF = 3751.06;
    private static final double FAIXA_4_LIMITE_SUP = 4664.68;
    private static final double FAIXA_5_LIMITE_INF = 4664.69;
    private static final double ALIQUOTA_FAIXA_2 = 0.075;
    private static final double ALIQUOTA_FAIXA_3 = 0.15;
    private static final double ALIQUOTA_FAIXA_4 = 0.225;
    private static final double ALIQUOTA_FAIXA_5 = 0.275;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public double calcularIrpf() {
        
        double imposto = 0;
        
        if (salario >= FAIXA_5_LIMITE_INF) {
            imposto = ((salario-FAIXA_5_LIMITE_INF) * ALIQUOTA_FAIXA_5);
        }
        if (salario >= FAIXA_4_LIMITE_INF) {
            imposto = ((salario-FAIXA_4_LIMITE_INF) * ALIQUOTA_FAIXA_4);
        }
        if (salario >= FAIXA_3_LIMITE_INF) {
            imposto = ((salario-FAIXA_3_LIMITE_INF) * ALIQUOTA_FAIXA_3);
        }
        if (salario >= FAIXA_2_LIMITE_INF) {
            imposto = ((salario-FAIXA_2_LIMITE_INF) * ALIQUOTA_FAIXA_2);
        }
        return imposto;
    }
}
