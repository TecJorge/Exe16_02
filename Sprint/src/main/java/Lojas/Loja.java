package Lojas;

public class Loja {

    private int numID;
    private String nome;
    private double area;
    private double receitasAnoAnterior;

    private static final int NUM_ID_OMISSAO = 0;
    private static final String NOME_OMISSAO = "Sem nome";
    private static final double AREA_OMISSAO = 0;
    private static final double RECEITAS_ANO_ANTERIOR_OMISSAO = 0;

    public Loja(int numID, String nome, double area, double receitasAnoAnterior) {
        this.numID = numID;
        this.nome = nome;
        this.area = area;
        this.receitasAnoAnterior = receitasAnoAnterior;
    }

    public Loja() {
        numID = NUM_ID_OMISSAO;
        nome = NOME_OMISSAO;
        area = AREA_OMISSAO;
        receitasAnoAnterior = RECEITAS_ANO_ANTERIOR_OMISSAO;
    }

    private static int limSuperiorArea = 100;
    private static int limInferiorArea = 20;

    public int getNumID() {
        return numID;
    }

    public String getNome() {
        return nome;
    }

    public double getArea() {
        return area;
    }

    public double getReceitasAnoAnterior() {
        return receitasAnoAnterior;
    }

    public static int getLimSuperiorRenda() {
        return limSuperiorArea;
    }

    public static int getLimInferiorArea() {
        return limInferiorArea;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setReceitasAnoAnterior(double receitasAnoAnterior) {
        this.receitasAnoAnterior = receitasAnoAnterior;
    }

    public static void setLimSuperiorRenda(int limSuperiorRenda) {
        Loja.limSuperiorArea = limSuperiorRenda;
    }

    public static void setLimInferiorArea(int limInferiorArea) {
        Loja.limInferiorArea = limInferiorArea;
    }

    @Override
    public String toString() {
        return String.format("ID Loja: %d\n %sNome da Loja: %s\n Area da Loja:%.2f\n " +
                "Receitas do Ano anterior:%.2f", numID, nome, area, receitasAnoAnterior);
    }


    public String classificacaoArea() {

        if (this.area < getLimInferiorArea()) {

            return "Pequena";
        }
        else if (this.area > getLimSuperiorRenda()) {
            return "Grande";
        } else return "Média";
    }

    @Override
    public boolean equals(Object outroObject) {
        if (this == outroObject) {
            return true;
    }
        if (outroObject == null || getClass() != outroObject.getClass())
            return false;

        Loja outraLoja = (Loja) outroObject;
        return numID == outraLoja.numID &&
        nome.equalsIgnoreCase(outraLoja.nome) &&
                area == outraLoja.area &&
        receitasAnoAnterior == outraLoja.receitasAnoAnterior;

}


