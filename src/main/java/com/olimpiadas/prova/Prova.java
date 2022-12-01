package com.olimpiadas.prova;

import com.olimpiadas.atleta.Atleta;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class Prova {
    private Long id;
    private String modalidade;
    private List<Atleta> atletas;

    public String getResultado(){
        Collections.sort(atletas);
        return "Modalidade: " + modalidade + "\n" +
                "Ouro: " + atletas.get(0) + "\n" +
                "Prata: " + atletas.get(1) + "\n" +
                "Bronze: " + atletas.get(2);
    }

    public Prova(String modalidade, List<Atleta> atletas) {
        this.modalidade = modalidade;
        this.atletas = atletas;
    }
}
