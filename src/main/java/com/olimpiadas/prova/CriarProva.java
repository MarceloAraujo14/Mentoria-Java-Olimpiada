package com.olimpiadas.prova;

import com.olimpiadas.atleta.Atleta;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

@Log4j2
@AllArgsConstructor
public class CriarProva {

    private final Scanner sc;

    public Prova execute(){
        List<Atleta> atletas = new ArrayList<>();
        Prova prova = null;
        int numAtletas = 10;
        inserirAtletas(atletas, numAtletas);
        prova = getProva(atletas, prova);
        System.out.println(prova.getResultado());
        return prova;
    }

    private void inserirAtletas(List<Atleta> atletas, int numAtletas) {
        while (0 < numAtletas) {
            try{
                System.out.print("Insira o nome do atleta: ");
                String nome = reader();
                System.out.print("Insira o país do atleta: ");
                String pais = reader();
                System.out.print("Insira o resultado do atleta (m): ");
                double resultado = Double.parseDouble(reader());

                Atleta atleta = new Atleta(nome, pais, resultado);
                atletas.add(atleta);
                System.out.println("Atleta inserido: " + atleta);
                numAtletas--;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Tente novamente.");
            }
        }
    }

    private Prova getProva(List<Atleta> atletas, Prova prova) {
        while (Objects.isNull(prova)) {
            try {
                System.out.print("Insira o nome da modalidade da prova:");
                String modalidade = reader();
                prova = new Prova(modalidade, atletas);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Tente novamente.");
            }
        }
        return prova;
    }

    private String reader(){
        return sc.nextLine();
    }
}
