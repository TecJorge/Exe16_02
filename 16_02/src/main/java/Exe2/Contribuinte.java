package Exe2;

public abstract class Contribuinte {
    private String nome,morada,tipo;
    private double outroRend;
    private static final String NOME_DEFAULT="SemNome";
    private static final String MORADA_DEFAULT="SemMorada";
    private static final double OutrosRend_Default=0;
    Contribuinte(String nome , String morada,double outroRend){
        this.nome=nome;
        this.morada=morada;
        this.outroRend=outroRend;
    }
    Contribuinte(){
        morada=MORADA_DEFAULT;
        nome=NOME_DEFAULT;
        outroRend=OutrosRend_Default;
    }
    public String getNome() {
        return nome;
    }
    public String getMorada() {
        return morada;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public double getOutroRend() {
        return outroRend;
    }
    public void setOutroRend(double outroRend) {
        this.outroRend = outroRend;
    }
    public String toString() {
        return String.format("O contribuinte %s é %s tem a seguinte morada fiscal %s",nome,getClass().getSimpleName(),morada);
    }
    public abstract double Impostos();

}
