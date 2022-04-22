package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilter;

public class AlojamentoFilterContainsDiaSemana implements AlojamentoFilter {
    final String NAME = "Alojamentos que inclui Dia da Semana string ";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, String string) {
        String sDiaSemanaUpper=ta.getData().getsDiaSemana().toUpperCase();
        String sToUpper=string.toUpperCase();
        return sDiaSemanaUpper.contains(sToUpper);
    }
}
