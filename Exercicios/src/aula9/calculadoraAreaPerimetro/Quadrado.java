package aula9.calculadoraAreaPerimetro;

public class Quadrado {
    private int area;
    private int perimetro;
    private int lado;

    public Quadrado() {

    }

    public Quadrado(int lado) {
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

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void Calculo() {
        area = this.lado * this.lado;
        perimetro = 4 * this.lado;
    }

    public void resultado() {
        System.out.println("Quadrado: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
