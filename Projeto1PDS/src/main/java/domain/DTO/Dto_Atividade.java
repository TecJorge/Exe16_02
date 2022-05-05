package domain.DTO;

import domain.*;

public class Dto_Atividade {
    private String Denominacao;
    private String  sTipoAtividade;
    private String sLocalc,sLocalp;
    private String sData;
    private double preco;
    private String tempoInicio,tempoFim;
    public Dto_Atividade(Atividade atividade){
        this.Denominacao=atividade.getDenominação();
        this.sTipoAtividade=atividade.getTipoAtividade().getDescricao();
        this.sLocalc=atividade.getLocalc().toString();
        this.sLocalp=atividade.getLocalp().toString();
        this.sData=atividade.getData().sDiaSemana();
        this.preco=atividade.getPreco();
        this.tempoInicio=atividade.getTempoInicio().toStringHHMMSS();
        this.tempoFim=atividade.getTempoFim().toStringHHMMSS();
    }

    public String getsData() {
        return sData;
    }

    public String getDenominacao() {
        return Denominacao;
    }

    public double getPreco() {
        return preco;
    }

    public String getsLocalc() {
        return sLocalc;
    }

    public String getsLocalp() {
        return sLocalp;
    }

    public String getsTipoAtividade() {
        return sTipoAtividade;
    }

    public String getTempoFim() {
        return tempoFim;
    }

    public String getTempoInicio() {
        return tempoInicio;
    }
}
