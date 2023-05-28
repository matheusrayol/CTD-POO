package models;

public class Seguidor implements Observador {

    private String nome;
    private String sobrenome;
    private int contadorNotificacao;

    @Override
    public void atualizar(String nomeUsuario, String sobrenomeUsuario) {
        System.out.println(this.nome + " " + this.sobrenome + ", "+  nomeUsuario +
                " " + sobrenomeUsuario + " acabou de publicar uma nova foto.");
    }

}
