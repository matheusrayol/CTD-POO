package br.com.digitalhouse.adocaopet;

import br.com.digitalhouse.adocaopet.modules.AdocaoPet;

public class Main {
    public static void main(String[] args) {
        AdocaoPet adocaopet = new AdocaoPet("Totó", "Beagle", 2011, 5.11, true, true);
        adocaopet.imprimeDadosCachorro();
        adocaopet.checaApto();

        AdocaoPet adocaopet1 = new AdocaoPet("Totó", "Beagle", 2011, 4.11, true, false);
        adocaopet1.imprimeDadosCachorro();
        adocaopet1.checaApto();

        AdocaoPet adocaopet2 = new AdocaoPet("Totó", "Beagle", 2011, 5.11, true, false);
        adocaopet2.imprimeDadosCachorro();
        adocaopet2.checaApto();
    }
}