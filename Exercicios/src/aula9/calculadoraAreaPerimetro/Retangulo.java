package aula9.calculadoraAreaPerimetro;

public class Retangulo extends Figura {
    private int base;
    private int altura;

    public Retangulo() {
        super();
    }

    public Retangulo(int base, int altura) {
        super();
        this.base = base;
        this.altura = altura;
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

    @Override
    public void Calculo() {
        area = this.base * this.altura;
        perimetro = 2 * (this.base + this.altura);
    }

    @Override
    public void resultado() {
        System.out.println("Retangulo: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
