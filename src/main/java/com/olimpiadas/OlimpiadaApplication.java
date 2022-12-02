package com.olimpiadas;

import com.olimpiadas.prova.CriarProva;

import java.util.Scanner;

public class OlimpiadaApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CriarProva criarProva = new CriarProva(scanner);
        criarProva.execute();
        scanner.close();
    }
}
