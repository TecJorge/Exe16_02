import java.util.Comparator;
 public class Ordenar implements Comparator<exposicao> {
        /**
         * Rescrita do Metodo Compare da Interface Nativa do Java Comparator
         * @return Retorna um valor inteiro que irá servir como critério de ordenação
         */
        @Override
        public int compare(exposicao o1, exposicao o2) {
            int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            if (result == 0) {
                if (o2.getAno()>o1.getAno())
                    return 1;
                else if (o2.getAno()<o1.getAno())
                    return -1;
                else return 0;
            }
            return result;
        }
}
