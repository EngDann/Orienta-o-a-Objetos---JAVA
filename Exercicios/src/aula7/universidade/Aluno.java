package aula7.universidade;

public class Aluno {
    private String nome, email;
    private int matricula;
    private Curso curso;

    public Aluno() {
    }

    public Aluno(String nome, String email, int matricula, Curso curso) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.curso = curso;
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
}
