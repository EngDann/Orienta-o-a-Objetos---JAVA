package aula9.calculadoraAreaPerimetro;

public class Retangulo {
    private int area;
    private int perimetro;
    private int base;
    private int altura;

    public Retangulo() {

    }

    public Retangulo(int area, int perimetro, int base, int altura) {
        this.area = area;
        this.perimetro = perimetro;
        this.base = base;
        this.altura = altura;
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

    public void Calculo() {
        area = this.base * this.altura;
        perimetro = 2 * (this.base + this.altura);
    }

    public void resultado() {
        System.out.println("Retangulo: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
