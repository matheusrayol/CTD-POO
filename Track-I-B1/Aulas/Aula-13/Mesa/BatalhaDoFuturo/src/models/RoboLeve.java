package models;

public class RoboLeve extends SistemaArmas implements Voar {

    private int energia;

    public RoboLeve(int energia, int energia1) {
        super(energia);
        this.energia = energia1;
    }

    public void voar() {
        System.out.println();
    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void mostrar() {

    }
}
