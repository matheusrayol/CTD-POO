package com.digitalhouse.checkpoint.models;

import java.text.DecimalFormat;

public class DevJunior extends Desenvolvedor {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public DevJunior(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void pagarSalario() {
        System.out.println("---------------------------------------");
        System.out.println("-    Salário Desenvolvedor Júnior     -");
        System.out.println("---------------------------------------");
        System.out.println("Funcionário: " + super.getNome());
        System.out.println("Salário mensal: R$" + df.format(this.getSalario()));
        System.out.println("Custo por Hora: R$" + df.format(super.horaSalario()));
        System.out.println("---------------------------------------");
    }

}
