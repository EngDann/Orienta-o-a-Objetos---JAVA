package aula3;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do console
import java.lang.Math; // Importa a classe Math para realizar operações matemáticas

public class Formas {
    // Cria um objeto Scanner estático para ler entradas do console
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu(); // Chama o método que exibe o menu de escolhas
        System.out.println("Saindo . . ."); // Mensagem de saída
        sc.close(); // Fecha o scanner para evitar vazamento de recursos
    }

    // Exibe um menu de escolhas para o usuário e executa a opção selecionada
    public static void menu() {
        int escolha; // Armazena a escolha do usuário

        do {
            // Exibe as opções de formas geométricas
            System.out.println("Escolha a figura geométrica desejada  \n"
                    + "1 - Circulo  \n"
                    + "2 - Quadrado  \n"
                    + "3 - Retângulo  \n"
                    + "4 - Trapézio  ");
            escolha = sc.nextInt(); // Lê a escolha do usuário

            // Direciona para o método correspondente à escolha feita
            switch (escolha) {
                case 1:
                    circulo(); // Calcula perímetro e área de um círculo
                    break;
                case 2:
                    quadrado(); // Calcula perímetro e área de um quadrado
                    break;
                case 3:
                    retangulo(); // Calcula perímetro e área de um retângulo
                    break;
                case 4:
                    trapezio(); // Calcula perímetro e área de um trapézio
                    break;
            }

        } while (escolha >= 1 && escolha <= 4); // Repete enquanto a escolha for válida
    }

    // Calcula e exibe o perímetro e a área de um círculo
    public static void circulo() {
        System.out.println("Qual o raio do circulo?");
        int radius = sc.nextInt(); // Lê o raio do círculo
        // Exibe perímetro e área do círculo
        System.out.println("Perímetro: " + radius * 2 * Math.PI + "\nÁrea: " + Math.PI * Math.pow(radius, 2));
    }

    // Calcula e exibe o perímetro e a área de um quadrado
    public static void quadrado() {
        System.out.println("Informe o comprimento de um dos lados do quadrado");
        int length = sc.nextInt(); // Lê o comprimento do lado do quadrado
        // Exibe perímetro e área do quadrado
        System.out.println("Perímetro: " + length * 4 + "\nÁrea: " + Math.pow(length, 2));
    }

    // Calcula e exibe o perímetro e a área de um retângulo
    public static void retangulo() {
        System.out.println("Informe o comprimento e a largura do retângulo");
        System.out.println("Comprimento:");
        int length = sc.nextInt(); // Lê o comprimento do retângulo
        System.out.println("Largura:");
        int width = sc.nextInt(); // Lê a largura do retângulo
        // Exibe perímetro e área do retângulo
        System.out.println("Perímetro: " + 2 * (length + width) + "\nÁrea: " + length * width);
    }

    // Calcula e exibe o perímetro e a área de um trapézio
    public static void trapezio() {
        System.out.println("Informe o comprimento das duas base, dos dois lados paralelos e a altura");
        System.out.println("Base 1:");
        int base1 = sc.nextInt(); // Lê a primeira base do trapézio
        System.out.println("Base 2:");
        int base2 = sc.nextInt(); // Lê a segunda base do trapézio
        System.out.println("Lado 1:");
        int lado1 = sc.nextInt(); // Lê o primeiro lado (não base) do trapézio
        System.out.println("Lado 2:");
        int lado2 = sc.nextInt(); // Lê o segundo lado (não base) do trapézio
        System.out.println("Altura:");
        int heigth = sc.nextInt(); // Lê a altura do trapézio
        // Exibe perímetro e área do trapézio
        System.out
                .println("Perímetro: " + (base1 + base2 + lado1 + lado2) + "\nÁrea: " + ((base1 + base2) * heigth) / 2);
    }
}
