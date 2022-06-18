package models;

import java.util.*;

public class Equipe {

    private String nome;
    private List<Jogador> listaDeJogadores = new ArrayList<Jogador>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador jogador) {
        listaDeJogadores.add(jogador);
    }

    public void mostrarJogadorestitulares() {
        Collections.sort(listaDeJogadores);

        for (Jogador jogador: listaDeJogadores) {
            if (jogador.isTitular()) {
                System.out.println("Nome: " + jogador.getNome() + " Número camisa: " + jogador.getNumeroCamisa());
            }
        }
    }

    public int getQuantidadeJogadoresLesionados() {
        int contador = 0;
        for (Jogador jogador: listaDeJogadores) {
            if (jogador.isLesionado() && jogador.isTitular()) {
                contador++;
            }
        }
        return contador;
    }

}
