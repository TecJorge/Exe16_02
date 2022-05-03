package utils;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class utilitarios {

    static public String readLineFromConsole(String strPrompt)
    {
        try
        {
            System.out.println(strPrompt);

            InputStreamReader converter = new InputStreamReader(System.in); //lê do teclado
            BufferedReader in = new BufferedReader(converter);

            return in.readLine();
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
        /* este não está a ser utilizado, certo?
        static public Date readDateFromConsole(String strPrompt)
        {
            do
            {
                try
                {
                    String strDate = readLineFromConsole(strPrompt);

                    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

                    Date date = df.parse(strDate);

                    return date;
                } catch (ParseException ex)
                {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while (true);
        }*/

    static public boolean confirma(String sMessage) {
        String strConfirma;
        do {
            strConfirma = utilitarios.readLineFromConsole("\n" + sMessage + "\n");
        } while (!strConfirma.equalsIgnoreCase("s") && !strConfirma.equalsIgnoreCase("n"));

        return strConfirma.equalsIgnoreCase("s");
    }
    static public Object apresentaESeleciona(List list, String sHeader)
    {
        apresentaLista(list,sHeader);
        return selecionaObject(list);
    }
    static public void apresentaLista(List list,String sHeader)
    {
        System.out.println(sHeader);

        int index = 0;
        for (Object o : list)
        {
            index++;

            System.out.println(index + ". " + o.toString());
        }
        System.out.println("");
        System.out.println("0 - Cancelar");
    }

    static public Object selecionaObject(List list)
    {
        String opcao;
        int nOpcao;
        do
        {
            opcao = utilitarios.readLineFromConsole("Introduza opção: ");
            nOpcao = Integer.valueOf(opcao);
        } while (nOpcao < 0 || nOpcao > list.size());

        if (nOpcao == 0)
        {
            return null;
        } else
        {
            return list.get(nOpcao - 1);
        }
    }
    static public String readConfigString(String strElement) throws ConfigurationException, org.apache.commons.configuration2.ex.ConfigurationException {

        Configurations configs = new Configurations();

        Configuration config = configs.properties(new File("config.properties"));

        // access configuration properties
        String strRead = config.getString( strElement );

        return strRead;
    }

    static public String[] readConfigArrayString(String strElement) throws ConfigurationException, org.apache.commons.configuration2.ex.ConfigurationException {

        Configurations configs = new Configurations();

        Configuration config = configs.properties(new File("config.properties"));

        // access configuration properties
        String[] listStrRead = config.getStringArray( strElement );

        return listStrRead;
    }

}