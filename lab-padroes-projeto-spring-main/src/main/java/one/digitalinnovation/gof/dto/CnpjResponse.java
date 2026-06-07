package one.digitalinnovation.gof.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CnpjResponse {

    @JsonProperty("descricao_situacao_cadastral")
    private String descricaoSituacaoCadastral;

    public String getDescricaoSituacaoCadastral() {
        return descricaoSituacaoCadastral;
    }

    public void setDescricaoSituacaoCadastral(String descricaoSituacaoCadastral) {
        this.descricaoSituacaoCadastral = descricaoSituacaoCadastral;
    }
}