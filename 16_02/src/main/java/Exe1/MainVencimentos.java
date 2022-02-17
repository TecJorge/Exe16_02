package Exe1;

public class MainVencimentos {
    public static void main(String[] args) {
        TrabalhadorPeca trp1=new TrabalhadorPeca("Jorge Silva",53,62);
        TrabalhadorComissao trc1=new TrabalhadorComissao("Susana Ferreira",650, 2731.50f,4.25f);
        TrabalhadorHora trH1=new TrabalhadorHora("Carlos Miguel",168,4.5f);
        Trabalhador [] arr= new Trabalhador[10];
        arr[0]=trp1;
        arr[1]=trc1;
        arr[2]=trH1;
        for(int i = 0;arr[i]!=null;i++){
            System.out.println(arr[i].toString());
        }
        for(int i = 0;arr[i]!=null;i++){
            if(arr[i] instanceof TrabalhadorHora) {
                System.out.println(arr[i].toString());
            }
        }
        for(int i = 0;arr[i]!=null;i++){
            System.out.printf("%s %nVencimento do Mes : %.2f€%n ",arr[i],arr[i].calcularVencimento());
        }
        Object [] arr1= new Object[10];
        arr1[0]=trp1;
        arr1[1]=trc1;
        arr1[2]=trH1;
        for(int i = 0;arr1[i]!=null;i++){
            System.out.println(arr[i].toString());
        }
        for(int i = 0;arr1[i]!=null;i++){
            if(arr1[i] instanceof TrabalhadorHora) {
                System.out.println(arr[i].toString());
            }
        }
        for(int i = 0;arr1[i]!=null;i++){
            System.out.printf("%s %nVencimento do Mes : %.2f€%n ",arr1[i], ((Trabalhador) arr1[i]).calcularVencimento());
        }
    }
}























