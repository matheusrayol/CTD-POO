package com.digitalhouse.checkpoint.models;

import java.text.DecimalFormat;

public class DevPleno extends Desenvolvedor {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public DevPleno(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double horaSalario() {
        return (super.getSalario() * 1.3) / 160;
    }
    @Override
    public void pagarSalario() {
        System.out.println("---------------------------------------");
        System.out.println("-     Salário Desenvolvedor Pleno     -");
        System.out.println("---------------------------------------");
        System.out.println("Funcionário: " + super.getNome());
        System.out.println("Salário mensal: R$" + df.format(super.getSalario() * 1.3));
        System.out.println("Custo por Hora: R$" + df.format(this.horaSalario()));
        System.out.println("---------------------------------------");
    }

    @Override
    public int compareTo(Desenvolvedor o) {
        return 0;
    }
}