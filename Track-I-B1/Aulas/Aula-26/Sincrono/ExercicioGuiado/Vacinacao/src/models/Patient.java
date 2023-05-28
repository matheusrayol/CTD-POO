package models;

public class Patient {

    private String name;
    private int vaccinesQuantity;
    private VaccineStrategy vaccineStrategy;

    public Patient(String name, int vaccinesQuantity, VaccineStrategy vaccineStrategy) {
        this.name = name;
        this.vaccinesQuantity = vaccinesQuantity;
        this.vaccineStrategy = vaccineStrategy;
    }

    public void vaccinate() {
        this.vaccineStrategy.vaccinate();
    }

    public void setVacina(VaccineStrategy vaccineStrategy) {
        this.vaccineStrategy = vaccineStrategy;
    }
}
