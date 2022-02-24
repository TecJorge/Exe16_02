package Exe2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contribuinte> arr = new ArrayList<>();
        Reformado ref1 = new Reformado("Jose Pereira", "Rua da Esquerda", 100, 120);
        Reformado ref2 = new Reformado("Carlos Cruz", "Rua da Direita", 300, 120);
        TrabalhadorProprio tp1 = new TrabalhadorProprio("Marilio Costa", "Rua da Frente", 5000000, 350);
        TrabalhadorProprio tp2 = new TrabalhadorProprio("Rosilda Costa", "Rua da Frente", 800, 350);
        TrabalhadorOutrem to1 = new TrabalhadorOutrem("Gracinda da Meo", "Rua de Tras", 500000, 120);
        TrabalhadorOutrem to2 = new TrabalhadorOutrem("Jose Rocha", "Rua de Tras", 300, 50);
        Desempregado d1 = new Desempregado("Rahim", "Rua do Norte", 120);
        Desempregado d2 = new Desempregado("Sterling", "Rua do Nordeste", 850);
        arr.add(ref1);
        arr.add(ref2);
        arr.add(tp1);
        arr.add(tp2);
        arr.add(to1);
        arr.add(to2);
        arr.add(d1);
        arr.add(d2);
        for (Contribuinte contribuinte : arr) {
            System.out.printf("%s e tem de pagar %.2f EUR de impostos\n", contribuinte, contribuinte.Impostos());
        }
        for (Contribuinte contribuinte : arr) {
            if (contribuinte instanceof Desempregado)
                System.out.printf("%s e tem de pagar %.2f EUR de impostos\n", contribuinte, contribuinte.Impostos());
        }
        Desempregado.setPercentOR(15);
        for (Contribuinte contribuinte : arr) {
            if (contribuinte instanceof Desempregado)
                System.out.printf("%s e tem de pagar %.2f EUR de impostos\n", contribuinte, contribuinte.Impostos());
        }
        System.out.println("\n\n\n##------------NOVO EXERCICIO------------------##\n\n\n");
        ArrayList<Contribuinte> contribuintes = new ArrayList<>();
        contribuintes.add(new Desempregado("Luís Vidal", "Lisboa", 1));
        contribuintes.add(new Reformado("Valter Coelho", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 4));
        contribuintes.add(new TrabalhadorOutrem("Ana", "Ovar", 1800, 400));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TrabalhadorOutrem("Sílvio", "Seixal", 8000, 1000));
        contribuintes.add(new TrabalhadorProprio("Mário", "Guarda", 1500, 300));
        contribuintes.add(new Reformado("Amílcar Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TrabalhadorOutrem("João", "Lisboa", 800, 100));
        contribuintes.add(new TrabalhadorProprio("Carla", "Porto", 15000, 1000));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 8));
        for (Contribuinte x : contribuintes) {
            System.out.print(x);
        }
        System.out.println("\n##------------Tentar Remover Sem Alterar Equals------------------##\n");
        Desempregado delete = new Desempregado("Luís Vidal", "Lisboa", 1);
        contribuintes.remove(delete);
        for (Contribuinte x : contribuintes) {
            System.out.print(x);
        }
        System.out.println("\n##------------Tentar Remover Depois de Alterar Equals------------------##\n");
        contribuintes.remove(delete);
        for (Contribuinte x : contribuintes) {
            System.out.print(x);
        }
        contribuintes.add(new Desempregado("Luís Vidal", "Lisboa", 1));
        System.out.println("\n\n\n!!-----TESTES METODO EQUALS-----!!\n\n\n");
            Contribuinte instance =new Desempregado("Luís Vidal", "Lisboa", 1);
            System.out.printf("\nInstâncias com características iguais: %s", instance.equals(contribuintes.get(contribuintes.size()-1)));
            System.out.println("\nInstâncias do mesmo tipo com características diferentes:  " + instance.equals(contribuintes.get(contribuintes.size()-2)));
            System.out.println("Instâncias de tipos diferentes: " + instance.equals(contribuintes.get(contribuintes.size()-3)));


        Comparator<Contribuinte> criterio2 = new Comparator<Contribuinte>() {

            @Override
            public int compare(Contribuinte f1, Contribuinte f2) {
                String area1 = f1.getClass().getSimpleName();
                String area2 = f2.getClass().getSimpleName();
                return area1.compareTo(area2);
            }
        };
            Comparator<Contribuinte> criterio1 = new Comparator<Contribuinte>() {
            @Override
            public int compare(Contribuinte o1, Contribuinte o2) {
                int result = o1.getClass().getName().compareTo(o2.getClass().getName());
                if (result == 0) {
                    return  o1.getNome().compareTo(o2.getNome());
                }
                else
                return result;
            }
        };System.out.println("\n\n\n!!-----Ordenar a Lista com 1 Critério-----!!\n\n\n");
        Collections.sort(contribuintes,criterio2);
        for (Contribuinte x : contribuintes) {
            System.out.print(x);
        }
        System.out.println("\n\n\n!!AGORA COM DOIS CRITEIROS!!\n\n\n");
        Collections.sort(contribuintes,criterio1);
        // Collections.reverse(contribuintes);
        for (Contribuinte x : contribuintes) {
            System.out.print(x);
        }
    }
}


