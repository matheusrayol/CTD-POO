package br.com.academiadh;

import br.com.academiadh.models.Associado;

public class Main {
    public static void main(String[] args) {
        Associado associado1 = new Associado("123", "Matheus", "Boxing", 250.00);

        System.out.println(associado1.custoMensal());

    }
}