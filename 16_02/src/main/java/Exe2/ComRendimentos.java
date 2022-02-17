package Exe2;

public abstract class ComRendimentos extends Contribuinte{
    private double Rendimento;
    private final double RENDIMENTO_DEFAULT=0;


    ComRendimentos(String nome , String morada ,double Rendimento,double outrosrend){
        super(nome,morada,outrosrend);
        this.Rendimento=Rendimento;
    }
    ComRendimentos(){
        super();
        Rendimento=RENDIMENTO_DEFAULT;
    }
    public void setRendimento(double rendimento) {
        Rendimento = rendimento;
    }

    public double getRendimento() {
        return Rendimento;
    }

    @Override
    public String toString() {
    return String.format("%s tem %.2f euros como rendimentos e %.2f como outros rendimentos\n",super.toString(),getRendimento(),getOutroRend());
    }
    public abstract double Impostos();
    public static double liminf=30000;
    public static double limsup=50000;

    public static double getLiminf() {
        return liminf;
    }

    public static double getLimsup() {
        return limsup;
    }

    public static void setLiminf(double liminf) {
        ComRendimentos.liminf = liminf;
    }

    public static void setLimsup(double limsup) {
        ComRendimentos.limsup = limsup;
    }
}
