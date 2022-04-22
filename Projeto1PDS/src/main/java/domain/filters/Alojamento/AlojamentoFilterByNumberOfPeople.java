package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilterNumerico;

public class AlojamentoFilterByNumberOfPeople implements AlojamentoFilterNumerico {
    final String NAME = "Alojamentos que suportem uma Quantidade de Pessoas de";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, double number) {
        double MaxP=ta.getQntdMax();
        double MinP= ta.getQntdMax();
        return (number>MinP&&number<MaxP);
    }
}
