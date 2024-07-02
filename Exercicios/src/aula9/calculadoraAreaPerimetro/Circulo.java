package aula9.calculadoraAreaPerimetro;

public class Circulo extends Figura {
    private int raio;

    public Circulo() {
        super();
    }

    public Circulo(int raio) {
        super();
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void Calculo() {
        area = Math.PI * Math.pow(this.raio, 2);
        perimetro = 2 * Math.PI * this.raio;
    }

    @Override
    public void resultado() {
        System.out.println("Circulo: \nArea:" + this.getArea() + "\n" + "Perimetro:" + this.getPerimetro() + "\n");
    }
}
