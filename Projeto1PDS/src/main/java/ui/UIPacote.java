package ui;

import controller.ControllerAtividade;
import controller.ControllerPacote;
import domain.Organizacao;
import utils.utilitarios;

public class UIPacote {
    private Organizacao organizacao;
    private ControllerPacote controller;
    public UIPacote(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerPacote(organizacao);
    }
    public void run() {
        System.out.println("Novo tipo de Atividade");
        introduzDados();
        if ((utilitarios.confirma("Confirma os Dados do tipo de Atividade [S|N]"))) {

            if (controller.guardarAtividadePacote())
                System.out.println("Serviço Guardado");
            else {
                System.out.println("Serviço não guardado");
            }
            apresentaDados();
        }
    }
    public void introduzDados(){
        do{
        String option=utilitarios.readLineFromConsole("Introduza o tipo de  Serviço que pretende adicionar ao pacote \n 1-Atividade  \n2-Alojamente \n3- Finalizar Pacote");
        if(option.equalsIgnoreCase("1"))
            System.out.println(organizacao.getOalojamentoList());
        else if (option.equalsIgnoreCase("2"));
        else
            System.out.println("Fim da criação do Pacote");
        String desc=utilitarios.readLineFromConsole("Introduza o numero referente ao Serviço que prentede adicionar");

        controller.CriarTipoAtividade(desc);
    }while (true);}
    public void apresentaDados(){
        System.out.printf("Tipo de Atividade \n%s",controller.getTipoAtividade());
    }
}
