package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilterNumerico;

public class AlojamentoFilterByMaxNumberOfPeople implements AlojamentoFilterNumerico {
    final String NAME = "Alojamentos que suportem uma Quantidade de Pessoas Max de";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta, double number) {
        double MaxP=ta.getQntdMax();
        return number<=MaxP;
    }
}
