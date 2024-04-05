package aula3;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do console

public class Matrizes {
    // Cria um objeto Scanner estático para ler entradas do console
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Solicita ao usuário as dimensões das duas matrizes
        System.out.println("Informe a quantidade de linhas da primeira matriz");
        int l1 = sc.nextInt();
        System.out.println("Informe a quantidade de colunas da primeira matriz");
        int c1 = sc.nextInt();
        System.out.println("Informe a quantidade de linhas da segunda matriz");
        int l2 = sc.nextInt();
        System.out.println("Informe a quantidade de colunas da segunda matriz");
        int c2 = sc.nextInt();

        // Cria as matrizes com as dimensões fornecidas pelo usuário
        int matriz1[][] = new int[l1][c1];
        int matriz2[][] = new int[l2][c2];

        // Verifica se é possível realizar a multiplicação das matrizes
        if (c1 == l2) {
            System.out.println("Essa multiplicação é possivel, preencha a matriz e terá o resultado");
            // Preenche as duas matrizes com os valores fornecidos pelo usuário
            int matrizPreench1[][] = preencheMatriz(matriz1);
            int matrizPreench2[][] = preencheMatriz(matriz2);

            // Realiza a multiplicação das matrizes e exibe o resultado
            multiplicaMatriz(matrizPreench1, matrizPreench2);
        } else {
            System.out.println("Essa multiplicação é impossivel");
        }
        sc.close(); // Fecha o scanner para evitar vazamento de recursos
    }

    // Método para preencher uma matriz com valores fornecidos pelo usuário
    public static int[][] preencheMatriz(int[][] x) {
        int[][] resultado = new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int e = 0; e < x[0].length; e++) {
                System.out.println("Digite o elemento [" + i + "][" + e + "]:");
                int num = sc.nextInt();
                resultado[i][e] = num;
            }
        }
        return resultado;
    }

    // Método para multiplicar duas matrizes e exibir o resultado
    public static void multiplicaMatriz(int[][] x, int[][] y) {
        int[][] resultado = new int[x.length][y[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                for (int k = 0; k < x[0].length; k++) {
                    resultado[i][j] += x[i][k] * y[k][j];
                }
            }
        }

        // Exibe o resultado da multiplicação
        System.out.println("Resultado da multiplicação:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
