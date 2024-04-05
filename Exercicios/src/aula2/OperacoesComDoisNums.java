package aula2;

import javax.swing.JOptionPane;
import java.text.*;

public class OperacoesComDoisNums {
    public static void main(String[] args) {
        float num1 = lerInteiro("Qual o primeiro num? ");
        float num2 = lerInteiro("Qual o segundo num? ");

        DecimalFormat df = new DecimalFormat("#.##");

        // Realizando as operações e aplicando a formatação aos resultados
        String soma = df.format(num1 + num2);
        String subtracao = df.format(num1 - num2);
        String multiplicacao = df.format(num1 * num2);
        String divisao = df.format(num1 / num2);
        String exponenciacao = df.format(Math.pow(num1, num2));

        // Montando a mensagem a ser exibida
        String mensagem = "Soma: " + soma +
                "\nSubtração: " + subtracao +
                "\nMultiplicação: " + multiplicacao +
                "\nDivisão: " + divisao +
                "\nExponenciação: " + exponenciacao;

        // Exibindo a mensagem com JOptionPane
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static float lerInteiro(String msg) {
        String num_str = JOptionPane.showInputDialog(msg);
        float num = Float.parseFloat(num_str);
        return num;
    }
}
