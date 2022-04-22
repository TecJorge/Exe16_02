package domain.filters;

import domain.TipoAlojamento;

public interface TipoAlojamentoFilter extends Filter {
    public boolean complies( TipoAlojamento ta, String string );
}
