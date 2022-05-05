package domain;

import domain.DTO.Dto_Atividade;

public class Atividade {
    private String denominação;
    private TipoAtividade tipoAtividade;
    private Local localc,localp;
    private Data data;
    private double preco;
    private Tempo tempoInicio,tempoFim;
    public Atividade(String denominação, TipoAtividade tipoAtividade, Local localc, Local localp, Data data, double preco, Tempo tempoInicio, Tempo tempoFim) {
        this.denominação=denominação;
        this.tipoAtividade=tipoAtividade;
        this.localc=localc;
        this.localp=localp;
        this.data=data;
        this.preco=preco;
        this.tempoInicio=tempoInicio;
        this.tempoFim=tempoFim;
    }
    public Atividade(Dto_Atividade dto_atividade){
        this.denominação=dto_atividade.getDenominacao();
        this.tipoAtividade=new TipoAtividade(dto_atividade.getsTipoAtividade());
        this.localc=new Local(dto_atividade.getsLocalc());
        this.localp=new Local(dto_atividade.getsLocalp());
        //Questionavel
        this.data=CreateDataFromString(dto_atividade.getsData());
        this.tempoInicio=new Tempo(dto_atividade.getTempoInicio());
        this.tempoFim=new Tempo(dto_atividade.getTempoFim());
        this.preco=dto_atividade.getPreco();
    }

    public Data getData() {
        return data;
    }

    public double getPreco() {
        return preco;
    }

    public String getDenominação() {
        return denominação;
    }

    public Local getLocalc() {
        return localc;
    }

    public Local getLocalp() {
        return localp;
    }

    public Tempo getTempoFim() {
        return tempoFim;
    }

    public Tempo getTempoInicio() {
        return tempoInicio;
    }

    public TipoAtividade getTipoAtividade() {
        return tipoAtividade;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\nLocal de Chegada: %s\nLocal de Partida: %s\nDia da Semana : %s\nPreço :%.2f EUR\nHora de Inicio:%s \nHora de Terminio :%s",denominação,tipoAtividade,localc,localp,data.sDiaSemana(),preco,tempoInicio,tempoFim);
    }
    private Data CreateDataFromString(String data){
        Data retorno=new Data();
        retorno.setDiaSemanaFromString(data);
        return retorno;
    }
}
