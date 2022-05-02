package domain.Factories;

import domain.filters.AlojamentoFilter;

import java.util.ArrayList;
import java.util.List;

public class FactoryAlojamentoFilters {
    public List<AlojamentoFilter> createInstancesOfAlojamentoFilters(List<String> listaStringAlojamentoFilters ) {

        List<AlojamentoFilter> lAlojamentoFilters = new ArrayList<AlojamentoFilter>();

        for (String strClassAlojamentoFilter : listaStringAlojamentoFilters) {
            try {
                AlojamentoFilter oAlojamentoFilter = (AlojamentoFilter) Class.forName(strClassAlojamentoFilter).getDeclaredConstructor().newInstance();
                lAlojamentoFilters.add(oAlojamentoFilter);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return lAlojamentoFilters;
    }
}
