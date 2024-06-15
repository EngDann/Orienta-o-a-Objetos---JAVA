package aula5;

import java.util.*;
import java.io.*;

public class exercicio4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] matriz = new int[100][100];

        // Preenchendo a matriz com números aleatórios
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) {
                matriz[a][b] = r.nextInt(100);
            }
        }

        // Escrevendo a matriz em um arquivo
        try (PrintWriter writer = new PrintWriter(new File("matriz.txt"))) {
            for (int a = 0; a < matriz.length; a++) {
                for (int b = 0; b < matriz[a].length; b++) {
                    writer.print(matriz[a][b] + " ");
                }
                writer.println();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        // Lendo a matriz do arquivo e armazenando em uma nova variável
        int[][] MatrizArquivo = new int[100][100];
        try (BufferedReader reader = new BufferedReader(new FileReader("matriz.txt"))) {
            String line;
            int a = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(" ");
                for (int b = 0; b < values.length; b++) {
                    MatrizArquivo[a][b] = Integer.parseInt(values[b]);
                }
                a++;
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Verificando se a matriz é simétrica
        if (simetrico(MatrizArquivo)) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }

    public static boolean simetrico(int[][] MatrizArquivo) {
        for (int a = 0; a < MatrizArquivo.length; a++) {
            for (int b = a + 1; b < MatrizArquivo[a].length; b++) {
                if (MatrizArquivo[a][b] != MatrizArquivo[b][a]) {
                    return false;
                }
            }
        }
        return true;
    }
}
