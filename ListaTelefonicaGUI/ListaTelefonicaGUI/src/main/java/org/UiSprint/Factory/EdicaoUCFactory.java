package org.UiSprint.Factory;

import org.UiSprint.model.NewEdicaoUCDTO;

public class EdicaoUCFactory implements  iEdicaoUCFactory
{
    @Override
    public NewEdicaoUCDTO NewEdicaoUC(int edicaoUCID, int anoLetivoID) {
        return new NewEdicaoUCDTO(edicaoUCID,anoLetivoID);
    }
}
