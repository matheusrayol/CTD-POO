package models;

public abstract class SistemaArmas {
    private int energia;

    public SistemaArmas(int energia) {
        this.energia = energia;
    }

    public abstract void atacar();

    public abstract void defender();

    public abstract void mostrar();
}
