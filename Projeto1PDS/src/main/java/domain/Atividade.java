package domain;

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

    public Data getData() {
        return data;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\nLocal de Chegada: %s\nLocal de Partida: %s\nDia da Semana : %s\nPreço :%.2f EUR\nHora de Inicio:%s \nHora de Terminio :%s",denominação,tipoAtividade,localc,localp,data.sDiaSemana(),preco,tempoInicio,tempoFim);
    }
}
