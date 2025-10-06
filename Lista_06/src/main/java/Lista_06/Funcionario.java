/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lista_06;

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
    
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que zero!");
        }
        
        this.salario = salario;
    }
    
    public Funcionario(String nome, double salario) {
        setSalario(salario);
        setNome(nome);
    }
    
    
    public double calcularIrpf() {
        if (salario <= FAIXA_1_LIMITE_SUP){
            return 0;
    }
        if (salario <= FAIXA_2_LIMITE_SUP){
            return salario * ALIQUOTA_FAIXA_2;
    }
        if (salario <= FAIXA_3_LIMITE_SUP){
            return salario * ALIQUOTA_FAIXA_3;
    }
        if (salario <= FAIXA_4_LIMITE_SUP){
            return salario * ALIQUOTA_FAIXA_4;
    }
       return salario * ALIQUOTA_FAIXA_5;
    }
    
    public FaixaIrpf identificarFaixaIrpf() {
        if (salario <= FAIXA_1_LIMITE_SUP){
            return FaixaIrpf.PRIMEIRA;
    }
        if (salario <= FAIXA_2_LIMITE_SUP){
            return FaixaIrpf.SEGUNDA;
    }
        if (salario <= FAIXA_3_LIMITE_SUP){
            return FaixaIrpf.TERCEIRA;
    }
        if (salario <= FAIXA_4_LIMITE_SUP){
            return FaixaIrpf.QUARTA;
    }
       return FaixaIrpf.QUINTA;
    }
    
}
