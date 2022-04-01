package ui;

import controller.ControllerOAtividade;
import domain.*;
import utils.utilitarios;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;



public class UIOAtividade {
    private Organizacao organizacao;
    private ControllerOAtividade controller;
    public UIOAtividade(Organizacao organizacao){
        this.organizacao=organizacao;
        this.controller=new ControllerOAtividade(organizacao);
    }
    public void run() {
        System.out.println("Nova Atividade");
        introduzDados();
        if ((utilitarios.confirma("Confirma os Dados da Atividade [S|N]"))) {

            if (controller.guardarAtividade())
                System.out.println("Tipo de Atividade Guardado");
            else {
                System.out.println("Tipo Atividade não guardado");
            }
            apresentaDados();
        }
    }
    public void introduzDados(){
        String denominação=utilitarios.readLineFromConsole("Introduza uma denominação");
        System.out.println("De momento estão disponiveis os seguintes Tipos de Atividades");
        utilitarios.apresentaLista(organizacao.getAtividadeList(),"Tipos de Atividade");
        String choice=utilitarios.readLineFromConsole("Introduza o numero correspondente ao Tipo de Atividade que pretende");
        TipoAtividade tipoAtividade=organizacao.getAtividadeList().get(Integer.valueOf(choice)-1);
        utilitarios.apresentaLista(organizacao.getLocalList(),"Locais");
        choice=utilitarios.readLineFromConsole("Introduza o numero correspondente ao Local de chegada que pretende");
        Local localc =organizacao.getLocalList().get(Integer.valueOf(choice)-1);
        choice=utilitarios.readLineFromConsole("Introduza o numero correspondente ao Local de partida que pretende");
        Local localp =organizacao.getLocalList().get(Integer.valueOf(choice)-1);
        int hora=Integer.valueOf(utilitarios.readLineFromConsole("Introduza a Hora de Inicio"));
        int minuto=Integer.valueOf(utilitarios.readLineFromConsole("Introduza os minutos de inico da Atividade"));
        Tempo tempoi=new Tempo(hora,minuto);
         hora=Integer.valueOf(utilitarios.readLineFromConsole("Introduza a Hora de Fim"));
         minuto=Integer.valueOf(utilitarios.readLineFromConsole("Introduza os minutos do Fim da Atividade"));
        Tempo tempof=new Tempo(hora,minuto);
        System.out.println("Escolha um dia da semana dos Seguintes");
        List dias=Traduz(DayOfWeek.values());
        utilitarios.apresentaLista(dias,"Dias da Semana");
        String dia=utilitarios.readLineFromConsole("Escolha um dia da semana dos Seguintes").toUpperCase(Locale.ROOT);
        Date data=new Date();
        data.setDiaSemana(DayOfWeek.of(Integer.valueOf(dia)));
        double preco=Double.valueOf(utilitarios.readLineFromConsole("Introduza um preço"));

        controller.CriarAtividade(denominação,tipoAtividade,localc,localp,data,preco,tempoi,tempof);
    }
    public void apresentaDados(){
        System.out.printf("Atividade \n%s",controller.getAtividade());
    }
    public static List Traduz(DayOfWeek[] array){
        List<String>dayOfWeeks=new ArrayList<>();
        for (DayOfWeek x:array) {
            dayOfWeeks.add((x.getDisplayName(TextStyle.FULL_STANDALONE,new Locale(System.getProperty("user.country.format")))));
        }
        return dayOfWeeks;
    }
}

