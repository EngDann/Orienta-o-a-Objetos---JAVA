package aula7.universidade;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private String codigo;
    private List<Curso> cursos;

    public Universidade() {
        this.cursos = new ArrayList<>();
    }

    public Universidade(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
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

    public List<Curso> getCurso() {
        return cursos;
    }

    public void criarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }
}
