package ui;

import controller.ControllerAlojamento;
import controller.ControllerLocal;
import domain.Organizacao;
import org.apache.commons.configuration2.ex.ConfigurationException;
import utils.utilitarios;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class UiLocal implements UI {
    private Organizacao organizacao;
    private ControllerLocal controller;
    public UiLocal(Organizacao organizacao) throws ConfigurationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.organizacao=organizacao;
        this.controller=createInstancesOfController();
    }
    public void run(List<String> listStringController){
        System.out.println("Novo Local");
        introduzDados();
        if ((utilitarios.confirma("Confirma os Dados do Local [S|N]"))) {

            if (controller.guardarLocal())
                System.out.println("Local Guardado");}
        else
            System.out.println("Local não guardado");
        apresentaDados();
    }

    @Override
    public String getMenuDescription() {
        return "Criar Local\n";
    }

    public void introduzDados(){
        String cid=utilitarios.readLineFromConsole("Introduza a cidade");
        String pais=utilitarios.readLineFromConsole("Introduza o Pais");
        controller.CriarLocal(cid,pais);
    }
    public void apresentaDados(){
        System.out.printf("Local: \n%s",controller.getLocal());
    }
    // Codigo para gerar o controller
    public ControllerLocal createInstancesOfController() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ConfigurationException {
        String lController = utilitarios.readConfigString("ui.controllerInterface.iControllerLocal");
        ControllerLocal controller=(ControllerLocal) Class.forName(lController).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
        return controller;
    }
}
