package Lojas;

/**
 * Representa uma Loja do tipo restauração através do seu número de identificação, nome, área
 * receitas do ano anterior, número de mesas e custo de manutenção.
 */
public class LojaComumRestauracao extends LojaComum implements CustoSeguranca, Renda {

    /**
     * O custo de manutenção da Loja Restauração.
     */
    private double custoManutencao;

    /**
     * O número de mesas da Loja Restauração.
     */
    private int numMesas = 0;

    /**
     * O custo de manutenção, por omissão, da Loja Restauração.
     */
    private static final double CUSTO_MANUTENCAO_OMISSAO = 0;

    /**
     * O número de mesas, por omissão, da Loja Restauração.
     */
    private static final int NUM_MESAS_OMISSAO = 0;

    /**
     * O valor do custo de segurança por mesa da Loja Restauração.
     */
    private static double custoSegurancaPorMesa = 5;

    /**
     * O valor da renda fixa da Loja Restauração.
     */
    private static double rendaFixa = 2000;

    /**
     * /**
     * * Constrói uma instância de LojaComumRestauracao, recebendo: o número de identificação, o nome, a área, as
     * receitas referentes ao ano anterior da mesma, a quantidade de funcionários que lá trabalham,
     * o custo de manutenção e o número de mesas.
     *
     * @param numID                 o número de identificação da Loja
     * @param nome                  o nome da Loja
     * @param area                  a área da Loja
     * @param receitasAnoAnterior   as receitas do ano anterior da Loja
     * @param quantidadeFuncionario quantidade de funcionários a trabalhar na Loja
     * @param custoManutencao       custo da manutenção da Loja
     * @param numMesas              Número de mesas disponíveis na Loja
     */
    public LojaComumRestauracao(int numID, String nome, double area, double receitasAnoAnterior,
                                int quantidadeFuncionario, double custoManutencao, int numMesas) {
        super(numID, nome, area, receitasAnoAnterior, quantidadeFuncionario);
        this.custoManutencao = custoManutencao;
        this.numMesas = numMesas;
    }

    /**
     *Inicializa o estado da LojaComumRestauracao atribuindo a quantidade de funcionários que
     *trabalham na Loja Comum Restauração.
     *
     * @param custoManutencao o custo de manutenção das Lojas Restauração.
     * @param numMesas o número de mesas pertencentes à Loja Restauração.
     */
    public LojaComumRestauracao(double custoManutencao, int numMesas) {
        this.custoManutencao = custoManutencao;
        this.numMesas = numMesas;
    }

    /**
     * Inicializa o estado da Loja atribuindo por omissão: o número de identificação, o nome, a área, as
     * receitas referentes ao ano anterior da mesma, o custo de manutensão e o número de mesa.
     */
    public LojaComumRestauracao() {
        super();
        custoManutencao = CUSTO_MANUTENCAO_OMISSAO;
        numMesas = NUM_MESAS_OMISSAO;
    }

    /**
     * Devolve o custo de manutenção da Loja Restauração.
     *
     * @return O custo de manutenção da Loja Restauração.
     */
    public double getCustoManutencao() {
        return custoManutencao;
    }

    /**
     * Devolve o número de mesas da Loja Restauração.
     *
     * @return O número de mesas da Loja Restauração.
     */
    public int getNumMesas() {
        return numMesas;
    }

    /**
     * Devolve o custo gasto em segurança por cada mesa da Loja Restauração.
     *
     * @return O custo gasto em segurança por cada mesa da Loja Restauração.
     */
    public static double getCustoSegurancaPorMesa() {
        return custoSegurancaPorMesa;
    }

    /**
     * Devolve o valor da renda fixa da Loja Restauração.
     *
     * @return O valor da renda fixa da Loja Restauração.
     */
    public static double getRendaFixa() {
        return rendaFixa;
    }

    /**
     * Modifica o valor do custo de manutenção da Loja Restauração.
     *
     * @param custoManutencao o novo valor do custo de manutenção da Loja Restauração.
     */
    public void setCustoManutencao(double custoManutencao) {
        this.custoManutencao = custoManutencao;
    }


    /**
     * Modifica o número de mesas disponíveis na Loja Restauração.
     *
     * @param numMesas o novo número de mesas disponíveis na Loja Restauração.
     */
    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    /**
     * Modifica o custo da segurança por mesa na Loja Restauração.
     *
     * @param custoSegurancaPorMesa o novo custo da segurança por mesa na Loja Restauração.
     */

    public static void setCustoSegurancaPorMesa(double custoSegurancaPorMesa) {
        LojaComumRestauracao.custoSegurancaPorMesa = custoSegurancaPorMesa;
    }
    /**
     * Modifica o valor da renda fixa da Loja Restauração.
     *
     * @param rendaFixa o novo valor da renda fixa da Loja Restauração.
     */
    public static void setRendaFixa(double rendaFixa) {
        LojaComumRestauracao.rendaFixa = rendaFixa;
    }

    /**
     * Devolve a descrição textual da Loja Restauração.
     *
     * @return caraterísticas da Loja Restauração.
     */
    @Override
    public String toString() {
        return String.format("\n %s\n Numero de Mesas: %d \n Custo de Manutenção: %.2f€",
                super.toString().replace("----Loja Comum----", "----Lojas de Restauração----"),
                numMesas, custoManutencao);
    }

    /**
     * Devolve o número de funcionários da Loja Restauração.
     *
     * @return O número de funcionários da Loja Restauração.
     */
    @Override
    public int getQuantidadeFuncionario() {
        return super.getQuantidadeFuncionario();
    }

    /**
     * Devolve a área da Loja Restauração.
     *
     * @return A área da Loja Restauração.
     */
    @Override
    public double getArea() {
        return super.getArea();
    }

    /**
     * Devolve as receitas do ano anterior da Loja Restauração.
     *
     * @return As receitas do ano anterior da Loja Restauração.
     */
    @Override
    public double getReceitasAnoAnterior() {
        return super.getReceitasAnoAnterior();
    }


    /**
     * Devolve o custo de segurança total da Loja Restauração.
     *
     * @return O custo de segurança total da Loja Restauração.
     */
    @Override
    public double custoSeguranca() {
        return this.numMesas * custoSegurancaPorMesa;
    }

    /**
     * Devolve a renda total da Loja Restauração.
     *
     * @return a renda total da Loja Restauração.
     */
    @Override
    public double calcRenda() {
        return rendaFixa * (1 + (getArea() / 100)) + getReceitasAnoAnterior() / 100;
    }

    /**
     * Compara a LojaComumRestauracao com o objeto recebido.
     *
     * @param outroObject o objeto a comparar com a Loja Comum Restauração.
     * @return true se o objeto recebido representar outra Loja Comum Restauração equivalente à Loja Comum Restauração.
     * Caso contrário, retorna false.
     */
    @Override
    public boolean equals(Object outroObject) {
        if (!super.equals(outroObject)) {
            return false;
        }
        LojaComumRestauracao outraLojaComumRestauracao = (LojaComumRestauracao) outroObject;
        return Double.compare(outraLojaComumRestauracao.custoManutencao, custoManutencao) == 0 &&
                numMesas == outraLojaComumRestauracao.numMesas;
    }
}