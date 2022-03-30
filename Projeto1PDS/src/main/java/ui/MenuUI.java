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

        }while (!Opcao.equalsIgnoreCase("0"));
    }
}
