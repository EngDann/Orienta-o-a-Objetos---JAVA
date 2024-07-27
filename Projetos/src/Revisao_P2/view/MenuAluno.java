package view;

import javax.swing.JOptionPane;
import app.Aluno;
import cadastros.CRUD;

public class MenuAluno {

	public static Aluno dadosAlunos() {
		String nome = lerNome();
		String cpf = lerCPF();
		String email = lerEmail();
		String matricula = lerMatricula();
		String curso = lerCurso();
		return new Aluno(nome, cpf, email, matricula, curso);
	}

	private static String lerCurso() {
		return JOptionPane.showInputDialog("Informe o curso do aluno: ");
	}

	private static String lerEmail() {
		return JOptionPane.showInputDialog("Informe o email do aluno: ");
	}

	private static String lerCPF() {
		return JOptionPane.showInputDialog("Informe o CPF do aluno: ");
	}

	private static String lerNome() {
		return JOptionPane.showInputDialog("Informe o nome do aluno: ");
	}

	private static String lerMatricula() {
		return JOptionPane.showInputDialog("Informe a matrícula do aluno: ");
	}

	public static void menuAluno(CRUD<Aluno> Alunos) {
		String txt = "Informe a opção desejada \n"
				+ "1 - Cadastrar aluno\n"
				+ "2 - Pesquisar aluno\n"
				+ "3 - Atualizar aluno\n"
				+ "4 - Remover aluno\n"
				+ "5 - Listar todos os alunos\n"
				+ "0 - Voltar para menu anterior";
		int opcao = -1;
		do {
			String strOpcao = JOptionPane.showInputDialog(txt);
			opcao = Integer.parseInt(strOpcao);
			switch (opcao) {
				case 1:
					Aluno novoAluno = dadosAlunos();
					Alunos.adicionar(novoAluno.getMatricula(), novoAluno);
					break;

				case 2:
					String matricula = lerMatricula();
					Aluno a = Alunos.pesquisar(matricula);
					if (a != null)
						JOptionPane.showMessageDialog(null, a.toString());
					break;

				case 3:
					matricula = lerMatricula();
					Aluno novoCadastro = dadosAlunos();
					boolean atualizado = Alunos.atualizar(matricula, novoCadastro);
					if (atualizado) {
						JOptionPane.showMessageDialog(null, "Cadastro atualizado.");
					}
					break;

				case 4:
					matricula = lerMatricula();
					boolean removido = Alunos.remover(matricula);
					if (removido) {
						JOptionPane.showMessageDialog(null, "Aluno removido do cadastro");
					}
					break;
				case 5:
					Alunos.listarTODOS();
				default:
					break;
			}
		} while (opcao != 0);
	}
}
