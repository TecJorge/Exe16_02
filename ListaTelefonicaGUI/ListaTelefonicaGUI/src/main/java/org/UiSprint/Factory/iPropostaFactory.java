package org.UiSprint.Factory;

import org.UiSprint.model.NewAnoLetivoDTO;
import org.UiSprint.model.NewPropostaDTO;

public interface iPropostaFactory {
    public NewPropostaDTO newProposta (int userID, int empresaID, String titleProposta, String problema, String objetivo, int edicaoID);
}
