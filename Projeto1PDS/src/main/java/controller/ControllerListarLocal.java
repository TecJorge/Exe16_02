package controller;

import domain.Organizacao;

import java.util.List;

public class ControllerListarLocal implements ui.controllerInterface.iControllerListarLocal {
    private List tipoLocallist;
    private Organizacao organizacao;
    public ControllerListarLocal(Organizacao organizacao){
        this.tipoLocallist=organizacao.getLocalList();
    }
    public void ListarAlojamentos(){
        if (this.tipoLocallist.isEmpty())
            System.out.println("Não existem Alojamentos criados");
        else
            System.out.printf("A Organização tem: %s",tipoLocallist);
    }
}

