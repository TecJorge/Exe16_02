package org.UiSprint.Services;

import org.UiSprint.Factory.AnoLetivoFactory;
import org.UiSprint.WebServices.AnoLetivoWS;
import org.UiSprint.model.NewLocalInfoDTO;

public class AnoLetivoService {
    AnoLetivoFactory anoLetivoFactory=new AnoLetivoFactory();
    AnoLetivoWS anoLetivoWS=new AnoLetivoWS();
    public AnoLetivoService(){}
    public boolean addAnoLetivo(int anoInicial,int anoFinal){
        NewLocalInfoDTO anoLetivo =anoLetivoFactory.NewAnoletivo(anoInicial,anoFinal);
        return anoLetivoWS.addAnoLetivo(anoLetivo);
    }

}
