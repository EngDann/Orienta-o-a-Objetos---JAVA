package Resumo;

public class a_Objeto_Classe {
    // Atributos
    // Atributos são variáveis que pertencem a uma classe. Eles representam as
    // características ou propriedades que os objetos dessa classe podem ter.
    String nome;
    int idade;

    // Classe
    // Uma classe é um modelo ou blueprint a partir do qual os objetos são criados.
    // Ela define um novo tipo de dado com atributos e métodos.
    public static class Pessoa {
        String nome;
        int idade;

        // Construtor
        // Um construtor é um método especial usado para inicializar objetos. Ele é
        // chamado quando um objeto da classe é criado.
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        // Método para exibir as informações do objeto
        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }

    // Objeto
    // Um objeto é uma instância de uma classe. Quando criamos um objeto, estamos
    // alocando memória para ele e inicializando seus atributos.
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("João", 25);

        // Chamando o método do objeto para exibir as informações
        pessoa.exibirInformacoes();
    }

    // This
    // A palavra-chave this é usada para referenciar o objeto atual. É
    // frequentemente usada em métodos construtores e setters para diferenciar entre
    // atributos da classe e parâmetros do método.
    public class Carro {
        String modelo;
        int ano;

        // Construtor usando this
        public Carro(String modelo, int ano) {
            this.modelo = modelo;
            this.ano = ano;
        }
    }
}
