import Lojas.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * Esta classe permite a construção de um Objecto "CentroComercial" que por sua vez irá conter várias lojas
 */
public class CentroComercial {
    /**
     * Variavél de texto para armazenar o nome do Centro Comercial
     */
    private String nomeCentroC;
    /**
     * Variavél de Texto para armazenar a Morada do Centro Comercial
     */
    private String morada;
    /**
     * ArrayList do Tipo Loja onde pronta para receber e armazenar todos os objetos deste Tipo
     */
    private ArrayList<Loja> lista;
    /**
     * Nome Dado ao Centro Comercial por Omissão
     */
    private final String NOME_CENTRO_OMISSAO = "NorteShopping";
    /**
     * Morada dada ao Centro Comercial por Omissão
     */
    private final String MORADA_OMISSAO = "Indefinido";
    /**
     * Construtor completo do Centro Comercial
     *
     * @param nomeCentroC Nome do Centro Comercial
     * @param morada Morada do Centro Comercial
     * @param lista ArrayList pronto para receber objetos do tipo Loja
     */
    CentroComercial(String nomeCentroC, String morada, ArrayList<Loja> lista) {
        this.nomeCentroC = nomeCentroC;
        this.morada = morada;
        this.lista = lista;
    }
    /**
     *
     *Inicializa o estado da CentroComercial atribuindo por omissão: o nome, morada e lista de lojas.
     *
     */

    CentroComercial() {
        nomeCentroC = NOME_CENTRO_OMISSAO;
        morada = MORADA_OMISSAO;
        lista = new ArrayList<Loja>();
    }
    /**
     * Metodo para obter o nome do Centro Comercial
     * @return Nome do Centro Comercial
     */
    public String getNomeCentroC() {
        return nomeCentroC;
    }
    /**
     * Metodo para obter a morada do Centro Comercial
     * @return Morada do Centro Comercial
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Metodo para obter o ArrayList do Centro Comercial
     * @return ArrayList do Centro Comercial
     */
    public ArrayList<Loja> getLista() {
        return lista;
    }
    /**
     * Metodo para redefinir o nome do Centro Comercial
     * @param nomeCentroC recebe por parametro uma String que irá representar o novo Nome do CentroComercial
     */
    public void setNomeCentroC(String nomeCentroC) {
        this.nomeCentroC = nomeCentroC;
    }
    /**
     * Metodo para redefinir a morada do Centro Comercial
     * @param morada  Recebe por parametro uma string com a nova morada a ser defenida no objeto
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }
    /**
     * Metodo para redefinir o Arraylist do Centro Comercial
     * @param lista recebe por parametro um ArrayList do Tipo Loja que irá substituir o atual
     */
    public void setLista(ArrayList<Loja> lista) {
        this.lista = lista;
    }
    /**
     * Metodo para adicionar um Objecto do Tipo Loja ao ArrayList do Centro Comercial
     * @param lojas  Recebe por paramentro um Objeto do Tipo Loja para ser adicionado na lista
     */
    public void AdicionarLoja(Loja lojas) {
        lista.add(lojas);
    }
    /**
     * Metodo para obter o nº de lojas do Centro Comercial
     * @return Numero de Objetos contidos no ArrayList
     */
    public int nLojas() {
        return lista.size();
    }
    /**
     * Metodo que retorna o valor total das Rendas das Lojas do tipo Ancora
     * @return valor total das Rendas das Lojas do tipo Ancora
     */
    public double totalRendaAncora() {
        double totalRenda = 0;
        for (Loja x : lista) {
            if (x.getClass().getSimpleName().equalsIgnoreCase("LojaAncoraExterna")) {
                totalRenda += ((LojaAncoraExterna) x).calcRenda();
            }
        }
        return totalRenda;
    }
    /**
     * Metodo que retorna o valor total das Rendas das Lojas do tipo Comum
     * @return valor total das Rendas das Lojas do tipo Comum
     */
    public double totalRendaLojasComuns() {
        double totalRenda = 0;
        for (Loja x : lista) {
            if (x.getClass().getSimpleName().equals("LojaComumRestauracao")) {
                totalRenda += ((LojaComumRestauracao) x).calcRenda();
            }
            else if (x.getClass().getSimpleName().equals("LojaComumQuiosque")) {
                totalRenda += ((LojaComumQuiosque) x).calcRenda();
            }
        }
        return totalRenda;
    }
    /**
     * Metodo que retorna o valor total dos Custos de Segurança das Lojas
     * @return valor total dos Custos de Segurança das Lojas
     */
    public double totalPagarSeguranca() {
        double totalSeguranca = 0;
        for (Loja x : lista) {
            if (x.getClass().getSimpleName().equalsIgnoreCase("LojaAncoraExterna"))
                totalSeguranca += ((LojaAncoraExterna) x).custoSeguranca();
            else if (x.getClass().getSimpleName().equalsIgnoreCase("LojaComumRestauracao"))
                totalSeguranca += ((LojaComumRestauracao) x).custoSeguranca();
            else if (x.getClass().getSimpleName().equalsIgnoreCase("LojaAncora")) {
                totalSeguranca += ((LojaAncora) x).custoSeguranca();
            }
        }
        return totalSeguranca;
    }
    /**
     * Metodo que retorna o valor total dos Custos de Segurança das Lojas do Tipo Ancora
     * @return valor total dos Custos de Segurança das Lojas do Tipo Ancora
     */
    public double totalCustoSegurancaAncora() {
        double totalSegurancaA = 0;
        for (Loja x : lista) {
            if (x.getClass().getSimpleName().equalsIgnoreCase("LojaAncoraExterna"))
                totalSegurancaA += ((LojaAncoraExterna) x).custoSeguranca();
            else if (x.getClass().getSimpleName().equalsIgnoreCase("LojaAncora")) {
                totalSegurancaA += ((LojaAncora) x).custoSeguranca();
            }
        }
        return totalSegurancaA;
    }
    /**
     * Metodo que retorna o valor total dos Custos de Segurança das Lojas do Tipo Comum
     * @return valor total dos Custos de Segurança das Lojas do Tipo Comum
     */
    public double totalCustoSegurancaComum() {
        double totalSegurancaC = 0;
        for (Loja x : lista) {
            if (x.getClass().getSimpleName().equalsIgnoreCase("LojaComumRestauracao"))
                totalSegurancaC += ((LojaComumRestauracao) x).custoSeguranca();
        }
        return totalSegurancaC;
    }
    /**
     * Metodo que retorna o valor total da Receita do Centro Comercial
     * @return Soma das Rendas das Lojas Tipo Ancora,Rendas das Lojas Tipo Comum e o Custo Total com Segurança
     */

