package Exe2;

public class TrabalhadorProprio extends ComRendimentos {
    TrabalhadorProprio(String nome, String morada, double vencimento, double outrorend) {
        super(nome, morada,vencimento,outrorend);
    }

    TrabalhadorProprio() {
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
    public double getRendimento() {
        return super.getRendimento();
    }

    @Override
    public void setMorada(String morada) {
        super.setMorada(morada);
    }

    @Override
    public void setRendimento(double rendimento) {
        super.setRendimento(rendimento);
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
        if (getRendimento()<=ComRendimentos.getLimsup()){
            return getRendimento()*(getPercentRT()*(Math.pow(10,-2)))+this.getOutroRend()*(getPercentOR()*(Math.pow(10,-2)));
        }
        else
            return getRendimento()*(getPercentRT()+3*(Math.pow(10,-2)))+this.getOutroRend()*(getPercentOR()*(Math.pow(10,-2)));
    }

    public static double PercentRT = 2;
    public static double PercentOR = 2;

    public static double getPercentOR() {
        return PercentOR;
    }

    public static double getPercentRT() {
        return PercentRT;
    }

    public static void setPercentOR(double percentOR) {
        PercentOR = percentOR;
    }

    public static void setPercentRT(double percentRT) {
        PercentRT = percentRT;
    }
}