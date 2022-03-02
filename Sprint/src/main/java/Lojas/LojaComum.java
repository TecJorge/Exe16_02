package Lojas;

import java.util.Objects;

public class LojaComum extends Loja{
    private int quantidadeFuncionario;

    private static final int QUANTIDADE_FUNCIONARIO_OMISSAO = 0;

    public LojaComum(int numID, String nome, double area, double receitasAnoAnterior, int quantidadeFuncionario) {
        super(numID, nome, area, receitasAnoAnterior);
        this.quantidadeFuncionario = quantidadeFuncionario;
        contador++;
    }

    public LojaComum(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public LojaComum (){
        super();
    }
    public static int contador = 0;


    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    public static int getContador() {
        return contador;
    }

    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    @Override
    public String toString() {
        return String.format("Loja Comum\n%s\n Quantidade de Funcionários: %d\n",
                super.toString(), quantidadeFuncionario);
    }

    @Override
    public boolean equals(Loja outraLoja) {
        if (this == outraLoja)
            return true;

        if (!(outroObject instanceof LojaComum))
            return false;

        LojaComum outraLojaComum =
                (LojaComum) outraLoja;
        if (!super.equals(outraLoja))
            return false;
        LojaComum lojaComum = (LojaComum) outraLoja;
        return quantidadeFuncionario == lojaComum.quantidadeFuncionario;
    }


}
