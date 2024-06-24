package aula7.universidade;

public class Disciplina {
    private String nome, codigo, professor;
    private int cargaHoraria;
    Curso cursos;

    public Disciplina() {

    }

    public Disciplina(String nome, String codigo, String professor, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
        this.cargaHoraria = cargaHoraria;
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

}
