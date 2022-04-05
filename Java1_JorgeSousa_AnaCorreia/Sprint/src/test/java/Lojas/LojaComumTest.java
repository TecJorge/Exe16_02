package Lojas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Testes da Classe LojaComum
 */
class LojaComumTest {
    /**
     * Declaracao de variaveis a ser usadas nos Testes da Classe LojaComum
     */
    private Loja loja1, loja2, loja3;
    public LojaComumTest() {

    }
    /**
     * Instaciamento dos objetos antes de qualquer Teste
     */
    @BeforeEach
    void setUp() {
        loja1 = new LojaComumRestauracao(18, "FNAC", 150, 10750, 23, 800, 25);
        loja2 = new LojaAncoraExterna(15, "Publigon", 90, 1030, 70, 2);
        loja3 = new LojaComumRestauracao(18, "FNAC", 150, 10750, 23, 800, 25);

    }


    /**
     * Teste ao método equals da classe LojaComum.
     */
    @Test
    void testEqualsSuper() {
        System.out.println("equals1");
        boolean result = loja1.equals(loja2);
        assertFalse(result);
    }

    /**
     * Teste ao método equals da classe LojaComum.
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