package aula9.calculadoraPAPG;

import java.util.Scanner;

class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Informe o valor de a0: ");
            int a0 = scanner.nextInt();

            System.out.print("Informe o valor de r: ");
            int r = scanner.nextInt();

            System.out.print("Informe o valor de n: ");
            int n = scanner.nextInt();

            PA pa = new PA(a0, r, n);
            PG pg = new PG(a0, r, n);
            pa.calcular();
            pg.calcular();

            System.out.print("PA = [");
            for (int i = 0; i < pa.getTermos().size(); i++) {
                System.out.print(pa.getTermos().get(i).getValor());
                if (i < pa.getTermos().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.print("PG = [");
            for (int i = 0; i < pg.getTermos().size(); i++) {
                System.out.print(pg.getTermos().get(i).getValor());
                if (i < pg.getTermos().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.print("Deseja calcular novas progressões? (s/n): ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        scanner.close();
    }
}