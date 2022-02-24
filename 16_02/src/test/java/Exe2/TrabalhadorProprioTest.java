package Exe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TrabalhadorProprioTest {

    @Test
    void impostosliminf() {
        double expRes = 4.60;
        double Res=0;
        TrabalhadorProprio o1 = new TrabalhadorProprio("teste", "teste", 100, 120);
            Res=o1.Impostos();
            assertEquals(Res, expRes, 0.2);
        }

        @Test
    void impostoslimiSup() {
        double expRes =10150007.00;
        double Res=0;
        TrabalhadorProprio tp1 = new TrabalhadorProprio("Marilio Costa", "Rua da Frente", 5000000, 350);
        Res=tp1.Impostos();
        assertEquals(Res, expRes, 0.2);
    }
    }
