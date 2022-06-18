package com.digitalhouse.checkpoint.models;

import java.text.DecimalFormat;

public class DevSenior extends Desenvolvedor {

    private double multiplicador;
    private double bonusSalario;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public DevSenior(String nome, double salario, double multiplicador, double bonusSalario) {
        super(nome, salario);
        this.multiplicador = multiplicador;
        this.bonusSalario = bonusSalario;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * this.multiplicador + this.bonusSalario;
    }
    
    @Override
    public void pagarSalario() {
        System.out.println("---------------------------------------");
        System.out.println("-    Salário Desenvolvedor Sênior     -");
        System.out.println("---------------------------------------");
        System.out.println("Funcionário: " + super.getNome());
        System.out.println("Salário mensal: R$" + df.format(this.getSalario()));
        System.out.println("Custo por Hora: R$" + df.format(super.horaSalario()));
        System.out.println("---------------------------------------");
    }

}
