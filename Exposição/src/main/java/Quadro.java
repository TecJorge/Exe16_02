import java.util.Objects;

public class Quadro implements Comparable<Quadro>{
    private int ano;
    private String designacao,nomeAutor;
    private final int ano_Default=0000;
    private final String designacao_Default="Indefinido";
    private final String nome_Default="Indefinido";

    Quadro(int ano , String nome,String designacao){
        this.ano=ano;
        this.nomeAutor=nome;
        this.designacao=designacao;
    }
    Quadro(){
        this.ano=ano_Default;
        this.nomeAutor=nome_Default;
        this.designacao=designacao_Default;
    }

    public int getAno() {
        return ano;
    }

    public String getDesignacao() {
        return designacao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    @Override
    public String toString() {
        return String.format("\n|| Designação do Quadro:%s || Autor : %s || Ano : %s || \n",designacao,nomeAutor,ano);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadro quadro = (Quadro) o;
        return ano == quadro.ano && ano_Default == quadro.ano_Default && Objects.equals(designacao, quadro.designacao) && Objects.equals(nomeAutor, quadro.nomeAutor) && Objects.equals(designacao_Default, quadro.designacao_Default) && Objects.equals(nome_Default, quadro.nome_Default);
    }

    @Override
    public int compareTo(Quadro o) {
        return this.getNomeAutor().compareToIgnoreCase(o.getNomeAutor());
    }
}
