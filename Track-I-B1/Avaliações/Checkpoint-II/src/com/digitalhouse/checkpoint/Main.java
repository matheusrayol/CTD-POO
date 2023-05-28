package com.digitalhouse.checkpoint;

import com.digitalhouse.checkpoint.models.DevJunior;
import com.digitalhouse.checkpoint.models.DevPleno;
import com.digitalhouse.checkpoint.models.DevSenior;
import com.digitalhouse.checkpoint.models.Projeto;

/* O objetivo deste checkpoint é utilizar conceitos de orientação a objetos apresentados durante o bimestre.
   Você deve implementar as classes modeladas no diagrama de classes e enviar todo o código fonte do sistema.

   Sobre o desenvolvimento do sistema:

     1. Características básicas.
       a. Ser orientado a objetos.
       b. Usar o console para receber as entradas do usuário.
       c. Todas as classes modeladas no diagrama de classes devem estar
          implementadas no código fonte.

     2. Tópicos da disciplina que deverão ser contemplados e que serão avaliados no projeto:
       a. Classes (atributos e métodos), Construtores, Encapsulamento.
       b. Implementar os conceitos de sobrecarga/sobrescrita (de métodos e construtores);
       c. Implementar o conceito de herança, classe abstrata e/ou interface;
       d. Implementar os conceitos de Collections (List ou Set);
       e. Implementar os conceitos de Exceptions (RuntimeException e personalizadas).

   Características extras

     1. Comentários no código para facilitar o entendimento;
     2. Formatação de código;
     3. Se houver alguma alteração no diagrama de classes, enviar novamente o diagrama juntamente com o código.

   Prazos para entrega:

     - Entrega: 06/07/2022 até 23:59 hrs.
     - Via forms - https://forms.gle/XzuiVWnFJCZNxC8eA
*/


public class Main {
    public static void main(String[] args) {
        // 3 Instâncias da Classe Projeto
        Projeto projeto = new Projeto("Front-End DH-Dev", 1, 72, new DevJunior("Matheus", 3200));
        projeto.getDesenvolvedor().pagarSalario();
        projeto.custoProjeto(projeto.getDesenvolvedor().horaSalario(), projeto.getDuracaoProjeto());

        Projeto projeto1 = new Projeto("Front-End DH-Dev", 1, 72, new DevJunior("Tiago", 3200));
        projeto1.getDesenvolvedor().pagarSalario();
        projeto1.custoProjeto(projeto.getDesenvolvedor().horaSalario(), projeto1.getDuracaoProjeto());

        Projeto projeto2 = new Projeto("Front-End DH-Dev", 1, 72, new DevJunior("Guilherme", 3200));
        projeto2.getDesenvolvedor().pagarSalario();
        projeto2.custoProjeto(projeto.getDesenvolvedor().horaSalario(), projeto2.getDuracaoProjeto());

        // 3 Instancias da Classe DevJunior
        DevJunior devJunior = new DevJunior("Matheus", 3200);
        devJunior.pagarSalario();

        DevJunior devJunior1 = new DevJunior("Tiago", 3200);
        devJunior1.pagarSalario();

        DevJunior devJunior2 = new DevJunior("Guilherme", 3200);
        devJunior2.pagarSalario();

        // 3 Instâncias da Classe DevPleno
        DevPleno devPleno = new DevPleno("Matheus", 3200);
        devPleno.pagarSalario();

        DevPleno devPleno1 = new DevPleno("Tiago", 3200);
        devPleno1.pagarSalario();

        DevPleno devPleno2 = new DevPleno("Guilherme", 3200);
        devPleno2.pagarSalario();

        // 3 Instâncias da Classe DevSenior
        DevSenior devSenior = new DevSenior("Matheus", 3200, 1500);
        devSenior.pagarSalario();

        DevSenior devSenior1 = new DevSenior("Tiago", 3200, 1600);
        devSenior1.pagarSalario();

        DevSenior devSenior2 = new DevSenior("Guilherme", 3200, 1700);
        devSenior2.pagarSalario();
    }
}