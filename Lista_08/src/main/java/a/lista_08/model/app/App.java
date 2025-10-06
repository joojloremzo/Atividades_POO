/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a.lista_08.model.app;

import a.lista_08.model.Aluno;
import a.lista_08.model.Professor;
import a.lista_08.model.Titulacao;
import a.lista_08.model.Turma;
import a.lista_08.model.Turno;
import java.util.ArrayList;

/**
 *
 * @author zobol
 */
public class App {
    public static void main(String[] args) {
        
        ArrayList<Aluno> alunos = new ArrayList();
        
        Aluno a1 = new Aluno(1100,"João",8.6);
        Aluno a2 = new Aluno(1101,"Maria",7.4);
        Aluno a3 = new Aluno(1110,"Jefferson",9.8);
        
        Professor professor = new Professor("Renato Souza","souza.renato@gmail.com",Titulacao.MESTRADO);
        
        Turma turma = new Turma("Biologia",Turno.NOTURNO,professor);
        
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Aluno " + (i+1) + ": " + alunos.get(i).getNome());
        }
        
    }
}
