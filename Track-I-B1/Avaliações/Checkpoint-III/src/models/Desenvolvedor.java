package models;

public abstract class Desenvolvedor {

    // Attributes
    private String nome;

    private double salarioBase;

    // Constructor
    public Desenvolvedor(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }


    public double getSalarioBase() {
        return salarioBase;
    }

    public double getHoraSalario() {
        return this.getSalario() / 160;
    }

    public abstract double getSalario();

    public abstract void pagarSalario();

}
