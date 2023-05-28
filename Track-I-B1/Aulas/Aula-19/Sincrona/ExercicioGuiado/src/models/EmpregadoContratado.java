package models;

public class EmpregadoContratado extends Empregado {

    private double valorPorHora;
    private double imposto;

    @Override
    public double calculaSalario(int dias) {
        return (this.valorPorHora * 8) * dias * (1 - this.imposto);
    }
}
