package models;

public class Sputnik implements VaccineStrategy {

    private int requiredDoses;
    private String origin;

    public Sputnik(int requiredDoses) {
        this.requiredDoses = requiredDoses;
        this.origin = origin;
    }

    @Override
    public void vaccinate() {
        System.out.println("Vaccinate with Sputnik");
    }

}