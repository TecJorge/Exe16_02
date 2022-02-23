package Exe1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsaTest {

    @Test
    void calcPagMensal() {
        AlunoBolsa instance = new AlunoBolsa("Diogo",90,109999,650);
        double expResult=650;
        double Result=instance.calcPagMensal();
        assertEquals(expResult,Result,0.001);
    }
}