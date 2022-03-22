import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Contato implements Comparable<Contato> {
    private String nome,email,categoria;
    private ArrayList<Integer> numero;
    private static String cat_default="sem Categoria";
    Contato (String nome , String email, ArrayList<Integer> lista , String categoria){
        this.nome=nome;
        this.email=email;
        this.categoria=categoria;
        this.numero=lista;
    }
    Contato(){
        this.nome=null;
        this.email=null;
        this.categoria=null;
        this.numero=new ArrayList<>();
    }
    Contato (String nome , String email, ArrayList<Integer>lista){
        this.nome=nome;
        this.email=email;
        this.categoria=cat_default;
        this.numero=lista;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Integer> getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumero(ArrayList<Integer> numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("\nCategoria : %s ,Nome : %s ,Email :%s , Numero : %s\n",categoria,nome,email,numero);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(email, contato.email) && Objects.equals(numero, contato.numero);
    }

    @Override
    public int compareTo(Contato o) {
        return this.nome.compareToIgnoreCase(o.getNome());
    }
    void addNum(int n){
        this.numero.add(n);
    }
}
