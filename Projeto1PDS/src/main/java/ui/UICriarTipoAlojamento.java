package ui;

import controller.ControllerAlojamento;
import controller.ControllerTipoAlojamento;
import domain.Organizacao;
import org.apache.commons.configuration2.ex.ConfigurationException;
import ui.controllerInterface.iControllerTipoAlojamento;
import utils.utilitarios;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class UICriarTipoAlojamento implements  UI {
    private Organizacao organizacao;
    private iControllerTipoAlojamento controller;
    public UICriarTipoAlojamento(Organizacao organizacao) throws ConfigurationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.organizacao=organizacao;
        this.controller=createInstancesOfController();
    }
    public void run(List<String> listStringController) {
        System.out.println("Novo tipo de Alojamento");
        introduzDados();
        if ((utilitarios.confirma("Confirma os Dados do tipo de Alojamento [S|N]"))) {

            if (controller.guardarTipoAlojamento())
                System.out.println("Tipo de Alojamento Guardado");
            else {
                System.out.println("Tipo de Alujamento não guardado");
            }
            apresentaDados();
        }
    }

    @Override
    public String getMenuDescription() {
        return "Criar Tipo de Alojamento\n";
    }

    public void introduzDados(){
        String desc=utilitarios.readLineFromConsole("Introduza os dados");
        controller.CriarTipoAlojamento(desc);
    }
    public void apresentaDados(){
        System.out.printf("Tipo de Alojamento \n%s",controller.getTipoAlojamento());
    }
    // Codigo para gerar o controller
    public iControllerTipoAlojamento createInstancesOfController() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ConfigurationException {
        String lController = utilitarios.readConfigString("controller.ControllerTipoAlojamento");
        iControllerTipoAlojamento controller=(iControllerTipoAlojamento) Class.forName(lController).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
        return controller;
    }
}
