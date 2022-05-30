package org.UiSprint.controller;

import org.UiSprint.Services.AnoLetivoService;
import org.UiSprint.Services.PropostaService;

public class AplicacaoController {
    private AnoLetivoService anoLetivoService=new AnoLetivoService();
    private PropostaService propostaService = new PropostaService();
    private EdicaoUCService edicaoUCService=new EdicaoUCService();
    public boolean addAnoLetivo(int pais, int cidade) {
        return anoLetivoService.addAnoLetivo(pais,cidade);
    }
    public boolean addProposta(int userID,int empresaID,String titleProposta,String problema,String objetivo,int edicaoID){
        return propostaService.addProposta(userID,empresaID,titleProposta,problema,objetivo,edicaoID);
    }
    public boolean addEdicaoUC(int edicaoID,int anoLetivoID){
        return edicaoUCService.addEdicaoUC(edicaoID,anoLetivoID);
    }
}