import javax.swing.JOptionPane;

import app.Aluno;
import app.Professor;
import view.MenuAluno;
import view.MenuPrincipal;

import cadastros.CRUD;

public class Principal {

	static CRUD<Aluno> Aluno;
	static CRUD<Professor> Prof;

	public static void main(String[] args) {
		Aluno = new CRUD<>();
		Prof = new CRUD<>();

		int opcao = 0;

		do {
			opcao = MenuPrincipal.menuOpcoes();
			switch (opcao) {
				case 1:
					MenuAluno.menuAluno(Aluno);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Cadastro de professores a ser implementado");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Cadastro de disciplinas a ser implementado");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Cadastro de turmas a ser implementado");
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
					opcao = -1;
					break;
			}
		} while (opcao != 0);
	}
}