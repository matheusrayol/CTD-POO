package models;

import java.util.ArrayList;
import java.util.List;

public class Projeto {

    private String nome;

    private int codigo;

    private int duracaoProjeto;

    private List<Desenvolvedor> desenvolvedores = new ArrayList<>();

    public Projeto(String nome, int codigo, int duracaoProjeto) {
        this.nome = nome;
        this.codigo = codigo;
        this.duracaoProjeto = duracaoProjeto;
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

    public void adicionarDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedores.add(desenvolvedor);
    }

    public void listarDesenvolvedores() {
        for (Desenvolvedor desenvolvedor : this.desenvolvedores) {
            System.out.println(desenvolvedor.getNome());
        }
    }

    public void custoProjeto(double horaSalario, int horasProjeto) {
        double custoProjeto = horaSalario * horasProjeto;
        System.out.println("Projeto: " + this.getNome() + " (Código " + this.getCodigo() + ")");
        System.out.println("Duração: " + this.getDuracaoProjeto() + " horas");
        System.out.printf("Custo do projeto: R$%.2f%n", custoProjeto);
    }
}
