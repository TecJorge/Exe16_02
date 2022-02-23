package Exe1;

public class Aluno extends Pessoa {
    int nMecano;
    static final int  nMecano_Default=9999999;
    Aluno(String nome,int id,int nMecano){
        super(nome,id);
        this.nMecano=nMecano;
    }
    Aluno(){
        super();
        nMecano=nMecano_Default;
    }

    @Override
    public int getiDCivil() {
        return super.getiDCivil();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public int getnMecano() {
        return nMecano;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setiDCivil(int iDCivil) {
        super.setiDCivil(iDCivil);
    }

    public void setnMecano(int nMecano) {
        this.nMecano = nMecano;
    }

    @Override
    public String toString() {
    return String.format("%s com o numero mecanografico %d\n",super.toString(),nMecano);
    }


}
