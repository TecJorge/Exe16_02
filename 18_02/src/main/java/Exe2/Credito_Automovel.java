package Exe2;

public class Credito_Automovel extends Credito {
    public static double juro = 6;
    private final double juro_default = 0.1;
    public static int totalCAuto = 0;

    Credito_Automovel(String nome, String profissao, int montante, int mes) {
        super(nome, profissao, montante, mes);
        totalCAuto++;
    }

    Credito_Automovel() {
        super();
        totalCAuto++;
    }

    public static double getJuro() {
        return juro;
    }

    public static void setJuro(double juro) {
        Credito_Automovel.juro = juro;
    }


    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getMontante() {
        return super.getMontante();
    }

    @Override
    public int getnMeses() {
        return super.getnMeses();
    }

    public static int getTotalCAuto() {
        return totalCAuto;
    }

    @Override
    public String getProfissao() {
        return super.getProfissao();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setMontante(int montante) {
        super.setMontante(montante);
    }

    @Override
    public void setnMeses(int nMeses) {
        super.setnMeses(nMeses);
    }

    @Override
    public void setProfissao(String profissao) {
        super.setProfissao(profissao);
    }

    private double cTaxaAnualAuto() {
        if (getnMeses() <= 24)
            return juro - 1;
        else
            return juro;
    }
    @Override
    public String toString() {
        return String.format("%s o total de juros a ser pagos é de %d",super.toString(),calcularMontanteTotalJuros());
    }
    public double calcularAmortizacao() {
        return getMontante()-(getMontante()/getnMeses());
    }

    @Override
    public double calcularMontanteTotalJuros() {
        double juros=0, MontanteTal=0, jurosTotal=0;

        for (int i = 0; i < getnMeses(); i++) {
            if (i == 0) {
                juros = getMontante() * ((cTaxaAnualAuto() / 100) / 12);
                MontanteTal = getMontante() - calcularAmortizacao();
                jurosTotal = jurosTotal + juros;
            } else {
                juros = MontanteTal * ((cTaxaAnualAuto() / 100) / 12);
                jurosTotal = jurosTotal + juros;
                MontanteTal = MontanteTal - calcularAmortizacao();
            }
        }
        return jurosTotal;
    }

    @Override
    public double calcularMontanteAReceberPorCadaCredito () {
        return calcularMontanteTotalJuros();
            }
}

