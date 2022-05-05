package domain.DTO;

import domain.Alojamento;
import domain.Data;
import domain.Local;
import domain.TipoAlojamento;

public class Dto_Alojamento {
    private String Denominacao;
    private String sTipoAlojamento;
    private String sLocal;
    private int qntdMax,qntdMin;
    private String sData;
    private double preco;
public Dto_Alojamento(Alojamento alojamento){
    this.Denominacao=alojamento.getDenomincao();
    this.sTipoAlojamento=alojamento.getTipoAlojamento().getDescricao();
    this.sLocal=alojamento.getLocal().toString();
    this.qntdMin=alojamento.getQntdMin();
    this.qntdMax=alojamento.getQntdMax();
    this.sData=alojamento.getData().sDiaSemana();
    this.preco=alojamento.getPreco();
}

    public double getPreco() {
        return preco;
    }

    public int getQntdMin() {
        return qntdMin;
    }

    public int getQntdMax() {
        return qntdMax;
    }

    public String getDenominacao() {
        return Denominacao;
    }

    public String getsData() {
        return sData;
    }

    public String getsLocal() {
        return sLocal;
    }

    public String getsTipoAlojamento() {
        return sTipoAlojamento;
    }
}
