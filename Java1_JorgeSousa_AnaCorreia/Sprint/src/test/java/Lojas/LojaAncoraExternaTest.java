package Lojas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Testes da Classe LojaAncoraExterna
 */
class LojaAncoraExternaTest {

    /**
     * Declaracao de variaveis a ser usadas nos Testes da Classe LojaAncoraExterna
     */
    private LojaAncoraExterna loja1, loja2, loja3;
    public LojaAncoraExternaTest() {

    }
    /**
     * Instaciamento dos objetos antes de qualquer Teste
     */
    @BeforeEach
    void setUp() {
        loja1 = new LojaAncoraExterna(14, "FNAC", 110, 10300, 700, 22);
        loja2 = new LojaAncoraExterna(15, "Publigon", 90, 1030, 70, 2);
        loja3 = new LojaAncoraExterna(14, "FNAC", 110, 10300, 700, 22);

    }
    /**
     * Teste ao método custoSeguranca da classe LojaAncoraExterna.
     */
    @Test
    void custoSeguranca() {
        System.out.println("Custo Segurança");
        double expResult = 700;
        double result = loja1.custoSeguranca();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Teste ao método calcRenda da classe LojaAncoraExterna.
     */
    @Test
    void calcRenda() {
        System.out.println("Calcular Renda");
        double expResult = 4303;
        double result = loja1.calcRenda();
        assertEquals(expResult, result, 0.005);
    }

    /**
     * Teste ao método equals da classe LojaAncoraExterna.
     */
    @Test
    public void testEqualsClass() {
        boolean result = loja1.equals(loja2);
        assertFalse(result);
    }

    /**
     * Teste ao método equals da classe LojaAncoraExterna.
     */
    @Test
    void testEqualsSuper() {
        System.out.println("equals1");
        boolean result = loja1.equals(loja2);
        assertFalse(result);
    }
    /**
     * Teste ao método equals da classe LojaAncoraExterna.
     */
    @Test
    void testEqualsNull() {
        System.out.println("equals");
        assertFalse(loja1.equals(null));
    }
    /**
     * Teste ao método equals da classe LojaAncoraExterna.
     */
    @Test
    void testEqualsOthers() {

        boolean result = loja1.equals(loja2);
        assertFalse(result);
    }
    /**
     * Teste ao método equals da classe LojaAncoraExterna.
     */
    @Test
    void testEqualsOthers2() {
        System.out.println("equals2");
        boolean result = loja1.equals(loja3);
        assertTrue(result);
    }


}