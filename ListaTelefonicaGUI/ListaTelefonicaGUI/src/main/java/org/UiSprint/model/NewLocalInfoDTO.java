package org.UiSprint.model;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
@JsonSerialize
public class NewLocalInfoDTO {
    private int pais;
    private int cidade;
    protected NewLocalInfoDTO(){}
    public NewLocalInfoDTO(int pais , int cidade){
       setAnoInicial(pais);
       setAnoFinal(cidade);
    }

    public void setAnoInicial(int pais) {
        this.pais = pais;
    }
    public void setAnoFinal(int cidade) {
        this.cidade = cidade;
    }

    public int getAnoFinal() {
        return cidade;
    }

    public int getAnoInicial() {
        return pais;
    }


    public String toJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(this));
        return mapper.writeValueAsString(this);
    }

}
