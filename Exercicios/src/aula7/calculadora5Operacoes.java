package aula7;

public class calculadora5Operacoes {

    // Atributos da classe Calculadora
    int op1, op2;
    float resultado;

    // Construtor que inicializa os operadores com valores fornecidos
    public calculadora5Operacoes(int op1, int op2) {
        // 'this' refere-se ao atributo da instância da classe
        // 'op1' e 'op2' são os parâmetros passados ao construtor
        this.op1 = op1;
        this.op2 = op2;
    }

    // Construtor padrão sem parâmetros
    public calculadora5Operacoes() {

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
    public float getResultado() {
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
    public float somar() {
        resultado = op1 + op2; // Atribui a soma de op1 e op2 ao atributo 'resultado'
        return resultado; // Retorna o valor de 'resultado'
    }

    // Método para subtrair op2 de op1 e armazenar o resultado
    public float subtrair() {
        resultado = op1 - op2; // Atribui a subtração de op2 de op1 ao atributo 'resultado'
        return resultado; // Retorna o valor de 'resultado'
    }

    public float dividir() {
        resultado = op1 / op2;
        return resultado;
    }

    public float multiplicar() {
        resultado = op1 * op2;
        return resultado;
    }

    public float trocarSinal(int op) {
        resultado = op * -1;
        return resultado;
    }
}
