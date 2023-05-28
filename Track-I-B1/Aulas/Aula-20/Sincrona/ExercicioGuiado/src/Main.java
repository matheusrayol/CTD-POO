import models.Sede;
import models.Tamagochi;

public class Main {
    public static void main(String[] args) {

        Tamagochi batata = new Tamagochi();

        batata.comer();

        batata.setEstado(new Sede(batata));


    }
}