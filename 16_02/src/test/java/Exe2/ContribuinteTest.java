package Exe2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {
    private  TrabalhadorOutrem trp1;
    private  TrabalhadorProprio trc1;
    private  Desempregado dp1;
    private  Reformado ref1;
    @BeforeEach
    void setUp() {
        trp1 = new TrabalhadorOutrem("Gracinda da Meo", "Rua de Tras", 500000, 120);
        trc1=new TrabalhadorProprio("Marilio Costa", "Rua da Frente", 5000000, 350);
        dp1= new Desempregado("teste", "teste", 120);
        ref1=new Reformado("Carlos Cruz", "Rua da Direita", 300, 120);
    }
    @Test
   void testEqualsIgual() {
        TrabalhadorOutrem est =trp1;
        assertTrue(trp1 == est);
    }
    @Test
    void testEqualsNotIgual() {
        assertFalse(trp1.equals(new TrabalhadorOutrem("Gracinda da Meo", "Rua de Tras", 500000, 120)));

    }
    @Test
    void testEqualsNull() {
        assertFalse(trp1 ==null|| trp1.getClass() != (new TrabalhadorOutrem("Gracinda da Meo", "Rua de Tras", 500000, 120).getClass()));

    }
    @Test
    void testEquals4() {
        assertFalse(Double.compare(trp1.getRendimento(), trc1.getRendimento()) == 0 && Double.compare(trp1.getOutroRend(), trc1.getOutroRend()) == 0);

    }
}