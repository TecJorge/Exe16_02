package org.UiSprint.controller;

import org.UiSprint.Services.AnoLetivoService;
import org.UiSprint.model.ListaTelefonica;

public class AplicacaoController {
    private ListaTelefonica listaTelefonica;
    private AnoLetivoService anoLetivoService=new AnoLetivoService();

    public AplicacaoController() {
        listaTelefonica = new ListaTelefonica();
    }

    public String getListaTelefonica() {
        return listaTelefonica.toString();
    }

    public void preencherListaTelefonica() {
        listaTelefonica.prePreencherLista();
    }

    public boolean addAnoLetivo(int anoInicial, int anoFinal) {
        return anoLetivoService.addAnoLetivo(anoInicial,anoFinal);
    }
}