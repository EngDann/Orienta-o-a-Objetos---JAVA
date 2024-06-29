package aula9.calculadoraAreaPerimetro;

public class Circulo {
    private int raio;
    private double area;
    private double perimetro;

    public Circulo(double area, double perimetro, int raio) {
        this.area = area;
        this.perimetro = perimetro;
        this.raio = raio;
    }

    public Circulo() {

    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
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

    public void Calculo() {
        area = Math.PI * Math.pow(this.raio, 2);
        perimetro = 2 * Math.PI * this.raio;
    }

    public void resultado() {
        System.out.println("Circulo: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
