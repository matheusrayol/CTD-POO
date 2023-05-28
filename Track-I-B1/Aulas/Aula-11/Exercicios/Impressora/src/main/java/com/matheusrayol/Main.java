package com.matheusrayol;

import com.matheusrayol.models.Impressora;
import com.matheusrayol.models.ImpressoraCannon;
import com.matheusrayol.models.ImpressoraEpson;

public class Main {
    public static void main(String[] args) {
        Impressora impressora = new ImpressoraCannon("LX300", "LPT1", 0, 0.2);
        System.out.println(impressora.imprimir());
    }
}