package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilter;

public class AlojamentoFilterContainsDescricao implements AlojamentoFilter {
    final String NAME = "Alojamentos que incluem determinada Descrição string ";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, String string) {
        String sDenominaçãoUpper=ta.getDenomincao().toUpperCase();
        String sToUpper=string.toUpperCase();
        return sDenominaçãoUpper.contains(sToUpper);
    }

}
