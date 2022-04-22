package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilterNumerico;

public class AlojamentoFilterByPriceLessThan implements AlojamentoFilterNumerico {
    final String NAME = "Alojamentos que tenham um preço menor que  ";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, double number) {
        double price=ta.getPreco();
       return price<number;
    }
}
