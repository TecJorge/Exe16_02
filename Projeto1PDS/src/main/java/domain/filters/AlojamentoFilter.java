package domain.filters;

import domain.Alojamento;

public interface AlojamentoFilter extends Filter{
    public boolean complies(Alojamento ta, String string );

}
