package Resumo;

/**
 * Polimorfismo é a propriedade que permite que métodos ou atributos assumam
 * várias formas. É fundamental na orientação por objetos, pois permite que
 * comportamentos ou propriedades sejam definidos para cada classe/objeto.
 * 
 * Tipos de Polimorfismo:
 * 
 * 1. Polimorfismo por Sobrescrita (Overriding):
 * Permite que uma subclasse forneça uma implementação específica de um método
 * que já foi definido na sua superclasse. Exemplo: Circulo, Quadrado, e
 * TrianguloEquilatero
 * sobrescrevem os métodos calcularArea e calcularPerimetro da superclasse
 * FiguraGeometrica.
 * 
 * 2. Polimorfismo Paramétrico (Parametric Polymorphism):
 * Permite que um método ou classe opere em tipos genéricos usando Generics.
 * Exemplo:
 * Classe Caixa<T> que pode conter qualquer tipo de dado especificado pelo
 * usuário.
 * 
 * 3. Polimorfismo por Sobrecarga (Overloading):
 * Permite que duas ou mais funções tenham o mesmo nome, mas diferentes
 * parâmetros.
 * Exemplo: Construtores Circulo() e Circulo(float raio).
 * 
 * 4. Polimorfismo por Inclusão (Inclusion Polymorphism):
 * Permite que uma superclasse seja usada para referenciar objetos de suas
 * subclasses.
 * Exemplo: FiguraGeometrica fg; fg = new Circulo(10);.
 * 
 * 5. Polimorfismo por Coerção (Coercion):
 * O compilador automaticamente converte um tipo de dado em outro.
 * Exemplo: FiguraGeometrica fgCoercao; fgCoercao = new Quadrado(10);.
 */
public class e_Polimorfismo {

    // Superclasse abstrata FiguraGeometrica
    public static abstract class FiguraGeometrica {
        public abstract float calcularArea();

        public abstract float calcularPerimetro();
    }

    // Subclasse Circulo que estende FiguraGeometrica
    public static class Circulo extends FiguraGeometrica {
        private float raio;

        // Construtor padrão
        public Circulo() {
            this.raio = 0;
        }

        // Construtor alternativo
        public Circulo(float raio) {
            this.raio = raio;
        }

        @Override
        public float calcularArea() {
            return (float) Math.PI * raio * raio;
        }

        @Override
        public float calcularPerimetro() {
            return 2 * (float) Math.PI * raio;
        }

        // Método get
        public float getRaio() {
            return raio;
        }

        // Método set
        public void setRaio(float raio) {
            this.raio = raio;
        }
    }

    // Subclasse Quadrado que estende FiguraGeometrica
    public static class Quadrado extends FiguraGeometrica {
        private float lado;

        // Construtor padrão
        public Quadrado() {
            this.lado = 0;
        }

        // Construtor alternativo
        public Quadrado(float lado) {
            this.lado = lado;
        }

        @Override
        public float calcularArea() {
            return lado * lado;
        }

        @Override
        public float calcularPerimetro() {
            return 4 * lado;
        }

        // Método get
        public float getLado() {
            return lado;
        }

        // Método set
        public void setLado(float lado) {
            this.lado = lado;
        }
    }

    // Subclasse TrianguloEquilatero que estende FiguraGeometrica
    public static class TrianguloEquilatero extends FiguraGeometrica {
        private float lado;

        // Construtor padrão
        public TrianguloEquilatero() {
            this.lado = 0;
        }

        // Construtor alternativo
        public TrianguloEquilatero(float lado) {
            this.lado = lado;
        }

        @Override
        public float calcularArea() {
            return (float) (lado * Math.sqrt(3) / 4);
        }

        @Override
        public float calcularPerimetro() {
            return 3 * lado;
        }

        // Método get
        public float getLado() {
            return lado;
        }

        // Método set
        public void setLado(float lado) {
            this.lado = lado;
        }
    }

    public static class Caixa<T> {
        private T conteudo;

        public Caixa(T conteudo) {
            this.conteudo = conteudo;
        }

        public T getConteudo() {
            return conteudo;
        }

        public void setConteudo(T conteudo) {
            this.conteudo = conteudo;
        }
    }

    // Classe principal para demonstrar polimorfismo
    public static class Principal {
        public static void main(String[] args) {
            // Polimorfismo por sobrescrita de métodos
            FiguraGeometrica c1 = new Circulo(10);
            System.out.println("Área do Círculo: " + c1.calcularArea());
            System.out.println("Perímetro do Círculo: " + c1.calcularPerimetro());

            FiguraGeometrica q1 = new Quadrado(10);
            System.out.println("Área do Quadrado: " + q1.calcularArea());
            System.out.println("Perímetro do Quadrado: " + q1.calcularPerimetro());

            FiguraGeometrica tr1 = new TrianguloEquilatero(10);
            System.out.println("Área do Triângulo Equilátero: " + tr1.calcularArea());
            System.out.println("Perímetro do Triângulo Equilátero: " + tr1.calcularPerimetro());

            // Polimorfismo por sobrecarga de métodos
            Circulo c2 = new Circulo();
            c2.setRaio(5);
            Circulo c3 = new Circulo();
            c3.setRaio(0);
            System.out.println("Raio do Círculo 1: " + c2.getRaio());
            System.out.println("Raio do Círculo 2: " + c3.getRaio());

            // Polimorfismo por inclusão
            FiguraGeometrica fg;
            fg = new Circulo(10);
            fg.calcularArea();
            fg.calcularPerimetro();
            fg = new Quadrado(5);
            fg.calcularArea();
            fg.calcularPerimetro();
            fg = new TrianguloEquilatero(10);
            fg.calcularArea();
            fg.calcularPerimetro();

            // Polimorfismo por coerção
            FiguraGeometrica fgCoercao;
            fgCoercao = new Quadrado(10);
            System.out.println("Área do Quadrado (fgCoercao): " + fgCoercao.calcularArea());
            fgCoercao = new TrianguloEquilatero(10);
            System.out.println("Área do Triângulo Equilátero (fgCoercao): " + fgCoercao.calcularArea());

            // Polimorfismo Paramétrico
            Caixa<String> caixaString = new Caixa<>("Texto na Caixa");
            System.out.println("Conteúdo da Caixa de String: " + caixaString.getConteudo());

            Caixa<Integer> caixaInt = new Caixa<>(123);
            System.out.println("Conteúdo da Caixa de Integer: " + caixaInt.getConteudo());
        }
    }
}
