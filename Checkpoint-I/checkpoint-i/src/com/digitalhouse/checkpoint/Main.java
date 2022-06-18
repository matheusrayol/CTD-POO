package com.digitalhouse.checkpoint;

import com.digitalhouse.checkpoint.models.DevJunior;
import com.digitalhouse.checkpoint.models.DevPleno;
import com.digitalhouse.checkpoint.models.DevSenior;
import com.digitalhouse.checkpoint.models.Projeto;

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
        DevPleno devPleno = new DevPleno("Matheus", 3200, 1.3);
        devPleno.pagarSalario();

        DevPleno devPleno1 = new DevPleno("Tiago", 3200, 1.3);
        devPleno1.pagarSalario();

        DevPleno devPleno2 = new DevPleno("Guilherme", 3200, 1.3);
        devPleno2.pagarSalario();

        // 3 Instâncias da Classe DevSenior
        DevSenior devSenior = new DevSenior("Matheus", 3200, 1.6, 1500);
        devSenior.pagarSalario();

        DevSenior devSenior1 = new DevSenior("Tiago", 3200, 1.6, 1600);
        devSenior1.pagarSalario();

        DevSenior devSenior2 = new DevSenior("Guilherme", 3200, 1.6, 1700);
        devSenior2.pagarSalario();
    }
}