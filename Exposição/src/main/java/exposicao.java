import java.util.ArrayList;
import java.util.Collections;

import java.util.Objects;

public class exposicao implements Comparable<exposicao>{
    private  String designacao;
    private int ano;
    private ArrayList<Quadro> list;
    private static final  String designacao_default="Indefinido";
    private static final int ano_default =0000;
    exposicao(String designacao,int ano , ArrayList<Quadro>list){
        this.ano=ano;
        this.designacao=designacao;
        this.list=list;
    }
    exposicao(){
        this.ano=ano_default;
        this.designacao=designacao_default;
        this.list=new ArrayList<Quadro>();
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setList(ArrayList<Quadro> list) {
        this.list = list;
    }

    public String getDesignacao() {
        return designacao;
    }

    public int getAno() {
        return ano;
    }

    public ArrayList<Quadro> getList() {
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        exposicao exposicao = (exposicao) o;
        return ano == exposicao.ano && Objects.equals(designacao, exposicao.designacao) && Objects.equals(list, exposicao.list);
    }
    public boolean NovoQuadro(Quadro o){
        this.list.add(o);
        if(list.contains(o))
            return true;
        else
            return false;
    }
    public boolean  RemoverQuadro(Quadro o){
        this.list.remove(o);
        if(list.contains(o))
            return false;
        else
            return true;
    }

    @Override
    public String toString() {
        Collections.sort(list);
        return String.format("\n Exposição : %s || Ano : %d ||\n %s ",designacao,ano,list);
    }

    @Override
    public int compareTo(exposicao o) {
        if (this.getAno()>o.getAno())
                return 1;
            else if (this.getAno()<o.getAno())
                return -1;
            else return 0;
        }

    }


