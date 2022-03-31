package ui;

import controller.ControllerAlojamento;
import domain.*;
import utils.utilitarios;

import java.util.Arrays;
import java.util.Locale;

import static domain.Data.DiaDaSemana.designacaoDiaDaSemana;

public class UIAlojamento {
    private Organizacao organizacao;
    private ControllerAlojamento controller;
    public UIAlojamento(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerAlojamento(organizacao);
    }
    public void run() {
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
       utilitarios.apresentaLista(Arrays.asList(Data.DiaDaSemana.values()),"Dias da Semana");
        String dia=utilitarios.readLineFromConsole("Escolha um dia da semana dos Seguintes").toUpperCase(Locale.ROOT);
       Data data=new Data();
       data.setDiaDaSemana((designacaoDiaDaSemana(Integer.valueOf(dia))));
       double preco=Double.valueOf(utilitarios.readLineFromConsole("Introduza um preço"));
        controller.CriarAlojamento(denominação,tipoAlojamento,local,qntdMax,qntdMin,data,preco);
    }
    public void apresentaDados(){
        System.out.printf("Alojamento \n%s",controller.getAlojamento());
    }
}
