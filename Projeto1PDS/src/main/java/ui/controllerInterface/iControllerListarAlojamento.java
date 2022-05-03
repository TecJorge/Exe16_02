package ui.controllerInterface;

import domain.Alojamento;
import domain.filters.AlojamentoFilter;

import java.util.List;

public interface iControllerListarAlojamento {
    public void ListarAlojamentos();
    public List<AlojamentoFilter> getAlojamentoFilters();
    public List<Alojamento> filtrar(AlojamentoFilter filter, String string) throws Exception;
}
