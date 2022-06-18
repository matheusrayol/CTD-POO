package com.digitalhouse.exerciciointerfaces.models;

public class ContaCorrente extends Conta implements GravarImposto {

    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    @Override
    public double imposto(double porc) {
        return porc;
    }

    @Override
    public void sacar(double valor) {
        if(this.getSaldo() >= valor + valor * this.imposto(0.05)) {
            this.setSaldo(getSaldo() - (valor + valor * this.imposto(0.05)));
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
