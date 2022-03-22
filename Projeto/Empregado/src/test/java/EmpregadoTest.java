import org.upskill.utils.Data;
import org.upskill.utils.Tempo;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @org.junit.jupiter.api.Test
    void horasSemanaisTest() {
        Data atual= Data.dataAtual();
        Tempo temp1 = new Tempo(9,00,00);
        Tempo temp2 = new Tempo(18,00,00);
        Empregado emp1 = new Empregado("Aj","Nabo",atual,temp1,temp2);
        int Expres=45;
        int res=emp1.horasSemanais();

        assertEquals(Expres,res);
    }

    @org.junit.jupiter.api.Test
    void tempoDeCasaTest() {
        Data atual= Data.dataAtual();
        Tempo temp1 = new Tempo(9,00,00);
        Tempo temp2 = new Tempo(18,00,00);
        Empregado emp1 = new Empregado("Aj","Nabo",atual,temp1,temp2);
        int expRes=0;
        int res=emp1.tempoDeCasa();
        assertEquals(expRes,res);
    }
}