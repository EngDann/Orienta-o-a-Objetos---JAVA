package aula6.Calculadora;

public class Calculadora_Principal {
    public static void main(String[] args) {
        // Cria duas instâncias da classe Calculadora
        Calculadora Calculadora1, Calculadora2;

        // Inicializa a primeira calculadora com os valores 2 e 5
        Calculadora1 = new Calculadora(2, 5);
        // Realiza a operação de soma com a primeira calculadora
        Calculadora1.somar();

        // Inicializa a segunda calculadora com o construtor padrão
        Calculadora2 = new Calculadora();
        // Define o valor do primeiro operador da segunda calculadora para 5
        Calculadora2.setOp1(5);
        // Define o valor do segundo operador da segunda calculadora para 1
        Calculadora2.setOp2(1);
        // Realiza a operação de subtração com a segunda calculadora
        Calculadora2.subtrair();

        System.out.println(Calculadora1.getOp1() + " + " + Calculadora1.getOp2() + " = " + Calculadora1.getResultado());
        System.out.println(Calculadora2.getOp1() + " - " + Calculadora2.getOp2() + " = " + Calculadora2.getResultado());
    }
}
