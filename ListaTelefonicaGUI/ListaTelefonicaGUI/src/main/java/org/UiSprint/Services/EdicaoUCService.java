package org.UiSprint.Services;

import org.UiSprint.Factory.AnoLetivoFactory;
import org.UiSprint.WebServices.AnoLetivoWS;
import org.UiSprint.model.NewAnoLetivoDTO;

public class EdicaoUCService {
    EdicaoUCFactory edicaoUCFactory=new EdicaoUCFactory();
    EdicaoUCWS edicaoUCWS=new EdicaoUCWS();
    public EdicaoUCService(){}
    public boolean addEdicaoUC(int edicaoUCID,int anoLetivoID){
        NewEdicaoUCDTO edicaoUCDTO =edicaoUCFactory.NewEdicaoUC(edicaoUCID,anoLetivoID);
        return edicaoUCWS.addEdicaoUC(edicaoUCDTO);
    }
}
