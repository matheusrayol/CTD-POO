package com.digitalhouse.checkpoint.models;

import java.text.DecimalFormat;

public class Projeto {

    private String nome;
    private int codigo;
    private int duracaoProjeto;
    private Desenvolvedor desenvolvedor;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Projeto(String nome, int codigo, int duracaoProjeto, Desenvolvedor desenvolvedor) {
        this.nome = nome;
        this.codigo = codigo;
        this.duracaoProjeto = duracaoProjeto;
        this.desenvolvedor = desenvolvedor;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getDuracaoProjeto() {
        return duracaoProjeto;
    }

    public Desenvolvedor getDesenvolvedor() {
        return desenvolvedor;
    }

    public void custoProjeto(double horaSalario, int horasProjeto) {
        double custoProjeto = horaSalario * horasProjeto;
        System.out.println("Projeto: " + this.getNome() + " (Código " + this.getCodigo() + ")");
        System.out.println("Duração: " + this.getDuracaoProjeto() + " horas");
        System.out.println("Custo do projeto: R$" + df.format(custoProjeto));
    }
}
