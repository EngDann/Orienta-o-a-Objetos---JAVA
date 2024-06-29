package aula7.universidade;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome, codigo, professor;
    private int cargaHoraria;
    private List<Curso> cursos;

    public Disciplina() {
        this.cursos = new ArrayList<>();

    }

    public Disciplina(String nome, String codigo, String professor, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
        this.cursos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

}
