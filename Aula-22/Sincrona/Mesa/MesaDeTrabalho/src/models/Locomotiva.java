package models;

import java.util.ArrayList;

public class Locomotiva implements Figura {

    private ArrayList<Figura> figurasDaLocomotiva = new ArrayList<>();

    public void adicionarFigura(Figura figura) {
        this.figurasDaLocomotiva.add(figura);
    }

    @Override
    public double calcularArea() {
        double total = 0;
        for (Figura figura : figurasDaLocomotiva) {
            total += figura.calcularArea();
        }
        return total;
    }
}
