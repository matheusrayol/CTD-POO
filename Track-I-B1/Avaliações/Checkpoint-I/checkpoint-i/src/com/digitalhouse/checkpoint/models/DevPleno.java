package com.digitalhouse.checkpoint.models;

import java.text.DecimalFormat;

public class DevPleno extends Desenvolvedor {

    private double multiplicador;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public DevPleno(String nome, double salarioBase, double multiplicador) {
        super(nome, salarioBase);
        this.multiplicador = multiplicador;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * this.multiplicador;
    }

    @Override
    public void pagarSalario() {
        System.out.println("---------------------------------------");
        System.out.println("-     Salário Desenvolvedor Pleno     -");
        System.out.println("---------------------------------------");
        System.out.println("Funcionário: " + super.getNome());
        System.out.println("Salário mensal: R$" + df.format(this.getSalario()));
        System.out.println("Custo por Hora: R$" + df.format(super.horaSalario()));
        System.out.println("---------------------------------------");
    }
    
}