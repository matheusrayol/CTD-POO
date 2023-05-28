package models;

import java.util.ArrayList;

public class Usuario implements Observavel {

    private String nome;
    private String sobrenome;
    private ArrayList<Seguidor> seguidores = new ArrayList<Seguidor>();
    private boolean subiuFoto;

    @Override
    public void adicionar(Observador observador) {
        this.seguidores.add((Seguidor) observador);
    }

    @Override
    public void excluir(Observador observador) {
        this.seguidores.remove((Observador) observador);
    }

    @Override
    public void notificar() {
        for (Seguidor seguidor : this.seguidores) {
            seguidor.atualizar();
        }
    }

    public void publicarFoto() {
        this.subiuFoto = true;
        this.notificar(this.nome, this.sobrenome);
        this.subiuFoto = false;
    }
}

