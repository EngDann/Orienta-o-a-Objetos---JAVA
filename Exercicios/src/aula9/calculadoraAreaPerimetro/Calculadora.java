package aula9.calculadoraAreaPerimetro;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, baseMaior, baseMenor, raio, base, lado;
        int[] lados = new int[3];
        Quadrado QUADRADO = new Quadrado();
        Retangulo RETANGULO = new Retangulo();
        Triangulo TRIANGULO = new Triangulo();
        Circulo CIRCULO = new Circulo();
        Trapezio TRAPEZIO = new Trapezio();
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
                        lado = sc.nextInt();
                        QUADRADO.setLado(lado);
                        QUADRADO.Calculo();
                        operacoes[0] = 1;
                    } else {
                        System.out.println("Já existe um quadrado cadastrado");
                    }
                    break;
                case 2:
                    if (operacoes[1] != 1) {
                        System.out.println("Informe a base do retângulo: ");
                        base = sc.nextInt();
                        System.out.println("Informe a altura do retângulo: ");
                        altura = sc.nextInt();
                        RETANGULO.setBase(base);
                        RETANGULO.setAltura(altura);
                        RETANGULO.Calculo();
                        operacoes[1] = 1;
                    } else {
                        System.out.println("Já existe um retângulo cadastrado");
                    }
                    break;
                case 3:
                    if (operacoes[2] != 1) {
                        System.out.println("Informe a base do triângulo: ");
                        base = sc.nextInt();
                        System.out.println("Informe a altura do triângulo: ");
                        altura = sc.nextInt();
                        System.out.println("Informe o primeiro lado do triângulo: ");
                        lados[0] = sc.nextInt();
                        System.out.println("Informe o segundo lado do triângulo: ");
                        lados[1] = sc.nextInt();
                        System.out.println("Informe o terceiro lado do triângulo: ");
                        lados[2] = sc.nextInt();
                        TRIANGULO.setBase(base);
                        TRIANGULO.setAltura(altura);
                        TRIANGULO.setLado(lados);
                        TRIANGULO.Calculo();
                        operacoes[2] = 1;
                    } else {
                        System.out.println("Já existe um triângulo cadastrado");
                    }
                    break;
                case 4:
                    if (operacoes[3] != 1) {
                        System.out.println("Informe o raio do círculo: ");
                        raio = sc.nextInt();
                        CIRCULO.setRaio(raio);
                        CIRCULO.Calculo();
                        operacoes[3] = 1;
                    } else {
                        System.out.println("Já existe um círculo cadastrado");
                    }
                    break;
                case 5:
                    if (operacoes[4] != 1) {
                        System.out.println("Informe a base maior do trapézio: ");
                        baseMaior = sc.nextInt();
                        System.out.println("Informe a base menor do trapézio: ");
                        baseMenor = sc.nextInt();
                        System.out.println("Informe a altura do trapézio: ");
                        altura = sc.nextInt();
                        TRAPEZIO.setBaseMaior(baseMaior);
                        TRAPEZIO.setBaseMenor(baseMenor);
                        TRAPEZIO.setAltura(altura);
                        TRAPEZIO.Calculo();
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
                switch (num) {
                    case 0:
                        QUADRADO.resultado();

                        break;
                    case 1:
                        RETANGULO.resultado();
                        break;
                    case 2:
                        TRIANGULO.resultado();
                        break;
                    case 3:
                        CIRCULO.resultado();
                        break;
                    case 4:
                        TRAPEZIO.resultado();
                        break;
                    default:
                        break;
                }
            }
        }
        sc.close();
    }
}
