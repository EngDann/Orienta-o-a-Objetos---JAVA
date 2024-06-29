package aula9.calculadoraPAPG;

import java.util.ArrayList;

public class PG {
    private int a0, r, n;
    private ArrayList<Termo> termos;

    public PG() {
        termos = new ArrayList<>();
    }

    public PG(int a0, int r, int n) {
        this.a0 = a0;
        this.r = r;
        this.n = n;
        termos = new ArrayList<>();
    }

    public int getA0() {
        return a0;
    }

    public void setA0(int a0) {
        this.a0 = a0;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<Termo> getTermos() {
        return termos;
    }

    public void calcular() {
        for (int i = 0; i < n; i++) {
            termos.add(new Termo(a0 * (int) Math.pow(r, i)));
        }
    }
}
