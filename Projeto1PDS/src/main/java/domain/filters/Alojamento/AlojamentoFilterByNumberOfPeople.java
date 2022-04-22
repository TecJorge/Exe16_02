package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilter;
import domain.filters.AlojamentoFilterNumerico;

public class AlojamentoFilterByNumberOfPeople implements AlojamentoFilter {
    final String NAME = "Alojamentos que suportem uma Quantidade de Pessoas de";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, String number) {
        double MaxP=ta.getQntdMax();
        double MinP= ta.getQntdMax();
        return (Double.valueOf(number)>MinP&&Double.valueOf(number)<MaxP);
    }
}
