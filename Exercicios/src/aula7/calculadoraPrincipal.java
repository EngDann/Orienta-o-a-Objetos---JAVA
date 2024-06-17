package aula7;

import java.util.*;

public class calculadoraPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char escolha = ' ';
        char operacao = ' ';
        int escolhaSinal = 0;

        calculadora5Operacoes calculadora = new calculadora5Operacoes();
        do {
            System.out.println("Informe o valor do primeiro operando: ");
            calculadora.setOp1(sc.nextInt());
            System.out.println("Informe o valor do segundo operando: ");
            calculadora.setOp2(sc.nextInt());
            System.out.println("Informe a operação desejada: (+, -, *, /, ! -> inversão de sinal)");
            operacao = sc.next().charAt(0);
            switch (operacao) {
                case '+':
                    calculadora.somar();
                    break;
                case '-':
                    calculadora.subtrair();
                    break;
                case '*':
                    calculadora.multiplicar();
                    break;
                case '/':
                    calculadora.dividir();
                    break;
                case '!':
                    System.out.println("Deseja saber o inverso do operador 1 ou 2?");
                    escolhaSinal = sc.nextInt();
                    if (escolhaSinal == 1) {
                        calculadora.trocarSinal(calculadora.getOp1());
                    } else if (escolhaSinal == 2) {
                        calculadora.trocarSinal(calculadora.getOp2());
                    } else {
                        System.out.println("Selecione um operador válido");

                    }
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }
            System.out.println(calculadora.getResultado());
            System.out.println("Desejar realizar mais um cálculo? (s/n)");
            escolha = sc.next().charAt(0);
        } while (escolha != 'n');
        sc.close();
        System.out.println("Obrigado por utilizar minha calculadora");

    }
}
