package aula6.Aluno_UNB;

public class Turmas {
    int disciplina; // Código da disciplina
    String professor; // Nome do professor da disciplina

    // Construtor que inicializa a disciplina e o professor
    public Turmas(int disciplina, String professor) {
        this.disciplina = disciplina;
        this.professor = professor;
    }

    // Construtor padrão
    public Turmas() {
    }

    // Define o código da disciplina
    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }

    // Retorna o código da disciplina
    public int getDisciplina() {
        return disciplina;
    }

    // Define o nome do professor
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    // Retorna o nome do professor
    public String getProfessor() {
        return professor;
    }
}
