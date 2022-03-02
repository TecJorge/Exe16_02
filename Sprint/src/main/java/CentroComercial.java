import Lojas.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Comparable;
import java.util.*;
public class CentroComercial implements Comparable<Loja>{
    private String nomeCentroC;
    private String morada;
    private ArrayList<Loja> lista;
    private final String nomeCentro_Default = "NorteShopping";
    private final String morada_Default = "Indefinido";

    CentroComercial(String nomeCentroC, String morada, ArrayList<Loja> lista) {
        this.nomeCentroC = nomeCentroC;
        this.morada = morada;
        this.lista = lista;
    }

    CentroComercial() {
        nomeCentroC = nomeCentro_Default;
        morada = morada_Default;
        lista = new ArrayList<Loja>();
    }

    public String getNomeCentroC() {
        return nomeCentroC;
    }

    public void newLoja(Loja lojas) {
        lista.add(lojas);
    }

    public int nLojas() {
        return lista.size();
    }

    public double totalPagarAncora() {
        double totalRenda = 0;
        for (Loja x : lista) {
            if (x.getClass().getName() == "AncoraExterna") ;
            {
                totalRenda += ((AncoraExterna) x).calcRenda();
            }
        }
        return totalRenda;
    }

    public double totalPagarComuns() {
        double totalRenda = 0;
        for (Loja x : lista) {
            if (x.getClass().getName() == "ComumRestauracao") ;
            {
                totalRenda += ((ComumRestauracao) x).calcRenda();
            }
        }
        return totalRenda;
    }

    public double totalPagarSeguranca() {
        double totalSeguranca = 0;
        for (Loja x : lista) {
            if (x.getClass().getName().equalsIgnoreCase("AncoraExterna"))
            totalSeguranca += ((AncoraExterna) x).custoSeguranca();
            else if (x.getClass().getName().equalsIgnoreCase("ComumRestauracao"))
                totalSeguranca += ((ComumRestauracao) x).custoSeguranca();
            else if(x.getClass().getName().equalsIgnoreCase("LojaAncora")){
            totalSeguranca += ((LojaAncora) x).custoSeguranca();}
        }
        return totalSeguranca;
    }

    public double totalReceitas() {
        return totalPagarAncora() + totalPagarComuns() + totalPagarSeguranca();
    }

@Override
    public int compareTo(Loja f2) {
        f2=lista.get(1);
        Loja f1 = lista.get(0);
        return f1.getNome().compareTo(f2.getNome());

    }


  public void ordenarLista(){Collections.sort(lista);
    }



    public void ordenarTipoeArea() {
        Collections.sort(lista,(new Compare()));
    }

    public void removerLista(Loja loja) {
        lista.remove(loja);
    }
    public void LerFicheiro() throws FileNotFoundException {
        Scanner ler = new Scanner(new File("Lojas.txt"));
        while(ler.hasNext());

    }

    /**
     * Meo
     * @throws FileNotFoundException
     */
    public  void CriarFicheiro()throws FileNotFoundException{
        Formatter output=new Formatter(new File("Resultados.txt"));
        for (Loja x:lista) {
            output.format("%d,%n,%d,%d",x.getNumID(),x.getNome(),x.getArea(),x.getReceitasAnoAnterior());
        }
        output.close();
    }

    }
