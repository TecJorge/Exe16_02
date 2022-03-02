package Lojas;

public class ComumQuiosque extends LojaComum implements Renda {

    private double renda;
    private static final double RENDA_OMISSAO = 250;

    public ComumQuiosque(int numID, String nome, double area, double receitasAnoAnterior,
                         int quantidadeFuncionario, double renda) {
        super(numID, nome, area, receitasAnoAnterior, quantidadeFuncionario);
        this.renda = renda;
    }

    public ComumQuiosque(double renda) {
        this.renda = renda;
    }

    public ComumQuiosque() {
        super();
        renda = RENDA_OMISSAO;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public int getQuantidadeFuncionario() {
        return super.getQuantidadeFuncionario();
    }

    @Override
    public double calcRenda() {
        return renda;
    }
}
