package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilter;

public class AlojamentoFilterNotContainsDescricao implements AlojamentoFilter {
    final String NAME = "Alojamentos que não inclui Descrição string ";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, String string) {
        String sDenominacaoUpper=ta.getDenomincao().toUpperCase();
        String sToUpper=string.toUpperCase();
        return !sDenominacaoUpper.contains(sToUpper);
    }


}
