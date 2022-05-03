package ui;

import domain.Factories.*;
import domain.Organizacao;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        {

            String[] listStringClassesTipoAlojamentoFilters = {};
            String[] listStringClassesAlojamentoFilters={};
            String[] listStringUI = {};
            String[] listControllers ={};
            Configurations configs = new Configurations();
            try
            {
                Configuration config = configs.properties(new File("config.properties"));

                // access configuration properties
                listStringClassesTipoAlojamentoFilters = config.getStringArray("filters.tipoalojamento");
                listStringClassesAlojamentoFilters=config.getStringArray("filters.Alojamento");
                listStringUI = config.getStringArray("UI"); //lê todas as linhas com a tag UI
                listControllers=config.getStringArray("Controller");// lê todas as linhas a tag Controller

            }
            catch (ConfigurationException cex)
            {
                // Something went wrong
                System.out.println("Algo correu mal na leitura de configuração: " + cex.getMessage());
            }
       try{
           FactoryAlojamento factoryAlojamento=new FactoryAlojamento();
           FactoryAtividade factoryAtividade=new FactoryAtividade();
           FactoryLocal factoryLocal=new FactoryLocal();
           FactoryTipoAlojamento factoryTipoAlojamento=new FactoryTipoAlojamento();
           FactoryTipoAtividade factoryTipoAtividade=new FactoryTipoAtividade();
           FactoryPacote factoryPacote=new FactoryPacote();
           FactoryTipoAlojamentoFilter factoryTipoAlojamentoFilters=new FactoryTipoAlojamentoFilter();
           FactoryAlojamentoFilters factoryAlojamentoFilters=new FactoryAlojamentoFilters();
           Organizacao organizacao=new Organizacao(Arrays.asList(listStringClassesTipoAlojamentoFilters),Arrays.asList(listStringClassesAlojamentoFilters),factoryTipoAlojamento,factoryTipoAtividade,factoryAtividade,factoryAlojamento,factoryLocal,factoryPacote,factoryTipoAlojamentoFilters,factoryAlojamentoFilters, Arrays.asList(listStringUI),Arrays.asList(listControllers));
        MenuUI menuUI=new MenuUI(organizacao);
        menuUI.run(Arrays.asList(listStringUI),Arrays.asList(listControllers));
       }catch (IOException e){
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.getMessage();
       }catch (InvocationTargetException e){
           e.getMessage();
       }catch (NoSuchMethodException e){
           e.getMessage();
       }catch (Exception e){
           e.getMessage();
       }
        }}}


