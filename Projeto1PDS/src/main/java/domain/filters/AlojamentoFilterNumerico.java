package domain.filters;

import domain.Alojamento;

public interface AlojamentoFilterNumerico extends Filter {
    public boolean complies(Alojamento ta, double number );
}
