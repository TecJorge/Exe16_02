package domain;

import java.util.Objects;

public class Local {
    private String cid,pais;
    private final String cidDefault="Indefinido";
    public Local(String cid,String pais){
        this.cid=cid;
        this.pais=pais;
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
