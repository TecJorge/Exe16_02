package ui;

import domain.Organizacao;

import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       try{ Organizacao organizacao=new Organizacao();
        MenuUI menuUI=new MenuUI(organizacao);
        menuUI.run();
       }catch (IOException e){
           e.printStackTrace();
       }
       }
}
