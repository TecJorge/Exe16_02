package Exe1;

import java.util.ArrayList;

public class MainVencimentos {
    public static void main(String[] args) {
        TrabalhadorPeca trp1=new TrabalhadorPeca("Jorge Silva",53,62);
        TrabalhadorComissao trc1=new TrabalhadorComissao("Susana Ferreira",650, 2731.50f,4.25f);
        TrabalhadorHora trH1=new TrabalhadorHora("Carlos Miguel",168,4.5f);
        ArrayList<Trabalhador> arr= new ArrayList<Trabalhador>();
        arr.add(trp1);
        arr.add(trc1);
        arr.add(trH1);
        for(Trabalhador trabalhador:arr){
            System.out.println(trabalhador.toString());
        }
        for(Trabalhador trabalhador:arr){
            if(trabalhador instanceof TrabalhadorHora) {
                System.out.println(trabalhador.toString());
            }
        }
        for(Trabalhador trabalhador:arr){
            System.out.printf("%s %nVencimento do Mes : %.2f€%n ",trabalhador,trabalhador.calcularVencimento());
        }
       ArrayList<Object> arr1= new ArrayList<Object>();
        arr1.add(trp1);
        arr1.add(trc1);
        arr1.add(trH1);
        for(Trabalhador trabalhador:arr){
            System.out.println(trabalhador.toString());
        }
        for(Trabalhador trabalhador:arr){
            if(trabalhador instanceof TrabalhadorHora) {
                System.out.println(trabalhador.toString());
            }
        }
        for(Trabalhador trabalhador:arr){
            System.out.printf("%s %nVencimento do Mes : %.2f€%n ",trabalhador, ((Trabalhador) trabalhador).calcularVencimento());
        }
    }
}























