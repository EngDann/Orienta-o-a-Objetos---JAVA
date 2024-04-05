package aula3;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite alguma palavra ou frase e descubra se ela é um palíndromo");
        String palavra = sc.nextLine();
        String palavra0Espaco = palavraSemEspacos(palavra);
        String inversoPalavra = palavraInvertida(palavra0Espaco);
        if (palindromo(inversoPalavra, palavra0Espaco)) {
            System.out.println("É um palíndromo");
        } else {
            System.err.println("Não é um palíndromo");
        }
        sc.close();
    }

    public static String palavraSemEspacos(String palavra) {
        String palavraSemEspacos = "";
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != ' ') {
                palavraSemEspacos += String.valueOf(palavra.charAt(i));
            }
        }
        return palavraSemEspacos.toLowerCase();
    };

    public static String palavraInvertida(String palavra) {
        String palavraInvert = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvert += String.valueOf(palavra.charAt(i));
        }
        return palavraInvert.toLowerCase();
    };

    public static boolean palindromo(String palavra, String palavraInvert) {
        return palavra.equals(palavraInvert);
    }
}