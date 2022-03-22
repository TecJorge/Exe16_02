import org.upskill.utils.Data;
import org.upskill.utils.Tempo;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Data atual= Data.dataAtual();
        Data pos = new Data(2019,10,01);
        Tempo temp1 = new Tempo(9,00,00);
        Tempo temp2 = new Tempo(18,00,00);
        System.out.println(atual);
        Empregado emp1 = new Empregado("Aj","Nabo",atual,temp1,temp2);
        Empregado emp2 = new Empregado("Ken","Nabo",atual,temp1,temp2);
        emp1.getHoraEntrada().equals(emp2.getHoraEntrada());
        emp1.getHoraSaida().equals(emp2.getHoraSaida());
        emp1.getDataContrato().equals(emp2.getDataContrato());
        emp1.setDataContrato(pos);
        emp1.setHoraEntrada(Tempo.tempoAtual());
        System.out.println(emp1);
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(pos);
        System.out.println(emp2);
        ArrayList <Empregado> cont=new ArrayList<>();
        cont.add(emp1);
        cont.add(emp2);
        for (Empregado x:cont
             ) {
            System.out.println(x);
        }
        for (Empregado x:cont
        ) {
            System.out.println(String.format("\nO Empregado %s , trabalha %s horas por semana e esta contrado ha %s dias\n",x.getPrimeiroNome(),x.horasSemanais(),x.tempoDeCasa()));
        }
    }


}
