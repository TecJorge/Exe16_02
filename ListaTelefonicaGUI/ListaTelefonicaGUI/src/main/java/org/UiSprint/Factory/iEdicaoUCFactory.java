package org.UiSprint.Factory;

import org.UiSprint.model.NewEdicaoUCDTO;

public interface iEdicaoUCFactory {
    public NewEdicaoUCDTO NewEdicaoUC(int edicaoUCID, int anoLetivoID);
}
