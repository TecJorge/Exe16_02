package ui;

import controller.ControllerAlojamento;
import controller.ControllerPacote;
import domain.Alojamento;
import domain.Atividade;
import domain.Data;
import domain.Organizacao;
import org.apache.commons.configuration2.ex.ConfigurationException;
import ui.controllerInterface.iControllerPacote;
import utils.utilitarios;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class UIPacote implements  UI{
    private Organizacao organizacao;
    private iControllerPacote controller;

    public UIPacote(Organizacao organizacao) throws ConfigurationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.organizacao = organizacao;
        this.controller = createInstancesOfController();
    }

    public void run(List<String> listStringController) {
        System.out.println("Novo Pacote");
        introduzDados();
        if ((utilitarios.confirma("Confirma os Dados do tipo de Atividade [S|N]")))
            System.out.println("Pacote Guardado");
        else {
            System.out.println("Pacote não guardado");
        }
        apresentaDados();
    }

    @Override
    public String getMenuDescription() {
        return "Criar Pacote\n";
    }

    public void introduzDados() {
        boolean flag = false;
        String desc = utilitarios.readLineFromConsole("Introduza a descrição do Pacote");
        controller.CriarPacote(desc);
        do {

            ArrayList<Alojamento> arrayListAlojamento = new ArrayList<>();
            ArrayList<Atividade> arrayListAtividade = new ArrayList<>();
            String option = utilitarios.readLineFromConsole("Introduza a Opção desejada \n 1- Adicionar Alojamento  \n2-Adicionar Atividade \n3- Remover Alojamentos \n4- Remover Atividade \n-Finalizar o Pactoe");
            if (option.equalsIgnoreCase("1")) {
                int nPessoas = Integer.valueOf(utilitarios.readLineFromConsole("Introduza o numero de pessoas que vão estar presentes"));
                Data data = this.CriarData();
                arrayListAlojamento = this.IterarLista(controller.getAlojamento(), data, nPessoas);
                if (!arrayListAlojamento.isEmpty()) {
                    controller.guardarAlojamentoPacote((Alojamento) utilitarios.apresentaESeleciona(arrayListAlojamento, "Alojamentos Disponiveis"));
                } else {
                    System.out.println("Não existem alojamentos para os critérios inseridos");
                }
            } else if (option.equalsIgnoreCase("2")) {
                Data data = this.CriarData();
                arrayListAtividade = this.IterarListaAtividade(controller.getAtividade(), data);
                if (!arrayListAtividade.isEmpty()) {
                    controller.guardarAtividadePacote((Atividade) utilitarios.apresentaESeleciona(arrayListAtividade, "Atividades Disponiveis"));
                } else System.out.println("Não existem atividades para os critérios inseridos");
            } else if (option.equalsIgnoreCase("3"))
                controller.removerAlojamentoPacote((Alojamento) utilitarios.apresentaESeleciona(controller.getPacote().getListaAlojamento(), "Alojamentos Armazenados até ao momento"));
            else if (option.equalsIgnoreCase("4"))
                controller.removerAtividadePacote((Atividade) utilitarios.apresentaESeleciona(controller.getPacote().getListaAtividades(), "Atividades Armazenados até ao momento"));
            else
                flag = true;
        } while (!flag);
        System.out.println("Fim da criação do Pacote");
    }

    public void apresentaDados() {
        System.out.printf("Pacote \n%s", controller.getPacote());
    }

    public Data CriarData() {
        String dia = utilitarios.readLineFromConsole("Introduza o Dia que pretende");
        String mes = utilitarios.readLineFromConsole("Introduza o Mês que pretende em formato numérico");
        String ano = utilitarios.readLineFromConsole("Introduza o Ano");
        return new Data(Integer.valueOf(dia), Integer.valueOf(mes), Integer.valueOf(ano));
    }

    public ArrayList<Alojamento> IterarLista(List<Alojamento> arr, Data data, int nPessoas) {
        ArrayList<Alojamento> list = new ArrayList<>();
        String diaS1, diaS2;
        for (Alojamento x : arr) {
            diaS1 = String.valueOf(x.getData().getDiaSemana());
            diaS2 = String.valueOf(data.getsDiaSemana());
            if (diaS1.equalsIgnoreCase(diaS2) && x.getQntdMin() <= nPessoas && x.getQntdMax() >= nPessoas)
                list.add(x);
        }
        return list;
    }

    public ArrayList<Atividade> IterarListaAtividade(List<Atividade> arr, Data data) {
        String diaS1, diaS2;
        ArrayList<Atividade> list = new ArrayList<>();
        for (Atividade x : arr) {
            diaS1 = String.valueOf(x.getData().getsDiaSemana());
            diaS2 = String.valueOf(data.getsDiaSemana());
            if (diaS1.equalsIgnoreCase(diaS2))
                list.add(x);
        }
        return list;
    }
    // Codigo para gerar o controller
    public iControllerPacote createInstancesOfController() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ConfigurationException {
        String lController = utilitarios.readConfigString("controller.ControllerPacote");
        iControllerPacote controller=(iControllerPacote) Class.forName(lController).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
        return controller;
    }
}
