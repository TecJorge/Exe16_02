package org.UiSprint.Factory;

import org.UiSprint.model.NewPropostaDTO;

public class PropostaFactory implements iPropostaFactory{
    @Override
    public NewPropostaDTO newProposta(int userID, int empresaID, String titleProposta, String problema, String objetivo, int edicaoID) {
        return new NewPropostaDTO(userID,empresaID,titleProposta,problema,objetivo,edicaoID);
    }
}
