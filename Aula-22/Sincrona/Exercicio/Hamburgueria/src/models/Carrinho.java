package models;

import java.util.ArrayList;

public class Carrinho implements Item {

    private ArrayList<Item> itensDoCarrinho = new ArrayList<Item>();

    public void adicionarItem(Item item) {
        this.itensDoCarrinho.add(item);
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (Item item : itensDoCarrinho) {
            total += item.calcularPreco();
        }
        return total;
    }
}
