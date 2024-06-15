package aula5;

import java.io.*;
import java.util.*;

public class exercicio3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        for (int i = 0; i < vet1.length; i++) {
            vet1[i] = r.nextInt(100);
            vet2[i] = r.nextInt(100);
        }

        System.out.print("Vetor 1: ");
        for (int num : vet1) {
            System.out.print(num + " ");
        }
        System.out.print("//");
        System.out.print(" Vetor 1 ordenado: ");
        int vet1Ord[] = ordena1(vet1);
        for (int num : vet1Ord) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Vetor 2: ");
        for (int num : vet2) {
            System.out.print(num + " ");
        }
        System.out.print("//");
        System.out.print(" Vetor 2 ordenado: ");
        int vet2Ord[] = ordena1(vet2);
        for (int num : vet2Ord) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println();

        int[] ordenado = ordena2(vet1, vet2);

        System.out.print("Vetor combinado e ordenado: ");
        for (int num : ordenado) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Escrever o vetor combinado e ordenado no arquivo "combinado.txt"
        try (PrintWriter writer = new PrintWriter(new File("combinado.txt"))) {
            for (int num : ordenado) {
                writer.print(num + " ");
            }
            System.out.println("Vetor combinado e ordenado foi escrito no arquivo 'combinado.txt'.");
        } catch (FileNotFoundException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static int[] ordena1(int[] x) {
        int swap;
        for (int menor = 0; menor < x.length; menor++) {
            for (int verificador = menor; verificador < x.length; verificador++) {
                if (x[verificador] < x[menor]) {
                    swap = x[menor];
                    x[menor] = x[verificador];
                    x[verificador] = swap;
                }
            }
        }
        return x;
    }

    public static int[] ordena2(int[] x, int[] y) {
        // Criar um vetor temporário com todos os elementos de x e y
        int[] combinado = new int[x.length + y.length];
        int index = 0;

        // Adicionar todos os elementos de x ao vetor combinado
        for (int i = 0; i < x.length; i++) {
            combinado[index++] = x[i];
        }

        // Adicionar todos os elementos de y ao vetor combinado
        for (int i = 0; i < y.length; i++) {
            combinado[index++] = y[i];
        }

        ordena1(combinado);
        return combinado;
    }
}
