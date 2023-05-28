package models;

public class Jogador {

    private int numCamisa;
    private String sobrenome;
    private String posicao;

    public Jogador(int numCamisa, String sobrenome, String posicao) {
        if(posicao != "Goleiro" && posicao != "Defensor" && posicao != "Meio-campo" && posicao != "Atacante") {
            throw new PlayerException("Posição inválida");
        }

        this.numCamisa = numCamisa;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
    }

    public String getPosicao() {
        return posicao;
    }

    @Override
    public String toString() {
        return "Jogador: " + this.sobrenome + ", Camisa: " + this.numCamisa + ", Posição: " + this.posicao;
    }


}
