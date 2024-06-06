package revisao;

public class exercicio2 {
    public static void main(String[] args) {
        String Lojas[] = { "Carioca", "Imperatriz" };
        String Produtos[] = { "Artigos para construção", "Artigos de papelaria", "Roupas" };
        final Boolean[][] M = {
                { true, true, true },
                { false, true, true }
        };
        for (int i = 0; i < Lojas.length; i++) {
            System.out.print(Lojas[i] + ": ");
            boolean primeiroProduto = true;
            for (int j = 0; j < Produtos.length; j++) {
                if (M[i][j]) {
                    if (!primeiroProduto) {
                        System.out.print(", ");
                    }
                    System.out.print(Produtos[j]);
                    primeiroProduto = false;
                }
            }
            System.out.println();
        }
    }
}
