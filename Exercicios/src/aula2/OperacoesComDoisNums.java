package aula2;

import javax.swing.JOptionPane; // Importa a classe JOptionPane para usar caixas de diálogo
import java.text.*; // Importa a classe DecimalFormat para formatação de números

public class OperacoesComDoisNums {
    // Método principal que executa o programa
    public static void main(String[] args) {
        // Lê dois números float do usuário usando caixas de diálogo
        float num1 = lerInteiro("Qual o primeiro num? ");
        float num2 = lerInteiro("Qual o segundo num? ");

        // Cria um objeto DecimalFormat para formatar os números com duas casas decimais
        DecimalFormat df = new DecimalFormat("#.##");

        // Realiza operações básicas entre os dois números e formata o resultado
        String soma = df.format(num1 + num2); // Realiza a soma
        String subtracao = df.format(num1 - num2); // Realiza a subtração
        String multiplicacao = df.format(num1 * num2); // Realiza a multiplicação
        String divisao = df.format(num1 / num2); // Realiza a divisão
        // Realiza a exponenciação (num1 elevado a num2) e formata o resultado
        String exponenciacao = df.format(Math.pow(num1, num2));

        // Monta uma string contendo os resultados das operações
        String mensagem = "Soma: " + soma +
                "\nSubtração: " + subtracao +
                "\nMultiplicação: " + multiplicacao +
                "\nDivisão: " + divisao +
                "\nExponenciação: " + exponenciacao;

        // Exibe uma caixa de diálogo contendo os resultados das operações
        JOptionPane.showMessageDialog(null, mensagem);
    }

    // Método que exibe uma caixa de diálogo para o usuário inserir um número,
    // retorna esse número como float
    public static float lerInteiro(String msg) {
        // Exibe uma caixa de diálogo pedindo por um número
        String num_str = JOptionPane.showInputDialog(msg);
        // Converte o número de String para float
        float num = Float.parseFloat(num_str);
        return num; // Retorna o número
    }
}
