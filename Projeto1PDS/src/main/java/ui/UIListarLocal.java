package ui;

import controller.ControllerListarAtividade;
import controller.ControllerListarLocal;
import domain.Organizacao;
import utils.utilitarios;

public class UIListarLocal {
    private Organizacao organizacao;
    private ControllerListarLocal controller;
    public UIListarLocal(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerListarLocal(organizacao);
    }
    public void run() {
        utilitarios.apresentaLista(organizacao.getLocalList(),"Lista de Locais");
    }
}
