package com.olimpiadas;

import com.olimpiadas.prova.ProvaController;
import com.olimpiadas.prova.ProvaService;

public class Main {

    public static void main(String[] args) {
        ProvaController controller = new ProvaController(new ProvaService());
        controller.criarProva();
    }
}
