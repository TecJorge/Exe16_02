package Lojas;

/**
 * Representa uma Loja do tipo Âncora Externa através do seu número de identificação, nome, área
 * receitas do ano anterior e quantidade de funcionários.
 */

public class LojaAncoraExterna extends LojaAncora implements CustoSeguranca, Renda {

    /**
     * A quantidade de funcionários da Loja Âncora Externa.
     */
    private int quantidadeFuncionario;

    /**
     * A quantidade de funcionários, por omissão, da Loja Âncora Externa.
     */
    private static final int QUANTIDADE_FUNCIONARIO_OMISSAO = 0;

    /**
     * O valor da renda fixa da Loja Âncora Externa.
     */
    private static double rendaFixa = 2000;

    /**
     * Inicializa o estado da LojaAncoraExterna atribuindo o número de identificação, o nome, a área, as
     * receitas referentes ao ano anterior da mesma, o custo de sugurança e a quantidade de funcionários
     * que lá trabalham
     *
     * @param numID o número de identificação da Loja Ancora Externa
     * @param nome o nome da Loja Ancora Externa
     * @param area a área da Loja Ancora Externa
     * @param receitasAnoAnterior as receitas do ano anterior da Loja Ancora Externa
     * @param custoSeguranca o valor gasto em segurança pela Loja Ancora Externa
     * @param quantidadeFuncionario a quantidade de funcionários que trabalham na Loja Ancora Externa
     */
    public LojaAncoraExterna(int numID, String nome, double area,
                             double receitasAnoAnterior, double custoSeguranca, int quantidadeFuncionario) {
        super(numID, nome, area, receitasAnoAnterior, custoSeguranca);
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    /**
     *Inicializa o estado da LojaAncoraExterna atribuindo a quantidade de funcionários que
     * trabalham na Loja Âncora Externa
     *
     * @param quantidadeFuncionario a quantidade de funcionários que trabalham na Loja Âncora Externa
     */
    public LojaAncoraExterna(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    /**
     * Inicializa o estado da LojaAncoraExterna atribuindo por omissão: o número de identificação, o nome, a área e as
     * receitas referentes ao ano anterior da mesma.
     */
    public LojaAncoraExterna() {
        super();
        quantidadeFuncionario = QUANTIDADE_FUNCIONARIO_OMISSAO;
    }

    /**
     * Devolve a quantidade de funcionários da Loja Âncora Externa.
     *
     * @return a quantidade de funcionários da Loja Âncora Externa.
     */
    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    /**
     * Devolve o valor da renda fixa da Loja Âncora Externa.
     *
     * @return o valor da renda da Loja Âncora Externa.
     */
    public static double getRendaFixa() {
        return rendaFixa;
    }

    /**
     * Modifica a quantidade de funcionários da Loja Âncora Externa.
     *
     * @param quantidadeFuncionario a nova área da Loja Âncora Externa.
     */
    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    /**
     * Modifica o valor da renda fixa da Loja Âncora Externa.
     *
     * @param rendaFixa a nova área da Loja Âncora Externa.
     */
    public static void setRendaFixa(double rendaFixa) {
        LojaAncoraExterna.rendaFixa = rendaFixa;
    }

    /**
     * Devolve a descrição textual da Loja Âncora Externa.
     *
     * @return caraterísticas da Loja Âncora Externa.
     */
    @Override
    public String toString() {
        return String.format("\n %s \n Quantidade de funcioários: %d",
                super.toString().replace("----Loja Âncora----", "----Loja Âncora externa----"),
                quantidadeFuncionario);
    }

    /**
     * Devolve a área da Loja Âncora Externa.
     *
     * @return a área da Loja Âncora Externa.
     */
    @Override
    public double getArea() {
        return super.getArea();
    }

    /**
     * Devolve as receitas do ano anterior da Loja Âncora Externa.
     *
     * @return aa receitas do ano anterior da Loja Âncora Externa.
     */
    @Override
    public double getReceitasAnoAnterior() {
        return super.getReceitasAnoAnterior();
    }

    /**
     * Devolve o custo da segurança da Loja Âncora Externa.
     *
     * @return o custo da segurança da Loja Âncora Externa.
     */
    @Override
    public double custoSeguranca() {
        return super.getCustoSeguranca();
    }

    /**
     * Devolve o valor total da renda a pagar pela Loja Âncora Externa.
     *
     * @return o valor total da renda a pagar pela Loja Âncora Externa.
     */
    public double calcRenda() {

        return rendaFixa * (1 + (getArea() / 100)) + getReceitasAnoAnterior() / 100;
    }

    /**
     * Compara a LojaAncoraExterna com o objeto recebido.
     *
     * @param outroObject o objeto a comparar com a Loja Ancora Externa.
     * @return true se o objeto recebido representar outra Loja Ancora Externa equivalente à Loja Ancora Externa.
     * Caso contrário, retorna false.
     *
     */
    @Override
    public boolean equals(Object outroObject) {
        if (!super.equals(outroObject)) {
            return false;
        }
        LojaAncoraExterna outraLojaAncoraExterna = (LojaAncoraExterna) outroObject;
        return quantidadeFuncionario == outraLojaAncoraExterna.quantidadeFuncionario;
    }
}