package Resumo;

public class b_Modularidade_Encapsulamento {

    // Exemplo de Pacotes
    // Pacotes (pastas) são agrupamentos de classes relacionadas, ajudando na
    // organização do
    // código e na definição de namespaces.
    // As classes ModuloA e ModuloB pertencem a pacotes diferentes.
    public static class ModuloA {
        public void metodoA() {
            System.out.println("Método do Módulo A");
        }
    }

    public static class ModuloB {
        public void metodoB() {
            System.out.println("Método do Módulo B");
        }
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
        public int getPrivado() {
            return privado;
        }

        public void setPrivado(int privado) {
            this.privado = privado;
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

    public static void main(String[] args) {
        // Exemplo de Pacotes
        ModuloA moduloA = new ModuloA();
        moduloA.metodoA();

        ModuloB moduloB = new ModuloB();
        moduloB.metodoB();

        // Exemplo de Encapsulamento e Modificadores de Acesso
        Encapsulamento objEncapsulamento = new Encapsulamento();
        objEncapsulamento.publico = 1; // Acesso público
        objEncapsulamento.setPrivado(2); // Acesso privado via métodos públicos

        // Exemplo de Escopo de Elementos
        Escopo.atributoDeClasse = 3; // Atributo de classe (estático)
        Escopo objEscopo = new Escopo();
        objEscopo.atributoDeInstancia = 4; // Atributo de instância

    }
}
