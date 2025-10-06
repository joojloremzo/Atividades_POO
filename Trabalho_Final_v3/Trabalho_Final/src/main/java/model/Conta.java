/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe que representa uma conta financeira de um titular, 
 * com capacidade de gerenciar receitas e despesas armazenadas em um arquivo CSV.
 * 
 * 
 * @author Lorenzo Zoboli, Henrique Horn Lenzi, Vinícius Mafezzoli Simplício
 */
public class Conta {

    
    File file = new File("C:\\Users\\henri\\Downloads\\conta.csv");
    private String titular;
    private ArrayList<Despesa> despesas;
    private ArrayList<Receita> receitas;

    /**
     * Construtor, responsável por criar uma conta com um titular.
     * 
     * @param titular Nome do titular da conta(não pode ser vazio)
     */
    public Conta(String titular) {
        setTitular(titular);
        despesas = new ArrayList();
        receitas = new ArrayList();
    }

    /**
     * Retorna o arquivo CSV
     * 
     * @return retorna o file
     */
    public File getFile() {
        return file;
    }

    /**
     * Adiciona uma receita a conta
     * 
     * @param r referesse a receita a ser adicionada, não podendo ser nulo
     */
    public void incluirReceita(Receita r) {
        if (r == null) {
            throw new IllegalArgumentException("A receita não pode ser nula!");
        }
        receitas.add(r);
    }

    /**
     * Remove uma receita da conta
     * 
     * @param r referesse a receita a ser removida, não podendo ser nula
     */
    public void removerReceita(Receita r) {
        if (r == null) {
            throw new IllegalArgumentException("A receita não pode ser nula!");
        }
        receitas.remove(r);
    }

    /**
     * Adiciona uma despesa a conta
     * 
     * @param d refere-se a despesa a ser adicionada, não podendo ser nula
     */
    public void incluirDespesa(Despesa d) {
        if (d == null) {
            throw new IllegalArgumentException("A despesa não pode ser nula!");
        }
        despesas.add(d);
    }

    /**
     * Remove uma despesa da conta
     * 
     * @param d referesse a despesa a ser removida, não podendo ser nula
     */
    public void removerDespesa(Despesa d) {
        if (true) {
            throw new IllegalArgumentException("A despesa não pode ser nula!");
        }
        despesas.remove(d);
    }

    /**
     * Retorna as despesas do arquivo CSV
     * 
     * @return retorna a lista de despesas
     */
    public ArrayList<Despesa> getDespesas() {
        despesas.clear();
        try {
            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);
            String linha;
            linha = br.readLine();
            linha = br.readLine();

            double valor;
            LocalDate data;
            CategoriaDespesa categoria;
            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(";");

                if ("d".equals(colunas[5])) {
                    valor = Double.parseDouble(colunas[0]);
                    data = LocalDate.of(Integer.parseInt(colunas[3]),
                            Integer.parseInt(colunas[2]),
                            Integer.parseInt(colunas[1]));
                    categoria = CategoriaDespesa.valueOf(colunas[4]);

                    Despesa despesa = new Despesa(data, valor, categoria);
                    despesas.add(despesa);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Conta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Conta.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.despesas.sort((r1, r2) -> r1.getData().compareTo(r2.getData()));
        return despesas;
    }

    /**
     * Retorna as receitas do arquivo CSV
     * 
     * @return retorna a lista de receitas
     */
    public ArrayList<Receita> getReceitas() {
        receitas.clear();
        try {
            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);
            String linha;
            linha = br.readLine();
            linha = br.readLine();

            double valor;
            LocalDate data;
            CategoriaReceita categoria;
            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(";");

                if ("r".equals(colunas[5])) {
                    valor = Double.parseDouble(colunas[0]);
                    data = LocalDate.of(Integer.parseInt(colunas[3]),
                            Integer.parseInt(colunas[2]),
                            Integer.parseInt(colunas[1]));
                    categoria = CategoriaReceita.valueOf(colunas[4]);

                    Receita receita = new Receita(data, valor, categoria);
                    receitas.add(receita);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Conta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Conta.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.receitas.sort((r1, r2) -> r1.getData().compareTo(r2.getData()));
        return receitas;
    }

    /**
     * Retorna o titular da conta
     * 
     * @return Nome do titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Inclui o titular da conta
     * 
     * @param titular Nome do titular
     */
    public void setTitular(String titular) {
        if (titular.trim().equals("")) {
            throw new IllegalArgumentException("Nome do titular invalido!");
        }
        this.titular = titular;
    }

    /**
     * Calcula o saldo total pegando todas as receitas e despesas
     * 
     * @return Saldo total
     */
    public double calcularSaldoTotal() {
        double totalReceitas = 0;
        double totalDespesas = 0;

        for (Receita r : this.getReceitas()) {
            totalReceitas += r.getValor();
        }
        for (Despesa d : this.getDespesas()) {
            totalDespesas += d.getValor();
        }

        return totalReceitas - totalDespesas;
    }

    /**
     * Calcula o saldo da conta considerando apenas até a data atual
     * 
     * @return Saldo atual
     */
    public double calcularSaldoAtual() {
        double receitasAtual = 0;
        double despesasAtual = 0;

        for (Receita r : this.getReceitas()) {
            if (!r.getData().isAfter(LocalDate.now())) {
                receitasAtual += r.getValor();
            }
        }

        for (Despesa d : this.getDespesas()) {
            if (!d.getData().isAfter(LocalDate.now())) {
                despesasAtual += d.getValor();
            }
        }

        return receitasAtual - despesasAtual;
    }

    /**
     * Escreve os dados da receita no arquivo CSV
     * 
     * @param receita Receita a ser escrita
     * @throws IOException Caso ocorra erro de escrita no arquivo
     */
    public void escreverDadosReceita(Receita receita) throws IOException {
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bfw = new BufferedWriter(fw)) {

            LocalDate data = receita.getData();

            bfw.write(String.valueOf(receita.getValor()) + ";");
            bfw.write(data.getDayOfMonth() + ";");
            bfw.write(data.getMonthValue() + ";");
            bfw.write(data.getYear() + ";");
            bfw.write(receita.getCategoriaReceita().name() + ";");
            bfw.write("r;");
            bfw.newLine();
        }
    }

    /**
     * Escreve os dados de uma despesa no arquivo CSV
     * 
     * @param despesa Despesa a ser escrita
     * @throws IOException Caso ocorra erro de escrita no arquivo
     */
    public void escreverDadosDespesa(Despesa despesa) throws IOException {
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bfw = new BufferedWriter(fw)) {

            LocalDate data = despesa.getData();

            bfw.write(String.valueOf(despesa.getValor()) + ";");
            bfw.write(data.getDayOfMonth() + ";");
            bfw.write(data.getMonthValue() + ";");
            bfw.write(data.getYear() + ";");
            bfw.write(despesa.getCategoriaDespesa().name() + ";");
            bfw.write("d;");
            bfw.newLine();
        }
    }

    /**
     * Retorna todos os lançamentos das receitas e despesas
     * 
     * @return Lista de tudo
     */
    public ArrayList<Lancamento> getTodosLancamentos() {
        ArrayList<Lancamento> tudo = new ArrayList<>();
        tudo.addAll(this.getReceitas());
        tudo.addAll(this.getDespesas());
        tudo.sort((r1, r2) -> r1.getData().compareTo(r2.getData()));
        return tudo;
    }
}
