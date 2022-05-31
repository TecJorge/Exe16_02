package org.UiSprint.model;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class NewUnidadeCurricularDTO {
    private String sigla;
    private String denominacao;
    protected NewUnidadeCurricularDTO(){}
    public NewUnidadeCurricularDTO(String sigla,String denominacao){
        setDenominacao(denominacao);
        setSigla(sigla);
    }
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public String toJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

}
