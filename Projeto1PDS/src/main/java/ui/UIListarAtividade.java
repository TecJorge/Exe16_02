package ui;

import controller.ControllerListarAtividade;
import domain.Organizacao;
import utils.utilitarios;

public class UIListarAtividade {
    private Organizacao organizacao;
    private ControllerListarAtividade controller;
    public UIListarAtividade(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerListarAtividade(organizacao);
    }
    public void run() {
        utilitarios.apresentaLista(organizacao.getAtividadeList(),"Lista de Atividades");
    }
}

