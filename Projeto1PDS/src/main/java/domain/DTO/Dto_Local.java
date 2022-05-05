package domain.DTO;

import domain.Local;

public class Dto_Local {
    private String cid,pais;
    public Dto_Local(Local local){
        this.cid=local.getCid();
        this.pais=local.getPais();
    }

    public String getPais() {
        return pais;
    }

    public String getCid() {
        return cid;
    }
}
