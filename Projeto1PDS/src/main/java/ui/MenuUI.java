package ui;

import domain.Organizacao;
import utils.utilitarios;

import java.io.IOException;

public class MenuUI {
    private Organizacao organizacao;
    private String Opcao;
    public MenuUI(Organizacao organizacao){this.organizacao=organizacao;}
    public void run()throws IOException {
        do {
            System.out.println("\n\n");
            System.out.println("1- Especificar Tipo de Alojamento");
            System.out.println("2- Especificar Local");
            System.out.println("3- Especificar Tipo de Atividade");
            System.out.println("4- Listar Tipo de Alojamento");
            System.out.println("5- Listar Locais");
            System.out.println("6- Listar Tipo de Atividade");
            System.out.println("7- Criar Alojamento");
            System.out.println("8- Criar Atividade");
            System.out.println("9- Criar Pacote");

            System.out.println("0- Sair");
            Opcao= utilitarios.readLineFromConsole("Introduza a opção\n");
            if (Opcao.equalsIgnoreCase("1")){
                UICriarTipoAlojamento ui=new UICriarTipoAlojamento(organizacao);
                ui.run();
            }
            if (Opcao.equalsIgnoreCase("2")){
                UiLocal ui=new UiLocal(organizacao);
                ui.run();
            }
            if (Opcao.equalsIgnoreCase("3")){
                UIAtividade ui=new UIAtividade(organizacao);
                ui.run();
            }
            if (Opcao.equalsIgnoreCase("4")){
                UIListarAlojamento ui=new UIListarAlojamento(organizacao);
                ui.run();
            }
            if (Opcao.equalsIgnoreCase("5")){
                UIListarAtividade ui=new UIListarAtividade(organizacao);
                ui.run();
            }
            if (Opcao.equalsIgnoreCase("6")){
                UIListarLocal ui=new UIListarLocal(organizacao);
                ui.run();
            }
            if (Opcao.equalsIgnoreCase("7")){
                UIAlojamento ui=new UIAlojamento(organizacao);
                ui.run();
            }
            if (Opcao.equalsIgnoreCase("8")){
                UIOAtividade ui=new UIOAtividade(organizacao);
                ui.run();
            }
            if (Opcao.equalsIgnoreCase("9")){
                UIPacote ui=new UIPacote(organizacao);
                ui.run();
            }

        }while (!Opcao.equalsIgnoreCase("0"));
    }
}
