package Lojas;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Teste da Classe Compare
 */
class CompareTest {

    /**
     * Teste da Classe compare onde o resultado expectavel é um valor inferior a 0
     */
    @Test
    public void compare() {
        Loja o1=new Loja(1,"a",3,5);
      LojaAncoraExterna  o2=new LojaAncoraExterna(1,"b",3,5,1,3);
        int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        assertTrue(result<0);
    }
    /**
     * Teste da Classe compare onde o resultado expectavel é um valor superior a 0
     */
    @Test
    public void compare1() {
        LojaComumRestauracao o1=new LojaComumRestauracao(1,"a",3,5,3,3,3);
       LojaAncoraExterna o2=new LojaAncoraExterna(1,"b",3,5,1,3);
        int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        assertTrue(result>0);
    }
    /**
     * Teste da Classe compare onde o resultado expectavel é um valor igual a 0
     */
    @Test
    public void compare2() {
       Loja o1=new Loja(1,"a",3,5);
        Loja o2=new Loja(1,"b",3,5);
        int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        assertTrue(result==0);
        }
    /**
     * Teste da Classe compare onde o resultado expectavel primeiramente é um valor igual a 0 e de seguida um valor inferior a 0
     */
    @Test
    public void compare3() {
       LojaAncoraExterna o1 = new LojaAncoraExterna(1, "a", 4, 5, 3, 3);
        LojaAncoraExterna o2 = new LojaAncoraExterna(1, "b", 3, 5, 1, 3);

        int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        if (result == 0) {
        }
        assertTrue((o2.getArea() - o1.getArea()) < 0);
    }
    /**
     * Teste da Classe compare onde o resultado expectavel primeiramente é um valor igual a 0 e de seguida um valor superior a 0
     */
    @Test
    public void compare4() {
       LojaAncoraExterna o1=new LojaAncoraExterna(1,"a",4,5,3,3);
        LojaAncoraExterna o2=new LojaAncoraExterna(1,"b",5,5,1,3);

        int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        if (result == 0) {
        }
        assertTrue((o2.getArea()-o1.getArea())>0);
    }
    /**
     * Teste da Classe compare onde o resultado expectavel primeiramente é um valor igual a 0 e de seguida um valor igual a 0
     */
    @Test
    public void compare5() {
       LojaAncoraExterna o1=new LojaAncoraExterna(1,"a",4,5,3,3);
       LojaAncoraExterna o2=new LojaAncoraExterna(1,"b",4,5,1,3);

        int result = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        if (result == 0) {
        }
        assertTrue((o2.getArea()-o1.getArea())==0);
    }

}