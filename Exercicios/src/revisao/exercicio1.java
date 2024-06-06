package revisao;

import java.util.*;

public class exercicio1 {
    public static void main(String[] args) {
        Random r = new Random();
        int matriz4x4[][] = new int[4][4];
        int matrizDiagonal[] = new int[4];

        // Preencher a matriz 4x4 com valores aleatórios de 0 a 99
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz4x4[i][j] = r.nextInt(100);
            }
        }

        // Imprimir a matriz 4x4 e preencher a matriz diagonal
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    matrizDiagonal[i] = matriz4x4[i][j];
                }
                System.out.print(matriz4x4[i][j] + " "); // Usar " " para evitar a soma de valores ASCII
            }
            System.out.println(); // Usar println() para adicionar uma nova linha
        }

        // Imprimir a matriz diagonal
        System.out.println("Matriz Diagonal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matrizDiagonal[i]);
        }
    }
}
