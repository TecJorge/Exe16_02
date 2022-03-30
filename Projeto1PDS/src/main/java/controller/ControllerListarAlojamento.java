package controller;

import domain.Organizacao;
import domain.TipoAtividade;

import java.util.List;

public class ControllerListarAlojamento {
    private List tipoAlojamentolist;
    private Organizacao organizacao;
    ControllerListarAlojamento(Organizacao organizacao){
        this.tipoAlojamentolist=organizacao.getAlojamentoList();
    }
    public void ListarAlojamentos(){
        if (this.tipoAlojamentolist.isEmpty())
        System.out.println("Não existem Alojamentos criados");
        else
            System.out.printf("A Organização tem: %s",tipoAlojamentolist);
    }
}
