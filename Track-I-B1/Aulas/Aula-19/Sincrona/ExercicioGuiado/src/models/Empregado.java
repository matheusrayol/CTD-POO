package models;

public abstract class Empregado {

    private String nome;
    private String sobrenome;
    private String arquivo;

    public Empregado(String nome, String sobrenome, String arquivo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.arquivo = arquivo;
    }

    public abstract double calculaSalario(int dias);

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }


}
