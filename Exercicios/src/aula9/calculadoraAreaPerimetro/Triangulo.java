package aula9.calculadoraAreaPerimetro;

public class Triangulo {
    private int area;
    private int perimetro;
    private int base;
    private int altura;
    private int[] lado = new int[3];

    public Triangulo() {

    }

    public Triangulo(int area, int perimetro, int base, int altura, int lado[]) {
        this.area = area;
        this.perimetro = perimetro;
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
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

    public void Calculo() {
        area = (this.base * this.altura) / 2;
        perimetro = this.lado[0] + this.lado[1] + this.lado[2];
    }

    public void resultado() {
        System.out.println("Triangulo: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