    public double totalReceitas() {
        return totalRendaAncora() + totalRendaLojasComuns() + totalPagarSeguranca();
    }
    /**
     * Metodo para obter o valor pago em percentagem pelas Lojas Comuns ao CentroComercial
     * @return valor pago em percentagem pelas Lojas Comuns ao CentroComercial
     */
    public double percentualComum() {
        return ((totalCustoSegurancaComum()+totalRendaLojasComuns()) * 100) / totalReceitas();}
    /**
     * Metodo para obter o valor pago em percentagem pelas Lojas Ancora ao CentroComercial
     * @return valor pago em percentagem pelas Lojas Ancora ao CentroComercial
     */
    public double percentualAncora() {
        return ((totalCustoSegurancaAncora()+totalRendaAncora())* 100) / totalReceitas();}
    /**
     * Metodo para ordenar o Arraylist de forma Crescente alfabeticamente pelo Nome das Lojas
     */
    public void ordenarLista() {
        Collections.sort(lista);
    }
    /**
     * Metodo que ordena o Arraylist tendo em conta dois critérios :
     * 1- De forma Crescente pelo Tipo de Loja
     * 2- De forma Decrescente pela Area de Cada Loja
     */
    public void ordenarTipoeArea() {
        Collections.sort(lista, (new Lojas.Compare()));
    }
    /**
     * Metodo que para remover uma determinada loja do ArrayList
     @param loja Loja que vai ser removida do ArrayList
     */
    public void removerLoja(Loja loja) {
        lista.remove(loja);
    }
    /**
     * Metodo para ler o Ficheiro Resultados.txt da root do projeto , consoante a informação presente neste txt o metodo vai criar objetos do Tipo Loja e armazenar o mesmo no ArrayList do Centro Comercial
     * @throws FileNotFoundException caso o ficheiro não consiga ler o ficheiro na Root do projeto
     */
    public void LerFicheiro() throws FileNotFoundException {
        Scanner ler = new Scanner(new File("Resultados.txt"));
        while (ler.hasNext()) {
            String[] obj;
            String[] atributos;
            obj = ler.nextLine().split(":");
            if (obj[0].equalsIgnoreCase("LojaAncora")) {
                atributos = obj[1].split("=|;");
                this.AdicionarLoja(new LojaAncora((Integer.valueOf(atributos[1])), String.valueOf(atributos[3]), Double.parseDouble(atributos[5].replace(",", ".")), Double.valueOf(atributos[7].replace(",", ".")), Double.valueOf(atributos[9].replace(",", "."))));
            } else if (obj[0].equalsIgnoreCase("LojaAncoraExterna")) {
                atributos = obj[1].split("=|;");
                this.AdicionarLoja(new LojaAncoraExterna((Integer.parseInt(atributos[1])), atributos[3], Double.parseDouble(atributos[5].replace(",", ".")), Double.parseDouble(atributos[7].replace(",", ".")), Double.parseDouble(atributos[9].replace(",", ".")), (Integer.parseInt(atributos[11]))));
            } else if (obj[0].equalsIgnoreCase("LojaComumQuiosque")) {
                atributos = obj[1].split("=|;");
                this.AdicionarLoja(new LojaComumQuiosque((Integer.parseInt(atributos[1])), atributos[3], Double.parseDouble(atributos[5].replace(",", ".")), Double.parseDouble(atributos[7].replace(",", ".")), Integer.parseInt(atributos[9])));
            } else if (obj[0].equalsIgnoreCase("LojaComumRestauracao")) {
                atributos = obj[1].split("=|;");
                this.AdicionarLoja(new LojaComumRestauracao((Integer.parseInt(atributos[1])), atributos[3], Double.parseDouble(atributos[5].replace(",", ".")), Double.parseDouble(atributos[7].replace(",", ".")), Integer.parseInt(atributos[9]), Double.parseDouble(atributos[11].replace(",", ".")), Integer.parseInt(atributos[13])));
            }
        }
        ler.close();
    }
    /**
     * Metodo para Criar o Ficheiro Resultados.txt na root do projeto , consoante a informação presente no ArrayList do CentroComercial
     * @throws FileNotFoundException caso o ficheiro não criar o ficheiro na Root do projeto
     */
    public void CriarFicheiro() throws FileNotFoundException {
        Formatter output = new Formatter(new File("Resultados.txt"));
        output.format("CentroComercial:%s\nMorada:%s\n", getNomeCentroC(), getMorada());
        for (Loja x : lista) {
            String y = (x.getClass().getSimpleName());
            if (y.equalsIgnoreCase("LojaAncora")) {
                output.format("%s:IdLoja=%d;NomeLoja=%s;AreaLoja=%.2f;ReceitasAnoAnterior=%.2f;CustoSegurança=%.2f\n", y, x.getNumID(), x.getNome(), x.getArea(), x.getReceitasAnoAnterior(), ((LojaAncora) x).getCustoSeguranca());
            } else if (y.equalsIgnoreCase("LojaAncoraExterna")) {
                output.format("%s:IDloja=%d;NomeLoja=%s;AreaLoja=%.2f;ReceitasAnoAnterior=%.2f;CustoSegurança=%.2f;NFuncionarios=%d\n", y, x.getNumID(), x.getNome(), x.getArea(), x.getReceitasAnoAnterior(), ((LojaAncoraExterna) x).getCustoSeguranca(), ((LojaAncoraExterna) x).getQuantidadeFuncionario());
            } else if (y.equalsIgnoreCase("LojaComumQuiosque")) {
                output.format("%s:IDLoja=%d;NomeLoja=%s;AreaLoja=%.2f;ReceitasAnoAnterior=%.2f;NFuncionarios=%d;Renda=%.2f\n", y, x.getNumID(), x.getNome(), x.getArea(), x.getReceitasAnoAnterior(), ((LojaComumQuiosque) x).getQuantidadeFuncionario(), ((LojaComumQuiosque) x).getRenda());
            } else if (y.equalsIgnoreCase("LojaComumRestauracao")) {
                output.format("%s:IDLoja=%d;NomeLoja=%s;AreaLoja=%.2f;ReceitasAnoAnterior=%.2f;NFuncionarios=%d;CustoManutenção=%.2f;NMesas=%d\n", y, x.getNumID(), x.getNome(), x.getArea(), x.getReceitasAnoAnterior(), ((LojaComumRestauracao) x).getQuantidadeFuncionario(), ((LojaComumRestauracao) x).getCustoManutencao(), ((LojaComumRestauracao) x).getNumMesas());
            }
        }
        output.close();
    }

}
