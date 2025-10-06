/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_10_p2;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        
        /*
        CRIANDO OS OBJETOS DA CLASSE VENDEDOR
        */
        
        Vendedor luiz = new Vendedor(10,"Luiz",1000);
        
        Venda v1l = new Venda(200);
        Venda v2l = new Venda(100);
        
        luiz.incluirVenda(v1l);
        luiz.incluirVenda(v2l);
        
        Vendedor paula = new Vendedor(7,"Paula",1200);
        
        Venda v1p = new Venda(500);
        Venda v2p = new Venda(350);
        Venda v3p = new Venda(280);
        
        paula.incluirVenda(v1p);
        paula.incluirVenda(v2p);
        paula.incluirVenda(v3p);
        
        /*
        CRIANDO OS OBJETOS DA CLASSE PROGRAMADOR
        */
        
        Programador julio = new Programador("Julio",1000);
        Programador ana = new Programador("Ana",1000);
        Programador anderson = new Programador("Anderson",1200);
        
        julio.incluirLinguagens("C");
        julio.incluirLinguagens("Java");
        
        ana.incluirLinguagens("Java");
        ana.incluirLinguagens("C#");
        
        anderson.incluirLinguagens("Python");
        
        /*
        CRIANDO OS OBJETOS DA CLASSE FUNCIONARIO
        */
        
        Funcionario jose = new Funcionario("José",1000);
        Funcionario maria = new Funcionario("Maria",1400);
        
        /*
        CRIANDO A EMPRESA
        */
        
        Empresa philips = new Empresa("Philips");
        
        philips.incluirFuncionario(luiz);
        philips.incluirFuncionario(paula);
        
        philips.incluirFuncionario(julio);
        philips.incluirFuncionario(ana);
        philips.incluirFuncionario(anderson);
        
        philips.incluirFuncionario(jose);
        philips.incluirFuncionario(maria);
        
        /*
        OS PRINTS
        */
        
        System.out.println("Total de custos da empresa com salários: " + philips.calcularCustosSalarios());
        
        for (int i = 0; i < philips.getFuncionarios().size(); i++) {
            System.out.println(" Funcionário: " + philips.getFuncionarios().get(i).getNome() + 
                                "\n Salário: " + philips.getFuncionarios().get(i).calcularSalario());
            System.out.println();
        }
        
        for (int i = 0; i < philips.getFuncionarios().size(); i++) {
            if (philips.getFuncionarios().get(i) instanceof Vendedor) {
                Vendedor v = (Vendedor) philips.getFuncionarios().get(i);
                System.out.println(" Vendedor: " + v.getNome()+
                                    "\n Comissão: " + v.getPercentualComissao());
            }
        }
        
        for (int i = 0; i < philips.getFuncionarios().size(); i++) {
            if (philips.getFuncionarios().get(i) instanceof Programador) {
                Programador p = (Programador) philips.getFuncionarios().get(i);
                System.out.println(" Programador: " + p.getNome() +
                                 "\n Linguagens conhecidas: " + String.join(", ", p.getLinguagens()));
            }
        }
    }
}
