package Exe1;
public class Gas extends Contador{
    public static int countGas=1;
    public static double TaxGas=0.8
;    Gas (String nome , String ID, int Consumo){
        super(nome,ID+"-"+countGas,Consumo);
        countGas++;
    }
    Gas (String ID){
        super(ID);
        countGas++;
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
    public String toString() {
        return String.format("%s com o contador %s teve um consumo no mês atual de %d m3 e tem um custo de %.2f eur para pagar\n",super.toString(),super.getID(),super.getConsumoForaVazio(),calcConsumo());
    }
    @Override
    public double calcConsumo() {
        return TaxGas*super.getConsumoForaVazio();
    }
}
