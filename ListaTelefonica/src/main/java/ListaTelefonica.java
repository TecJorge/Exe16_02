import java.util.ArrayList;
import java.util.Objects;

public class ListaTelefonica {
    private String nome;
    private ArrayList<Contato>list;
    ListaTelefonica(String nome , ArrayList<Contato> lista){
        this.nome=nome;
        this.list=lista;
    }
    ListaTelefonica(){
        this.nome=null;
        this.list=new ArrayList<Contato>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Contato> getList() {
        return list;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setList(ArrayList<Contato> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaTelefonica that = (ListaTelefonica) o;
        return Objects.equals(nome, that.nome) && Objects.equals(list, that.list);
    }

    @Override
    public String toString() {
       return  String.format("\n Nome da Lista: %s \n Contatos: \n%s ",nome ,list);
    }
    public void novoContato(String nome , String email, ArrayList<Integer> lista , String categoria){
        if(list.contains(new Contato(nome,email,lista,categoria)))
            System.out.println("Contato já existe!");
        else
        this.list.add(new Contato(nome,email,lista,categoria));
    }
    public void novoContatojaCriado(Contato o){
        if(list.contains(o))
            System.out.println("Contato já existe!");
        else
            this.list.add(o);
    }
    public void removerContato(String cat,String nome ,ArrayList<Integer>num,String email){
        if(list.contains(new Contato(cat,nome,num,email)))
        this.list.remove(new Contato(cat,nome,num,email));
        else
            System.out.println("O Contato não Existe!");
    }
    public void removerContatojaCriado(Contato o){
        if(list.contains(o))
            this.list.remove(o);
        else
            System.out.println("O Contato não Existe!");
    }
    public void mostrarUmaCategoria(String n){
        for (Contato x:list
             ) {if (x.getCategoria().equalsIgnoreCase(n))
            System.out.println(x);
        }
    }

}
