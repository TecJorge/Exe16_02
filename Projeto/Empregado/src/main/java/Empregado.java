
import org.upskill.utils.Data;
import org.upskill.utils.Tempo;

public class Empregado {
    private String primeiroNome, ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada,horaSaida;
    private final String nome_Default="Indefenido";
    private final String apelido_Default="Indefenido";

    Empregado (String primeiroNome,String ultimoNome,Data dataContrato,Tempo horaEntrada,Tempo horaSaida){
        this.dataContrato=dataContrato;
        this.primeiroNome=primeiroNome;
        this.ultimoNome=ultimoNome;
        this.horaEntrada=horaEntrada;
        this.horaSaida=horaSaida;
    }
    Empregado(){
        this.horaSaida=new Tempo();
        this.horaEntrada=new Tempo();
        this.primeiroNome=nome_Default;
        this.ultimoNome=apelido_Default;
        this.dataContrato=new Data();
    }

    public Data getDataContrato() {
        return dataContrato;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    public Tempo getHoraSaida() {
        return horaSaida;
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = dataContrato;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    @Override
    public String toString() {
    return String.format("\nO Trabalhador %s %s entra as %s , e sai as %s o seu contrato foi assinado em : %s\n",primeiroNome,ultimoNome,horaEntrada.toString(),horaSaida.toString(),dataContrato.toString());}

    public int horasSemanais(){
       return (horaEntrada.diferencaEmTempoSemana(horaSaida)).getHoras();
    }
    public int tempoDeCasa(){
        return Data.dataAtual().diferenca(dataContrato);
    }
}
