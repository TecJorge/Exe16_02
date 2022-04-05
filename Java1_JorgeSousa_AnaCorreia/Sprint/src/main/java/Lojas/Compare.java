package Lojas;

import java.util.Comparator;

public class Compare implements Comparator<Loja> {
    /**
     * Rescrita do Metodo Compare da Interface Nativa do Java Comparator
     * @return Retorna um valor inteiro que irá servir como critério de ordenação
     */
    @Override
    public int compare(Loja o1, Loja o2) {
        int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        if (result == 0) {
            if (o2.getArea()>o1.getArea())
                return 1;
            else if (o2.getArea()<o1.getArea())
                return -1;
            else return 0;
        }
        return result;
    }
}

