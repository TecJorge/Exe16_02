
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaFIlmes {
    private List<Filme> list;
    private String Id;
    private final String idDefault="ZZZ";
    ListaFIlmes(String id,List<Filme> lista) throws IdentificadorInvalidoException {
        setId(id);
        this.list=lista;
    }
    ListaFIlmes(){
        this.Id=idDefault;
        this.list=new ArrayList<Filme>();
    }

    public void setList(List<Filme> list) {
        this.list = list;
    }

    public void setId(String id) throws IdentificadorInvalidoException {
        if (Character.isUpperCase(id.charAt(0)))
        Id = id;
        else throw new IdentificadorInvalidoException ("Identificador não começa com Letra Maiuscula");
    }

    public List<Filme> getList() {
        return list;
    }

    public String getId() {
        return Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaFIlmes that = (ListaFIlmes) o;
        return Objects.equals(list, that.list) && Objects.equals(Id, that.Id) && Objects.equals(idDefault, that.idDefault);
    }

    @Override
    public String
    toString() {
        final StringBuilder sb = new StringBuilder("ListaFIlmes{");
        sb.append(list);
        sb.append(", Id='").append(Id).append('\'');
        return sb.toString();
    }

    public void addFilme(Filme f){
        if (list.contains(f))
            System.out.println("Filme já existente nesta Lista");
        else
        list.add(f);
    }
    public void removeFilme(Filme f){
        if (list.contains(f))
            list.remove(f);
        else System.out.println("Filme não existe nesta lista");
    }
}
