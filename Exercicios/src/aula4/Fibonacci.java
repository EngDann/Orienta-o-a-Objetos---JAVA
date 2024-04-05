package aula4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Até que número a sequência deve ir?");
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário
        int num = sc.nextInt(); // Lê o número limite fornecido pelo usuário
        CalculoFibonacci(num); // Chama o método para calcular a sequência de Fibonacci até o número limite
        sc.close(); // Fecha o scanner para evitar vazamento de recursos
    }

    public static void CalculoFibonacci(int num) {
        if (num <= 0) {
            System.out.println("[]"); // Se o número fornecido for menor ou igual a zero, imprime uma lista vazia
            return;
        }
        int vetor[] = new int[num]; // Cria um array para armazenar os números da sequência de Fibonacci
        vetor[0] = 0; // O primeiro número da sequência é 0
        if (num > 1) {
            vetor[1] = 1; // O segundo número da sequência é 1
        }
        for (int i = 2; i < num; i++) {
            vetor[i] = vetor[i - 1] + vetor[i - 2]; // Calcula cada número da sequência como a soma dos dois anteriores
        }
        System.out.print("[");
        for (int i = 0; i < num; i++) {
            System.out.print(vetor[i]); // Imprime cada número da sequência
            if (i < num - 1) {
                System.out.print(", "); // Adiciona vírgulas entre os números, exceto após o último
            }
        }
        System.out.println("]"); // Fecha a impressão da lista com um colchete
    }
}
