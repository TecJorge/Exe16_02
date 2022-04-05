package Lojas;
/**
 * Representa uma Loja do tipo quiosque através do seu número de identificação, nome, área e
 * receitas do ano anterior.
 */

public class LojaComumQuiosque extends LojaComum implements Renda {
    /**
     Constrói uma instância de LojaComumQuiosque, recebendo: o número de identificação, o nome, a área, as
     * receitas referentes ao ano anterior da mesma e a quantidade de funcionários que lá trabalha.
     *
     * @param numID o número de identificação da Loja Quiosque
     * @param nome o nome da Loja Quiosque
     * @param area a área da Loja Quiosque
     * @param receitasAnoAnterior as receitas do ano anterior da Loja Quiosque
     * @param quantidadeFuncionario quantidade de funcionários trabalham na Loja Quiosque
     */

    public LojaComumQuiosque(int numID, String nome, double area, double receitasAnoAnterior,
                             int quantidadeFuncionario) {
        super(numID, nome, area, receitasAnoAnterior, quantidadeFuncionario);
    }
    /**
     * Inicializa o estado da LojaComumQuiosque atribuindo por omissão: o número de identificação, o nome, a área, as
     * receitas referentes ao ano anterior da mesma e a quantidade de funcionários lá empregados.
     */
    public LojaComumQuiosque (){
        super();
    }

    /**
     * O valor da renda fixa da Loja Quiosque.
     */
    private static double renda = 250;

    /**
     * Devolve o valor da renda da Loja Quiosque.
     *
     * @return O valor da renda da Loja Quiosque.
     */
    public static double getRenda() {
        return renda;
    }

    /**
     * Modifica o valor da renda da Loja Quiosque.
     *
     * @param renda o novo valor da renda da Loja Quiosque.
     */
    public static void setRenda(double renda) {
        LojaComumQuiosque.renda = renda;
    }

    /**
     * Devolve a descrição textual da Loja Quiosque.
     *
     * @return caraterísticas da Loja Quiosque.
     */
    @Override
    public String toString() {
        return String.format("\n %s \n Renda: %.2f€",
                super.toString().replace("----Loja Comum----", "----Loja de Quiosque----"),
                renda);
    }

    /**
     * Devolve a quantidade de funcionários da Loja Quiosque.
     *
     * @return A quantidade de funcionários da Loja Quiosque.
     */
    @Override
    public int getQuantidadeFuncionario() {
        return super.getQuantidadeFuncionario();
    }

    /**
     * Devolve o valor toral da renda Loja Quiosque.
     *
     * @return O valor toral da renda da Loja Quiosque.
     */
    @Override
    public double calcRenda() {
        return renda;
    }

}

