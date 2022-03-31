package controller;

import domain.Organizacao;

import java.util.List;

public class ControllerListarAlojamento {
    private List tipoAlojamentolist;
    private Organizacao organizacao;
    public ControllerListarAlojamento(Organizacao organizacao){
        this.tipoAlojamentolist=organizacao.getAlojamentoList();
    }
    public void ListarAlojamentos(){
        if (this.tipoAlojamentolist.isEmpty())
        System.out.println("Não existem Alojamentos criados");
        else
            System.out.printf("A Organização tem: %s",tipoAlojamentolist);
    }
}
