package org.UiSprint.Factory;

import org.UiSprint.model.NewAnoLetivoDTO;

public class AnoLetivoFactory implements iAnoLetivoFactory{
    @Override
    public NewAnoLetivoDTO NewAnoletivo(int pais, int cidade) {
        return new NewAnoLetivoDTO(pais,cidade);
    }
}
