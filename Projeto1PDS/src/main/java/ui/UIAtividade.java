package ui;

import controller.ControllerAtividade;
import controller.ControllerTipoAlojamento;
import domain.Organizacao;
import utils.utilitarios;

public class UIAtividade {
    private Organizacao organizacao;
    private ControllerAtividade controller;
    public UIAtividade(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerAtividade(organizacao);
    }
    public void run() {
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
    public void introduzDados(){
        String desc=utilitarios.readLineFromConsole("Introduza os dados");
        controller.CriarTipoAtividade(desc);
    }
    public void apresentaDados(){
        System.out.printf("Tipo de Atividade \n%s",controller.getTipoAtividade());
    }

}
