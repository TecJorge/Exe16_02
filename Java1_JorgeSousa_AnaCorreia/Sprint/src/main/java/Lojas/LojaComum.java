package Lojas;

import java.util.Objects;

/**
 * Representa uma Loja do tipo comun através do seu número de identificação, nome, área
 * receitas do ano anterior e quantidade de funcionários.
 */
public class LojaComum extends Loja {

    /**
     * A quantidade de funcionários da Loja Comum.
     */
    private int quantidadeFuncionario;

    /**
     * A quantidade de funcionários, por omissão, da Loja Comum.
     */
    private static final int QUANTIDADE_FUNCIONARIO_OMISSAO = 0;

    /**
     * Contador que permite obter a quantidade de lojas criadas
     * (classe LojaComum e subclasse LojaComumRestauracao e LojaComumQuiosque).
     */
    private static int contador = 0;

    /**
     * Constrói uma instância de LojaComum, recebendo: o número de identificação, o nome, a área, as
     * receitas referentes ao ano anterior da mesma e a quantidade de funcionários que lá trabalha.
     *
     * @param numID                 o número de identificação da Loja Comum
     * @param nome                  o nome da Loja Comum
     * @param area                  a área da Loja Comum
     * @param receitasAnoAnterior   as receitas do ano anterior da Loja Comum
     * @param quantidadeFuncionario quantidade de funcionários trabalham na Loja Comum
     */
    public LojaComum(int numID, String nome, double area, double receitasAnoAnterior, int quantidadeFuncionario) {
        super(numID, nome, area, receitasAnoAnterior);
        this.quantidadeFuncionario = quantidadeFuncionario;
        contador++;
    }

    /**
     *Inicializa o estado da LojaComum atribuindo a quantidade de funcionários que
     *trabalham na Loja Comum
     *
     * @param quantidadeFuncionario a quantidade de funcionários que trabalham na Loja Comum
     */
    public LojaComum(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }


    /**
     * Inicializa o estado da LojaComum atribuindo por omissão: o número de identificação, o nome, a área, as
     * receitas referentes ao ano anterior da mesma e a quantidade de funcionários.
     */
    public LojaComum() {
        super();
        quantidadeFuncionario = QUANTIDADE_FUNCIONARIO_OMISSAO;
        contador++;
    }

    /**
     * Devolve quantidade de funcionários da Loja Comum.
     *
     * @return Quantidade de funcionários da Loja Comum.
     */
    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    /**
     * Devolve a quantidade de lojas criadas do tipo Loja Comum, Loja Comum Restauração e Loja Comum Quiosque.
     *
     * @return a quantidade de lojas criadas do tipo Loja Comum, Loja Comum Restauração e Loja Comum Quiosque.
     */
    public static int getContador() {
        return contador;
    }


    /**
     * Modifica a quantidade de funcionários da Loja Comum.
     *
     * @param quantidadeFuncionario a nova quantidade de funcionarios da Loja Comum.
     */
    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    /**
     * Devolve a descrição textual da Loja Comum.
     *
     * @return caraterísticas da Loja Comum.
     */
    @Override
    public String toString() {
        return String.format("\n----Loja Comum----\n %s\n Quantidade de Funcionários: %d",
                super.toString(), quantidadeFuncionario);
    }

    /**
     * Compara a LojaComum com o objeto recebido.
     *
     * @param outroObject o objeto a comparar com a Loja Comum.
     * @return true se o objeto recebido representar outra Loja Comum equivalente à Loja Comum.
     * Caso contrário, retorna false.
     *
     */
    @Override
    public boolean equals(Object outroObject) {
        if (!super.equals(outroObject)) {
            return false;
        }
        LojaComum outraLojaComum = (LojaComum) outroObject;
        return quantidadeFuncionario == outraLojaComum.quantidadeFuncionario;

    }
}
