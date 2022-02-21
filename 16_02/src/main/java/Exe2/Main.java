package Exe2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Contribuinte> arr = new ArrayList<>();
        Reformado ref1 = new Reformado("Jose Pereira", "Rua da Esquerda", 500, 400);
        Reformado ref2 = new Reformado("Carlos Cruz", "Rua da Direita", 300, 120);
        TrabalhadorProprio tp1 = new TrabalhadorProprio("Marilio Costa", "Rua da Frente", 800, 350);
        TrabalhadorProprio tp2 = new TrabalhadorProprio("Rosilda Costa", "Rua da Frente", 800, 350);
        TrabalhadorOutrem to1 = new TrabalhadorOutrem("Gracinda da Meo", "Rua de Tras", 400, 50);
        TrabalhadorOutrem to2 = new TrabalhadorOutrem("Jose Rocha", "Rua de Tras", 300, 50);
        Desempregado d1 = new Desempregado("Rahim", "Rua do Norte", 650);
        Desempregado d2 = new Desempregado("Sterling", "Rua do Nordeste", 850);
        arr.add(ref1);
        arr.add(ref2);
        arr.add(tp1);
        arr.add(tp2);
        arr.add(to1);
        arr.add(to2);
        arr.add(d1);
        arr.add(d2);
        for (Contribuinte contribuinte:arr) {
            System.out.printf("%s e tem de pagar %.2f EUR de impostos\n", contribuinte, contribuinte.Impostos());
        }
        for (Contribuinte contribuinte:arr) {
            if (contribuinte instanceof Desempregado)
                System.out.printf("%s e tem de pagar %.2f EUR de impostos\n", contribuinte, contribuinte.Impostos());
        }
        Desempregado.setPercentOR(15);
        for (Contribuinte contribuinte:arr) {
            if (contribuinte instanceof Desempregado)
                System.out.printf("%s e tem de pagar %.2f EUR de impostos\n", contribuinte,contribuinte.Impostos());


        }
    }
}
