import models.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Projeto projeto = new Projeto("Desenvolvimento de Website Institucional", 2615, 160);

        Squad squad = new Squad();
        Scanner squadScanner = new Scanner(System.in);
        System.out.println("Insira o nome do Squad: ");
        squad.setNome(squadScanner.nextLine());
        try {
            if (squad.getNome().isEmpty()) {
                throw new InputMismatchException("Nome do Squad não pode ser vazio!");
            }
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }

        Scanner nome = new Scanner(System.in);
        System.out.println("Insira o nome do Desenvolvedor: ");
        String nomeDesenvolvedor = nome.nextLine();
        try {
            if (nomeDesenvolvedor.isEmpty()) {
                throw new InputMismatchException("Nome do Desenvolvedor não pode ser vazio!");
            }
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }

        Scanner salario = new Scanner(System.in);
        System.out.println("Insira o salário base do Desenvolvedor: ");
        double salarioBase = salario.nextDouble();
        try {
            if (salarioBase == 0) {
                throw new InputMismatchException("Salário base não pode ser zero!");
            } else if (salarioBase < 0) {
                throw new InputMismatchException("Salário base não pode ser negativo!");
            } else if (salarioBase )

        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
//
//        Scanner salario = new Scanner(System.in);
//        System.out.println("Digite o salário base do desenvolvedor: ");
//        double salarioBaseDev = salario.nextDouble();
//
//        Scanner senioridade = new Scanner(System.in);
//        System.out.println("Senioridade do desenvolvedor: ");
//        String senioridadeDev = senioridade.nextLine();
//
//
//
//        try {
//            if (senioridadeDev.equals("junior")) {
//                DevJunior devJunior = new DevJunior(nomeDev, salarioBaseDev);
//                devJunior.pagarSalario();
//            } else if (senioridadeDev.equals("pleno")) {
//                DevPleno devPleno = new DevPleno(nomeDev, salarioBaseDev);
//                devPleno.pagarSalario();
//            } else if (senioridadeDev.equals("senior")) {
//                DevSenior devSenior = new DevSenior(nomeDev, salarioBaseDev);
//                devSenior.pagarSalario();
//            } else {
//                throw new DevException("Não existe essa senioridade!");
//            }
//        } catch (DevException e) {
//            System.out.println(e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println("Erro de entrada!");
//        }
//
//
//        squad.adicionarDesenvolvedor(new DevJunior("Juan", 1000));
//        squad.adicionarDesenvolvedor(new DevPleno("Pedro", 2000));
//        squad.adicionarDesenvolvedor(new DevSenior("Maria", 3000));
//        squad.adicionarDesenvolvedor(new DevJunior("José", 1000));
//        squad.adicionarDesenvolvedor(new DevPleno("João", 2000));
//        squad.adicionarDesenvolvedor(new DevSenior("Júlia", 3000));
//        squad.adicionarDesenvolvedor(new DevJunior("José", 1000));
//
//        squad.listarDesenvolvedores();
//        System.out.println(squad.tamanhoSquad());

    }
}