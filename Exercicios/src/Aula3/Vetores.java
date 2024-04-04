package Aula3;

import java.util.Scanner;

public class Vetores {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas posições o vetor terá ?");
        int index = sc.nextInt();
        int vetor[] = new int[index];
        for (int x = 0; x < vetor.length; x++) {
            int num = sc.nextInt();
            vetor[x] = num;
        }
        System.out.println(
                "Média: " + media(vetor) + "\n" + "Quantidade de números positivos: " + positivo(vetor)
                        + "\nQuantidade de números negativos:"
                        + negativo(vetor) + "\nQuantidade de zeros: " + zero(vetor) + "\nQuantidade de números pares: "
                        + par(vetor) + "\nQuantidade de números impares: "
                        + impar(vetor));
        sc.close();
    }

    public static int media(int a[]) {
        int media = 0;
        for (int x : a) {
            media += x;
        }
        media /= a.length;
        return media;
    }

    public static int positivo(int a[]) {
        int positivo = 0;
        for (int x : a) {
            if (x >= 0) {
                positivo++;
            }
        }
        return positivo;
    }

    public static int negativo(int a[]) {
        int negativo = 0;
        for (int x : a) {
            if (x < 0) {
                negativo++;
            }
        }
        return negativo;
    }

    public static int zero(int a[]) {
        int zero = 0;
        for (int x : a) {
            if (x == 0) {
                zero++;
            }
        }
        return zero;
    }

    public static int par(int a[]) {
        int par = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                par++;
            }
        }
        return par;
    }

    public static int impar(int a[]) {
        int impar = 0;
        for (int x : a) {
            if (x % 2 != 0) {
                impar++;
            }
        }
        return impar;
    }
}
