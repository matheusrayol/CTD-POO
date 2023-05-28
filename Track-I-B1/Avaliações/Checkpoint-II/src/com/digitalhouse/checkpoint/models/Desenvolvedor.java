package com.digitalhouse.checkpoint.models;

import java.text.DecimalFormat;

public abstract class Desenvolvedor implements Comparable<Desenvolvedor> {

    private String nome;
    private double salarioBase;

    public Desenvolvedor(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salarioBase;
    }

    public abstract void pagarSalario();

    public abstract double horaSalario();

}
