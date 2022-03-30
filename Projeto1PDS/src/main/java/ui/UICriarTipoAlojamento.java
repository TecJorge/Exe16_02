package ui;

import controller.ControllerTipoAlojamento;
import domain.Organizacao;
import utils.utilitarios;

public class UICriarTipoAlojamento {
    private Organizacao organizacao;
    private ControllerTipoAlojamento controller;
    public UICriarTipoAlojamento(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerTipoAlojamento(organizacao);
    }
    public void run() {
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
    public void introduzDados(){
        String desc=utilitarios.readLineFromConsole("Introduza os dados");
        controller.CriarTipoAlojamento(desc);
    }
    public void apresentaDados(){
        System.out.printf("Tipo de Alojamento \n%s",controller.getTipoAlojamento());
    }

}
