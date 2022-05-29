package org.UiSprint.Factory;

import org.UiSprint.model.NewLocalInfoDTO;

public class AnoLetivoFactory implements iAnoLetivoFactory{
    @Override
    public NewLocalInfoDTO NewAnoletivo(int anoInicial, int anoFinal) {
        return new NewLocalInfoDTO(anoInicial,anoFinal);
    }
}
