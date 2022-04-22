package ui;

import controller.ControllerListarAlojamento;
import domain.Alojamento;
import domain.Organizacao;
import domain.TipoAlojamento;
import domain.filters.AlojamentoFilter;
import domain.filters.TipoAlojamentoFilter;
import utils.utilitarios;

import java.util.List;

public class UIListarAlojamento {
    private Organizacao organizacao;
    private ControllerListarAlojamento controller;
    public UIListarAlojamento(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerListarAlojamento(organizacao);
    }
    public void run() {

        System.out.println("\nListar  Alojamento:");

       AlojamentoFilter AlojamentoFilter = readAlojamentoFilter();

        String sDeFiltro = utilitarios.readLineFromConsole("String de filtro: ");

        List<Alojamento> listaAlojamento = controller.filtrar(AlojamentoFilter, sDeFiltro);

        System.out.println("\nLista de  Alojamento filtrada:\n");
        for (Alojamento ta : listaAlojamento) {
            System.out.println(ta.toString() + "\n");
        }

        utilitarios.readLineFromConsole("Continuar?");
        }
    private AlojamentoFilter readAlojamentoFilter()
    {
        List<AlojamentoFilter> lstAlojamentoFilters = controller.getAlojamentoFilters();

        int nIndex = 0;
        do {
            int i = 0;
            for (AlojamentoFilter AlojamentoFilter : lstAlojamentoFilters) {
                i++;
                System.out.println(i + ". " + AlojamentoFilter.getName() );
            }

            String sAlojamentoFilter = utilitarios.readLineFromConsole("Tipo Alojamento Filter: ");

            nIndex = Integer.parseInt(sAlojamentoFilter );

            if( nIndex <= lstAlojamentoFilters.size() )
                return lstAlojamentoFilters.get( nIndex - 1 );
        }
        while ( nIndex !=0 );

        return null;
    }
}




