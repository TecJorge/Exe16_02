import Lojas.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Testes da Classe CentroComercial
 */
class CentroComercialTest {
    /**
     * Teste ao metodo de Adiconar Loja
     */
    @org.junit.jupiter.api.Test
    void AdicionarLoja() {
        CentroComercial c1=new CentroComercial();
        c1.AdicionarLoja(new LojaAncoraExterna(4, "Adudas", 15, 2000, 300, 3));
        assertTrue(c1.getLista().contains(new LojaAncoraExterna(4, "Adudas", 15, 2000, 300, 3)));
    }
    /**
     * Teste ao metodo de obter o numero de Lojas
     */
    @org.junit.jupiter.api.Test
    void nLojas() {
        CentroComercial c1=new CentroComercial();
        int ExpRes=1;
        c1.AdicionarLoja(new Loja());
        int result=c1.nLojas();
        assertEquals(ExpRes,result);
    }
    /**
     * Teste ao metodo de calcular o valor total das Rendas do Tipo Ancora
     */
    @org.junit.jupiter.api.Test
    void totalPagarRendaAncora() {
        CentroComercial c1=new CentroComercial();
        c1.AdicionarLoja(new LojaAncoraExterna(4, "Adudas", 15, 2000, 300, 3));
        double result=c1.totalRendaAncora();
        double expres=2320;
        assertEquals(expres,result);}
    /**
     * Teste ao metodo de calcular o valor total das Rendas do Tipo Comum
     */
    @org.junit.jupiter.api.Test
    void totalPagarRendasComuns() {
        CentroComercial c1=new CentroComercial();
        c1.AdicionarLoja(new LojaComumRestauracao(5, "TacoBell", 70, 9000, 18, 10, 10));
        double result=c1.totalRendaLojasComuns();
        double expres=3490;
        assertEquals(expres,result);}

    /**
     * Teste ao metodo de calcular o valor total dos CustosSeguranca
     */
    @org.junit.jupiter.api.Test
    void totalPagarSeguranca() {
        CentroComercial c1=new CentroComercial();
        c1.AdicionarLoja(new LojaComumRestauracao(5, "TacoBell", 70, 9000, 18, 10, 10));
        double result=c1.totalRendaLojasComuns();
        double expres=3490;
        assertEquals(expres,result);}
    /**
     * Teste ao metodo de calcular o valor total dos CustosSeguranca do Tipo loja Ancora
     */
    @org.junit.jupiter.api.Test
    void totalPagarCustoSegurancaAncora() {
        CentroComercial c1=new CentroComercial();
        c1.AdicionarLoja(new LojaAncoraExterna(4, "Adudas", 15, 2000, 300, 3));
        c1.AdicionarLoja(new LojaAncora(1, "Bdidas", 90, 10000, 2000));
        System.out.println(c1.getLista());
        double result=c1.totalCustoSegurancaAncora();
        double expres=2300;
        assertEquals(expres,result);}

    /**
     * Teste ao metodo de calcular o valor total dos CustosSeguranca do Tipo loja Comum
     */
    @org.junit.jupiter.api.Test
    void totalPagarCustoSegurancaComum() {
        CentroComercial c1=new CentroComercial();
        c1.AdicionarLoja(new LojaComumRestauracao(5, "TacoBell", 70, 9000, 18, 10, 10));
        double result=c1.totalCustoSegurancaComum();
        double expres=50;
        assertEquals(expres,result);
    }
    /**
     * Teste ao metodo de calcular o valor total a Receber pelo CentroComercial
     */
    @org.junit.jupiter.api.Test
    void totalReceitas() {
        CentroComercial c1=new CentroComercial();
        c1.AdicionarLoja(new LojaComumRestauracao(5, "TacoBell", 70, 9000, 18, 10, 10));
        double result=c1.totalReceitas();
        double expres=3540;
        assertEquals(expres,result);
    }
    /**
     * Teste ao metodo ordenar o Arraylist Alfabeticamente pelo Nome da Loja Crescente
     */
    @org.junit.jupiter.api.Test
    void ordenarLista() {
        CentroComercial c1=new CentroComercial();
        CentroComercial c2=new CentroComercial();
        c1.AdicionarLoja(new LojaAncora(5,"a",5,6,7));
        c1.AdicionarLoja(new LojaAncora(5,"d",5,6,7));
        c1.AdicionarLoja(new LojaAncora(5,"e",5,6,7));
        c1.AdicionarLoja(new LojaAncora(5,"b",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"a",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"b",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"d",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"e",5,6,7));
        c1.ordenarLista();
        assertArrayEquals(c1.getLista().toArray(),c2.getLista().toArray());
    }
    /**
     * Teste ao metodo ordenar o Arraylist pelo Tipo de Loja(Crescente) e pela Area da Loja (Decrescente)
     */
    @org.junit.jupiter.api.Test
    void ordenarTipoeArea() {
        CentroComercial c1=new CentroComercial();
        CentroComercial c2=new CentroComercial();
        c1.AdicionarLoja(new LojaAncoraExterna(5,"a",1,6,7,2));
        c1.AdicionarLoja(new LojaAncoraExterna(5,"a",2,6,7,1));
        c1.AdicionarLoja(new LojaAncora(5,"a",3,6,7));
        c1.AdicionarLoja(new LojaAncora(5,"a",4,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"a",4,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"a",3,6,7));
        c2.AdicionarLoja(new LojaAncoraExterna(5,"a",2,6,7,1));
        c2.AdicionarLoja(new LojaAncoraExterna(5,"a",1,6,7,2));
        c1.ordenarTipoeArea();
        assertArrayEquals(c1.getLista().toArray(),c2.getLista().toArray());
    }
    /**
     * Teste ao metodo para remover determinada loja do ArrayList
     */
    @org.junit.jupiter.api.Test
    void removerLoja() {
        CentroComercial c1=new CentroComercial();
        c1.removerLoja(new LojaAncoraExterna(4, "Adudas", 15, 2000, 300, 3));
        assertFalse(c1.getLista().contains(new LojaAncoraExterna(4, "Adudas", 15, 2000, 300, 3)));
    }

    @org.junit.jupiter.api.Test
    /**
     * Teste ao metodo para ler o Ficheiro existente na root do Projeto
     */
    void lerFicheiro() throws FileNotFoundException {
        CentroComercial c2=new CentroComercial();
        CentroComercial c1=new CentroComercial();
        c2.AdicionarLoja(new LojaAncora(5,"a",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"b",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"d",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"e",5,6,7));
        c2.CriarFicheiro();
        c1.LerFicheiro();
        assertArrayEquals(c1.getLista().toArray(),c2.getLista().toArray());
        File obj = new File("Resultados.txt");
        obj.delete();
    }

    @org.junit.jupiter.api.Test
    /**
     * Teste ao metodo para Criar o Ficheiro na root do Projeto
     */
    void criarFicheiro() throws FileNotFoundException {
        CentroComercial c2=new CentroComercial();
        c2.AdicionarLoja(new LojaAncora(5,"a",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"b",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"d",5,6,7));
        c2.AdicionarLoja(new LojaAncora(5,"e",5,6,7));
        c2.CriarFicheiro();
        File path= new File("Resultados.txt");
        assertTrue(path.exists());
        path.delete();
    }
}