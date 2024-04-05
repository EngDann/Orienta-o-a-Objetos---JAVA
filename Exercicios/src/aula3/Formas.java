package aula3;

import java.util.Scanner;
import java.lang.Math;

public class Formas {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        System.out.println("Saindo . . .");
        sc.close();
    }

    public static void menu() {
        int escolha;

        do {
            System.out.println("Escolha a figura geométrica desejada  \n"
                    + "1 - Circulo  \n"
                    + "2 - Quadrado  \n"
                    + "3 - Retângulo  \n"
                    + "4 - Trapézio  ");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    circulo();
                    break;
                case 2:
                    quadrado();
                    break;
                case 3:
                    retangulo();
                    break;
                case 4:
                    trapezio();
                    break;
            }

        } while (escolha >= 1 && escolha <= 4);
    }

    public static void circulo() {
        System.out.println("Qual o raio do circulo?");
        int radius = sc.nextInt();
        System.out.println("Perímetro: " + radius * 2 * Math.PI + "\nÁrea: " + Math.PI * Math.pow(radius, 2));
    }

    public static void quadrado() {
        System.out.println("Informe o comprimento de um dos lados do quadrado");
        int length = sc.nextInt();
        System.out.println("Perímetro: " + length * 4 + "\nÁrea: " + Math.pow(length, 2));
    }

    public static void retangulo() {
        System.out.println("Informe o comprimento e a largura do retângulo");
        System.out.println("Comprimento:");
        int length = sc.nextInt();
        System.out.println("Largura:");
        int width = sc.nextInt();
        System.out.println("Perímetro: " + 2 * (length + width) + "\nÁrea: " + length * width);
    }

    public static void trapezio() {
        System.out.println("Informe o comprimento das duas base, dos dois lados paralelos e a altura");
        System.out.println("Base 1:");
        int base1 = sc.nextInt();
        System.out.println("Base 2:");
        int base2 = sc.nextInt();
        System.out.println("Lado 1:");
        int lado1 = sc.nextInt();
        System.out.println("Lado 2:");
        int lado2 = sc.nextInt();
        System.out.println("Altura:");
        int heigth = sc.nextInt();
        System.out.println("Perímetro: " + base1 + base2 + lado1 + lado2 + "\nÁrea: " + ((base1 + base2) * heigth) / 2);
    }
}
