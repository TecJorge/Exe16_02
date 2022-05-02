package domain.Factories;

import domain.filters.TipoAlojamentoFilter;

import java.util.ArrayList;
import java.util.List;

public class FactoryTipoAlojamentoFilter{
public List<TipoAlojamentoFilter> createInstancesOfTipoAlojamentoFilters( List<String> listaStringClassesTipoAlojamentoFilters ) {

        List<TipoAlojamentoFilter> lTipoAlojamentoFilters = new ArrayList<TipoAlojamentoFilter>();

        for (String strClassTipoAlojamentoFilter : listaStringClassesTipoAlojamentoFilters) {
        try {
        TipoAlojamentoFilter oTipoAlojamentoFilter = (TipoAlojamentoFilter) Class.forName(strClassTipoAlojamentoFilter).getDeclaredConstructor().newInstance();
        lTipoAlojamentoFilters.add(oTipoAlojamentoFilter);
        }
        catch(Exception e) {
        System.out.println( e.getMessage() );
        }
        }
        return  lTipoAlojamentoFilters;}}
