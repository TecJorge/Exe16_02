package Lojas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Testes da Classe LojaComumRestauração
 */
class LojaComumRestauracaoTest {
    /**
     * Declaracao de variaveis a ser usadas nos Testes da Classe LojaComumRestaruração
     */
    private LojaComumRestauracao loja1, loja2, loja3;
    public LojaComumRestauracaoTest() {

    }
    /**
     * Instaciamento dos objetos antes de qualquer Teste
     */
    @BeforeEach
    void setUp() {
        loja1 = new LojaComumRestauracao(18, "FNAC", 150, 10750, 23, 800, 25);
        loja2 = new LojaComumRestauracao(15, "Publigon", 90,1030,70,5,5);
        loja3 = new LojaComumRestauracao(18, "FNAC", 150, 10750, 23, 800, 25);

    }

    /**
     * Teste ao método custoSeguranca da classe LojaComumRestauracao.
     */
    @Test
    void custoSeguranca() {
        System.out.println("Custo Segurança");
        double expResult = 125;
        double result = loja1.custoSeguranca();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Teste ao método equals da classe LojaComumRestauracao.
     */
    @Test
    void calcRenda() {
        System.out.println("Calcular Renda");
        double expResult = 5107.5;
        double result = loja1.calcRenda();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Teste ao método equals da classe LojaComumRestauracao.
     */
    @Test
    void testEqualsSuper() {
        System.out.println("equals1");
        boolean result = loja1.equals(loja2);
        assertFalse(result);
    }

    /**
     * Teste ao método equals da classe LojaComumRestauracao.
     */
    @Test
    void testEqualsNull() {
        System.out.println("equals");
        assertFalse(loja1.equals(null));
    }

    /**
     * Teste ao método equals da classe LojaComumRestauracao.
     */
    @Test
    void testEquals() {

        System.out.println("equals2");
        boolean result = loja1.equals(loja2);
        assertFalse(result);
    }

    /**
     * Teste ao método equals da classe LojaComumRestauracao.
     */
    @Test
    void testEquals2() {
        System.out.println("equals2");
        boolean result = loja1.equals(loja3);
        assertTrue(result);
    }
}