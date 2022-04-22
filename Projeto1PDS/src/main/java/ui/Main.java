package ui;

import domain.Organizacao;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {
            String[] listStringClassesTipoAlojamentoFilters = {};
            String[] listStringClassesAlojamentoFilters={};
            Configurations configs = new Configurations();
            try
            {
                Configuration config = configs.properties(new File("config.properties"));

                // access configuration properties
                listStringClassesTipoAlojamentoFilters = config.getStringArray("filters.tipoalojamento");
                listStringClassesAlojamentoFilters=config.getStringArray("filters.Alojamento");
            }
            catch (ConfigurationException cex)
            {
                // Something went wrong
            }
       try{
           Organizacao organizacao=new Organizacao(Arrays.asList(listStringClassesTipoAlojamentoFilters),Arrays.asList(listStringClassesAlojamentoFilters));
        MenuUI menuUI=new MenuUI(organizacao);
        menuUI.run();
       }catch (IOException e){
           e.printStackTrace();
       }}}}


