package controller;

import domain.Alojamento;
import domain.Organizacao;
import domain.TipoAlojamento;
import domain.filters.AlojamentoFilter;
import domain.filters.TipoAlojamentoFilter;

import java.util.List;

public class ControllerListarAlojamento {
    private List Alojamentolist;
    private Organizacao organizacao;
    public ControllerListarAlojamento(Organizacao organizacao){
        this.organizacao=organizacao;
        this.Alojamentolist=organizacao.getAlojamentoList();
    }
    public void ListarAlojamentos(){
        if (this.Alojamentolist.isEmpty())
        System.out.println("Não existem Alojamentos criados");
        else
            System.out.printf("A Organização tem: %s",Alojamentolist);
    }
    public List<AlojamentoFilter> getAlojamentoFilters() {
        return this.organizacao.getlistaAlojamentoFilters();
    }
    public List<Alojamento> filtrar(AlojamentoFilter filter, String string) {
        List<Alojamento> lista = this.organizacao.filtrarAlojamento( filter, string );

        return lista;
    }
}
