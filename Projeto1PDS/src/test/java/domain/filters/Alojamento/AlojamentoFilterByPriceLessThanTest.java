package domain.filters.Alojamento;

import domain.Alojamento;
import domain.Organizacao;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AlojamentoFilterByPriceLessThanTest {

    @Test
    void shouldAssertTrueInputStringIsSmallerThanAlojamentoPrice() throws Exception {
        Alojamento alojamentoDouble = mock(Alojamento.class);
        AlojamentoFilterByPriceLessThan alojamentoFilterDouble= new AlojamentoFilterByPriceLessThan();
        String inputString="2";
        when(alojamentoDouble.getPreco()).thenReturn(3.0);
        boolean expectedResult=alojamentoFilterDouble.complies(alojamentoDouble,inputString);
        assertTrue(expectedResult);
    }
    @Test
    void shouldAssertFalseWhenInputStringIsBiggerThanAlojamentoPrice() throws Exception {
        Alojamento alojamentoDouble = mock(Alojamento.class);
        AlojamentoFilterByPriceLessThan alojamentoFilterDouble= new AlojamentoFilterByPriceLessThan();
        String inputString="4";
        when(alojamentoDouble.getPreco()).thenReturn(3.0);
        boolean expectedResult=alojamentoFilterDouble.complies(alojamentoDouble,inputString);
        assertFalse(expectedResult);
    }
    @Test
    void shouldThrowExceptionWhenInputStringIsNegativeNumber() throws Exception {
        Alojamento alojamentoDouble = mock(Alojamento.class);
        AlojamentoFilterByPriceLessThan alojamentoFilterDouble= new AlojamentoFilterByPriceLessThan();
        String inputString="-4";
        when(alojamentoDouble.getPreco()).thenReturn(3.0);
        assertThrows(Exception.class, () -> {
            alojamentoFilterDouble.complies(alojamentoDouble,inputString);
        });
    }
        @Test
        void shouldThrowExceptionWhenInputStringIsEmpty() throws Exception {
            Alojamento alojamentoDouble = mock(Alojamento.class);
            AlojamentoFilterByPriceLessThan alojamentoFilterDouble= new AlojamentoFilterByPriceLessThan();
            String inputString="";
            when(alojamentoDouble.getPreco()).thenReturn(3.0);
            assertThrows(Exception.class, () -> {
                alojamentoFilterDouble.complies(alojamentoDouble,inputString);
            });
        }
}