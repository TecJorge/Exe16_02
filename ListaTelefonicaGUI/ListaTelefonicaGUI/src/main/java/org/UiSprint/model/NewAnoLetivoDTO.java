package org.UiSprint.model;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
@JsonSerialize
public class NewAnoLetivoDTO {
    private int pais;
    private int cidade;
    protected NewAnoLetivoDTO(){}
    public NewAnoLetivoDTO(int pais , int cidade){
       setPais(pais);
       setCidade(cidade);
    }

    public void setPais(int pais) {
        this.pais = pais;
    }
    public void setCidade(int cidade) {
        this.cidade = cidade;
    }

    public int getCidade() {
        return cidade;
    }

    public int getPais() {
        return pais;
    }


    public String toJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

}
