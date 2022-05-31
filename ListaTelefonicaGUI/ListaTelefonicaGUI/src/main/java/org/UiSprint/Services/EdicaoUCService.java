package org.UiSprint.Services;

import org.UiSprint.Factory.AnoLetivoFactory;
import org.UiSprint.Factory.EdicaoUCFactory;
import org.UiSprint.WebServices.AnoLetivoWS;
import org.UiSprint.WebServices.EdicaoUCWS;
import org.UiSprint.model.NewAnoLetivoDTO;
import org.UiSprint.model.NewEdicaoUCDTO;

public class EdicaoUCService {
    EdicaoUCFactory edicaoUCFactory=new EdicaoUCFactory();
    EdicaoUCWS edicaoUCWS=new EdicaoUCWS();
    public EdicaoUCService(){}
    public boolean addEdicaoUC(int edicaoUCID,int anoLetivoID){
        NewEdicaoUCDTO edicaoUCDTO =edicaoUCFactory.NewEdicaoUC(edicaoUCID,anoLetivoID);
        return edicaoUCWS.addEdicaoUC(edicaoUCDTO);
    }
}
