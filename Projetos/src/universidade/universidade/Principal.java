package universidade;

// Classe principal que cria e verifica a estrutura da universidade
public class Principal {
    public static void main(String[] args) {
        // Criar universidades
        Universidade UNB = new Universidade();
        Universidade UFM = new Universidade();
        Universidade UFG = new Universidade();

        // Configurar universidades
        UNB.setNome("UNB");
        UNB.setCodigo("1242");
        UFM.setNome("UFM");
        UFM.setCodigo("1243");
        UFG.setNome("UFG");
        UFG.setCodigo("1244");

        // Criar cursos
        Curso Software = new Curso("Software", "Integral", 1000);
        Curso Aeroespacial = new Curso("Aeroespacial", "Noturno", 1200);
        Curso Automotiva = new Curso("Automotiva", "Integral", 1100);

        // Adicionar cursos às universidades
        UNB.criarCurso(Software);
        UNB.criarCurso(Aeroespacial);
        UNB.criarCurso(Automotiva);

        // Criar disciplinas
        Disciplina IHC = new Disciplina("Interação Humano-Computador", "IHC123", "Professor A", 60);
        Disciplina APC = new Disciplina("Algoritmos e Programação de Computadores", "APC123", "Professor B", 80);
        Disciplina OO = new Disciplina("Orientação a Objetos", "OO123", "André", 90);
        Disciplina EA = new Disciplina("Engenharia Aeroespacial", "EA123", "Professor C", 100);
        Disciplina MCSOL = new Disciplina("Mecânica dos Solos", "MCSOL123", "Professor D", 70);
        Disciplina PEAE = new Disciplina("Projeto de Engenharia Automotiva", "PEAE123", "Professor E", 85);

        // Adicionar disciplinas aos cursos
        Software.adicionarDisciplinas(IHC);
        Software.adicionarDisciplinas(APC);
        Software.adicionarDisciplinas(OO);
        Software.adicionarDisciplinas(PEAE);
        Aeroespacial.adicionarDisciplinas(EA);
        Aeroespacial.adicionarDisciplinas(PEAE);
        Automotiva.adicionarDisciplinas(MCSOL);
        Automotiva.adicionarDisciplinas(PEAE);

        // Adicionar cursos às disciplinas
        IHC.adicionarCurso(Software);
        APC.adicionarCurso(Software);
        OO.adicionarCurso(Software);
        EA.adicionarCurso(Aeroespacial);
        MCSOL.adicionarCurso(Automotiva);
        PEAE.adicionarCurso(Automotiva);
        PEAE.adicionarCurso(Software);
        PEAE.adicionarCurso(Aeroespacial);

        // Criar alunos
        Aluno aluno1 = new Aluno("Danilo", "danilo@gmail.com", 232014244, Software);
        Aluno aluno2 = new Aluno("Maria", "maria@gmail.com", 232014245, Aeroespacial);
        Aluno aluno3 = new Aluno("João", "joao@gmail.com", 232014246, Automotiva);

        // Adicionar alunos aos cursos
        Software.addAluno(aluno1);
        Aeroespacial.addAluno(aluno2);
        Automotiva.addAluno(aluno3);
        Automotiva.removeAluno(aluno3);

        // Aplicar disciplinas aos alunos
        aluno1.aplicarEmDisciplinas(OO, Software);
        aluno1.aplicarEmDisciplinas(PEAE, Software);
        aluno2.aplicarEmDisciplinas(OO, Aeroespacial);
        aluno2.aplicarEmDisciplinas(EA, Aeroespacial);
        aluno3.aplicarEmDisciplinas(MCSOL, Automotiva);

        // Verificar e imprimir informações das universidades, cursos, disciplinas e
        // alunos
        imprimirUniversidade(UNB);
        imprimirUniversidade(UFM);
        imprimirUniversidade(UFG);
    }

    // Método para imprimir informações detalhadas sobre a universidade
    public static void imprimirUniversidade(Universidade universidade) {
        System.out.println();
        System.out.println("Universidade: " + universidade.getNome() + " (Código: " + universidade.getCodigo() + ")");
        for (Curso curso : universidade.getCurso()) {
            System.out.println();
            System.out.println("  Curso: " + curso.getNome() + " (Turno: " + curso.getTurno() + ", Carga Horária: "
                    + curso.getCargaHoraria() + ")");
            for (Disciplina disciplina : curso.getDisciplinas()) {
                System.out.println("    Disciplina: " + disciplina.getNome() + " (Código: " + disciplina.getCodigo()
                        + ", Professor: " + disciplina.getProfessor() + ", Carga Horária: "
                        + disciplina.getCargaHoraria() + ")");
            }
            for (Aluno aluno : curso.getAlunos()) {
                System.out.println("    Aluno: " + aluno.getNome() + " (Email: " + aluno.getEmail() + ", Matrícula: "
                        + aluno.getMatricula() + ")");
                System.out.print("      Disciplinas do Aluno: ");
                for (int i = 0; i < aluno.getDisciplinas().size(); i++) {
                    Disciplina disciplina = aluno.getDisciplinas().get(i);
                    System.out.print(disciplina.getNome());
                    if (i < aluno.getDisciplinas().size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();

    }
}