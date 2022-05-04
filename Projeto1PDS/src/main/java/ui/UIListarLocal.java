package ui;

import controller.ControllerAlojamento;
import controller.ControllerListarLocal;
import domain.Organizacao;
import org.apache.commons.configuration2.ex.ConfigurationException;
import ui.controllerInterface.iControllerListarLocal;
import utils.utilitarios;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class UIListarLocal implements UI {
    private Organizacao organizacao;
    private iControllerListarLocal controller;
    public UIListarLocal(Organizacao organizacao) throws ConfigurationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.organizacao=organizacao;
        this.controller=createInstancesOfController();
    }
    public void run(List<String> listStringController) {
        utilitarios.apresentaLista(organizacao.getLocalList(),"Lista de Locais");
    }

    @Override
    public String getMenuDescription() {
        return "Listar Local\n";
    }
    // Codigo para gerar o controller
    public iControllerListarLocal createInstancesOfController() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ConfigurationException {
        String lController = utilitarios.readConfigString("controller.ControllerListarLocal");
        iControllerListarLocal controller=(iControllerListarLocal) Class.forName(lController).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
        return controller;
    }
}
