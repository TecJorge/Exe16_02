package ui;

import controller.ControllerAlojamento;
import controller.ControllerListarAlojamento;
import domain.Alojamento;
import domain.Organizacao;
import domain.filters.AlojamentoFilter;
import org.apache.commons.configuration2.ex.ConfigurationException;
import ui.controllerInterface.iControllerListarAlojamento;
import utils.utilitarios;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class UIListarAlojamento implements UI {
    private Organizacao organizacao;
    private iControllerListarAlojamento controller;
    public UIListarAlojamento(Organizacao organizacao) throws ConfigurationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.organizacao=organizacao;
        this.controller=createInstancesOfController();
    }
    public void run(List<String> listStringController){
        try {
            System.out.println("\nListar  Alojamento:");

            AlojamentoFilter AlojamentoFilter = readAlojamentoFilter();

            String sDeFiltro = utilitarios.readLineFromConsole("String de filtro: ");

            List<Alojamento> listaAlojamento = controller.filtrar(AlojamentoFilter, sDeFiltro);

            System.out.println("\nLista de  Alojamento filtrada:\n");
        for (Alojamento ta : listaAlojamento) {
            System.out.println(ta.toString() + "\n");

        utilitarios.readLineFromConsole("Continuar?");
        } }catch (Exception e){
        System.out.println(e.getMessage());}
}

    @Override
    public String getMenuDescription() {
        return "Listar Alojamento\n";
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
    // Codigo para gerar o controller
    public iControllerListarAlojamento createInstancesOfController() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ConfigurationException {
        String lController = utilitarios.readConfigString("controller.ControllerListarAlojamento");
        iControllerListarAlojamento controller=(iControllerListarAlojamento) Class.forName(lController).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
        return controller;
    }
}




