package Exe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesempregadoTest {

    @Test
    void impostos() {
        double expRes = 2.5;
        double Res=0;
        Desempregado o1 = new Desempregado("teste", "teste", 120);
        Res=o1.Impostos();
        assertEquals(expRes, Res, 0.2);
    }

}