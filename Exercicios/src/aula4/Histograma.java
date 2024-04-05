package aula4;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do console

public class Histograma {
	public static Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para leitura de entrada

	public static void main(String[] args) {
		// Solicita ao usuário o número de valores e o maior número esperado no
		// histograma
		System.out.println("Quantos números terão no histograma?");
		int index = sc.nextInt();
		System.out.println("Qual será o maior número no histograma?");
		int quant = sc.nextInt();

		// Preenche um array com os números fornecidos pelo usuário
		int preencheHist[] = preencheNum(index);

		// Chama o método para criar o histograma e exibi-lo
		histograma(asterisco(preencheHist, quant, index));
	}

	// Método para preencher um array com números fornecidos pelo usuário
	public static int[] preencheNum(int y) {
		int exemplo[] = new int[y];
		for (int x = 1; x < exemplo.length + 1; x++) {
			System.out.print(x + ": ");
			int num = sc.nextInt();
			exemplo[x - 1] = num;
		}
		return exemplo;
	}

	public static String[][] asterisco(int[] d, int a, int b) {
		// Inicializa matriz para histograma com números nas linhas e asteriscos nas
		// colunas.
		String quantAst[][] = new String[a][b + 1];

		// A primeira coluna de cada linha armazena o número correspondente, as demais
		// ficam vazias inicialmente.
		for (int i = 0; i < a; i++) {
			quantAst[i][0] = String.valueOf(i + 1);
			for (int j = 1; j <= b; j++) {
				quantAst[i][j] = "";
			}
		}

		// Preenche matriz com asteriscos onde cada asterisco representa uma ocorrência
		// do número.
		for (int num : d) {
			if (num <= a) { // Checa se o número está dentro do limite.
				for (int j = 1; j <= b; j++) { // Encontra próxima coluna vazia para inserir asterisco.
					if (quantAst[num - 1][j].isEmpty()) {
						quantAst[num - 1][j] = "*";
						break; // Interrompe após inserção para evitar duplicatas.
					}
				}
			}
		}
		return quantAst; // Retorna matriz pronta para exibição.
	}

	public static void histograma(String[][] x) {
		// Transpõe matriz para adequar à exibição vertical do histograma.
		String[][] transposta = new String[x[0].length][x.length];
		for (int i = 0; i < x.length; i++) {
			for (int a = 0; a < x[i].length; a++) {
				transposta[a][i] = (x[i][a] != null) ? x[i][a] : " "; // Transforma nulls em espaços.
			}
		}

		// Exibe histograma na vertical, começando pela base.
		for (int i = transposta.length - 1; i >= 0; i--) { // Inicia da base do histograma.
			for (int a = 0; a < transposta[i].length; a++) {
				System.out.print(transposta[i][a] + " "); // Exibe elementos com espaçamento.
			}
			System.out.println("\n"); // Nova linha após cada "andar" do histograma.
		}
	}

}
