package aula6.Calculadora;

public class Calculadora {
    // Atributos da classe Calculadora
    int op1, op2, resultado;

    // Construtor que inicializa os operadores com valores fornecidos
    public Calculadora(int op1, int op2) {
        // 'this' refere-se ao atributo da instância da classe
        // 'op1' e 'op2' são os parâmetros passados ao construtor
        this.op1 = op1;
        this.op2 = op2;
    }

    // Construtor padrão sem parâmetros
    public Calculadora() {

    };

    // Método setter para definir o valor de op1
    public void setOp1(int op1) {
        this.op1 = op1; // 'this.op1' refere-se ao atributo da instância, enquanto 'op1' é o parâmetro
    }

    // Método setter para definir o valor de op2
    public void setOp2(int op2) {
        this.op2 = op2; // 'this.op2' refere-se ao atributo da instância, enquanto 'op2' é o parâmetro
    }

    // Método getter para obter o valor de resultado
    public int getResultado() {
        return resultado; // Retorna o valor do atributo 'resultado'
    }

    // Método getter para obter o valor de op1
    public int getOp1() {
        return op1; // Retorna o valor do atributo 'op1'
    }

    // Método getter para obter o valor de op2
    public int getOp2() {
        return op2; // Retorna o valor do atributo 'op2'
    }

    // Método para somar op1 e op2 e armazenar o resultado
    public int somar() {
        resultado = op1 + op2; // Atribui a soma de op1 e op2 ao atributo 'resultado'
        return resultado; // Retorna o valor de 'resultado'
    }

    // Método para subtrair op2 de op1 e armazenar o resultado
    public int subtrair() {
        resultado = op1 - op2; // Atribui a subtração de op2 de op1 ao atributo 'resultado'
        return resultado; // Retorna o valor de 'resultado'
    }
}
