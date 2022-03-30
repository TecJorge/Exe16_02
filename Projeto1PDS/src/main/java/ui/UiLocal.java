package ui;

import controller.ControllerLocal;
import controller.ControllerTipoAlojamento;
import domain.Organizacao;
import utils.utilitarios;

public class UiLocal {
    private Organizacao organizacao;
    private ControllerLocal controller;
    public UiLocal(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerLocal(organizacao);
    }
    public void run(){
        System.out.println("Novo Local");
        introduzDados();
        if ((utilitarios.confirma("Confirma os Dados do Local [S|N]"))) {

            if (controller.guardarLocal())
                System.out.println("Local Guardado");}
        else
            System.out.println("Local não guardado");
        apresentaDados();
    }
    public void introduzDados(){
        String cid=utilitarios.readLineFromConsole("Introduza a cidade");
        String pais=utilitarios.readLineFromConsole("Introduza o Pais");
        controller.CriarLocal(cid,pais);
    }
    public void apresentaDados(){
        System.out.printf("Local: \n%s",controller.getLocal());
    }
}
