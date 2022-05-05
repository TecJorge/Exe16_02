package domain;

import domain.DTO.Dto_Local;

import java.util.Objects;

import static org.apache.commons.lang3.StringUtils.split;

public class Local {
    private String cid,pais;
    private final String cidDefault="Indefinido";
    public Local(String cid,String pais){
        this.cid=cid;
        this.pais=pais;
    }
    public Local(String local){
        String [] Stemp=local.split(":");
        String[] sFinal=Stemp.toString().split(",");
        this.cid=sFinal[0];
        this.pais=sFinal[1];
    }
    public Local (Dto_Local local){
        this.cid=local.getCid();
        this.pais=local.getPais();
    }
    Local(){
        this.cid=cidDefault;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCid() {
        return cid;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
     return String.format("Localidade : %s,%s\n",cid,pais);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return Objects.equals(cid, local.cid) && Objects.equals(cidDefault, local.cidDefault);
    }

}
