import java.util.Objects;

public class Realizador {
    private String nome,nacionalidade;
    private Data data;
    private final String nomeDefault="Indefinido";
    private final String nacionalidadeDefault="Indefinido";
    private final Data dataDefault=new Data(2000,01,01);
    Realizador(String nome , String nacionalidade , int ano,int mes,int dia){
        this.nome=nome;
        this.nacionalidade=nacionalidade;
        this.data=new Data(ano, mes, dia);
    }
    Realizador(){
        this.nome=nomeDefault;
        this.nacionalidade=nacionalidadeDefault;
        this.data=new Data(dataDefault);
    }

    public String getNome() {
        return nome;
    }

    public Data getData() {
        return data;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return String.format("\nO %s é %s e nasceu a %s\n",nome,nacionalidade,data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Realizador that = (Realizador) o;
        return Objects.equals(nome, that.nome) && Objects.equals(nacionalidade, that.nacionalidade) && Objects.equals(data, that.data) && Objects.equals(nomeDefault, that.nomeDefault) && Objects.equals(nacionalidadeDefault, that.nacionalidadeDefault) && Objects.equals(dataDefault, that.dataDefault);
    }

}
