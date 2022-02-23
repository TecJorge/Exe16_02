package Exe1;

public class AlunoBolsa extends Aluno implements PagamentoMensal {
    double bolsa;
    static final double bolsa_Default=500;
    AlunoBolsa(String nome , int id , int num , int bolsa){
        super(nome,id,num);
        this.bolsa=bolsa;
    }
    AlunoBolsa(){
        super();
        bolsa=bolsa_Default;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getiDCivil() {
        return super.getiDCivil();
    }

    @Override
    public int getnMecano() {
        return super.getnMecano();
    }

    public double getBolsa() {
        return bolsa;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setiDCivil(int iDCivil) {
        super.setiDCivil(iDCivil);
    }

    @Override
    public void setnMecano(int nMecano) {
        super.setnMecano(nMecano);
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return  String.format("%s tem uma bolsa de %.2f Eur \n",super.toString().replace("\n",","),bolsa);
    }

    @Override
    public double calcPagMensal() {
        return bolsa;
    }
}
