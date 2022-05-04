package ui;

import controller.ControllerAlojamento;
import controller.ControllerAtividade;
import domain.Organizacao;
import org.apache.commons.configuration2.ex.ConfigurationException;
import ui.controllerInterface.iControllerAtividade;
import utils.utilitarios;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class UIAtividade implements  UI {
    private Organizacao organizacao;
    private iControllerAtividade controller;
    public UIAtividade(Organizacao organizacao) throws ConfigurationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.organizacao=organizacao;
        this.controller=createInstancesOfController();
    }
    public void run(List<String> listStringController) {
        System.out.println("Novo tipo de Atividade");
        introduzDados();
        if ((utilitarios.confirma("Confirma os Dados do tipo de Atividade [S|N]"))) {

            if (controller.guardarTipoAtividade())
                System.out.println("Tipo de Atividade Guardado");
            else {
                System.out.println("Tipo de Atividade não guardado");
            }
            apresentaDados();
        }
    }

    @Override
    public String getMenuDescription() {
        return "Criar Tipo de Atividade\n";
    }

    public void introduzDados(){
        String desc=utilitarios.readLineFromConsole("Introduza os dados");
        controller.CriarTipoAtividade(desc);
    }
    public void apresentaDados(){
        System.out.printf("Tipo de Atividade \n%s",controller.getTipoAtividade());
    }
    // Codigo para gerar o controller
    public iControllerAtividade createInstancesOfController() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ConfigurationException {
        try {
            String lController = utilitarios.readConfigString("controller.ControllerAtividade");
            iControllerAtividade controller = (iControllerAtividade) Class.forName(lController).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
            return controller;
        } catch (Exception e) {
            System.out.println("Algo de mal não está certo");
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getCause());
        }finally {
            return controller;
        }
    }
}
