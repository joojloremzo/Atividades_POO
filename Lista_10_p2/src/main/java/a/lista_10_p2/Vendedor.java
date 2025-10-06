/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_10_p2;

import java.util.ArrayList;

/**
 *
 * @author zobol
 */
public class Vendedor extends Funcionario{
    private double percentualComissao;
    private ArrayList<Venda> vendas;
    
    public Vendedor(double percentualComissao, String nome, double salarioBase) {
        super(nome, salarioBase);
        setPercentualComissao(percentualComissao);
        
        vendas = new ArrayList();
    }
    
    @Override
    public double calcularSalario() {
        double totalVendas = 0;
        
        for (Venda v : vendas) {
            totalVendas += v.getValor();
        }
        
        return super.getSalarioBase() + (totalVendas*getPercentualComissao())/100;
    }
    
    public void incluirVenda(Venda venda) {
        vendas.add(venda);
    }
    
    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
}
