package ui.controllerInterface;

import domain.Alojamento;
import domain.Atividade;
import domain.Pacote;

import java.util.ArrayList;

public interface iControllerPacote {
    public void CriarPacote(String desc);
    public boolean guardarAtividadePacote(Atividade obj1);
    public boolean removerAlojamentoPacote(Alojamento obj1);
    public boolean guardarAlojamentoPacote(Alojamento obj1);
    public String getPacoteString();
    public Pacote getPacote();
    public ArrayList<Alojamento> getAlojamento();
    public ArrayList<Atividade> getAtividade();

    boolean removerAtividadePacote(Atividade atividades_armazenados_até_ao_momento);
}
