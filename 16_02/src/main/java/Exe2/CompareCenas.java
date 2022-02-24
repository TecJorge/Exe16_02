package Exe2;

import java.util.Comparator;

public class CompareCenas implements Comparator<Contribuinte> {

    @Override
    public int compare(Contribuinte o1, Contribuinte o2) {
        int result = this.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        if (result == 0) {
            result = o1.getNome().compareTo(o2.getNome());
        }
        return result;
    }
}
