package domain;


import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;

public class Alojamento {
    private String denominação;
    private TipoAlojamento tipoAlojamento;
    private Local local;
    private int qntdMax,qntdMin;
    private Date data;
    private double preco;

    Alojamento(String denominação,TipoAlojamento tipoAlojamento,Local local,int qntdMax,int qntdMin,Date data, double preco){
        this.denominação=denominação;
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

    public int getQntdMax() {
        return qntdMax;
    }

    public int getQntdMin() {
        return qntdMin;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
       return String.format("Designação:%s\n%s\n%s\nDia da Semana:%s\nQuantidade Minima Pessoas %d\nQuantidade Máxima Pessoas %d\nPreço:%.2f EUR",denominação, tipoAlojamento,local,data.sDiaSemana(),qntdMin,qntdMax,preco);
    }
}
