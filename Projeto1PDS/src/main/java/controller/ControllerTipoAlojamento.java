package controller;


import domain.Organizacao;
import domain.TipoAlojamento;

public class ControllerTipoAlojamento implements ui.controllerInterface.iControllerTipoAlojamento {
    private TipoAlojamento tipoAlojamento;
    private Organizacao organizacao;

    public ControllerTipoAlojamento(Organizacao organizacao) {
        this.organizacao = organizacao;
    }

    public void CriarTipoAlojamento(String desc) {
        tipoAlojamento = organizacao.novoAlojamento(desc);
        organizacao.validaAlujamento(tipoAlojamento);
    }

    public boolean guardarTipoAlojamento() {
        return this.organizacao.guardaTipoAlojamento(tipoAlojamento);
    }

    public String getTipoAlojamento() {
        return String.format(tipoAlojamento.toString());
    }
}
