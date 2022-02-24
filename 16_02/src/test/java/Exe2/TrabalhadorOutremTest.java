package Exe2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrabalhadorOutremTest {

        @Test
        void impostosInf() {
            double expRes = 201.5;
            double Res=0;
            TrabalhadorOutrem o1 = new TrabalhadorOutrem("teste", "teste", 100, 120);
            Res = o1.Impostos();
            assertEquals(Res, expRes, 0.2);
        }
    @Test
    void impostosSup() {
        double expRes = 10002.40;
        double Res=0;
        TrabalhadorOutrem to1 = new TrabalhadorOutrem("Gracinda da Meo", "Rua de Tras", 500000, 120);
        Res = to1.Impostos();
        assertEquals(Res, expRes, 0.2);
    }
    }
