package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilter;
import domain.filters.AlojamentoFilterNumerico;

public class AlojamentoFilterByMinNumberOfPeople implements AlojamentoFilter {
    final String NAME = "Alojamentos que suportem uma Quantidade de Pessoas Max de";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, String number) {
        double MinP=ta.getQntdMin();
        return Double.valueOf(number)>=MinP;
    }
}
