package aula7.universidade;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome, turno;
    private int cargaHoraria;
    private List<Aluno> alunos;

    public Curso() {
        this.alunos = new ArrayList<>();
    }

    public Curso(String nome, String turno, int cargaHoraria) {
        this.nome = nome;
        this.turno = turno;
        this.cargaHoraria = cargaHoraria;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            aluno.setCurso(this); // Define o curso do aluno como este curso
        }
    }

    public void removeAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
            aluno.setCurso(null); // Remove o vínculo do curso com o aluno
        }
    }
    /*
     * public void setCurso(Curso curso) {
     * this.curso = curso;
     * }
     */
}
