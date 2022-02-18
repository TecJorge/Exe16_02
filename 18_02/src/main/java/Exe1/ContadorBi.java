package Exe1;

public class ContadorBi extends Eletricidade {
        private static int ConsumoVazio;
        public static double HoraVazio = 0.066;
        public static double TaxHoraForaVazio = 0.14;
        ContadorBi(String nome, String ID, int Consumo,int ConsumoVazio) {
            super(nome, ID, Consumo);
            this.ConsumoVazio=ConsumoVazio;
        }
        ContadorBi(String ID) {
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

    public static int getConsumoVazio() {
        return ConsumoVazio;
    }

    @Override
        public void setNome(String nome) {
            super.setNome(nome);
        }

    public static void setConsumoVazio(int consumoVazio) {
        ConsumoVazio = consumoVazio;
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

    public static void setHoraVazio(double horaVazio) {
        HoraVazio = horaVazio;
    }

    public static void setTaxHoraForaVazio(double taxHoraForaVazio) {
        TaxHoraForaVazio = taxHoraForaVazio;
    }

    public static double getHoraVazio() {
        return HoraVazio;
    }

    public static double getTaxHoraForaVazio() {
        return TaxHoraForaVazio;
    }

    @Override
        public String toString() {
            return String.format("%s mais %d Kw e terá de pagar %.2f EUR\n",super.toString(),getConsumoVazio(),calcConsumo());
        }

        @Override
        public double calcConsumo() {
        return (TaxHoraForaVazio*getConsumoForaVazio())+(HoraVazio*ConsumoVazio);
        }

}
