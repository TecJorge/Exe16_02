package Exe1;

import java.util.ArrayList;

public class MainFiguras {

    public static void main(String[] args) {
        System.out.println("\n### Figuras Construídas ###");
        Circulo c1 = new Circulo();
        System.out.println(c1);

        Circulo c2 = new Circulo(5, "amarelo");
        System.out.println(c2);

        Retangulo r1 = new Retangulo();
        System.out.println(r1);

        Retangulo r2 = new Retangulo(5, 2, "azul");
        System.out.println(r2);              
        
        System.out.println("\n### Variável do Tipo Object ###");
        Object obj;
        obj = c1;
        System.out.println(obj);
        
        obj = r1;
        System.out.println(obj);
        
        // Armazenamento de Objetos num Contentor do Tipo Array
        ArrayList<Figura>figuras = new ArrayList<>();

        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);
        System.out.println("\n### Listagem de Figuras Armazenadas no Contentor ###");
        for (Figura fig: figuras) {
                System.out.printf("%.2f\n",fig.cArea());
        }
        for (Figura fig: figuras) {
            if(fig instanceof Retangulo)
                System.out.print(fig);
        }
        for (Figura fig: figuras) {
            if(fig instanceof Circulo)
                System.out.print(fig);
        }

    }
}