package aula9.calculadoraAreaPerimetro;

public class Triangulo extends Figura {
    private int base;
    private int altura;
    private int[] lado = new int[3];

    public Triangulo() {
        super();
    }

    public Triangulo(int base, int altura, int[] lado) {
        super();
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int[] getLado() {
        return lado;
    }

    public void setLado(int[] lado) {
        this.lado = lado;
    }

    @Override
    public void Calculo() {
        area = (this.base * this.altura) / 2;
        perimetro = this.lado[0] + this.lado[1] + this.lado[2];
    }

    @Override
    public void resultado() {
        System.out.println("Triangulo: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
