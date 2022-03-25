import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException, MesInvalidoException {
        String[] obj;
        boolean flag = false;
        boolean valida = false;
        String nTemp,fixe,nome;
        ArrayList<ArrayList> lista1 = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Data> data = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        lista1.add(nomes);
        lista1.add(data);
        System.out.println("Introduza o nome do seu Ficheiro");
        fixe=ler.nextLine();
        do {
            System.out.println("Introduza um nome se desejar parar de introduzir pressione ENTER");
            nTemp = ler.nextLine();
            if (nTemp.isEmpty()) {
                flag = true;
                continue;
            }
            nome=nTemp;
            do {
                try {
                    System.out.println("Introduza uma data no formato ano/mes/dia");
                    nTemp = ler.nextLine();
                    if (!nTemp.contains("/"))
                        throw new Exception("Formato Invalido - introduza a data como ano/mes/dia");
                    obj = nTemp.split("/");
                    data.add(new Data(Integer.valueOf(obj[0]), Integer.valueOf(obj[1]), Integer.valueOf(obj[2])));
                    nomes.add(nome);
                    valida = true;
                } catch (MesInvalidoException e) {
                    System.out.println(e.getMessage());
                } catch (DiaInvalidoException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    e.getMessage();
                }
            } while (!valida);

        } while (!flag);
        do {
            try {
                criarFicheiro(lista1,fixe);
                flag = false;
            } catch
            (FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("Insira o nome do Ficheiro");
                nTemp = ler.nextLine();
                File file = new File(nTemp + ".txt");
            }
        } while (flag);
    }

    public static void criarFicheiro(ArrayList<ArrayList> e,String nome) throws FileNotFoundException {
        int x;
        Formatter output = new Formatter(new File(nome+".txt"));
        ArrayList<String> j = e.get(0);
        ArrayList<String> t = e.get(1);
        for (int i = 0; i < j.size(); i++) {
            output.format("Nome:%s;%s\n", j.get(i), t.get(i));
        }
        output.close();

    }
}
