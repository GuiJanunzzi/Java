package br.com.fiap.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

//LOMBOK gera de forma automática o código repetitivo
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Jogo {

    private int id;
    private String nome;
    private LocalDate dataLancamento;
    private Classificacao classificacao;

    @Override
    public String toString() {
        return "ID: " + id +
                ", Nome: " + nome +
                ", Data de Lançamento: " + dataLancamento +
                ", Classificação: " + classificacao;
    }
}
