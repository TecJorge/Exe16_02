package Exe2;

public abstract class Credito {
    private String nome,profissao;
    private int montante,nMeses;
    private final String Nome_Default="SemNome";
    private final String Profissao_Default="NaoDefenido";
    private final int Montante_Default=0;
    private final int MesesDefault=0;
    Credito(String nome , String profissao, int montante,int nMeses){
        this.nome=nome;
        this.profissao=profissao;
        this.montante=montante;
        this.nMeses=nMeses;
    }
    Credito(){
        nome=Nome_Default;
        profissao=Profissao_Default;
        montante=Montante_Default;
        nMeses=MesesDefault;
    }

    public String getNome() {
        return nome;
    }

    public int getMontante() {
        return montante;
    }

    public int getnMeses() {
        return nMeses;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMontante(int montante) {
        this.montante = montante;
    }

    public void setnMeses(int nMeses) {
        this.nMeses = nMeses;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return String.format("O Cliente %s com cargo %s pediu um %s de %d Eur a ser pago em %d Meses",nome,profissao,getClass().getSimpleName(),montante,nMeses);
    }
    public abstract double calcularMontanteAReceberPorCadaCredito();
    public abstract double calcularMontanteTotalJuros();
    public abstract double calcularAmortizacao();
    public abstract double calcularTotal();
}
