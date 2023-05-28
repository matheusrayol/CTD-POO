package models;

import java.util.ArrayList;

public class Combo implements Item {

    private String nome;
    private ArrayList<Produto> listaDeProduto = new ArrayList<Produto>();

    public Combo(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto(Produto produto) {
        this.listaDeProduto.add(produto);
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (Item item : listaDeProduto) {
            total += item.calcularPreco();
        }
        return total;
    }

}