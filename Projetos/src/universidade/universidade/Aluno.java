package universidade;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome, email;
    private int matricula;
    private Curso curso;
    private List<Disciplina> disciplinas;

    public Aluno() {
        this.disciplinas = new ArrayList<>();
    }

    public Aluno(String nome, String email, int matricula, Curso curso) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void aplicarEmDisciplinas(Disciplina disciplina, Curso curso) {
        if (this.getCurso() != null) {
            if (this.curso.getDisciplinas().contains(disciplina)) {
                if (!disciplinas.contains(disciplina)) {
                    disciplinas.add(disciplina);
                }
            } else {
                System.out.println(getNome() + ", " + disciplina.getNome() + " não existe no seu curso");
            }
        } else {
            System.out.println(this.getNome() + ", você não está matriculado em nenhum curso");
        }

    }
}
