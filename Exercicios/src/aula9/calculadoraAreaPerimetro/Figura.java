package aula9.calculadoraAreaPerimetro;

public abstract class Figura {
    protected double area;
    protected double perimetro;

    public Figura() {
    }

    public Figura(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public abstract void Calculo();

    public abstract void resultado();
}
