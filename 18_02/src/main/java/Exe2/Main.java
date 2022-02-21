package Exe2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Credito_Habitacao house1 = new Credito_Habitacao("Abilio", "Medico", 120000, 240, 1);
        Credito_Habitacao house2 = new Credito_Habitacao("José", "Engenheiro Eletrotecnico", 120000, 240, 2);
        Credito_Automovel auto1 = new Credito_Automovel("Raul", "Aviador", 50000, 48);
        Credito_Automovel auto2 = new Credito_Automovel("Martim", "Cantoneiro", 20000, 24);
        Credito_Educacao edu1 = new Credito_Educacao("Serafim", "Tecnico AVAC", 18000, 60, 24, 2);
        Credito_Educacao edu2 = new Credito_Educacao("Rodri", "Tecnico AVAC", 20000, 60, 24, 4);
        Credito[] arr = new Credito[10];
        arr[0] = house1;
        arr[1] = house2;
        arr[2] = auto1;
        arr[3] = auto2;
        arr[4] = edu1;
        arr[5] = edu2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.printf("Cliente %s \n Total a Pagar %.2f Eur \n", arr[i].getNome(), arr[i].calcularTotal());
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.print(arr[i]);
        }
        System.out.printf("Foram criadas %s Creditos a Habitaçao\n", Credito_Habitacao.getCountCredHab());
        System.out.printf("Foram criadas %s Creditos de Consumo\n", Credito_Educacao.getCountCredEdu() + Credito_Automovel.getTotalCAuto());
        double Total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                Total = arr[i].calcularMontanteTotalJuros() + Total;

        }
        System.out.printf("A Instituição Bancaria vai receber %.2f Eur na Totalidade\n", Total);

        //-------------------------------------//-------------------------------------//-------------------------------------
        /**
         * Agora o mesmo corpo mas com arraylists
         */
        ArrayList<Credito> Cred = new ArrayList<Credito>();
        Cred.add(arr[0]);
        Cred.add(arr[1]);
        Cred.add(arr[2]);
        Cred.add(arr[3]);
        Cred.add(arr[4]);
        Cred.add(arr[5]);


        for (Credito cred:Cred) {
            System.out.printf("Cliente %s \n Total a Pagar %.2f Eur \n", cred.getNome(), cred.calcularTotal());
        }
        for (Credito cred:Cred) {
            System.out.print(cred);
        }
        System.out.printf("Foram criadas %s Creditos a Habitaçao\n", Credito_Habitacao.getCountCredHab());
        System.out.printf("Foram criadas %s Creditos de Consumo\n", Credito_Educacao.getCountCredEdu() + Credito_Automovel.getTotalCAuto());
        Total=0;
        for (Credito cred:Cred) {
                Total = cred.calcularMontanteTotalJuros() + Total;

        }
        System.out.printf("A Instituição Bancaria vai receber %.2f Eur na Totalidade\n", Total);

    }
}