package Exe1;

public class Main {
    public static void main(String[] args) {
        int aux=0;
        String nome = "";
        Gas gas1 = new Gas("Abilio", "GAS", 100);
        Gas gas2 = new Gas("Abilia", "GAS", 400);
        ContadorSimples ele1 = new ContadorSimples("Marilio", "ELECT", 500, 7);
        ContadorSimples ele2 = new ContadorSimples("Marilia", "ELECT", 400, 5);
        ContadorBi ele3 = new ContadorBi("Alberto", "ELECT", 100, 200);
        ContadorBi ele4 = new ContadorBi("Alberta", "ELECT", 90, 100);
        Contador[] arr = new Contador[10];
        arr[0] = gas1;
        arr[1] = gas2;
        arr[2] = ele1;
        arr[3] = ele2;
        arr[4] = ele3;
        arr[5] = ele4;
        for (int i = 0; i < arr.length && arr[i]!=null; i++) {
            System.out.printf("Nome do Cliente: %s%nContador: %s\n",arr[i].getNome(),arr[i].getID());
        }
        System.out.printf("Foram Criados %d contadores de eletricidade\n",Eletricidade.getCountElect()-1);
        for (int i = 0; i < arr.length && arr[i]!=null; i++) {
            if(arr[i] instanceof ContadorBi)
            System.out.printf("Nome do Cliente: %s%nContador: %s\n",arr[i].getNome(),arr[i].getID());
        }
        for (int i = 0; i < arr.length && arr[i]!=null; i++) {
            System.out.print(arr[i]);
        }
        for (int i = 0; i < arr.length && arr[i]!=null; i++) {
            if(arr[i] instanceof Gas){
                if(arr[i].getConsumoForaVazio()>aux) {
                    aux = arr[i].getConsumoForaVazio();
                }
            }
        }
        System.out.printf("O maior consumo de gas foi %d m3\n",aux);
        for (int i = 0; i < arr.length && arr[i]!=null; i++) {
            if(arr[i].getNome()!=nome){
                nome=arr[i].getNome();
                System.out.print(arr[i]);
            }
        }
    }
}