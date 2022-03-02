package Lojas;

import java.util.Comparator;

public class Compare implements Comparator<Loja> {

    @Override
    public int compare(Loja o1, Loja o2) {
        int result = this.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        if (result == 0) {
            result = o1.getNome().compareTo(o2.getNome());
        }
        return result;
    }
}

