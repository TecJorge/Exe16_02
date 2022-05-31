package org.UiSprint.model;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class NewEdicaoUCDTO {
    private int edicaoUCID;
    private int anoLetivoID;
    protected NewEdicaoUCDTO(){}
    public NewEdicaoUCDTO(int edicaoUCID,int anoLetivoID){
      setEdicaoUCID(edicaoUCID);
      setAnoLetivoID(anoLetivoID);
    }

    public int getEdicaoUCID() {
        return edicaoUCID;
    }

    public void setEdicaoUCID(int edicaoUCID) {
        this.edicaoUCID = edicaoUCID;
    }

    public int getAnoLetivoID() {
        return anoLetivoID;
    }

    public void setAnoLetivoID(int anoLetivoID) {
        this.anoLetivoID = anoLetivoID;
    }
    public String toJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }
}
