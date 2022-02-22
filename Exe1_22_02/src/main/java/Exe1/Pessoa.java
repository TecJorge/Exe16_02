package Exe1;

abstract class Pessoa {
    String nome;
    int iDCivil;
    private  static String Nome_Default="SemNome";
    private static int iD_Default=9999999;
    Pessoa(String nome , int iDCivil){
        this.nome=nome;
        this.iDCivil=iDCivil;
    }
    Pessoa(){
        nome=Nome_Default;
        iDCivil=iD_Default;
    }

    public String getNome() {
        return nome;
    }
    public int getiDCivil() {
        return iDCivil;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setiDCivil(int iDCivil) {
        this.iDCivil = iDCivil;
    }

    @Override
    public String toString() {
       return String.format("O %s com o numero de identificaçao civil %d é %s",nome,iDCivil,this.getClass().getSimpleName());
    }
}
