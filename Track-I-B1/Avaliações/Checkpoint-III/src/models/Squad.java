package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String nome;
    private List<Desenvolvedor> desenvolvedores = new ArrayList<>();

    public void adicionarDesenvolvedor(Desenvolvedor desenvolvedor) {
        this.desenvolvedores.add(desenvolvedor);
    }

    public int tamanhoSquad() {
        return this.desenvolvedores.size();
    }

    public void listarDesenvolvedores() {
        for (Desenvolvedor desenvolvedor : this.desenvolvedores) {
            System.out.println(desenvolvedor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
