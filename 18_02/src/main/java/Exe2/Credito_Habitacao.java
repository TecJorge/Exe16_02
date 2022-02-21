package Exe2;

public class Credito_Habitacao extends Credito {
    private double spread;
    public static double Euribor = 0.1;
    private final double spread_default = 0;
    public static int countCredHab=0;

    Credito_Habitacao(String nome, String profissao, int montante, int mes, double spread){
        super(nome, profissao, montante, mes);
        this.spread = spread;
        countCredHab++;
    }

    Credito_Habitacao() {
        super();
        spread = spread_default;
        countCredHab++;
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

    @Override
    public String getProfissao() {
        return super.getProfissao();
    }

    public static double getEuribor() {
        return Euribor;
    }

    public static int getCountCredHab() {
        return countCredHab;
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

    public static void setEuribor(double euribor) {
        Euribor = euribor;
    }

    public void setSpread(int spread) {
        this.spread = spread;
    }


    public double calcularAmortizacao() {
        return (getMontante()/getnMeses());
    }

    @Override
    public String toString() {
        return String.format("%s o total de juros a ser pagos é de %.2f Eur\n",super.toString(),calcularMontanteTotalJuros());
    }

    @Override
    public double calcularMontanteTotalJuros() {
        double juros, MontanteTal=0, jurosTotal=0;

        for (int i = 0; i < getnMeses(); i++) {
            if (i == 0) {
                juros = getMontante() * ((Euribor/ 100) / 12 + ((spread / 100) / 12));
                MontanteTal = getMontante() - calcularAmortizacao();
                jurosTotal = jurosTotal + juros;
            } else {
                juros = MontanteTal * ((Euribor / 100) / 12 + ((spread / 100) / 12));
                jurosTotal = jurosTotal + juros;
                MontanteTal = MontanteTal - calcularAmortizacao();
            }
        }return jurosTotal;
    }
    @Override
    public double calcularMontanteAReceberPorCadaCredito () {
        double total=0;
        for (int i = 0; i <countCredHab ; i++) {
            total=calcularMontanteTotalJuros();
        }
        return total;
    }

    @Override
    public double calcularTotal() {
        return getMontante()+calcularMontanteTotalJuros();
    }
}