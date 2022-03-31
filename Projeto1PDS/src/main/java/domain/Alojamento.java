package domain;



public class Alojamento {
    private String denominação;
    private TipoAlojamento tipoAlojamento;
    private Local local;
    private int qntdMax,qntdMin;
    private Data data;
    private double preco;

    Alojamento(String denominação,TipoAlojamento tipoAlojamento,Local local,int qntdMax,int qntdMin,Data data, double preco){
        this.denominação=denominação;
        this.tipoAlojamento=tipoAlojamento;
        this.local=local;
        this.qntdMax=qntdMax;
        this.qntdMin=qntdMin;
        this.preco=preco;
        this.data=data;
    }

    @Override
    public String toString() {
       return String.format("Designação:%s\n%s\n%s\nDia da Semana:%s\nQuantidade Minima Pessoas %d\nQuantidade Máxima Pessoas %d\nPreço:%.2f EUR",denominação, tipoAlojamento,local,data.DiaSemana(),qntdMin,qntdMax,preco);
    }
}
