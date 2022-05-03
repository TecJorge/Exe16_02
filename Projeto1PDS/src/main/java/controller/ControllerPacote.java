package controller;

import domain.Alojamento;
import domain.Atividade;
import domain.Organizacao;
import domain.Pacote;

import java.util.ArrayList;
import java.util.List;


public class ControllerPacote implements ui.controllerInterface.iControllerPacote{
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
 public boolean removerAlojamentoPacote(Alojamento obj1){
        return pacote.removerAlojamento(obj1);
 }
    public boolean removerAtividadePacote(Atividade obj1){
        return pacote.removerAtividade(obj1);
    }
    public String getPacoteString() {
        return String.format(pacote.toString());
    }

    public Pacote getPacote() {
        return pacote;
    }
    public ArrayList<Alojamento> getAlojamento(){
        return (ArrayList<Alojamento>) organizacao.getOalojamentoList();
    }
    public ArrayList<Atividade> getAtividade(){
        return (ArrayList<Atividade>) organizacao.getAtividades();
    }
}

