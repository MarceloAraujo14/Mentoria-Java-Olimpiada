package com.olimpiadas.atleta;

import org.junit.jupiter.api.Test;

import static com.olimpiadas.Constants.ERRO_MSG_NOME_NULO;
import static com.olimpiadas.Constants.ERRO_MSG_SOBRENOME_E_MIN_LETRAS;
import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {

    @Test
    void deveSalvarUmAtletaComSucesso(){
        String nome = "Marcelo Araujo";
        String pais = "Brasil";
        double distancia = 2d;

        Atleta atleta = new Atleta(nome, pais, distancia);

        assertNotNull(atleta);
        assertEquals(nome, atleta.getNome());
        assertEquals(pais, atleta.getPais());
        assertEquals(distancia, atleta.getDistancia());
    }

    @Test
    void deveLancarExcessaoCasoNaoTenhaSobrenome(){
        String nome = "Marcelo";
        String pais = "Brasil";
        double distancia = 2d;

        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> new Atleta(nome, pais, distancia));

        assertEquals(ERRO_MSG_SOBRENOME_E_MIN_LETRAS, result.getMessage());

    }

    @Test
    void deveLancarExcessaoQuandoNomeForNulo(){
        String nome = null;
        String pais = "Brasil";
        double distancia = 2d;

        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> new Atleta(nome, pais, distancia));

        assertEquals(ERRO_MSG_NOME_NULO, result.getMessage());
    }

}