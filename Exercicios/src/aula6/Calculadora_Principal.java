package aula6;

public class Calculadora_Principal {
    public static void main(String[] args) {
        Calculadora Calculadora1, Calculadora2;
        Calculadora1 = new Calculadora(2, 5);
        Calculadora1.somar();
        Calculadora2 = new Calculadora();
        Calculadora2.setOp1(5);
        Calculadora2.setOp2(1);

        System.out.println(Calculadora1.getResultado());

    }
}
