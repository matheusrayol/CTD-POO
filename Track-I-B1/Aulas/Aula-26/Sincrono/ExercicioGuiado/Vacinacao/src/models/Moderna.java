package models;

public class Moderna implements VaccineStrategy {

    private int requiredDoses;
    private String origin;

    public Moderna(int requiredDoses) {
        this.requiredDoses = requiredDoses;
        this.origin = origin;
    }

    @Override
    public void vaccinate() {
        System.out.println("Vaccinate with Moderna");
    }

}