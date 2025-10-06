/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package a.lista_08.model;

import a.lista_08.model.Aluno;
import a.lista_08.model.Professor;
import a.lista_08.model.Turno;
import java.util.ArrayList;

/**
 *
 * @author zobol
 */
public class Turma {
    private String disciplina;
    private Turno turno;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String disciplina, Turno turno, Professor professor) {
        setDisciplina(disciplina);
        setProfessor(professor);
        setTurno(turno);
        alunos = new ArrayList();
    }
    
    public Aluno obterAlunoMelhorNotaEnem() {
        int melhorAluno = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(melhorAluno).getNotaEnem()< alunos.get(i).getNotaEnem()) {
                melhorAluno = i;
            }
            
        }
        return alunos.get(melhorAluno);
    }

    public ArrayList<Aluno> getAlunos(int i) {
        return alunos;
    }
    
    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void removerAluno(int i) {
        alunos.remove(i);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
