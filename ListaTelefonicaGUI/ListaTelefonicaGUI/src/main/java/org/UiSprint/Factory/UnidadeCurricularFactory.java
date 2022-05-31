package org.UiSprint.Factory;

import org.UiSprint.Services.UnidadeCurricularService;
import org.UiSprint.model.NewUnidadeCurricularDTO;

public class UnidadeCurricularFactory implements iUnidadeCurricularFactory {
    @Override
    public NewUnidadeCurricularDTO NewUnidadeCurricular(String sigla, String denominacao) {
        return new NewUnidadeCurricularDTO(sigla,denominacao);
    }
}
