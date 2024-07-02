package aula9.calculadoraAreaPerimetro;

public class Trapezio extends Figura {
    private int baseMaior;
    private int baseMenor;
    private double altura;

    public Trapezio() {
        super();
    }

    public Trapezio(int baseMaior, int baseMenor, double altura) {
        super();
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
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

    @Override
    public void Calculo() {
        area = ((this.baseMaior + this.baseMenor) * this.altura) / 2;
        perimetro = 2 * this.altura + this.baseMaior + this.baseMenor;
    }

    @Override
    public void resultado() {
        System.out.println("Trapezio: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
