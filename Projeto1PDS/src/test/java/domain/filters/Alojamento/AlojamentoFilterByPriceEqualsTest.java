package domain.filters.Alojamento;

import domain.Alojamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AlojamentoFilterByPriceEqualsTest {

    @Test
    void shouldAssertTrueWhenInputStringIsEqualstoAlojamentoPrice() {
            Alojamento alojamentoDouble = mock(Alojamento.class);
            AlojamentoFilterByPriceEquals alojamentoFilterDouble= new AlojamentoFilterByPriceEquals();
            String inputString="3";
            when(alojamentoDouble.getPreco()).thenReturn(3.0);
            boolean expectedResult=alojamentoFilterDouble.complies(alojamentoDouble,inputString);
            assertTrue(expectedResult);
    }
    @Test
    void shouldAssertFalseWhenInputStringIsDifferenttoAlojamentoPrice() {
        Alojamento alojamentoDouble = mock(Alojamento.class);
        AlojamentoFilterByPriceEquals alojamentoFilterDouble= new AlojamentoFilterByPriceEquals();
        String inputString="4";
        when(alojamentoDouble.getPreco()).thenReturn(3.0);
        boolean expectedResult=alojamentoFilterDouble.complies(alojamentoDouble,inputString);
        assertFalse(expectedResult);
    }
}