package ui;

import domain.FactoryAlojamento;
import domain.Organizacao;

import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       try{
           FactoryAlojamento factoryAlojamento=new FactoryAlojamento();
           Organizacao organizacao=new Organizacao();
        MenuUI menuUI=new MenuUI(organizacao);
        menuUI.run();
       }catch (IOException e){
           e.printStackTrace();
       }
       }
}
