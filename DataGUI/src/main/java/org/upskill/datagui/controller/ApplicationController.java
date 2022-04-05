package org.upskill.datagui.controller;

import org.upskill.datagui.model.Data;

public class ApplicationController {

    public String diaSemana(String dataextenso){
    String[] temp;
    temp = dataextenso.split("/");
    Data data = new Data(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]), Integer.valueOf(temp[2]));
    return data.diaDaSemana();}

    public String dataExtenso (String dataextenso){
        String[] temp;
        temp = dataextenso.split("/");
        Data data = new Data(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]), Integer.valueOf(temp[2]));
        return data.toString();
    }
}
