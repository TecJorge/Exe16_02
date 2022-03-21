import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class SegmentoDeRetaTest {

    @org.junit.jupiter.api.Test
    void comprimento() {
        Ponto p1 = new Ponto("Zacarias",3.4,7.6);
        Ponto p2 = new Ponto("ZeManuel",5.5,8.9);
        SegmentoDeReta a = new SegmentoDeReta(p1,p2);
        double expRes=2.47;
        assertTrue(a.Comprimento()==expRes);
    }

    @org.junit.jupiter.api.Test
    void declive() {
        Ponto p1 = new Ponto("Zacarias",3.4,7.6);
        Ponto p2 = new Ponto("ZeManuel",5.5,8.9);
        SegmentoDeReta a = new SegmentoDeReta(p1,p2);
        double expRes=1.62;
        assertTrue(a.Declive()==expRes);
    }

   // @org.junit.jupiter.api.Test
    //void deslocar() {
      //  Ponto p1 = new Ponto("Zacarias",3.4,7.6);
        //Ponto p2 = new Ponto("ZeManuel",5.5,8.9);
        //SegmentoDeReta a =new SegmentoDeReta(p1,p2);
        //a.Deslocar();
        //Assert.assertTrue(p1.getX()==1&&p1.getY()==1);
    //}
}