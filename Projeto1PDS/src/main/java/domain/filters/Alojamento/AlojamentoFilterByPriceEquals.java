package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilterNumerico;

public class AlojamentoFilterByPriceEquals implements AlojamentoFilterNumerico {
    final String NAME = "Alojamentos que tenham um preço Igual a:  ";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, double number) {
        double price=ta.getPreco();
        return price==number;
    }
}
