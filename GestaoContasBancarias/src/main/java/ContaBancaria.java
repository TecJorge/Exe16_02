public class ContaBancaria {
    private Cliente cliente;
    private double saldo, limite;
    private String Iban;
    private static final double saldoDefault = 0;
    private static final double limDefault = 0;
    private static final String ibanDefault = "PT50999999999999999999999";

    ContaBancaria(Cliente cliente, double saldo, double limite, String iban) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
        this.Iban = iban;
    }

    ContaBancaria() {
        this.cliente = new Cliente();
        this.saldo = saldoDefault;
        this.limite = limDefault;
        this.Iban = ibanDefault;
    }
}
