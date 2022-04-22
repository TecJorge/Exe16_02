package domain.filters.tipoalojamento;

import domain.TipoAlojamento;
import domain.filters.TipoAlojamentoFilter;

public class TipoAlojamentoFilterIncludesIgnoreCase implements TipoAlojamentoFilter {

    final String NAME = "Tipo Alojamentos que inclui string ignorando Capitalização";

    public String getName() {
        return NAME;
    }

    public boolean complies( TipoAlojamento ta, String string )
    {
        String sUppercase=string.toUpperCase();
        String sDescricaoUpperCase=ta.getDescricao().toUpperCase();
        return sDescricaoUpperCase.contains(sUppercase);
    }
}
