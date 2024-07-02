package aula9.calculadoraAreaPerimetro;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura[] figuras = new Figura[5];
        int[] operacoes = new int[5];
        String continua = "S";

        do {
            System.out.println("1 - Quadrado\n2 - Retangulo\n3 - Triangulo\n4 - Circulo\n5 - Trapezio");
            System.out.println("Informe o tipo da figura:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (operacoes[0] != 1) {
                        System.out.println("Informe a medida do lado do quadrado: ");
                        int lado = sc.nextInt();
                        Quadrado quadrado = new Quadrado();
                        quadrado.setLado(lado);
                        quadrado.Calculo();
                        figuras[0] = quadrado;
                        operacoes[0] = 1;
                    } else {
                        System.out.println("Já existe um quadrado cadastrado");
                    }
                    break;
                case 2:
                    if (operacoes[1] != 1) {
                        System.out.println("Informe a base do retângulo: ");
                        int base = sc.nextInt();
                        System.out.println("Informe a altura do retângulo: ");
                        int altura = sc.nextInt();
                        Retangulo retangulo = new Retangulo();
                        retangulo.setBase(base);
                        retangulo.setAltura(altura);
                        retangulo.Calculo();
                        figuras[1] = retangulo;
                        operacoes[1] = 1;
                    } else {
                        System.out.println("Já existe um retângulo cadastrado");
                    }
                    break;
                case 3:
                    if (operacoes[2] != 1) {
                        System.out.println("Informe a base do triângulo: ");
                        int base = sc.nextInt();
                        System.out.println("Informe a altura do triângulo: ");
                        int altura = sc.nextInt();
                        System.out.println("Informe o primeiro lado do triângulo: ");
                        int lado1 = sc.nextInt();
                        System.out.println("Informe o segundo lado do triângulo: ");
                        int lado2 = sc.nextInt();
                        System.out.println("Informe o terceiro lado do triângulo: ");
                        int lado3 = sc.nextInt();
                        Triangulo triangulo = new Triangulo();
                        triangulo.setBase(base);
                        triangulo.setAltura(altura);
                        triangulo.setLado(new int[] { lado1, lado2, lado3 });
                        triangulo.Calculo();
                        figuras[2] = triangulo;
                        operacoes[2] = 1;
                    } else {
                        System.out.println("Já existe um triângulo cadastrado");
                    }
                    break;
                case 4:
                    if (operacoes[3] != 1) {
                        System.out.println("Informe o raio do círculo: ");
                        int raio = sc.nextInt();
                        Circulo circulo = new Circulo();
                        circulo.setRaio(raio);
                        circulo.Calculo();
                        figuras[3] = circulo;
                        operacoes[3] = 1;
                    } else {
                        System.out.println("Já existe um círculo cadastrado");
                    }
                    break;
                case 5:
                    if (operacoes[4] != 1) {
                        System.out.println("Informe a base maior do trapézio: ");
                        int baseMaior = sc.nextInt();
                        System.out.println("Informe a base menor do trapézio: ");
                        int baseMenor = sc.nextInt();
                        System.out.println("Informe a altura do trapézio: ");
                        int altura = sc.nextInt();
                        Trapezio trapezio = new Trapezio();
                        trapezio.setBaseMaior(baseMaior);
                        trapezio.setBaseMenor(baseMenor);
                        trapezio.setAltura(altura);
                        trapezio.Calculo();
                        figuras[4] = trapezio;
                        operacoes[4] = 1;
                    } else {
                        System.out.println("Já existe um trapézio cadastrado");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Deseja adicionar outra figura? (S/N)");
            continua = sc.next();
        } while (continua.equalsIgnoreCase("S"));

        for (int num = 0; num < operacoes.length; num++) {
            if (operacoes[num] == 1) {
                figuras[num].resultado();
            }
        }
        sc.close();
    }
}
