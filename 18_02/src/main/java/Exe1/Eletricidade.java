package Exe1;
public class Eletricidade extends Contador {
    private double Potencia;
    private final double Pot_Default=0;
    public static int countElect = 1;
    Eletricidade(String nome, String ID, int Consumo,double Potencia) {
        super(nome, ID + "-" + countElect, Consumo);
        this.Potencia=Potencia;
        countElect++;
    }
    Eletricidade(String nome, String ID, int Consumo) {
        super(nome, ID + "-" + countElect, Consumo);
        countElect++;
    }
    Eletricidade(String ID) {
        super(ID);
        Potencia=Pot_Default;
        countElect++;
    }
    @Override
    public void setID(String ID) {
        super.setID(ID);
    }
    public void setPotencia(double potencia) {
        Potencia = potencia;
    }
    @Override
    public void setConsumoForaVazio(int consumoForaVazio) {
        super.setConsumoForaVazio(consumoForaVazio);
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public String getID() {
        return super.getID();
    }
    @Override
    public int getConsumoForaVazio() {
        return super.getConsumoForaVazio();
    }
    public double getPotencia() {
        return Potencia;
    }

    public static int getCountElect() {
        return countElect;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public String toString() {
        return String.format("%s com o contador %s teve um consumo no mês atual de %d Kw ",super.toString(),super.getID(),super.getConsumoForaVazio());
    }
    @Override
    public double calcConsumo() {
        return 0;
    }
}