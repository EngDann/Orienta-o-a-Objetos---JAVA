package Resumo;

public class d_Polimorfismo {

    // Definição de polimorfismo:
    // Polimorfismo é a propriedade que permite que métodos ou atributos assumam
    // várias formas.
    // É fundamental na orientação por objetos, pois permite que comportamentos ou
    // propriedades
    // sejam definidos para cada classe/objeto.

    // Superclasse abstrata FiguraGeometrica
    public static abstract class FiguraGeometrica {
        public abstract float calcularArea();

        public abstract float calcularPerimetro();
    }

    // Subclasse Circulo que estende FiguraGeometrica
    public static class Circulo extends FiguraGeometrica {
        private float raio;

        public Circulo() {
            this.raio = 0;
        }

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

        public float getRaio() {
            return raio;
        }
    }

    // Subclasse Quadrado que estende FiguraGeometrica
    public static class Quadrado extends FiguraGeometrica {
        private float lado;

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
    }

    // Subclasse TrianguloEquilatero que estende FiguraGeometrica
    public static class TrianguloEquilatero extends FiguraGeometrica {
        private float lado;

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
            Circulo c2 = new Circulo(5);
            Circulo c3 = new Circulo(0);
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
            fgCoercao = new TrianguloEquilatero(10);
        }
    }
}
