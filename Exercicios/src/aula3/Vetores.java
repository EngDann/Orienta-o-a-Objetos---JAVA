package aula3;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do console

public class Vetores {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário
        System.out.println("Quantas posições o vetor terá ?");
        int index = sc.nextInt(); // Lê o tamanho do vetor fornecido pelo usuário
        int vetor[] = new int[index]; // Cria um vetor com o tamanho especificado
        // Preenche o vetor com números fornecidos pelo usuário
        for (int x = 0; x < vetor.length; x++) {
            int num = sc.nextInt();
            vetor[x] = num;
        }
        // Exibe as estatísticas do vetor
        System.out.println(
                "Média: " + media(vetor) + "\n" + "Quantidade de números positivos: " + positivo(vetor)
                        + "\nQuantidade de números negativos:"
                        + negativo(vetor) + "\nQuantidade de zeros: " + zero(vetor) + "\nQuantidade de números pares: "
                        + par(vetor) + "\nQuantidade de números impares: "
                        + impar(vetor));
        sc.close(); // Fecha o scanner para evitar vazamento de recursos
    }

    // Calcula a média dos valores do vetor
    public static int media(int a[]) {
        int media = 0;
        for (int x : a) {
            media += x;
        }
        media /= a.length;
        return media;
    }

    // Conta a quantidade de números positivos no vetor
    public static int positivo(int a[]) {
        int positivo = 0;
        for (int x : a) {
            if (x >= 0) {
                positivo++;
            }
        }
        return positivo;
    }

    // Conta a quantidade de números negativos no vetor
    public static int negativo(int a[]) {
        int negativo = 0;
        for (int x : a) {
            if (x < 0) {
                negativo++;
            }
        }
        return negativo;
    }

    // Conta a quantidade de zeros no vetor
    public static int zero(int a[]) {
        int zero = 0;
        for (int x : a) {
            if (x == 0) {
                zero++;
            }
        }
        return zero;
    }

    // Conta a quantidade de números pares no vetor
    public static int par(int a[]) {
        int par = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                par++;
            }
        }
        return par;
    }

    // Conta a quantidade de números ímpares no vetor
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
