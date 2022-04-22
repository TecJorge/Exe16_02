package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilter;
import domain.filters.AlojamentoFilterNumerico;

public class AlojamentoFilterByPriceBiggerThan implements AlojamentoFilter {
    final String NAME = "Alojamentos que tenham um preço maior que  ";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta,String number) {
        double price=ta.getPreco();
        return price>Double.valueOf(number);
    }
}
