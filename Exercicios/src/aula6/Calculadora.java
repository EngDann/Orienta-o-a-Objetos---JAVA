package aula6;

public class Calculadora {
    int op1, op2, resultado;

    public Calculadora(int op1, int op2) {
        this.op1 = op1;
        this.op1 = op2;
    }

    public Calculadora() {

    };

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int getResultado() {
        return resultado;
    }

    public int getOp1() {
        return op1;
    }

    public int getOp2() {
        return op2;
    }

    public int somar() {
        resultado = op1 + op2;
        return resultado;
    }

    public int subtrair() {
        resultado = op1 - op2;
        return resultado;
    }

}
