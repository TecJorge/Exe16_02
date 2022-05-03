//package domain;
//
//import domain.Factories.*;
//import domain.filters.Alojamento.AlojamentoFilterByMaxNumberOfPeople;
//import domain.filters.Alojamento.AlojamentoFilterByMinNumberOfPeople;
//import domain.filters.Alojamento.AlojamentoFilterByNumberOfPeople;
//import domain.filters.Alojamento.AlojamentoFilterContainsDiaSemana;
//import domain.filters.AlojamentoFilter;
//import org.junit.jupiter.api.Test;
//
//import java.time.DayOfWeek;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//class OrganizacaoTest {
//
//    @Test
//    void novoAlojamento() {
//    }
//
//    @Test
//    void novoPacote() {
//    }
//
//    @Test
//    void novaAtividade() {
//    }
//
//    @Test
//    void novoLocal() {
//    }
//
//    @Test
//    void novoOAlojamento() {
//    }
//
//    @Test
//    void novoOAtividade() {
//    }
//
//    @Test
//    void validaAlujamento() {
//    }
//
//    @Test
//    void validaPacote() {
//    }
//
//    @Test
//    void validaLocal() {
//    }
//
//    @Test
//    void validaAtividade() {
//    }
//
//    @Test
//    void guardaLocal() {
//    }
//
//    @Test
//    void validaoAlujamento() {
//    }
//
//    @Test
//    void validaOAtividade() {
//    }
//
//    @Test
//    void guardaTipoAlojamento() {
//    }
//
//    @Test
//    void guardaTipoAtividade() {
//    }
//
//    @Test
//    void guardaTipoOAlojamento() {
//    }
//
//    @Test
//    void guardaAtividade() {
//    }
//
//    @Test
//    void guardaAtividadenoPacote() {
//    }
//
//    @Test
//    void guardaAlojamentonoPacote() {
//    }
//
//    @Test
//    void getTipoAlojamentoFilters() {
//    }
//
//    @Test
//    void getlistaAlojamentoFilters() {
//    }
//
//    @Test
//    void shouldReturnEqualsFiltrarAlojamentoTest() throws Exception {
//        FactoryTipoAlojamento factoryTipoAlojamentoDouble = mock(FactoryTipoAlojamento.class);
//        FactoryTipoAtividade factoryTipoAtividadeDouble = mock(FactoryTipoAtividade.class);
//        FactoryLocal factoryLocalDouble = mock(FactoryLocal.class);
//        FactoryAlojamento factoryAlojamentoDouble = mock(FactoryAlojamento.class);
//        FactoryAtividade factoryAtividadeDouble = mock(FactoryAtividade.class);
//        FactoryPacote factoryPacote=mock(FactoryPacote.class);
//
//        Organizacao organizacao = new Organizacao(new ArrayList<>(),new ArrayList<>(),factoryTipoAlojamentoDouble,factoryTipoAtividadeDouble,factoryAtividadeDouble,factoryAlojamentoDouble,factoryLocalDouble,factoryPacote);
//
//        Alojamento alojamentoDouble1 = mock(Alojamento.class);
//        when(alojamentoDouble1.getDenomincao()).thenReturn("x");
//        organizacao.guardaTipoOAlojamento(alojamentoDouble1);
//
//        Alojamento alojamentoDouble2 = mock(Alojamento.class);
//        when(alojamentoDouble2.getDenomincao()).thenReturn("y");
//        organizacao.guardaTipoOAlojamento(alojamentoDouble2);
//
//        AlojamentoFilter alojamentoFilterDouble = mock(AlojamentoFilter.class);
//        when(alojamentoFilterDouble.complies(alojamentoDouble1, "h")).thenReturn(true);
//        when(alojamentoFilterDouble.complies(alojamentoDouble2,"h")).thenReturn(false);
//
//        List<Alojamento> listaExpectavel = new ArrayList<>();
//        listaExpectavel.add(alojamentoDouble1);
//        List<Alojamento> listaFiltrada = organizacao.filtrarAlojamento(alojamentoFilterDouble, "h");
//
//        assertArrayEquals (listaFiltrada.toArray(),listaExpectavel.toArray());
//    }
//
//    @Test
//    void ShouldReturnMinimunPeopleFiltrarAlojamentoTest () throws Exception {
//        FactoryTipoAlojamento factoryTipoAlojamentoDouble = mock(FactoryTipoAlojamento.class);
//        FactoryTipoAtividade factoryTipoAtividadeDouble = mock(FactoryTipoAtividade.class);
//        FactoryLocal factoryLocalDouble = mock(FactoryLocal.class);
//        FactoryAlojamento factoryAlojamentoDouble = mock(FactoryAlojamento.class);
//        FactoryAtividade factoryAtividadeDouble = mock(FactoryAtividade.class);
//        FactoryPacote factoryPacote=mock(FactoryPacote.class);
//
//        Organizacao organizacao = new Organizacao(new ArrayList<>(),new ArrayList<>(),factoryTipoAlojamentoDouble,factoryTipoAtividadeDouble,factoryAtividadeDouble,factoryAlojamentoDouble,factoryLocalDouble,factoryPacote);
//
//        Alojamento alojamentoDouble1 = mock(Alojamento.class);
//        when(alojamentoDouble1.getQntdMin()).thenReturn(10);
//        organizacao.guardaTipoOAlojamento(alojamentoDouble1);
//
//        Alojamento alojamentoDouble2 = mock(Alojamento.class);
//        when(alojamentoDouble2.getQntdMin()).thenReturn(11);
//        organizacao.guardaTipoOAlojamento(alojamentoDouble2);
//
//        AlojamentoFilterByMinNumberOfPeople alojamentoFilterDouble = mock(AlojamentoFilterByMinNumberOfPeople.class);
//        when(alojamentoFilterDouble.complies(alojamentoDouble1, "10")).thenReturn(true);
//        when(alojamentoFilterDouble.complies(alojamentoDouble2,"10")).thenReturn(false);
//
//        List<Alojamento> listaExpectavel = new ArrayList<>();
//        listaExpectavel.add(alojamentoDouble1);
//        List<Alojamento> listaFiltrada = organizacao.filtrarAlojamento(alojamentoFilterDouble, "10");
//        assertArrayEquals (listaFiltrada.toArray(),listaExpectavel.toArray());
//    }
//    @Test
//    void ShouldReturnMaxPeopleFiltrarAlojamentoTest () throws Exception {
//        FactoryTipoAlojamento factoryTipoAlojamentoDouble = mock(FactoryTipoAlojamento.class);
//        FactoryTipoAtividade factoryTipoAtividadeDouble = mock(FactoryTipoAtividade.class);
//        FactoryLocal factoryLocalDouble = mock(FactoryLocal.class);
//        FactoryAlojamento factoryAlojamentoDouble = mock(FactoryAlojamento.class);
//        FactoryAtividade factoryAtividadeDouble = mock(FactoryAtividade.class);
//        FactoryPacote factoryPacote=mock(FactoryPacote.class);
//
//        Organizacao organizacao = new Organizacao(new ArrayList<>(),new ArrayList<>(),factoryTipoAlojamentoDouble,factoryTipoAtividadeDouble,factoryAtividadeDouble,factoryAlojamentoDouble,factoryLocalDouble,factoryPacote);
//
//        Alojamento alojamentoDouble1 = mock(Alojamento.class);
//        when(alojamentoDouble1.getQntdMin()).thenReturn(10);
//        organizacao.guardaTipoOAlojamento(alojamentoDouble1);
//
//        Alojamento alojamentoDouble2 = mock(Alojamento.class);
//        when(alojamentoDouble2.getQntdMin()).thenReturn(11);
//        organizacao.guardaTipoOAlojamento(alojamentoDouble2);
//
//        AlojamentoFilterByMaxNumberOfPeople alojamentoFilterDouble = mock(AlojamentoFilterByMaxNumberOfPeople.class);
//        when(alojamentoFilterDouble.complies(alojamentoDouble1, "10")).thenReturn(true);
//        when(alojamentoFilterDouble.complies(alojamentoDouble2,"10")).thenReturn(false);
//
//        List<Alojamento> listaExpectavel = new ArrayList<>();
//        listaExpectavel.add(alojamentoDouble1);
//        List<Alojamento> listaFiltrada = organizacao.filtrarAlojamento(alojamentoFilterDouble, "10");
//        assertArrayEquals (listaFiltrada.toArray(),listaExpectavel.toArray());
//    }
//    @Test
//    void ShouldReturnAlojamentosThatSupportSpecificNumberOfPeople() throws Exception {
//        FactoryTipoAlojamento factoryTipoAlojamentoDouble = mock(FactoryTipoAlojamento.class);
//        FactoryTipoAtividade factoryTipoAtividadeDouble = mock(FactoryTipoAtividade.class);
//        FactoryLocal factoryLocalDouble = mock(FactoryLocal.class);
//        FactoryAlojamento factoryAlojamentoDouble = mock(FactoryAlojamento.class);
//        FactoryAtividade factoryAtividadeDouble = mock(FactoryAtividade.class);
//        FactoryPacote factoryPacote=mock(FactoryPacote.class);
//
//        Organizacao organizacao = new Organizacao(new ArrayList<>(),new ArrayList<>(),factoryTipoAlojamentoDouble,factoryTipoAtividadeDouble,factoryAtividadeDouble,factoryAlojamentoDouble,factoryLocalDouble,factoryPacote);
//
//        Alojamento alojamentoDouble1 = mock(Alojamento.class);
//        when(alojamentoDouble1.getQntdMin()).thenReturn(8);
//        when(alojamentoDouble1.getQntdMax()).thenReturn(10);
//        organizacao.guardaTipoOAlojamento(alojamentoDouble1);
//
//        Alojamento alojamentoDouble2 = mock(Alojamento.class);
//        when(alojamentoDouble2.getQntdMin()).thenReturn(11);
//        when(alojamentoDouble2.getQntdMax()).thenReturn(15);
//        organizacao.guardaTipoOAlojamento(alojamentoDouble2);
//
//        AlojamentoFilterByNumberOfPeople alojamentoFilterDouble = mock(AlojamentoFilterByNumberOfPeople.class);
//        when(alojamentoFilterDouble.complies(alojamentoDouble1, "9")).thenReturn(true);
//        when(alojamentoFilterDouble.complies(alojamentoDouble2,"9")).thenReturn(false);
//
//        List<Alojamento> listaExpectavel = new ArrayList<>();
//        listaExpectavel.add(alojamentoDouble1);
//        List<Alojamento> listaFiltrada = organizacao.filtrarAlojamento(alojamentoFilterDouble, "9");
//        assertArrayEquals (listaFiltrada.toArray(),listaExpectavel.toArray());
//    }
//    @Test
//    void ShouldReturnTrueAlojamentosWithDayofWeek() throws Exception {
//        FactoryTipoAlojamento factoryTipoAlojamentoDouble = mock(FactoryTipoAlojamento.class);
//        FactoryTipoAtividade factoryTipoAtividadeDouble = mock(FactoryTipoAtividade.class);
//        FactoryLocal factoryLocalDouble = mock(FactoryLocal.class);
//        FactoryAlojamento factoryAlojamentoDouble = mock(FactoryAlojamento.class);
//        FactoryAtividade factoryAtividadeDouble = mock(FactoryAtividade.class);
//        FactoryPacote factoryPacote=mock(FactoryPacote.class);
//
//        Organizacao organizacao = new Organizacao(new ArrayList<>(),new ArrayList<>(),factoryTipoAlojamentoDouble,factoryTipoAtividadeDouble,factoryAtividadeDouble,factoryAlojamentoDouble,factoryLocalDouble,factoryPacote);
//
//        Alojamento alojamentoDouble1 = mock(Alojamento.class);
//        Data doubleData=mock(Data.class);
//        Data mockData= mock(Data.class);
//        doubleData.setDiaSemana(DayOfWeek.MONDAY);
//        mockData.setDiaSemana(DayOfWeek.SUNDAY);
//        when(alojamentoDouble1.getData()).thenReturn(doubleData);
//        organizacao.guardaTipoOAlojamento(alojamentoDouble1);
//
//        Alojamento alojamentoDouble2 = mock(Alojamento.class);
//        when(alojamentoDouble2.getData()).thenReturn(mockData);
//        organizacao.guardaTipoOAlojamento(alojamentoDouble2);
//
//        AlojamentoFilterContainsDiaSemana alojamentoFilterDouble = mock(AlojamentoFilterContainsDiaSemana.class);
//        when(alojamentoFilterDouble.complies(alojamentoDouble1, "Segunda")).thenReturn(true);
//        when(alojamentoFilterDouble.complies(alojamentoDouble2,"Segunda")).thenReturn(false);
//
//        List<Alojamento> listaExpectavel = new ArrayList<>();
//        listaExpectavel.add(alojamentoDouble1);
//        List<Alojamento> listaFiltrada = organizacao.filtrarAlojamento(alojamentoFilterDouble, "Segunda");
//        assertArrayEquals (listaFiltrada.toArray(),listaExpectavel.toArray());
//    }
//}