package models;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String cnpj;
    private List<Empregado> empregados = new ArrayList<Empregado>();

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public void addEmmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }

    public double calculaFolhaPagamento(int dias) {
        double total = 0;
        for (Empregado empregado : empregados) {
            total += empregado.calculaSalario(dias);
        }
        return total;
    }
}
