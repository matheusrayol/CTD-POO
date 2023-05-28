import models.Circulo;
import models.Locomotiva;
import models.Retangulo;
import models.Triangulo;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(5, 4); // 20
        Retangulo retangulo1 = new Retangulo(6, 4); // 24
        Circulo circulo = new Circulo(1); // 3.14
        Triangulo triangulo = new Triangulo(2, 2); // 2

        System.out.printf("Area do retangulo: %.2f\n", retangulo.calcularArea());
        System.out.printf("Area do retangulo1: %.2f\n", retangulo1.calcularArea());
        System.out.printf("Area do circulo: %.2f\n", circulo.calcularArea());
        System.out.printf("Area do triangulo: %.2f\n", triangulo.calcularArea());

        Locomotiva vagao = new Locomotiva();
        vagao.adicionarFigura(retangulo);
        vagao.adicionarFigura(circulo);
        vagao.adicionarFigura(circulo);
        vagao.adicionarFigura(circulo);
        System.out.printf("Área total do vagão: %.2f%n", vagao.calcularArea());

        Locomotiva locomotiva = new Locomotiva();
        locomotiva.adicionarFigura(retangulo1);
        locomotiva.adicionarFigura(circulo);
        locomotiva.adicionarFigura(circulo);
        locomotiva.adicionarFigura(triangulo);
        System.out.printf("Área total da locomotiva: %.2f%n", locomotiva.calcularArea());

    }
}