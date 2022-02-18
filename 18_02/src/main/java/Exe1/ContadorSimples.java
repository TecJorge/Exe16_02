package Exe1;

public class ContadorSimples extends Eletricidade {
    public static double AbaixoPot = 0.13;
    public static double AcimaPot = 0.16;
    public static double KVA = 6.9;

    ContadorSimples(String nome, String ID, int Consumo, double Potencia) {
        super(nome, ID, Consumo, Potencia);
    }

    ContadorSimples(String ID) {
        super(ID);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getConsumoForaVazio() {
        return super.getConsumoForaVazio();
    }

    @Override
    public String getID() {
        return super.getID();
    }

    @Override
    public double getPotencia() {
        return super.getPotencia();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setConsumoForaVazio(int consumoForaVazio) {
        super.setConsumoForaVazio(consumoForaVazio);
    }

    @Override
    public void setID(String ID) {
        super.setID(ID);
    }

    @Override
    public void setPotencia(double potencia) {
        super.setPotencia(potencia);
    }

    public static double getAbaixoPot() {
        return AbaixoPot;
    }

    public static double getAcimaPot() {
        return AcimaPot;
    }

    public static void setAbaixoPot(double abaixoPot) {
        AbaixoPot = abaixoPot;
    }

    public static void setAcimaPot(double acimaPot) {
        AcimaPot = acimaPot;
    }

    public static void setKVA(double KVA) {
        ContadorSimples.KVA = KVA;
    }

    public static double getKVA() {
        return KVA;
    }

    @Override
    public String toString() {
        return String.format("%s e terá de pagar %.2f EUR\n",super.toString(),calcConsumo());
    }

    @Override
    public double calcConsumo() {
        if (getPotencia() < getKVA()) {
            return getConsumoForaVazio() * getAbaixoPot();
        } else
            return getConsumoForaVazio()*getAcimaPot();
    }
}
