package models;

public class Triste implements Estado {

    private Tamagochi t;

    public Triste(Tamagochi t) {
        this.t = t;
    }

    @Override
    public void comer() {
        System.out.println("Beep beep URGH!");
    }

    @Override
    public void beber() {
        System.out.println("Beep beep beep blink!");
    }

    @Override
    public void carinho() {
        this.t.setEstado(new Feliz(this.t));
    }
}
