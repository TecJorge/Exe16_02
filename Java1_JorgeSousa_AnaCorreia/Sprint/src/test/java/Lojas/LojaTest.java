package Lojas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Testes da Classe Loja
 */
class LojaTest {

    /**
     * Declaracao de variaveis a ser usadas nos Testes da Classe Loja
     */
    private Loja loja1, loja2, loja3, loja4;

    public LojaTest() {

    }
    /**
     * Instaciamento dos objetos antes de qualquer Teste
     */
    @BeforeEach
    void setUp() {
        loja1 = new Loja(1, "FNAC", 90, 2050);
        loja2 = new Loja(27, "Publigon", 140, 2410);
        loja3 = new Loja(1, "FNAC", 90, 2050);
        loja4 = new Loja(1, "FNAC", 10, 2050);
    }
    /**
     * Teste ao método classificacao da classe Loja.
     */
    @Test
    void classificacaoAreaPequena() {
        System.out.println("Classificação da Área");
        String expResult = "Pequena";
        String res = loja4.classificacaoArea();
        assertTrue(expResult.equalsIgnoreCase(res));
    }

    /**
     * Teste ao método classificacao da classe Loja.
     */
    @Test
    void classificacaoAreaMedia() {
        System.out.println("Classificação da Área");
        String expResult = "Média";
        String res = loja1.classificacaoArea();
        assertTrue(expResult.equalsIgnoreCase(res));
    }

    /**
     * Teste ao método classificacao da classe Loja.
     */
    @Test
    void classificacaoAreaGrande() {
        System.out.println("Classificação da Área");
        String expResult = "Grande";
        String res = loja2.classificacaoArea();
        assertTrue(expResult.equalsIgnoreCase(res));
    }

    /**
     * Teste ao método equals da classe Loja.
     */
    @Test
    void testEqualsSuper() {
        System.out.println("equals1");
        boolean result = loja1.equals(loja2);
        assertFalse(result);
    }
    /**
     * Teste ao método equals da classe Loja.
     */
        @Test
        public void testEqualsThis() {
            System.out.println("equals");
            boolean result = loja1.equals(loja1);
            assertTrue(result);
        }

        /**
         * Teste ao método equals da classe Loja.
         */
        @Test
        void testEqualsNull() {
            System.out.println("equals");
            assertFalse(loja1.equals(null));
        }

        /**
         * Teste ao método equals da classe Loja.
         */
        @Test
        void testEquals() {
            System.out.println("equals");
            boolean expResult = true;
            boolean result = ((loja1.getNumID()) == (loja3.getNumID())) &&
                    ((loja1.getNome()).equals(loja3.getNome())) &&
                    ((loja1.getArea()) == (loja3.getArea())) &&
                    ((loja1.getReceitasAnoAnterior()) == (loja3.getReceitasAnoAnterior()));
            assertEquals(expResult, result);

        }

        /**
         * Teste ao método equals da classe Loja.
         */
        @Test
        void testEquals2() {
            System.out.println("equals");
            boolean expResult = false;
            boolean result = ((loja1.getNumID()) == (loja2.getNumID())) &&
                    ((loja1.getNome()).equals(loja2.getNome())) &&
                    ((loja1.getArea()) == (loja2.getArea())) &&
                    ((loja1.getReceitasAnoAnterior()) == (loja2.getReceitasAnoAnterior()));
            assertEquals(expResult, result);
        }
    /**
     * Teste ao método Compare da classe Loja.
     */
        @Test
        void compareTo() {
            int expResult = 0;
            int result = loja1.getNome().compareTo(loja3.getNome());
            assertEquals(expResult, result);
        }

        /**
         * Teste ao método compareTo da classe Loja.
         */
        @Test
        public void testCompareTo2() {
            System.out.println("compareTo");
            int expResult = 0;
            int result = loja1.getNome().compareTo(loja2.getNome());
            System.out.println(result);
            assertTrue(expResult > result);
        }

        /**
         * Teste ao método compareTo da classe Loja.
         */
        @Test
        public void testCompareTo3() {
            System.out.println("compareTo");
            int expResult = 0;
            int result = loja2.getNome().compareTo(loja1.getNome());
            System.out.println(result);
            assertTrue(expResult < result);
        }

    }