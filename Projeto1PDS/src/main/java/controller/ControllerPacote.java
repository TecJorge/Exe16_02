package controller;

import domain.Alojamento;
import domain.Atividade;
import domain.Organizacao;
import domain.Pacote;

import java.util.List;


public class ControllerPacote {
    private Pacote pacote;
    private Organizacao organizacao;

    public ControllerPacote(Organizacao organizacao) {
        this.organizacao = organizacao;
    }

    public void CriarPacote(String desc) {
        pacote = organizacao.novoPacote(desc);
        organizacao.validaPacote(pacote);
    }

    public boolean guardarAtividadePacote(Atividade obj1) {
        return pacote.addAtividade(obj1);
    }
    public boolean guardarAlojamentoPacote(Alojamento obj1) {
        return pacote.addAlojamento(obj1);
    }

    public String getPacote() {
        return String.format(pacote.toString());
    }
}

