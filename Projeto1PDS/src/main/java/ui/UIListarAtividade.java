package ui;

import controller.ControllerAlojamento;
import controller.ControllerListarAtividade;
import domain.Organizacao;
import org.apache.commons.configuration2.ex.ConfigurationException;
import ui.controllerInterface.iControllerListarAtividade;
import utils.utilitarios;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class UIListarAtividade implements UI{
    private Organizacao organizacao;
    private iControllerListarAtividade controller;
    public UIListarAtividade(Organizacao organizacao) throws ConfigurationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.organizacao=organizacao;
        this.controller=createInstancesOfController();
    }
    public void run(List<String> listStringController) {
        utilitarios.apresentaLista(organizacao.getAtividadeList(),"Lista de Atividades");
    }

    @Override
    public String getMenuDescription() {
        return "Listar Atividade\n";
    }
    // Codigo para gerar o controller
    public iControllerListarAtividade createInstancesOfController() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ConfigurationException {
        String lController = utilitarios.readConfigString("controller.ControllerListarAtividade");
        iControllerListarAtividade controller=(iControllerListarAtividade) Class.forName(lController).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
        return controller;
    }
}

