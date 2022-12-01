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

    public List<Atleta> getResultado(){
        Collections.sort(atletas);
        return List.of(atletas.get(0), atletas.get(1), atletas.get(2));
    }

    public Prova(String modalidade, List<Atleta> atletas) {
        this.modalidade = modalidade;
        this.atletas = atletas;
    }
}
