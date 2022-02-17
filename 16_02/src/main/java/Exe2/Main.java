package Exe2;

public class Main {
    public static void main(String[] args) {
        Contribuinte[] arr = new Contribuinte[12];
        Reformado ref1 = new Reformado("Jose Pereira", "Rua da Esquerda", 500, 400);
        Reformado ref2 = new Reformado("Carlos Cruz", "Rua da Direita", 300, 120);
        TrabalhadorProprio tp1 = new TrabalhadorProprio("Marilio Costa", "Rua da Frente", 800, 350);
        TrabalhadorProprio tp2 = new TrabalhadorProprio("Rosilda Costa", "Rua da Frente", 800, 350);
        TrabalhadorOutrem to1 = new TrabalhadorOutrem("Gracinda da Meo", "Rua de Tras", 400, 50);
        TrabalhadorOutrem to2 = new TrabalhadorOutrem("Jose Rocha", "Rua de Tras", 300, 50);
        Desempregado d1 = new Desempregado("Rahim", "Rua do Norte", 650);
        Desempregado d2 = new Desempregado("Sterling", "Rua do Nordeste", 850);
        arr[0] = ref1;
        arr[1] = ref2;
        arr[2] = tp1;
        arr[3] = tp2;
        arr[4] = to1;
        arr[5] = to2;
        arr[6] = d1;
        arr[7] = d2;
        for (int i = 0; arr[i] != null; i++) {
            System.out.printf("%s e tem de pagar %.2f EUR de impostos\n", arr[i], arr[i].Impostos());
        }
        for (int i = 0; arr[i] != null; i++) {
            if (arr[i] instanceof Desempregado)
                System.out.printf("%s e tem de pagar %.2f EUR de impostos\n", arr[i], arr[i].Impostos());
        }
        Desempregado.setPercentOR(15);
        for (int i = 0; arr[i] != null; i++) {
            if (arr[i] instanceof Desempregado)
                System.out.printf("%s e tem de pagar %.2f EUR de impostos\n", arr[i], arr[i].Impostos());


        }
    }
}
