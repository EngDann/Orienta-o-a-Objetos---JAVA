package aula4;

import javax.swing.JOptionPane; // Importa a classe JOptionPane para uso de caixas de diálogo
import java.util.Random; // Importa a classe Random para geração de números aleatórios

public class OrdenarMatriz {
    public static void main(String[] args) {
        // Solicita ao usuário o número de valores a serem gerados e o limite máximo
        String num_matriz = JOptionPane.showInputDialog("Informe o número de valores a serem gerados: ");
        String num_max = JOptionPane.showInputDialog("Informe o número limite que o programa pode atingir ");
        int maximo = Integer.parseInt(num_max);
        int quantidade = Integer.parseInt(num_matriz);
        int array[] = new int[quantidade];

        Random random = new Random(); // Cria um objeto Random para geração de números aleatórios
        // Preenche o array com valores aleatórios entre 0 e maximo
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maximo + 1);
        }
        array = Ordenar(array); // Ordena o array

        // Decide como imprimir o array baseado na quantidade de valores
        if (raizExata(Math.sqrt(quantidade))) {
            ImprimirComplexo(array); // Se a raiz quadrada da quantidade for exata, imprime de forma complexa
        } else {
            ImprimirSimples(array); // Caso contrário, imprime de forma simples
        }
    }

    // Verifica se um número possui raiz quadrada exata
    public static boolean raizExata(double x) {
        return x - Math.floor(x) == 0;
    }

    // Método de ordenação bubble sort para ordenar um array de inteiros
    public static int[] Ordenar(int[] x) {
        boolean houveTroca = true;
        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    int swap = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = swap;
                    houveTroca = true;
                }
            }
        }
        return x;
    }

    // Imprime o array de forma complexa, organizando os valores em grupos
    public static void ImprimirComplexo(int[] x) {
        int limite = (int) Math.sqrt(x.length);
        int totalGrupos = (int) Math.ceil((double) x.length / limite);
        int index = 0;
        for (int grupo = 0; grupo < totalGrupos; grupo++) {
            System.out.print("|");
            for (int i = 0; i < limite; i++) {
                if (index < x.length) {
                    System.out.print(" " + x[index] + " ");
                    index++;
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    // Imprime o array de forma simples, em uma única linha
    public static void ImprimirSimples(int[] x) {
        for (int a = 0; a < x.length; a++) {
            if (a == 0) {
                System.out.print("[");
            } else if (a > 0 && a < x.length - 1)
                System.out.print(x[a] + ", ");
            else {
                System.out.print(x[a] + "]");
            }
        }
        System.out.println(" ");
    }
}
