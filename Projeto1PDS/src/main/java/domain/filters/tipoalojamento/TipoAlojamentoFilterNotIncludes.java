package domain.filters.tipoalojamento;

import domain.TipoAlojamento;
import domain.filters.TipoAlojamentoFilter;

public class TipoAlojamentoFilterNotIncludes implements TipoAlojamentoFilter {

    final String NAME = "Tipo Alojamentos que não inclui string";

    public String getName() {
        return NAME;
    }

    public boolean complies( TipoAlojamento ta, String string )
    {
        return !ta.getDescricao().contains( string );
    }
}
