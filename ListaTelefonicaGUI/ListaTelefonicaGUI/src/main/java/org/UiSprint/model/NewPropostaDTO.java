package org.UiSprint.model;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
@JsonSerialize
public class NewPropostaDTO {
    private int userID;
    private int empresaID;
    private String titleProposta;
    private String problema;
    private String objetivo;
    private int edicaoID;
        protected NewPropostaDTO(){}

    public NewPropostaDTO(int userID, int empresaID, String titleProposta, String problema, String objetivo, int edicaoID){
          setEdicaoID(edicaoID);
          setEmpresaID(empresaID);
          setObjetivo(objetivo);
          setProblema(problema);
          setUserID(userID);
          setTitleProposta(titleProposta);
        }
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setEmpresaID(int empresaID) {
        this.empresaID = empresaID;
    }

    public void setTitleProposta(String titleProposta) {
        this.titleProposta = titleProposta;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setEdicaoID(int edicaoID) {
        this.edicaoID = edicaoID;
    }

    public int getUserID() {
        return userID;
    }

    public int getEmpresaID() {
        return empresaID;
    }

    public String getTitleProposta() {
        return titleProposta;
    }

    public String getProblema() {
        return problema;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public int getEdicaoID() {
        return edicaoID;
    }

    public String toJson() throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        }
}
