import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PontoTest {

    @Test
    void moverPonto() {
        Ponto p1 = new Ponto("Zacarias",3.4,7.6);
        p1.MoverPonto(1,1);
        Assert.assertTrue(p1.getX()==1&&p1.getY()==1);
    }

    @Test
    void moverx() {
        Ponto p1 = new Ponto("Zacarias",3.4,7.6);
        p1.Moverx(3);
        assertTrue(p1.getX()==6.4);
    }

    @Test
    void movery() {
        Ponto p1 = new Ponto("Zacarias",3.4,7.6);
        p1.Movery(3);
        assertTrue(p1.getX()==10.6);
    }
}