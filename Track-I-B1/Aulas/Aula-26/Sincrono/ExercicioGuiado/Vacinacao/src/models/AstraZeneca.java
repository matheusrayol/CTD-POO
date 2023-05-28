package models;

public class AstraZeneca implements VaccineStrategy {

    private int requiredDoses;
    private String origin;

    public AstraZeneca(int requiredDoses) {
        this.requiredDoses = requiredDoses;
        this.origin = origin;
    }

    @Override
    public void vaccinate() {
        System.out.println("Vaccinate with AstraZeneca");
    }

}