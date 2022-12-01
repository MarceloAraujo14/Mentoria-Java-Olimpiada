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

    public Prova criarProva(){
        List<Atleta> atletas = new ArrayList<>();
        Prova prova = null;
        int i = 0;
        int numAtletas = 10;
        while (i < numAtletas) {

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
                i++;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Tente novamente.");
            }

        }
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
        System.out.println(prova.getResultado());
        return prova;
    }

    private String reader(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }


}
