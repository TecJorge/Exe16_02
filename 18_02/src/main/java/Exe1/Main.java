package Exe1;

import java.util.ArrayList;

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
        ArrayList <Contador>count = new ArrayList<>();
        count.add(gas1);
        count.add(gas2);
        count.add(ele1);
        count.add(ele2);
        count.add(ele3);
        count.add(ele4);
        for (Contador contador:count) {
            System.out.printf("Nome do Cliente: %s%nContador: %s\n",contador.getNome(),contador.getID());
        }
        for (Contador contador:count) {
        System.out.printf("Foram Criados %d contadores de eletricidade\n",Eletricidade.getCountElect()-1);

            System.out.printf("Nome do Cliente: %s%nContador: %s\n",contador.getNome(),contador.getID());
        }
        for (Contador contador:count) {
            System.out.print(contador);
        }
        for (Contador contador:count) {
            if(contador instanceof Gas){
                if(contador.getConsumoForaVazio()>aux) {
                    aux = contador.getConsumoForaVazio();
                }
            }
        }
        System.out.printf("O maior consumo de gas foi %d m3\n",aux);
        for (Contador contador:count) {
            if(contador.getNome()!=nome){
                nome=contador.getNome();
                System.out.print(contador);
            }
        }
    }
}