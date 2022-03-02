package Lojas;

import java.util.Objects;

public class AncoraExterna extends LojaAncora implements CustoSeguranca, Renda {

    private int quantidadeFuncionario;

    private static final int QUANTIDADE_FUNCIONARIO_OMISSAO = 0;

    public AncoraExterna(int numID, String nome, double area,
                         double receitasAnoAnterior, double custoSeguranca, int quantidadeFuncionario) {
        super(numID, nome, area, receitasAnoAnterior, custoSeguranca);
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public AncoraExterna(double custoSeguranca, int quantidadeFuncionario) {
        super(custoSeguranca);
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public AncoraExterna(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public AncoraExterna() {
        super();
    }

    private static double rendaFixa = 2000;

    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    public static double getRendaFixa() {
        return rendaFixa;
    }

    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public static void setRendaFixa(double rendaFixa) {
        AncoraExterna.rendaFixa = rendaFixa;
    }

    @Override
    public String toString() {
        return String.format("Loja Âncora externa\n%s\n Quantidade de funcioários: %d",
                quantidadeFuncionario);
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
        return getCustoSeguranca();
    }

    public double calcRenda() {

        return rendaFixa * (1 + (getArea() / 100)) + getReceitasAnoAnterior() / 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AncoraExterna)) return false;
        if (!super.equals(o)) return false;
        AncoraExterna that = (AncoraExterna) o;
        return quantidadeFuncionario == that.quantidadeFuncionario;
    }
}
