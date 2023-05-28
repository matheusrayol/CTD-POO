import models.Jogador;
import models.Selecao;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Selecao braza = new Selecao("CBF");
        Jogador j1 = new Jogador(9, "Vale", "Atacante");
        Jogador j2 = new Jogador(1, "Junior", "Goleiro");
        Jogador j3 = new Jogador(11, "Santos", "Defensor");
        Jogador j4 = new Jogador(12, "Filho", "Meio-campo");
        Jogador j5 = new Jogador(13, "Rayol", "Atacante");
        Jogador j6 = new Jogador(14, "Oduber", "Atacante");
        Jogador j7 = new Jogador(15, "Silva", "Atacante");

        braza.addJogador(j1);
        braza.addJogador(j2);
        braza.addJogador(j3);
        braza.addJogador(j4);
        braza.addJogador(j5);
        braza.addJogador(j6);
        braza.addJogador(j7);

        System.out.println(braza.obterReservas());
        System.out.println(braza.quantidadeDeJogadores("Atacante"));
        System.out.println(braza.quantidadeDeJogadores("Defensor"));
        System.out.println(braza.quantidadeDeJogadores("Meio-campo"));
        System.out.println(braza.quantidadeDeJogadores("Goleiro"));
        System.out.println(braza.quantidadeDeJogadores("Pé furado"));
    }
}