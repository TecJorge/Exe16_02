public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T firstElement, S secondElement) throws Exception {
        if (firstElement.getClass().equals(String.class)&&secondElement.getClass().equals(Double.class) {
                ||firstElement.getClass().equals(Integer.class)&&secondElement.getClass().equals(String.class)
                ||firstElement.getClass().equals(Float.class)&&secondElement.getClass().equals(Float.class))
        setFirst(firstElement);
        setSecond(secondElement);}
        else throw new Exception("Algo de mal aconteceu");
    }

    public S getSecond() {
        return second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) throws Exception {
        if (first.getClass().equals(String.class)||first.getClass().equals(Integer.class)||first.getClass().equals(Float.class))
        this.first = first;
        else throw new Exception("Tipo não Suportado");
    }

    public void setSecond(S second) throws Exception {
        if (first.getClass().equals(Double.class)||first.getClass().equals(String.class)||first.getClass().equals(Float.class))
            this.second = second;
        else throw new Exception("Tipo não Suportado");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pair{");
        sb.append("first=").append(first);
        sb.append(", second=").append(second);
        sb.append('}');
        return sb.toString();
    }
}
