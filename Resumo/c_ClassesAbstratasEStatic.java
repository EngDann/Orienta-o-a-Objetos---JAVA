package Resumo;

/**
 * Uma classe abstrata em Java é uma classe que não pode ser instanciada
 * diretamente e é destinada a ser subclassificada por outras classes.
 * Ela pode conter métodos abstratos e métodos concretos.
 * 
 * A palavra-chave static é usada para definir membros que pertencem à classe em
 * si, em vez de instâncias individuais. Isso significa que membros static
 * são compartilhados entre todas as instâncias da classe e podem ser acessados
 * sem criar uma instância da classe.
 */
public class c_ClassesAbstratasEStatic {

    // Classe abstrata Animal
    public static abstract class Animal {
        protected String nome;

        // Construtor padrão
        public Animal() {
        }

        // Construtor alternativo
        public Animal(String nome) {
            this.nome = nome;
        }

        // Método abstrato
        public abstract void fazerSom();

        // Método concreto
        public void dormir() {
            System.out.println(nome + " está dormindo.");
        }

        // Métodos get e set
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }

    // Subclasse Cachorro que estende Animal
    public static class Cachorro extends Animal {
        // Construtor padrão
        public Cachorro() {
        }

        // Construtor alternativo
        public Cachorro(String nome) {
            super(nome);
        }

        // Implementação do método abstrato
        @Override
        public void fazerSom() {
            System.out.println(nome + " diz: Au Au!");
        }
    }

    // Subclasse Gato que estende Animal
    public static class Gato extends Animal {
        // Construtor padrão
        public Gato() {
        }

        // Construtor alternativo
        public Gato(String nome) {
            super(nome);
        }

        // Implementação do método abstrato
        @Override
        public void fazerSom() {
            System.out.println(nome + " diz: Miau!");
        }
    }

    // Classe Utilitaria com método static
    public static class Utilitaria {
        // Método static
        public static void imprimirMensagem(String mensagem) {
            System.out.println("Mensagem: " + mensagem);
        }
    }

    // Classe principal para demonstrar classes abstratas e static
    public static class Principal {
        public static void main(String[] args) {
            // Polimorfismo com classes abstratas
            Animal cachorro = new Cachorro("Rex");
            Animal gato = new Gato("Felix");

            cachorro.fazerSom();
            cachorro.dormir();

            gato.fazerSom();
            gato.dormir();

            // Usando método static
            Utilitaria.imprimirMensagem("Bem-vindo ao mundo da programação Java!");
        }
    }
}
