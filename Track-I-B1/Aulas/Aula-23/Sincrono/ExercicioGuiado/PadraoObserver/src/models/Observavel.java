package models;

public interface Observavel {

    public void adicionar(Observador observador);
    public void excluir(Observador observador);
    public void notificar(String nomeUsuario, String sobrenomeUsuario);

}
