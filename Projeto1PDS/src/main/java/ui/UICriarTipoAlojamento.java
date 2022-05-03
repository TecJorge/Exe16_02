package ui;

import controller.ControllerAlojamento;
import controller.ControllerTipoAlojamento;
import domain.Organizacao;
import org.apache.commons.configuration2.ex.ConfigurationException;
import utils.utilitarios;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class UICriarTipoAlojamento implements  UI {
    private Organizacao organizacao;
    private ControllerTipoAlojamento controller;
    public UICriarTipoAlojamento(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerTipoAlojamento(organizacao);
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
    public ControllerTipoAlojamento createInstancesOfController() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ConfigurationException {
        String lController = utilitarios.readConfigString("ui.controllerInterface.iControllerTipoAlojamento");
        ControllerTipoAlojamento controller=(ControllerTipoAlojamento) Class.forName(lController).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
        return controller;
    }
}
