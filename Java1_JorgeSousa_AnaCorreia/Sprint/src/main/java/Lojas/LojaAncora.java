package Lojas;

import java.util.Objects;

/**
 * Representa uma Loja do tipo Âncora através do seu número de identificação, nome, área
 * receitas do ano anterior e custo de segurança.
 */

public class LojaAncora extends Loja implements CustoSeguranca {

    /**
     * O valor gasto pela Loja Âncora para segurança.
     */
    private double custoSeguranca;

    /**
     * O valor gasto pela Loja Âncora para segurança, por omissão.
     */
    private static final double CUSTO_SEGURANCA_OMISSAO = 500;

    /**
     * Contador que permite obter a quantidade de lojas Âncora
     * criadas (classe LojaAncora e subclasse LojaAncoraExterna).
     */
    private static int contador = 0;

    /**
     * * Constrói uma instância de LojaAncora, recebendo: o número de identificação, o nome, a área, as
     * receitas referentes ao ano anterior da mesma e o custo de segurança.
     *
     * @param numID               o número de identificação da Loja Ancora
     * @param nome                o nome da Loja Ancora
     * @param area                a área da Loja Ancora
     * @param receitasAnoAnterior as receitas do ano anterior da Loja Ancora
     * @param custoSeguranca      o custo de segurança da Loja Ancora
     */
    public LojaAncora(int numID, String nome, double area, double receitasAnoAnterior, double custoSeguranca) {
        super(numID, nome, area, receitasAnoAnterior);
        this.custoSeguranca = custoSeguranca;
        contador++;
    }

    /**
     * Inicializa o estado da LojaAncora atribuindo por omissão: o número de identificação, o nome, a área, as
     * receitas referentes ao ano anterior da mesma e o custo de segurança.
     */
    public LojaAncora() {
        super();
        custoSeguranca = CUSTO_SEGURANCA_OMISSAO;
        contador++;
    }

    /**
     * Devolve o valor gasto com segurança pela Loja Âncora
     *
     * @return o custo de segurança da Loja Âncora.
     */
    public double getCustoSeguranca() {
        return custoSeguranca;
    }

    /**
     * Devolve a quantidade de lojas criadas do tipo Loja Âncora e Loja Âncora Externa.
     *
     * @return a quantidade de lojas criadas do tipo Loja Âncora e Loja Âncora Externa.
     */
    public static int getContador() {
        return contador;
    }

    /**
     * Modifica o custo de segurança da Loja Âncora.
     *
     * @param custoSeguranca novo custo de segurança da Loja Âncora.
     */
    public void setCustoSeguranca(double custoSeguranca) {
        this.custoSeguranca = custoSeguranca;
    }

    /**
     *Devolve o custo de segurança a pagar pela Loja Âncora
     *
     * @return o custo de segurança a pagar pela Loja Âncora
     */
    @Override
    public double custoSeguranca() {
        return custoSeguranca;
    }


    /**
     * Devolve a descrição textual da Loja Âncora.
     *
     * @return caraterísticas da Loja Âncora.
     */
    @Override
    public String toString() {
        return String.format("\n----Loja Âncora----\n %s\n Custo de Segurança: %.2f€",
                super.toString(), custoSeguranca);
    }

    /**
     * Compara a LojaAncora com o objeto recebido.
     *
     * @param outroObject o objeto a comparar com a Loja Âncora.
     * @return true se o objeto recebido representar outra Loja Âncora equivalente à Loja Âncora.
     * Caso contrário, retorna false.
     * *
     */
    @Override
    public boolean equals(Object outroObject) {
        if (!super.equals(outroObject)) {
            return false;
        }
        LojaAncora outraLojaAncora = (LojaAncora) outroObject;
        return custoSeguranca == outraLojaAncora.custoSeguranca;
    }
}

