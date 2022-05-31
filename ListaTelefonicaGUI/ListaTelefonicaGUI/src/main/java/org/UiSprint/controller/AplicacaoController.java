package org.UiSprint.controller;

import org.UiSprint.Services.AnoLetivoService;
import org.UiSprint.Services.EdicaoUCService;
import org.UiSprint.Services.PropostaService;
import org.UiSprint.Services.UnidadeCurricularService;
import org.UiSprint.model.NewUnidadeCurricularDTO;

import java.util.Optional;

public class AplicacaoController {
    private AnoLetivoService anoLetivoService=new AnoLetivoService();
    private PropostaService propostaService = new PropostaService();
    private EdicaoUCService edicaoUCService=new EdicaoUCService();
    private UnidadeCurricularService unidadeCurricularService=new UnidadeCurricularService();
    public boolean addAnoLetivo(int pais, int cidade) {
        return anoLetivoService.addAnoLetivo(pais,cidade);
    }
    public boolean addProposta(int userID,int empresaID,String titleProposta,String problema,String objetivo,int edicaoID){
        return propostaService.addProposta(userID,empresaID,titleProposta,problema,objetivo,edicaoID);
    }
    public boolean addEdicaoUC(int edicaoID,int anoLetivoID){
        return edicaoUCService.addEdicaoUC(edicaoID,anoLetivoID);
    }
    public boolean addUnidadeCurricular(String sigla ,String denominacao){
        return unidadeCurricularService.addUnidadeCurricular(sigla,denominacao);
    }
    public Optional<NewUnidadeCurricularDTO> getUCbyID(int ucID) throws Exception {
        return unidadeCurricularService.getUCbyID(ucID);
    }
}