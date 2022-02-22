package Exe1;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @org.junit.jupiter.api.Test
    void calcPagMensal() {
        Professor instance = new Professor("Teste",99999,"Coordenador");
        double expectRes=2250;
    }
}