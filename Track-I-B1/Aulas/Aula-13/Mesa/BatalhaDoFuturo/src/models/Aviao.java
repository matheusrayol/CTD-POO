package models;

public class Aviao extends SistemaArmas implements Voar {

    private int energia;

    public Aviao(int energia) {
        super(energia);
        this.energia = energia;
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
