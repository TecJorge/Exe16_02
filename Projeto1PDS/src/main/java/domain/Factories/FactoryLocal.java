package domain.Factories;

import domain.Local;

public class FactoryLocal {
    public Local criaLocal(String cid, String pais){
        return new Local(cid,pais);
    }
}
