package org.UiSprint.Factory;

import org.UiSprint.model.NewEdicaoUCDTO;
import org.UiSprint.model.NewUnidadeCurricularDTO;

public interface iUnidadeCurricularFactory {
    public NewUnidadeCurricularDTO NewUnidadeCurricular(String sigla, String denominacao);
}
