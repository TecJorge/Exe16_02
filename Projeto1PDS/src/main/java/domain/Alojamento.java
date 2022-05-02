package domain;


import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;

public class Alojamento {
    private String denominacao;
    private TipoAlojamento tipoAlojamento;
    private Local local;
    private int qntdMax,qntdMin;
    private Data data;
    private double preco;

    public Alojamento(String denominacao,TipoAlojamento tipoAlojamento,Local local,int qntdMax,int qntdMin,Data data, double preco){
        this.denominacao=denominacao;
        this.tipoAlojamento=tipoAlojamento;
        this.local=local;
        this.qntdMax=qntdMax;
        this.qntdMin=qntdMin;
        this.preco=preco;
        this.data=data;

    }

    public double getPreco() {
        return preco;
    }

    public String getDenomincao() {
        return denominacao;
    }

    public Local getLocal() {
        return local;
    }

    public TipoAlojamento getTipoAlojamento() {
        return tipoAlojamento;
    }

    public int getQntdMax() {
        return qntdMax;
    }

    public int getQntdMin() {
        return qntdMin;
    }

    public Data getData() {
        return data;
    }

    @Override
    public String toString() {
       return String.format("Designação:%s\n%s\n%s\nDia da Semana:%s\nQuantidade Minima Pessoas %d\nQuantidade Máxima Pessoas %d\nPreço:%.2f EUR",denominacao, tipoAlojamento,local,data.sDiaSemana(),qntdMin,qntdMax,preco);
    }
}
