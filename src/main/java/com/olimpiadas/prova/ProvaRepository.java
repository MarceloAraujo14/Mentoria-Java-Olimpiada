package com.olimpiadas.prova;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class ProvaRepository {

    private static final List<Prova> provas = new ArrayList<>();

    public List<Prova> save(Prova prova){
        provas.add(prova);
        return provas;
    }
}
