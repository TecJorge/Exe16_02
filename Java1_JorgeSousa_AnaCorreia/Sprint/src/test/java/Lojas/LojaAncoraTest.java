package Lojas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Testes da Classe LojaAncora
 */
class LojaAncoraTest {
    /**
     * Declaracao de variaveis a ser usadas nos Testes da Classe LojaAncora
     */
    private LojaAncora loja1, loja2, loja3;
    public LojaAncoraTest() {
    }
    /**
     * Instaciamento dos objetos antes de qualquer Teste
     */
    @BeforeEach
    void setUp() {
        loja1 = new LojaAncora(12, "FNAC", 100, 10000, 2500);
        loja2 = new LojaAncora(10, "Publigon", 70, 1000, 200);
        loja3 = new LojaAncora(12, "FNAC", 100, 10000, 2500);
    }

    /**
     * Teste ao método custoSeguranca da classe LojaAncora.
     */
    @Test
    void testCustoSeguranca() {

        System.out.println("CustoSegurança");
        double expResult = 2500;
        double result = loja1.custoSeguranca();
        assertEquals(expResult, result, 0.005);
    }

        /**
         * Teste ao método equals da classe LojaAncora.
         */
        @Test
        public void testEqualsClass() {
            boolean result = loja1.equals(loja2);
            assertFalse(result);
        }

        /**
         * Teste ao método equals da classe LojaAncora.
         */
        @Test
        void testEqualsSuper() {
            System.out.println("equals1");
            boolean result = loja1.equals(loja2);
            assertFalse(result);
        }

        /**
         * Teste ao método equals da classe LojaAncora.
         */
        @Test
        void testEqualsNull() {
            System.out.println("equals");
            assertFalse(loja1.equals(null));
        }

        /**
         * Teste ao método equals da classe LojaAncora.
         */
        @Test
        void testEqualsOthers() {
            System.out.println("equals2");
            boolean result = loja1.equals(loja2);
            assertFalse(result);
        }

        /**
         * Teste ao método equals da classe LojaAncora.
         */
        @Test
        void testEqualsOthers2() {
            System.out.println("equals2");
            boolean result = loja1.equals(loja3);
            assertTrue(result);
    }
}