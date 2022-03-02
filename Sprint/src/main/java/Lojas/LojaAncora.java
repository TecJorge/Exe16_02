package Lojas;

public class LojaAncora extends Loja implements CustoSeguranca {

    private double custoSeguranca;

    private static final double CUSTO_SEGURANCA_OMISSAO = 500;

    public LojaAncora(int numID, String nome, double area, double receitasAnoAnterior, double custoSeguranca) {
        super(numID, nome, area, receitasAnoAnterior);
        this.custoSeguranca = custoSeguranca;
        contador++;
    }

    public LojaAncora(double custoSeguranca) {
        this.custoSeguranca = custoSeguranca;
        contador++;
    }

    public LojaAncora() {
        super();
        custoSeguranca = CUSTO_SEGURANCA_OMISSAO;
        contador++;
    }

    public static int contador = 0;

    public double getCustoSeguranca() {
        return custoSeguranca;
    }

       public static int getContador() {
        return contador;
    }
    public void setCustoSeguranca(double custoSeguranca) {
        this.custoSeguranca = custoSeguranca;
    }

    @Override
    public double custoSeguranca() {
        return custoSeguranca;
    }


//    @Override
//
//    public String toString() {
//        return String.format("%s",
//                super.toString());
//    }
}

