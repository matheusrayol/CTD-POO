import models.Carrinho;
import models.Combo;
import models.Produto;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("batata", 3.99);
        Produto produto2 = new Produto("coca-cola", 5.50);
        Produto produto3 = new Produto("Xis", 15.00);

        Combo combo1 = new Combo("Combo-atata");
        combo1.adicionarProduto(produto1);
        combo1.adicionarProduto(produto2);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(combo1);
        carrinho.adicionarItem(produto3);


        System.out.println("Valor da batata: " + produto1.calcularPreco());
        System.out.println("Valor da coca-cola: " + produto2.calcularPreco());
        System.out.println("Valor do Xis: " + produto3.calcularPreco());
        System.out.println("Valor do Combo-atata: " + combo1.calcularPreco());

        System.out.println("Valor total: " + carrinho.calcularPreco());
    }
}