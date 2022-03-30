package ui;

import controller.ControllerListarAlojamento;
import domain.Organizacao;
import utils.utilitarios;

public class UIListarAlojamento { private Organizacao organizacao;
    private ControllerListarAlojamento controller;
    public UIListarAlojamento(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerListarAlojamento(organizacao);
    }
    public void run() {
        System.out.println("Lista de Alojamento");
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
    public void introduzDados(){
        String desc=utilitarios.readLineFromConsole("Introduza os dados");
        controller.CriarTipoAlojamento(desc);
    }
    public void apresentaDados(){
        System.out.printf("Tipo de Alojamento \n%s",controller.getTipoAlojamento());
    }

}
