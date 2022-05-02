package domain.filters.Alojamento;

import domain.Alojamento;
import domain.filters.AlojamentoFilter;
import domain.filters.AlojamentoFilterNumerico;

public class AlojamentoFilterByPriceLessThan implements AlojamentoFilter {
    final String NAME = "Alojamentos que tenham um preço menor que  ";
    public String getName() {
        return NAME;
    }
    public boolean complies(Alojamento ta,String number) throws Exception {
        if (number.isEmpty())
            throw new Exception("Deve ser introduzido um valor");
        double inputPrice=Double.valueOf(number);
        if (inputPrice<0)
            throw new Exception("Preço introduzido não pode ter valor negativo");
        double price=ta.getPreco();
       return price>inputPrice;
    }
}
