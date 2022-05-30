package org.UiSprint.Services;

import org.UiSprint.Factory.PropostaFactory;
import org.UiSprint.WebServices.PropostaWS;
import org.UiSprint.model.NewPropostaDTO;

public class PropostaService {
    PropostaFactory propostaFactory=new PropostaFactory();
    PropostaWS propostaWS=new PropostaWS();
    public PropostaService(){}
    public boolean addProposta(int userID,int empresaID,String titleProposta,String problema,String objetivo,int edicaoID){
        NewPropostaDTO propostaDTO =propostaFactory.newProposta(userID,empresaID,titleProposta,problema,objetivo,edicaoID);
        return propostaWS.addProposta(propostaDTO);
    }
}
