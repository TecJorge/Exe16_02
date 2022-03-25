public class Telefone {
    private int indPais,numero;
    private final int indPaisDefault=00000;
    private final int numerDefault=000000000;
    Telefone(int n ,int i) throws NumerInvalidoException {
        setNumero(n);
        setIndPais(i);
    }
    Telefone(){
        this.numero=numerDefault;
        this.indPais=indPaisDefault;
    }

    public void setNumero(int numero) throws NumerInvalidoException {
        if(numero<999999999)
        this.numero = numero;
        else
            throw new NumerInvalidoException("Numero de Telefone Invalido o mesmo so pode conter 9 digitos");
    }

    public void setIndPais(int indPais) throws NumerInvalidoException {
        if (indPais<99999)
        this.indPais = indPais;
        else throw new NumerInvalidoException("Indice de Pais Invalido o mesmo so pode conter 5 digitos");
    }

    public int getIndPais() {
        return indPais;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
       return String.format("Indice:%d ,Numero:%d",indPais,numero);
    }
}
