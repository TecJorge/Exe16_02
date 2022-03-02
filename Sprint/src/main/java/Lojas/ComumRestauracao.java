package Lojas;

import java.util.Objects;

public class ComumRestauracao extends LojaComum implements CustoSeguranca, Renda {

    private double custoManutencao;
    private int numMesas = 0;

    private static final double CUSTO_MANUTENCAO_OMISSAO = 0;
    private static final int NUM_MESAS_OMISSAO = 0;

    public ComumRestauracao(int numID, String nome, double area, double receitasAnoAnterior,
                            int quantidadeFuncionario, double custoManutencao, int numMesas) {
        super(numID, nome, area, receitasAnoAnterior, quantidadeFuncionario);
        this.custoManutencao = custoManutencao;
        this.numMesas = numMesas;
    }

//    public ComumRestauracao(double custoManutencao, int numMesas) {
//        this.custoManutencao = custoManutencao;
//        this.numMesas = numMesas;
//    }

    public ComumRestauracao() {
        super();
    }

    private static double custoSegurancaPorMesa = 5;
    private static double rendaFixa = 2000;


    public double getCustoManutencao() {
        return custoManutencao;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public static double getCustoSegurancaPorMesa() {
        return custoSegurancaPorMesa;
    }

    public void setCustoManutencao(double custoManutencao) {
        this.custoManutencao = custoManutencao;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public static void setCustoSegurancaPorMesa(double custoSegurancaPorMesa) {
        ComumRestauracao.custoSegurancaPorMesa = custoSegurancaPorMesa;
    }

    @Override
    public String toString() {
        return String.format("Lojas de Restauração\n%s\n Numero de Mesas: %d\n Custo de Manutenção: \n%.2f",
                super.toString(), numMesas, custoManutencao);
    }

    @Override
    public int getQuantidadeFuncionario() {
        return super.getQuantidadeFuncionario();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getReceitasAnoAnterior() {
        return super.getReceitasAnoAnterior();
    }

    @Override
    public double custoSeguranca() {
        return this.numMesas * custoSegurancaPorMesa;
    }

    @Override
    public double calcRenda() {
        return rendaFixa * (1 + (getArea() / 100)) + getReceitasAnoAnterior() / 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComumRestauracao)) return false;
        if (!super.equals(o)) return false;
        ComumRestauracao that = (ComumRestauracao) o;
        return Double.compare(that.custoManutencao, custoManutencao) == 0 && numMesas == that.numMesas;
    }
}

