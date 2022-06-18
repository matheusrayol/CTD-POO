package com.digitalhouse.exerciciointerfaces;

import com.digitalhouse.exerciciointerfaces.models.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(101.0, 10.0);

        c1.sacar(10.0);
        c1.getSaldo();
    }
}