package controller;

import domain.Local;
import domain.Organizacao;

public class ControllerLocal implements  ui.controllerInterface.iContollerLocal {
    private Local local;
    private Organizacao organizacao;

    public ControllerLocal(Organizacao organizacao) {
        this.organizacao = organizacao;
    }

    public void CriarLocal(String cid,String pais) {
        local = organizacao.novoLocal(cid,pais);
        organizacao.validaLocal(local);
    }

    public boolean guardarLocal() {
        return this.organizacao.guardaLocal(local);
    }

    public String getLocal() {
        return String.format(local.toString());
    }
}
