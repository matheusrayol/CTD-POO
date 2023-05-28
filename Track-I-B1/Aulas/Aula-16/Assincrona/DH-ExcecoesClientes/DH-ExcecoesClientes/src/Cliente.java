

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite = limite;
        saldoEmConta=0;

    }
    public void comprar(double valor) throws ClientException {
        if (this.saldoEmConta + this.limite < valor) {
            throw new ClientException("Saldo insuficiente :(");
        }
        saldoEmConta-=valor;

    }

    public void pagarDivida(double valor) throws ClientException {
        if (this.saldoEmConta >= 0) {
            throw new ClientException("Você não possui dívidas pendentes ::");
        }
        saldoEmConta+=valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }
}