import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Forca {
    // Definição de constantes para limitar o número de temas e palavras por tema.
    private static final int MAX_THEMES = 50;
    private static final int MAX_WORDS_PER_THEME = 50;

    private static Scanner scanner = new Scanner(System.in);

    // Matriz para armazenar temas e suas respectivas palavras.
    // Cada linha representa um tema e cada coluna uma palavra desse tema.
    private static String[][] themes = new String[MAX_THEMES][MAX_WORDS_PER_THEME];
    private static int themeCount = 0; // Contador para o número de temas atualmente registrados.

    public static void main(String[] args) {
        menu();
        scanner.close(); // Fecha o scanner ao terminar a execução.
    }

    // Método que mostra o menu principal e permite ao usuário escolher entre
    // gerenciar temas, palavras ou jogar.
    public static void menu() {
        int choice;
        do {
            System.out.println(
                    "\nPor favor, selecione uma das opções abaixo: \n 1. Gerenciar Temas\n 2. Gerenciar Palavras \n 3. Jogar \n 4. Sair ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner após ler um inteiro.

            switch (choice) {
                case 1:
                    manageThemes(); // Gerencia os temas.
                    break;
                case 2:
                    manageWords(); // Gerencia as palavras.
                    break;
                case 3:
                    game(); // Inicia o jogo.
                    break;
                case 4:
                    System.out.println("Saindo..."); // Sai do programa.
                    break;
            }
        } while (choice != 4); // Repete até que o usuário escolha sair.
    }

    // Método para gerenciar temas, oferecendo opções para cadastrar ou excluir
    // temas.
    public static void manageThemes() {
        System.out.println("Por favor, selecione uma das opções abaixo: \n 1. Cadastrar Tema\n 2. Excluir Tema ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner.

        switch (choice) {
            case 1:
                registerTheme(); // Cadastra um novo tema.
                break;
            case 2:
                deleteTheme(); // Exclui um tema existente.
                break;
        }
    }

    // Método para cadastrar um novo tema. Verifica se já existe e se o limite de
    // temas não foi atingido.
    private static void registerTheme() {
        if (themeCount >= MAX_THEMES) {
            System.out.println("Limite de temas alcançado.");
            return;
        }
        System.out.println("Qual tema deseja cadastrar?");
        String themeName = scanner.nextLine();

        // Verifica se themeName não está vazia
        if (themeName == "") {
            System.out.println("Digite um tema válido");
            return;
        }
        // Verifica se o tema já existe.
        for (int i = 0; i < themeCount; i++) {
            if (themes[i][0].equalsIgnoreCase(themeName)) {
                System.out.println("Este tema já foi cadastrado.");
                return;
            }
        }

        themes[themeCount][0] = themeName; // Adiciona o tema novo.
        themeCount++; // Incrementa o contador de temas.
        System.out.println("Tema cadastrado com sucesso.");
    }

    // Método para excluir um tema. Verifica se há temas para excluir e se o tema
    // escolhido é válido.
    private static void deleteTheme() {
        if (themeCount == 0) {
            System.err.println("Não há temas para excluir.");
            return;
        }
        System.out.println("Qual tema deseja excluir? Escolha pelo índice:");
        // Exibe os temas disponíveis para exclusão.
        for (int i = 0; i < themeCount; i++) {
            System.out.println(i + ". " + themes[i][0]);
        }

        int themeIndex = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner.

        if (themeIndex < 0 || themeIndex >= themeCount) {
            System.out.println("Índice de tema inválido.");
            return;
        }

        // Verifica se há palavras no tema antes de permitir a exclusão.
        if (themes[themeIndex][1] != null) {
            System.err.println("Para realizar esta ação não podem haver palavras dentro deste tema");
        } else {
            // Remove o tema deslocando os temas subsequentes para "subir" na lista.
            for (int i = themeIndex; i < themeCount - 1; i++) {
                themes[i] = themes[i + 1];
            }
            themes[themeCount - 1] = new String[MAX_WORDS_PER_THEME]; // Reinicializa o último tema para vazio.
            themeCount--; // Decrementa o contador de temas.
            System.out.println("Tema excluído com sucesso.");
        }
    }

    // Método para gerenciar palavras, oferecendo opções para cadastrar ou excluir
    // palavras.
    public static void manageWords() {
        System.out.println("Por favor, selecione uma das opções abaixo: \n 1. Cadastrar Palavra\n 2. Excluir Palavra ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner.

        switch (choice) {
            case 1:
                registerWord(); // Registra uma nova palavra.
                break;
            case 2:
                deleteWord(); // Exclui uma palavra existente.
                break;
        }
    }

    // Método para cadastrar uma nova palavra em um tema existente.
    public static void registerWord() {
        if (themeCount == 0) {
            System.out.println("Por favor, cadastre um tema antes de adicionar palavras.");
            return;
        }

        System.out.println("Escolha um tema para adicionar uma palavra (pelo índice):");
        // Exibe os temas disponíveis para adicionar palavras.
        for (int i = 0; i < themeCount; i++) {
            System.out.println(i + ". " + themes[i][0]);
        }

        int themeIndex = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner.

        if (themeIndex < 0 || themeIndex >= themeCount) {
            System.err.println("Índice de tema inválido.");
            return;
        }

        System.out.println("Digite a palavra que deseja adicionar ao tema " + themes[themeIndex][0] + ":");
        String word = scanner.nextLine();

        // Verifica se word não está vazia
        if (word == "") {
            System.out.println("Digite uma palavra válida");
            return;
        }

        // Verifica se a palavra já foi cadastrada no tema escolhido.
        for (int i = 1; i < MAX_WORDS_PER_THEME; i++) {
            if (themes[themeIndex][i] != null && themes[themeIndex][i].equalsIgnoreCase(word)) {
                System.out.println("Palavra já cadastrada neste tema.");
                return;
            }
            if (themes[themeIndex][i] == null) {
                themes[themeIndex][i] = word; // Adiciona a palavra ao tema.
                System.out.println("Palavra adicionada com sucesso.");
                return;
            }
        }
        System.out.println("Limite de palavras por tema alcançado.");
    }

    // Método para excluir uma palavra de um tema.
    public static void deleteWord() {
        if (themeCount == 0) {
            System.out.println("Por favor, cadastre um tema antes de tentar deletar uma palavra.");
            return;
        }

        System.out.println("Escolha um tema para deletar uma palavra (pelo índice):");
        // Exibe os temas disponíveis para exclusão de palavras.
        for (int i = 0; i < themeCount; i++) {
            System.out.println(i + ". " + themes[i][0]);
        }

        int themeIndex = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner.

        if (themeIndex < 0 || themeIndex >= themeCount) {
            System.err.println("Índice de tema inválido.");
            return;
        }

        System.out.println("Escolha uma palavra para remover (pelo índice):");
        int wordCount = 0;

        // Verifica se há palavras no tema antes de permitir a exclusão.
        if (themes[themeIndex][1] == null) {
            System.err.println("Para realizar esta ação é necessário cadastrar uma palavra antes");
            return;
        }

        // Exibe as palavras disponíveis para exclusão.
        for (int i = 1; i < MAX_WORDS_PER_THEME && themes[themeIndex][i] != null; i++, wordCount++) {
            System.out.println(i - 1 + ". " + themes[themeIndex][i]);
        }

        int wordIndex = scanner.nextInt();
        if (wordIndex < 0 || wordIndex >= wordCount) {
            System.err.println("Índice de palavra inválido.");
            return;
        }

        // Correção na lógica de deslocamento das palavras para preencher o espaço vazio
        for (int i = wordIndex + 1; i < wordCount; i++) {
            themes[themeIndex][i] = themes[themeIndex][i + 1];
        }
        themes[themeIndex][wordCount] = null; // Define a última posição como null após mover as palavras.
        System.out.println("Palavra excluída com sucesso.");
        System.out.println("Palavras existentes neste tema:");
        // Exibe as palavras restantes no tema após a exclusão.
        for (int i = 1; i < MAX_WORDS_PER_THEME && themes[themeIndex][i] != null; i++) {
            System.out.println(i - 1 + ". " + themes[themeIndex][i]);
        }
    }

    public static void game() {
        // Verifica se há temas cadastrados
        if (themeCount == 0) {
            System.err.println("Não há temas cadastrados.");
            return;
        }

        // Exibe os temas disponíveis para escolha
        System.out.println("Escolha um tema, pelo índice, para começar a jogar, temas disponíveis:");
        for (int i = 0; i < themeCount; i++) {
            System.out.println(i + ". " + themes[i][0]);
        }

        // Obtém o tema escolhido pelo jogador
        int choice = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer do scanner

        // Conta o número de palavras no tema escolhido
        int wordsInTheme = 0;
        for (int i = 1; i < MAX_WORDS_PER_THEME && themes[choice][i] != null; i++) {
            wordsInTheme++;
        }

        // Verifica se há palavras cadastradas no tema escolhido
        if (wordsInTheme == 0) {
            System.err.println("Não há palavras cadastradas neste tema.");
            return;
        }

        // Escolhe uma palavra aleatória dentro do tema
        int randomIndex = ThreadLocalRandom.current().nextInt(1, wordsInTheme + 1);
        String chosenWord = themes[choice][randomIndex];

        // Inicializa um array de booleanos para controlar as letras adivinhadas
        boolean[] lettersGuessed = new boolean[chosenWord.length()];

        // Inicializa um array para armazenar as letras já digitadas
        String[] letters = new String[27];

        // Inicializa o número de vidas e o indicador de término do jogo
        int numLifes = 5;
        boolean finish = false;
        int index = 0;

        // Loop principal do jogo
        while (!finish && numLifes > 0) {
            // Solicita que o jogador digite uma letra
            System.out.println("Digite uma letra:");
            String input = scanner.nextLine();
            char choice_game = input.length() > 0 ? input.charAt(0) : ' ';
            // Obtém o primeiro caractere da entrada do jogador

            // Verifica se a letra digitada está na palavra escolhida
            boolean letterFound = false;
            for (int i = 0; i < chosenWord.length(); i++) {
                if (chosenWord.charAt(i) == choice_game) {
                    lettersGuessed[i] = true;
                    letterFound = true;
                }
            }

            // Verifica se a letra já foi digitada anteriormente
            boolean exist_letter = false;
            for (int x = 0; letters[x] != null; x++) {
                if (letters[x].equals(String.valueOf(choice_game))) {
                    exist_letter = true;
                    break;
                }
            }

            // Se a letra não foi digitada anteriormente, adiciona-a ao array de letras
            // digitadas
            if (!exist_letter) {
                letters[index] = String.valueOf(choice_game);
                index++;
            }

            // Verifica se a letra não foi digitada anteriormente e atualiza as vidas e a
            // saída de acordo
            if (!exist_letter) {
                if (!letterFound) {
                    numLifes--;
                    System.out.println("A letra '" + choice_game + "' não existe na palavra. Você tem " + numLifes
                            + " vidas restantes.");
                } else {
                    System.out.println("A letra '" + choice_game + "' existe na palavra!");
                }
            } else {
                System.err.println("Tente outra letra!");
            }

            // Verifica se todas as letras da palavra foram adivinhadas
            finish = true;
            for (int i = 0; i < lettersGuessed.length; i++) {
                if (!lettersGuessed[i]) {
                    finish = false;
                    break;
                }
            }

            // Verifica se o jogador perdeu ou ganhou o jogo e exibe a mensagem
            // correspondente
            if (numLifes == 0) {
                System.out.println(
                        "Que pena! Você perdeu! \nDeseja jogar novamente? se sim, no menu principal, digite 3");
            } else if (finish) {
                System.out.println("Parabéns! Você acertou a palavra: " + chosenWord
                        + " \nDeseja jogar novamente? se sim, no menu principal, digite 3");
            }
        }
    }
}
