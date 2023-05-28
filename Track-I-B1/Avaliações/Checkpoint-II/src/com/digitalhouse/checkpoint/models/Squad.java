package com.digitalhouse.checkpoint.models;

import java.util.ArrayList;
import java.util.List;

public class Squad {

    private String nome;

    private List<Desenvolvedor> listaDeDesenvolvedores = new ArrayList<>();

    public Squad(String nome) {
        this.nome = nome;
    }

    public void mostrarDesenvolvedoresNoSquad() {
        listaDeDesenvolvedores.sort(null);

        for (Desenvolvedor desenvolvedor : listaDeDesenvolvedores) {
            System.out.println("Nome: " + desenvolvedor.getNome());
        }
    }
}
