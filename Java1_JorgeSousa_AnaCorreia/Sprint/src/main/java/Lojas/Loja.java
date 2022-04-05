package Lojas;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem diferentes tipos de lojas. Especifica membros
 * comuns a todas as classes da hierarquia.
 */

public class Loja implements Comparable<Loja> {

    /**
     * O número de identificação da Loja.
     */
    private int numID;

    /**
     * O nome da Loja.
     */
    private String nome;

    /**
     * A área da Loja.
     */
    private double area;

    /**
     * O valor auferido em receitas no ano anterior pela Loja.
     */
    private double receitasAnoAnterior;

    /**
     * O número de identificação da Loja por omissão.
     */

    private static final int NUM_ID_OMISSAO = 0;

    /**
     * O nome da Loja por omissão.
     */

    private static final String NOME_OMISSAO = "Sem nome";

    /**
     * A área da Loja por omissão.
     */

    private static final double AREA_OMISSAO = 0;

    /**
     * As receitas auferidas no ano anterior pela Loja por omissão.
     */

    private static final double RECEITAS_ANO_ANTERIOR_OMISSAO = 0;

    /**
     * O limite superior da área da Loja, em m².
     */
    private static int limSuperiorArea = 100;

    /**
     * O limite inferior da área da Loja, em m².
     */
    private static int limInferiorArea = 20;


    /**
     * Inicializa o estado da Loja atribuindo o número de identificação, o nome, a área e as
     * receitas referentes ao ano anterior da mesma.
     *
     * @param numID o número de identificação da Loja
     * @param nome o nome da Loja
     * @param area a área da Loja
     * @param receitasAnoAnterior as receitas do ano anterior da Loja
     */

    public Loja(int numID, String nome, double area, double receitasAnoAnterior) {
        this.numID = numID;
        this.nome = nome;
        this.area = area;
        this.receitasAnoAnterior = receitasAnoAnterior;
    }

/**
 * Inicializa o estado da Loja atribuindo por omissão: o número de identificação, o nome, a área e as
 * receitas referentes ao ano anterior da mesma.
 */

    public Loja() {
        numID = NUM_ID_OMISSAO;
        nome = NOME_OMISSAO;
        area = AREA_OMISSAO;
        receitasAnoAnterior = RECEITAS_ANO_ANTERIOR_OMISSAO;
    }

    /**
     * Devolve o número de identificação da Loja.
     *
     * @return Número de identificação da Loja.
     */
    public int getNumID() {
        return numID;
    }

    /**
     * Devolve o nome da Loja.
     *
     * @return O nome da Loja.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve a area da Loja.
     *
     * @return A área da Loja.
     */
    public double getArea() {
        return area;
    }

    /**
     * Devolve as receitas auferidas no ano anterior pela Loja.
     *
     * @return as receitas auferidas no ano anterior pela Loja.
     */
    public double getReceitasAnoAnterior() {
        return receitasAnoAnterior;
    }

    /**
     * Devolve o limite superior da area da Loja, em m^2.
     *
     * @return o limite superior área da Loja, em m^2.
     */
    public static int getLimSuperiorArea() {
        return limSuperiorArea;
    }

    /**
     * Devolve o limite inferior da area da Loja, em m^2.
     *
     * @return o limite inferior área da Loja, em m^2.
     */
    public static int getLimInferiorArea() {
        return limInferiorArea;
    }

    /**
     * Modifica o número de identificação da Loja.
     *
     * @param numID o novo número de identificação da Loja.
     */
    public void setNumID(int numID) {
        this.numID = numID;
    }

    /**
     * Modifica o nome da Loja.
     *
     * @param nome o novo nome Loja.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Modifica a área da Loja.
     *
     * @param area a nova área da Loja.
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Modifica as receitas auferidas no ano anterior pela Loja.
     *
     * @param receitasAnoAnterior o novo valor auferido no ano anterior pela Loja.
     * Não é expectável que este valor seja modificado pelo utilizador, contudo pode ser
     * útil se ouver erros nas contas do ano anterior, com a possibilidade de terem que ser corrigidos os
     * valores manualmente
     */
    public void setReceitasAnoAnterior(double receitasAnoAnterior) {
        this.receitasAnoAnterior = receitasAnoAnterior;
    }

    /**
     * Modifica o limite superior da área da Loja, em m².
     *
     * @param limSuperiorArea o novo limite superior da área da Loja, em m².
     */
    public static void setLimSuperiorRenda(int limSuperiorArea) {
        Loja.limSuperiorArea = limSuperiorArea;
    }

    /**
     * Modifica o limite inferior da área da Loja, em m².
     *
     * @param limInferiorArea o novo limite inferior da área da Loja, em m².
     */
    public static void setLimInferiorArea(int limInferiorArea) {
        Loja.limInferiorArea = limInferiorArea;
    }

    /**
     * Devolve a representação textual da Loja.
     *
     * @return representação textual da Loja
     */
    @Override
    public String toString() {
        return String.format("ID Loja: %d\n Nome da Loja: %s.\n Area da Loja: %.2fm²\n" +
                " Receitas do Ano anterior: %.2f€",numID, nome, area, receitasAnoAnterior);
    }

    /**
     * Permite atribuir à Loja a classificação "Pequena", "Média" ou "Grande", segundo a sua área.
     *
     * @return Classificação da Loja, segundo a sua área
     */
    public String classificacaoArea() {

        if (this.area < getLimInferiorArea(

        )) {

            return "Pequena";
        }
        else if (this.area > getLimSuperiorArea()) {
            return "Grande";
        } else return "Média";
    }


    /**
     * Compara a Loja com o objeto recebido.
     *
     * @param outroObject o objeto a comparar com a Loja.
     * @return true se o objeto recebido representar outra Loja
     *         equivalente à Loja. Caso contrário, retorna false.
     */
    @Override
    public boolean equals(Object outroObject) {
        if (this == outroObject) {
            return true;
    }
        if (outroObject == null || getClass() != outroObject.getClass()) {
            return false;
        }
        Loja outraLoja = (Loja) outroObject;
        return numID == outraLoja.numID &&
        nome.equalsIgnoreCase(outraLoja.nome) &&
                area == outraLoja.area &&
        receitasAnoAnterior == outraLoja.receitasAnoAnterior;

}
    /**
     * Permite comparar o nome da Loja com outro objecto.
     *
     * @return valor numérico que corresponde à ordem pela qual o contentor vai ser ordenado
     */
    @Override
    public int compareTo(Loja f2) {
        return this.getNome().compareTo(f2.getNome());

    }
}


