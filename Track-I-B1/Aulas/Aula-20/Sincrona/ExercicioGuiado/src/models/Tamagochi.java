package models;

public class Tamagochi {

    private Estado estado;

    public Tamagochi() {
        this.estado = new Fome(this);
    }

    public void comer() {
        this.estado.comer();
    }

    public void beber() {
        this.estado.beber();
    }

    public void carinho() {
        this.estado.carinho();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
