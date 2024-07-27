package view;

import javax.swing.JOptionPane;

import app.Professor;
import cadastros.CRUD;

public class MenuProfessor {
    public static Professor dadosProfessores() {
        String nome = lerNome();
        String cpf = lerCPF();
        String email = lerEmail();
        String areaForm = lerAreaFormacao();
        String matricula = lerMatriculaFUB();
        return new Professor(nome, cpf, email, areaForm, matricula);
    }

    private static String lerNome() {
        return JOptionPane.showInputDialog("Informe o nome do professor: ");
    }

    private static String lerAreaFormacao() {
        return JOptionPane.showInputDialog("Informe o curso do professor: ");
    }

    private static String lerEmail() {
        return JOptionPane.showInputDialog("Informe o email do professor: ");
    }

    private static String lerCPF() {
        return JOptionPane.showInputDialog("Informe o CPF do professor: ");
    }

    private static String lerMatriculaFUB() {
        return JOptionPane.showInputDialog("Informe a matrícula do professor: ");
    }

    public static void menuProfessor(CRUD<Professor> professores) {
        String txt = "Informe a opção desejada \n"
                + "1 - Cadastrar professor\n"
                + "2 - Pesquisar professor\n"
                + "3 - Atualizar professor\n"
                + "4 - Remover professor\n"
                + "5 - Listar todos os professores\n"
                + "0 - Voltar para menu anterior";
        int opcao = -1;
        do {
            String strOpcao = JOptionPane.showInputDialog(txt);
            opcao = Integer.parseInt(strOpcao);
            switch (opcao) {
                case 1:
                    Professor novoProfessor = dadosProfessores();
                    professores.adicionar(novoProfessor.getMatriculaFUB(), novoProfessor);
                    break;
                case 2:
                    String matFUB = lerMatriculaFUB();
                    if (professores.pesquisar(matFUB) != null)
                        JOptionPane.showMessageDialog(null, professores.pesquisar(matFUB).toString());
                    break;
                case 3:
                    matFUB = lerMatriculaFUB();
                    novoProfessor = dadosProfessores();
                    boolean atualizado = professores.atualizar(matFUB, novoProfessor);
                    if (atualizado) {
                        JOptionPane.showMessageDialog(null, "Cadastro atualizado.");
                    }
                    break;
                case 4:
                    matFUB = lerMatriculaFUB();
                    boolean removido = professores.remover(matFUB);
                    if (removido) {
                        JOptionPane.showMessageDialog(null, "Aluno removido do cadastro");
                    }
                    break;
                case 5:
                    professores.listarTODOS();
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }
}
