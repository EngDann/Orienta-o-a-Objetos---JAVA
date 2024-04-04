package aula3;

import java.util.Scanner;

public class Matrizes {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a quantidade de linhas da primeira matriz");
        int l1 = sc.nextInt();
        System.out.println("Informe a quantidade de colunas da primeira matriz");
        int c1 = sc.nextInt();
        System.out.println("Informe a quantidade de linhas da segunda matriz");
        int l2 = sc.nextInt();
        System.out.println("Informe a quantidade de colunas da segunda matriz");
        int c2 = sc.nextInt();
        int matriz1[][] = new int[l1][c1];
        int matriz2[][] = new int[l2][c2];

        if (l1 == c2) {
            System.out.println("Essa multiplicação é possivel, preencha a matriz e terá o resultado");
            int matrizPreench1[][] = preencheMatriz(matriz1);
            int matrizPreench2[][] = preencheMatriz(matriz2);

            multiplicaMatriz(matrizPreench1, matrizPreench2);
        } else {
            System.out.println("Essa multiplicação é impossivel");
        }
    }

    public static int[][] preencheMatriz(int[][] x) {
        int[][] resultado = new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int e = 0; e < x[0].length; e++) {
                int num = sc.nextInt();
                resultado[i][e] = num;
            }
        }
        return resultado;
    }

    public static void multiplicaMatriz(int[][] x, int[][] y) {
        int[][] resultado = new int[x.length][y[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int e = 0; e < y[0].length; e++) {
                for (int k = 0; k < x[0].length; k++) {
                    resultado[i][e] += x[i][k] * y[k][e];
                }
            }
        }
        for (int[] row : resultado) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
