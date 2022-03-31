package ui;

import controller.ControllerListarAlojamento;
import domain.Organizacao;
import utils.utilitarios;

public class UIListarAlojamento {
    private Organizacao organizacao;
    private ControllerListarAlojamento controller;
    public UIListarAlojamento(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerListarAlojamento(organizacao);
    }
    public void run() {
        utilitarios.apresentaLista(organizacao.getAlojamentoList(),"Lista de Alojamentos");
        }
    }




