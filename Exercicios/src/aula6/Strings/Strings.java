package aula6.Strings;

public class Strings {
    // Declaração de um atributo para armazenar a palavra
    String Palavra;

    // Construtor que inicializa a palavra com um valor fornecido
    public Strings(String Palavra) {
        this.Palavra = Palavra;
    }

    // Construtor padrão
    public Strings() {
    }

    // Método setter para definir o valor da palavra
    public void setString(String Palavra) {
        this.Palavra = Palavra;
    }

    // Método getter para obter o valor da palavra
    public String getString() {
        return Palavra;
    }

    // Método para transformar a string em um vetor de caracteres
    public char[] transformaStrEmChar(String Palavra) {
        char[] letras = new char[Palavra.length()];
        for (int i = 0; i < Palavra.length(); i++) {
            letras[i] = Palavra.charAt(i);
        }
        return letras;
    }

    // Método para verificar se a palavra é um palíndromo
    public boolean palindromo() {
        // Converte a palavra para minúsculas e transforma em vetor de caracteres
        char letras[] = transformaStrEmChar(this.Palavra.toLowerCase());
        int metade = this.Palavra.length() / 2;
        int fim = this.Palavra.length() - 1;
        boolean ehPalindromo = true;

        // Compara as letras do início com as do fim, movendo-se para o centro
        for (int i = 0; i < metade; i++) {
            if (letras[i] != this.Palavra.charAt(fim - i)) {
                ehPalindromo = false;
                break; // Sai do loop se não for palíndromo
            }
        }
        return ehPalindromo;
    }

    // Método para contar o número de vogais na palavra
    public int vogais() {
        // Converte a palavra para minúsculas e transforma em vetor de caracteres
        char letras[] = transformaStrEmChar(this.Palavra.toLowerCase());
        int quantVogais = 0;

        // Conta o número de vogais no vetor de caracteres
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
                quantVogais++;
            }
        }
        return quantVogais;
    }

    // Método para inverter a palavra
    public String inverter() {
        // Transforma a palavra em um vetor de caracteres
        char letras[] = transformaStrEmChar(this.Palavra);
        char[] invertido = new char[letras.length];
        int fim = this.Palavra.length() - 1;

        // Inverte o vetor de caracteres
        for (int i = 0; i < this.Palavra.length(); i++) {
            invertido[fim - i] = letras[i];
        }

        // Converte o vetor invertido de volta para uma string
        String palavraInvertida = String.copyValueOf(invertido);
        return palavraInvertida;
    }
}
