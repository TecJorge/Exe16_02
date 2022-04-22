package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilter;

public class AlojamentoFilterContainsTipoAlojamento implements AlojamentoFilter {
    final String NAME = "Alojamentos que não inclui TipoAlojamento string ";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, String string) {
        String sDenominacaoUpper=ta.getTipoAlojamento().getDescricao().toUpperCase();
        String sToUpper=string.toUpperCase();
        return sDenominacaoUpper.contains(sToUpper);
    }
}
