package aula2;

import javax.swing.JOptionPane; // Importa a classe JOptionPane para uso de caixas de diálogo

public class VerificadorTrianguloRetangulo {
        // Método principal que executa o programa
        public static void main(String[] args) {
                // Solicita ao usuário os valores dos lados 'a', 'b' e 'c' de um triângulo,
                // usando caixas de diálogo
                String inputA = JOptionPane.showInputDialog(null, "Digite o valor de a:", "Entrada de Dados",
                                JOptionPane.QUESTION_MESSAGE);
                String inputB = JOptionPane.showInputDialog(null, "Digite o valor de b:", "Entrada de Dados",
                                JOptionPane.QUESTION_MESSAGE);
                String inputC = JOptionPane.showInputDialog(null, "Digite o valor de c:", "Entrada de Dados",
                                JOptionPane.QUESTION_MESSAGE);

                // Converte os valores de entrada de String para float
                float a = Float.parseFloat(inputA);
                float b = Float.parseFloat(inputB);
                float c = Float.parseFloat(inputC);

                // Verifica se o triângulo é retângulo segundo o teorema de Pitágoras (a^2 = b^2
                // + c^2)
                // a representa a hipotenusa, e b e c representam os catetos do triângulo
                boolean resultado = a * a == (b * b + c * c);

                // Exibe o resultado da verificação em uma caixa de diálogo
                JOptionPane.showMessageDialog(null, "O resultado da expressão a*a == (b*b + c*c) é: " + resultado,
                                "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
}
