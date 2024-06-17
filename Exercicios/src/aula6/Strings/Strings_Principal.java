package aula6.Strings;

public class Strings_Principal {
    public static void main(String[] args) {
        // Declara uma variável do tipo Strings
        Strings Palavra1;
        // Inicializa a variável com um novo objeto Strings
        Palavra1 = new Strings();
        // Define a string "ola" para o objeto Palavra1
        Palavra1.setString("ola");

        // Verifica se a string armazenada no objeto Palavra1 é um palíndromo
        if (Palavra1.palindromo()) {
            System.out.println(Palavra1.getString() + " é palindromo");
        } else {
            System.out.println(Palavra1.getString() + " não é palindromo");
        }

        // Imprime o número de vogais na string armazenada no objeto Palavra1
        System.out.println(Palavra1.getString() + " possui " + Palavra1.vogais() + " vogais");
        // Imprime a string invertida do objeto Palavra1
        System.out.println(Palavra1.getString() + " invertido fica: " + Palavra1.inverter());
    }
}
