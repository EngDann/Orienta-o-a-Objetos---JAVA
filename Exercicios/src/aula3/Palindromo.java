package aula3;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do console

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler entrada do usuário
        System.out.println("Digite alguma palavra ou frase e descubra se ela é um palíndromo");
        String palavra = sc.nextLine(); // Lê a palavra ou frase fornecida pelo usuário
        String palavra0Espaco = palavraSemEspacos(palavra); // Remove espaços da palavra/frase
        String inversoPalavra = palavraInvertida(palavra0Espaco); // Inverte a palavra/frase
        // Verifica se a palavra/frase invertida é igual à palavra/frase original (é
        // palíndromo)
        if (palindromo(inversoPalavra, palavra0Espaco)) {
            System.out.println("É um palíndromo");
        } else {
            System.err.println("Não é um palíndromo");
        }
        sc.close(); // Fecha o scanner para evitar vazamento de recursos
    }

    // Remove espaços de uma palavra/frase e a converte para minúsculas
    public static String palavraSemEspacos(String palavra) {
        String palavraSemEspacos = "";
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != ' ') {
                palavraSemEspacos += String.valueOf(palavra.charAt(i));
            }
        }
        return palavraSemEspacos.toLowerCase();
    };

    // Inverte uma palavra/frase e a converte para minúsculas
    public static String palavraInvertida(String palavra) {
        String palavraInvert = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvert += String.valueOf(palavra.charAt(i));
        }
        return palavraInvert.toLowerCase();
    };

    // Verifica se uma palavra/frase é palíndromo
    public static boolean palindromo(String palavra, String palavraInvert) {
        return palavra.equals(palavraInvert); // Retorna verdadeiro se a palavra invertida for igual à original
    }
}
