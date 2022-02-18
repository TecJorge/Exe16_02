package Exe2;

public class Credito_Educacao extends Credito {
        private int nMesCarente;
        private final int nMesCarente_default = 0;
        public static double TaxaJuro = 2;
        private final double TaxaJuro_default = 0;
        public static int countCredEdu=0;


        Credito_Educacao(String nome, String profissao, int montante, int mes,int nMesCarente,double TaxaJuro) {
            super(nome, profissao, montante, mes);
            this.nMesCarente=nMesCarente;
            this.TaxaJuro = TaxaJuro;
            countCredEdu++;
        }

        Credito_Educacao() {
            super();
            TaxaJuro= TaxaJuro_default;
            countCredEdu++;
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
    @Override
    public String toString() {
        return String.format("%s o total de juros a ser pagos é de %d",super.toString(),calcularMontanteTotalJuros());
    }

        public double calcularAmortizacao() {
            return getMontante()-(getMontante()/getnMeses());
        }

        @Override
        public double calcularMontanteTotalJuros() {
            double juros, MontanteTal=0, jurosTotal=0;
            for (int i = 0; i <nMesCarente ; i++) {
                juros = getMontante() * ((TaxaJuro/ 100) / 12);
                jurosTotal = jurosTotal + juros;
            }
                for (int i = 0; i < (getnMeses()-nMesCarente); i++) {
                        juros = MontanteTal * ((TaxaJuro/ 100) / 12);
                        jurosTotal = jurosTotal + juros;
                        MontanteTal = MontanteTal - calcularAmortizacao();
                    }
                return jurosTotal; }
        @Override
        public double calcularMontanteAReceberPorCadaCredito () {
            return calcularMontanteTotalJuros();
        }

    public static double getTaxaJuro() {
        return TaxaJuro;
    }

    public static void setTaxaJuro(double taxaJuro) {
        TaxaJuro = taxaJuro;
    }

    public static int getCountCredEdu() {
        return countCredEdu;
    }
}

