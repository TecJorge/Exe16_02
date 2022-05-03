package controller;

import domain.*;

public class ControllerOAtividade implements  ui.controllerInterface.iControllerOAtividade{
    private Atividade atividade;
    private Organizacao organizacao;

    public ControllerOAtividade(Organizacao organizacao) {
        this.organizacao = organizacao;
    }

    public void CriarAtividade(String denominação, TipoAtividade tipoAtividade, Local localc, Local localp , Data data, double preco,Tempo tempoinicio,Tempo tempofim) {
        atividade = organizacao.novoOAtividade(denominação,tipoAtividade,localc,localp,data,preco,tempoinicio,tempofim);
        organizacao.validaOAtividade(atividade);
    }

    public boolean guardarAtividade() {
        return this.organizacao.validaOAtividade(atividade);
    }

    public String getAtividade() {
        return String.format(atividade.toString());
    }
}
