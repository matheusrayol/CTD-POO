package models;

public class Pfizer implements VaccineStrategy {

    private int requiredDoses = 2;
    private String origin;

    public Pfizer(String origin) {
        this.origin = origin;
    }

    @Override
    public void vaccinate() {
        System.out.println("Vaccinate with Pfizer");
    }

    @Override
    public boolean checkVaccine() {
        if (doses == this.requiredDoses) {
            return true;
        } else {
            return false;
        }
    }

}