package Exe2;

public class Desempregado extends Contribuinte {
    Desempregado(String nome, String morada, double outrorend) {
        super(nome, morada,outrorend);
    }
    Desempregado() {
        super();
    }
    @Override
    public String getMorada() {
        return super.getMorada();
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setMorada(String morada) {
        super.setMorada(morada);
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public double Impostos() {
        return getOutroRend()*(getPercentOR()*(Math.pow(10,-2)));
    }
    public static double PercentOR = 2;
    public static double getPercentOR() {
        return PercentOR;
    }
    public static void setPercentOR(double percentOR) {
        PercentOR = percentOR;
    }
}