package com.digitalhouse.checkpoint.models;

import java.text.DecimalFormat;

public class DevSenior extends Desenvolvedor {

    private double bonusSalario;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public DevSenior(String nome, double salarioBase, double bonusSalario) {
        super(nome, salarioBase);
        this.bonusSalario = bonusSalario;
    }

    @Override
    public double horaSalario() {
        return ((super.getSalario() * 1.3) + this.bonusSalario) / 160;
    }

    @Override
    public void pagarSalario() {
        System.out.println("---------------------------------------");
        System.out.println("-    Salário Desenvolvedor Sênior     -");
        System.out.println("---------------------------------------");
        System.out.println("Funcionário: " + super.getNome());
        System.out.println("Salário mensal: R$" + df.format(super.getSalario() * 1.3 + this.bonusSalario));
        System.out.println("Custo por Hora: R$" + df.format(this.horaSalario()));
        System.out.println("---------------------------------------");
    }

    @Override
    public int compareTo(Desenvolvedor o) {
        return 0;
    }
}
