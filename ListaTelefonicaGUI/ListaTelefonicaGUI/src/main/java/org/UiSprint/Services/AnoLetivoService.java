package org.UiSprint.Services;

import org.UiSprint.Factory.AnoLetivoFactory;
import org.UiSprint.WebServices.AnoLetivoWS;
import org.UiSprint.model.NewAnoLetivoDTO;

public class AnoLetivoService {
    AnoLetivoFactory anoLetivoFactory=new AnoLetivoFactory();
    AnoLetivoWS anoLetivoWS=new AnoLetivoWS();
    public AnoLetivoService(){}
    public boolean addAnoLetivo(int pais,int cidade){
        NewAnoLetivoDTO anoLetivo =anoLetivoFactory.NewAnoletivo(pais,cidade);
        return anoLetivoWS.addAnoLetivo(anoLetivo);
    }

}
