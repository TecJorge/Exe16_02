package Lojas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Testes da Classe LojaComumQuiosque
 */
class LojaComumQuiosqueTest {
    public LojaComumQuiosqueTest() {
    }

    /**
     * Teste ao método calcRenda da classe LojaComumQuiosque.
     */
    @Test
    void calcRenda() {
        System.out.println("Calcular Renda");
        double expResult = 250;
        double result =LojaComumQuiosque.getRenda();
        assertEquals(expResult, result, 0.005);
    }
}