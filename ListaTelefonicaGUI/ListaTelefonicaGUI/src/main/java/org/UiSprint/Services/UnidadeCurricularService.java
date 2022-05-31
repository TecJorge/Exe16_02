package org.UiSprint.Services;

import org.UiSprint.Factory.EdicaoUCFactory;
import org.UiSprint.Factory.UnidadeCurricularFactory;
import org.UiSprint.WebServices.EdicaoUCWS;
import org.UiSprint.WebServices.UnidadeCurricularWS;
import org.UiSprint.model.NewEdicaoUCDTO;
import org.UiSprint.model.NewUnidadeCurricularDTO;

import java.util.Optional;

public class UnidadeCurricularService {
    UnidadeCurricularFactory unidadeCurricularFactory=new UnidadeCurricularFactory ();
    UnidadeCurricularWS unidadeCurricularWS=new UnidadeCurricularWS();
    public UnidadeCurricularService(){}
    public boolean addUnidadeCurricular(String sigla,String denominacao){
        NewUnidadeCurricularDTO unidadeCurricularDTO =unidadeCurricularFactory.NewUnidadeCurricular(sigla,denominacao);
        return unidadeCurricularWS.addUnidadeCurricular(unidadeCurricularDTO);
    }
    public Optional<NewUnidadeCurricularDTO> getUCbyID(int ucID) throws Exception {
        return unidadeCurricularWS.getUCByID(ucID);
    }
}
