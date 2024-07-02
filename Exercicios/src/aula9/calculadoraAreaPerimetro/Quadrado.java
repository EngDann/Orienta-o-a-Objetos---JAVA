package aula9.calculadoraAreaPerimetro;

public class Quadrado extends Figura {
    private int lado;

    public Quadrado() {
        super();
    }

    public Quadrado(int lado) {
        super();
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void Calculo() {
        area = this.lado * this.lado;
        perimetro = 4 * this.lado;
    }

    @Override
    public void resultado() {
        System.out.println("Quadrado: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
