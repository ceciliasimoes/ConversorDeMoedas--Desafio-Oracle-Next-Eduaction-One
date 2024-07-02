package br.com.alura.ConversorMoedaswithNextEduOne.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ValorDTO(
        @JsonAlias("base_code")String moedaBase,
        @JsonAlias("conversion_rate") Double conversao,
        @JsonAlias("time_next_update_utc") String ultimaChecagem,
        @JsonAlias("target_code") String moedaParaConvercao
) {
    @Override
    public String toString() {
        return
                "Moeda Base = " + moedaBase + '\n' +
                "Moeda para Converção = " + moedaParaConvercao + '\n'+
                "Última Atualização de Valores = " + ultimaChecagem + '\n' +
                "A correspondência da moeda é de = " + conversao ;
    }
}
