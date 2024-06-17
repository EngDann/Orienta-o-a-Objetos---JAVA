package aula6.Aluno_UNB;

public class alunoPrincipal {
    public static void main(String[] args) {
        // Criação de instâncias de alunos com nome e matrícula
        Aluno aluno1, aluno2;
        aluno1 = new Aluno("Danilo", 232014244);
        aluno2 = new Aluno();
        aluno2.setMatricula(232020200);
        aluno2.setNome("Thanos");

        // Criação de instâncias de turmas com código de disciplina e nome do professor
        Turmas turma1, turma2;
        turma1 = new Turmas(2440, "Andre");
        turma2 = new Turmas();
        turma2.setDisciplina(3412);
        turma2.setProfessor("Ronni");

        // Matrícula dos alunos nas disciplinas
        aluno1.matricular(turma1.getDisciplina(), turma1.getProfessor());
        aluno1.matricular(turma2.getDisciplina(), turma2.getProfessor());
        aluno2.matricular(turma1.getDisciplina(), turma1.getProfessor());

        // Exibição das informações dos alunos e suas disciplinas matriculadas
        System.out.println("Aluno: " + aluno1.getNome() + ", Matrícula: " + aluno1.getMatricula() + ", Disciplinas: "
                + aluno1.getDisciplinas());
        System.out.println("Aluno: " + aluno2.getNome() + ", Matrícula: " + aluno2.getMatricula() + ", Disciplinas: "
                + aluno2.getDisciplinas());
    }
}
