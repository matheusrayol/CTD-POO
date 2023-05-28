package com.digitalhouse.exerciciointerfaces.models;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public void sacar(double valor) {
        if(valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    public void cobrarJuros() {
        this.setSaldo(this.getSaldo() * 1.01);
    }
}
