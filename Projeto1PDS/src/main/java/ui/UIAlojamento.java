package ui;

import controller.ControllerAlojamento;
import domain.*;
import domain.Data;
import org.apache.commons.configuration2.ex.ConfigurationException;
import ui.controllerInterface.iControllerAlojamento;
import utils.utilitarios;

import java.lang.reflect.InvocationTargetException;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.*;


public class UIAlojamento implements UI {
    private Organizacao organizacao;
     private ControllerAlojamento controller;
    public UIAlojamento(Organizacao organizacao) throws ConfigurationException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.organizacao=organizacao;
        controller=createInstancesOfController();
    }
    public void run(List<String> listaStringController) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("Novo Alojamento");
        introduzDados();
        if ((utilitarios.confirma("Confirma os Dados do Alojamento [S|N]"))) {

            if (controller.guardarAlojamento())
                System.out.println("Tipo de Alojamento Guardado");
            else {
                System.out.println("Tipo de Alujamento não guardado");
            }
            apresentaDados();
        }
    }

    @Override
    public String getMenuDescription() {
        return "Criar Alojamento\n";
    }

    public void introduzDados(){
        String denominação=utilitarios.readLineFromConsole("Introduza uma denominação");
        System.out.println("De momento estão disponiveis os seguintes tipos de alojamentos");
        utilitarios.apresentaLista(organizacao.getAlojamentoList(),"Tipos de Alojamento");
        String choice=utilitarios.readLineFromConsole("Introduza o numero correspondente ao tipo de Alojamento que pretende");
        TipoAlojamento tipoAlojamento=organizacao.getAlojamentoList().get(Integer.valueOf(choice)-1);
        utilitarios.apresentaLista(organizacao.getLocalList(),"Locais");
         choice=utilitarios.readLineFromConsole("Introduza o numero correspondente ao Local que pretende");
        Local local =organizacao.getLocalList().get(Integer.valueOf(choice)-1);
       int qntdMax=Integer.valueOf(utilitarios.readLineFromConsole("Introduza o numero Maximo de Pessoas "));
       int qntdMin=Integer.valueOf(utilitarios.readLineFromConsole("Introduza o numero Minimo de Pessoas "));
        System.out.println("Escolha um dia da semana dos Seguintes");
        List dias=Traduz(DayOfWeek.values());
       utilitarios.apresentaLista(dias,"Dias da Semana");
        String dia=utilitarios.readLineFromConsole("Escolha um dia da semana dos Seguintes").toUpperCase(Locale.ROOT);
      Data data=new Data();
       data.setDiaSemana(DayOfWeek.of(Integer.valueOf(dia)));
       double preco=Double.valueOf(utilitarios.readLineFromConsole("Introduza um preço"));
        controller.CriarAlojamento(denominação,tipoAlojamento,local,qntdMax,qntdMin,data,preco);
        apresentaDados();

    }
    public void apresentaDados(){
        System.out.printf("Alojamento \n%s",controller.getAlojamento());
    }
    public static List Traduz(DayOfWeek[] array){
        List<String>dayOfWeeks=new ArrayList<>();
        for (DayOfWeek x:array) {
                dayOfWeeks.add((x.getDisplayName(TextStyle.FULL_STANDALONE,new Locale(System.getProperty("user.country.format")))));
        }
        return dayOfWeeks;
    }

    // Codigo para gerar o controller
    public ControllerAlojamento createInstancesOfController() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ConfigurationException {
        String lController = utilitarios.readConfigString("ui.controllerInterface.iControllerAlojamento");
        ControllerAlojamento controller=(ControllerAlojamento) Class.forName(lController).getDeclaredConstructor(Organizacao.class).newInstance(this.organizacao);
        return controller;
    }
}
