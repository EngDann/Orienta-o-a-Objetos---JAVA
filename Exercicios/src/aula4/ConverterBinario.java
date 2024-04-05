package aula4;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do console

public class ConverterBinario {

    public static void main(String[] args) {
        System.out.println("Escreva um numero e descubra seu binário");
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário
        int num = sc.nextInt(); // Lê um número inteiro fornecido pelo usuário
        System.out.println(decimalParaBinario(num)); // Converte o número para binário e imprime o resultado
        sc.close(); // Fecha o scanner para evitar vazamento de recursos
        System.out.println(1 % 2);
    }

    // Método para converter um número decimal para binário
    public static String decimalParaBinario(int numero) {
        if (numero == 0)
            return "0"; // Se o número for zero, retorna "0"
        String resposta = ""; // Inicializa uma string vazia para armazenar o resultado
        int resto;
        while (numero > 0) {
            resto = numero % 2; // Calcula o resto da divisão por 2
            resposta = resto + resposta; // Adiciona o resto à string de resposta
            numero = numero / 2; // Divide o número por 2 para continuar o processo
        }
        return resposta; // Retorna o número binário resultante
    }
}
