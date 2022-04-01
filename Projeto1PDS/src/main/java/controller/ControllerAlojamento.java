package controller;

import domain.*;

public class ControllerAlojamento {
    private domain.Alojamento Alojamento;
    private Organizacao organizacao;

    public ControllerAlojamento(Organizacao organizacao) {
        this.organizacao = organizacao;
    }

    public void CriarAlojamento(String denominação, TipoAlojamento tipoAlojamento, Local local, int qntdMax, int qntdMin, Date data, double preco) {
        Alojamento = organizacao.novoOAlojamento(denominação,tipoAlojamento,local,qntdMax,qntdMin,data,preco);
        organizacao.validaoAlujamento(Alojamento);
    }

    public boolean guardarAlojamento() {
        return this.organizacao.guardaTipoOAlojamento(Alojamento);
    }

    public String getAlojamento() {
        return String.format(Alojamento.toString());
    }

}
