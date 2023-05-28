package models;

import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class DevJunior extends Desenvolvedor {

    // Constructor
    public DevJunior(String nome, double salarioBase) throws DevException {
        super(nome, salarioBase);
        if (salarioBase == 0) {
            throw new DevException("Salário base não pode ser zero!");
        } else if (salarioBase < 0) {
            throw new DevException("Salário base não pode ser negativo!");
        }
    }

    // Methods
    @Override
    public double getSalario() {
        return super.getSalarioBase();
    }

    @Override
    public void pagarSalario() {
        System.out.println("---------------------------------------");
        System.out.println("-    Salário Desenvolvedor Júnior     -");
        System.out.println("---------------------------------------");
        System.out.println("Funcionário: " + super.getNome());
        System.out.printf("Salário mensal: R$%.2f%n", this.getSalario());
        System.out.printf("Custo por Hora: R$%.2f%n", super.getHoraSalario());
        System.out.println("---------------------------------------");
    }
}
