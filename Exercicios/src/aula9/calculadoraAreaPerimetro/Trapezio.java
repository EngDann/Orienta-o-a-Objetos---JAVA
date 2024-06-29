package aula9.calculadoraAreaPerimetro;

public class Trapezio {
    private int baseMaior;
    private int baseMenor;
    private double area;
    private double perimetro;
    private double altura;

    public Trapezio(double area, double perimetro, int baseMaior, int baseMenor, int altura) {
        this.area = area;
        this.perimetro = perimetro;
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public Trapezio() {

    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Calculo() {
        area = ((this.baseMaior + this.baseMenor) * this.altura) / 2;
        perimetro = 2 * this.altura + this.baseMaior + this.baseMenor;
    }

    public void resultado() {
        System.out.println("Trapezio: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
