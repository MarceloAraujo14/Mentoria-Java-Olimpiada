package com.olimpiadas.atleta;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

import static com.olimpiadas.Constants.*;

@EqualsAndHashCode(callSuper = false)
@Data
@Builder
public class Atleta implements Comparable<Atleta> {

    private String nome;
    private String pais;
    private double distancia;

    public Atleta(String nome, String pais, double distancia) {
        this.nome = setNome(nome);
        this.pais = setPais(pais);
        this.distancia = setDistancia(distancia);
    }

    @Override
    public int compareTo(Atleta o) {
        return Double.compare(this.distancia, o.distancia);
    }

    private String setNome(String nome){
        if(Objects.isNull(nome) || nome.isBlank()){
            throw new IllegalArgumentException(ERRO_MSG_NOME_NULO);
        }
        if (!nome.matches("^((\\b[A-zA-Z']{2,40}\\b)\\s*){2,}$")){
            throw new IllegalArgumentException(ERRO_MSG_SOBRENOME_E_MIN_LETRAS);
        }
        return nome;
    }

    private String setPais(String pais){
        if(Objects.isNull(pais) || pais.isBlank()){
            throw new IllegalArgumentException(ERRO_MSG_PAIS_NULO);
        }
        if (!pais.matches("[A-Za-z ]\\w{3,}")){
            throw new IllegalArgumentException(ERRO_MSG_PAIS_MIN_LETRAS);
        }
        return pais;
    }

    private double setDistancia(double distancia){
        if (Objects.isNull(distancia)){
            throw new IllegalArgumentException(ERRO_MSG_DISTANCIA_NULO);
        }
        if (distancia < 0) {
            throw new IllegalArgumentException(ERRO_MSG_DISTANCIA_NEGATIVA);
        }
        return distancia;
    }

    @Override
    public String toString() {

        return  "nome='" + nome + '\'' +
                ", pais='" + pais + '\'' +
                ", distancia=" + distancia;
    }
}
