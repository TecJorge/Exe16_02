package ui;

import domain.Organizacao;
import utils.utilitarios;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class MenuUI {
    private Organizacao organizacao;
    public MenuUI(Organizacao organizacao){this.organizacao=organizacao;}
    public void run( List<String> listStringClassUI,List<String> listStringController ) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ArrayList<UI> arrayClassesUI = carregaClassesUI( listStringClassUI );
        int opcao = 0;
        try {


        do
        {
            opcao = readOpcaoMenu(arrayClassesUI);

            if( opcao != 0) {
                UI uiOpcao = arrayClassesUI.get( opcao - 1 );

                uiOpcao. run(listStringController);
            }
        }
        while (opcao != 0 );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }}
    private int readOpcaoMenu( ArrayList<UI> arrayClassesUI ) {

        System.out.println("\n\n");

        int i = 1;
        for (UI ui : arrayClassesUI ) {

            System.out.println(i + ". " + ui.getMenuDescription() );
            i++;
        }

        System.out.println("0. Sair");


        String opcaoStr = utilitarios.readLineFromConsole("Introduza opção: ");

        return Integer.parseInt(opcaoStr);
    }

    private ArrayList<UI> carregaClassesUI( List<String> listStringClassUI ) {

        ArrayList<UI> lClassesUI = new ArrayList<UI>();

        for (String strClassUI : listStringClassUI) {
            try {
                UI ui = (UI) Class.forName(strClassUI).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
                lClassesUI.add(ui);
            }
            catch(Exception e) {
                System.out.println( e.getMessage() );
            }
        }

        return lClassesUI;
    }
}
// Meu antigo run
//    public void run() throws Exception {
//        do {
//            System.out.println("\n\n");
//            System.out.println("1- Especificar Tipo de Alojamento");
//            System.out.println("2- Especificar Local");
//            System.out.println("3- Especificar Tipo de Atividade");
//            System.out.println("4- Listar Tipo de Alojamento");
//            System.out.println("5- Listar Locais");
//            System.out.println("6- Listar Tipo de Atividade");
//            System.out.println("7- Criar Alojamento");
//            System.out.println("8- Criar Atividade");
//            System.out.println("9- Criar Pacote");
//
//            System.out.println("0- Sair");
//            Opcao= utilitarios.readLineFromConsole("Introduza a opção\n");
//            if (Opcao.equalsIgnoreCase("1")){
//                UICriarTipoAlojamento ui=new UICriarTipoAlojamento(organizacao);
//                ui.run();
//            }
//            if (Opcao.equalsIgnoreCase("2")){
//                UiLocal ui=new UiLocal(organizacao);
//                ui.run();
//            }
//            if (Opcao.equalsIgnoreCase("3")){
//                UIAtividade ui=new UIAtividade(organizacao);
//                ui.run();
//            }
//            if (Opcao.equalsIgnoreCase("4")){
//                UIListarAlojamento ui=new UIListarAlojamento(organizacao);
//                ui.run();
//            }
//            if (Opcao.equalsIgnoreCase("5")){
//                UIListarAtividade ui=new UIListarAtividade(organizacao);
//                ui.run();
//            }
//            if (Opcao.equalsIgnoreCase("6")){
//                UIListarLocal ui=new UIListarLocal(organizacao);
//                ui.run();
//            }
//            if (Opcao.equalsIgnoreCase("7")){
//                UIAlojamento ui=new UIAlojamento(organizacao);
//                ui.run();
//            }
//            if (Opcao.equalsIgnoreCase("8")){
//                UIOAtividade ui=new UIOAtividade(organizacao);
//                ui.run();
//            }
//            if (Opcao.equalsIgnoreCase("9")){
//                UIPacote ui=new UIPacote(organizacao);
//                ui.run();
//            }
//
//        }while (!Opcao.equalsIgnoreCase("0"));
//    }
