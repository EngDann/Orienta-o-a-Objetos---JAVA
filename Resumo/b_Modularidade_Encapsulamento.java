package Resumo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b_Modularidade_Encapsulamento {

    // Pacotes e Namespaces
    // Pacotes são agrupamentos de classes relacionadas, ajudando na organização
    // do código e na definição de namespaces.
    // As classes ModuloA e ModuloB pertencem a pacotes diferentes e possuem
    // atributos com o mesmo nome.

    // Simulando a classe em um pacote diferente
    public static class ModuloA {
        public String nome = "ModuloA"; // Atributo nome em ModuloA
    }

    // Simulando a classe em outro pacote
    public static class ModuloB {
        public String nome = "ModuloB"; // Atributo nome em ModuloB
    }

    // Encapsulamento e Modificadores de Acesso
    // Encapsulamento é a prática de esconder os detalhes de implementação de uma
    // classe, expondo apenas uma interface pública.
    // Modificadores de acesso definem a visibilidade de classes, métodos e
    // atributos.
    public static class Encapsulamento {
        public int publico; // Acesso em todo o projeto
        protected int protegido; // Acesso no mesmo pacote e subclasses
        int pacote; // Acesso apenas no mesmo pacote (default)
        private int privado; // Acesso apenas dentro da mesma classe

        // Métodos públicos para acessar atributos privados

        // Método get para acessar o valor do atributo privado
        public int getPrivado() {
            return privado;
        }

        // Método set para modificar o valor do atributo privado
        public void setPrivado(int privado) {
            // Podemos adicionar validações aqui antes de alterar o valor
            if (privado >= 0) { // Exemplo de validação: o valor deve ser não negativo
                this.privado = privado;
            } else {
                System.out.println("Valor inválido. Deve ser não negativo.");
            }
        }
    }

    // Escopo de Elementos
    // O escopo de um elemento determina onde ele pode ser acessado: escopo de
    // instância (objeto) ou escopo de classe (estático).
    public static class Escopo {
        public static int atributoDeClasse; // Atributo de classe (estático)
        public int atributoDeInstancia; // Atributo de instância

        public void exemploEscopo() {
            // Acessando atributo de classe pela classe
            Escopo.atributoDeClasse = 10;

            // Acessando atributo de instância pelo objeto
            this.atributoDeInstancia = 20;
        }
    }

    // Referenciando Atributos
    // Um atributo pode ser referenciado pela classe (se for estático) ou pelo
    // objeto (se for de instância).
    public static class Referencia {
        public static int atributoEstatico;
        public int atributoInstancia;

        public void exemploReferencia() {
            // Referenciando atributo estático pela classe
            Referencia.atributoEstatico = 30;

            // Referenciando atributo de instância pelo objeto
            this.atributoInstancia = 40;
        }
    }

    // List e Map
    // List: Uma lista é uma coleção ordenada que permite elementos duplicados.
    // Ela mantém a ordem de inserção dos elementos, permitindo acesso por índice.
    // Map: Um mapa é uma coleção de pares chave-valor, onde cada chave é única.
    // É usado para associar chaves a valores, permitindo buscas rápidas.
    public static class ListMapExample {

        public void listExample() {
            // Criação de uma lista de strings usando ArrayList
            List<String> listaDeNomes = new ArrayList<>();
            listaDeNomes.add("Alice");
            listaDeNomes.add("Bob");
            listaDeNomes.add("Charlie");

            // Iterando sobre a lista e imprimindo cada nome
            for (String nome : listaDeNomes) {
                System.out.println("Nome: " + nome);
            }

            // Acessando um elemento específico pelo índice
            System.out.println("Primeiro nome na lista: " + listaDeNomes.get(0));
        }

        public void mapExample() {
            // Criação de um mapa para armazenar notas de alunos
            Map<String, Integer> notas = new HashMap<>();
            notas.put("Alice", 90);
            notas.put("Bob", 85);
            notas.put("Charlie", 92);

            // Iterando sobre o mapa e imprimindo cada aluno e sua nota
            for (Map.Entry<String, Integer> entry : notas.entrySet()) {
                System.out.println("Aluno: " + entry.getKey() + ", Nota: " + entry.getValue());
            }

            // Acessando a nota de um aluno específico usando a chave
            System.out.println("Nota de Alice: " + notas.get("Alice"));
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("========Pacotes========");
        ModuloA moduloA = new ModuloA();
        System.out.println("Nome no ModuloA: " + moduloA.nome);

        ModuloB moduloB = new ModuloB();
        System.out.println("Nome no ModuloB: " + moduloB.nome);
        System.out.println("========Pacotes========");
        System.out.println();

        System.out.println("========Encapsulamento========");

        // Exemplo de Encapsulamento e Modificadores de Acesso
        Encapsulamento objEncapsulamento = new Encapsulamento();
        objEncapsulamento.publico = 1; // Acesso público
        objEncapsulamento.setPrivado(2); // Acesso privado via métodos públicos
        // Tentativa de atribuir um valor inválido
        objEncapsulamento.setPrivado(-1); // Exibe mensagem de erro devido à validação

        // Recuperando e exibindo os valores dos atributos
        System.out.println("Atributo público: " + objEncapsulamento.publico);
        System.out.println("Atributo privado (via get): " + objEncapsulamento.getPrivado());
        System.out.println("========Encapsulamento========");
        System.out.println();

        System.out.println("========Escopo========");
        // Exemplo de Escopo de Elementos
        Escopo.atributoDeClasse = 3; // Atributo de classe (estático)
        Escopo objEscopo = new Escopo();
        objEscopo.atributoDeInstancia = 4; // Atributo de instância
        System.out.println("Atributo de classe: " + Escopo.atributoDeClasse);
        System.out.println("Atributo de instância: " + objEscopo.atributoDeInstancia);
        System.out.println("========Escopo========");
        System.out.println();

        System.out.println("========Referencia========");
        // Exemplo de Referenciando Atributos
        Referencia.atributoEstatico = 5; // Acesso via classe
        Referencia objReferencia = new Referencia();
        objReferencia.atributoInstancia = 6; // Acesso via objeto
        System.out.println("Atributo estático: " + Referencia.atributoEstatico);
        System.out.println("Atributo de instância: " + objReferencia.atributoInstancia);
        System.out.println("========Referencia========");
        System.out.println();

        System.out.println("========List e Map========");
        // Exemplo de List e Map
        ListMapExample listMapExample = new ListMapExample();
        listMapExample.listExample();
        listMapExample.mapExample();
        System.out.println("========List e Map========");
        System.out.println();
    }
}
