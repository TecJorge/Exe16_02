package ui.controllerInterface;

import domain.Data;
import domain.Local;
import domain.TipoAlojamento;

public interface iControllerAlojamento {
    public void CriarAlojamento(String denominação, TipoAlojamento tipoAlojamento, Local local, int qntdMax, int qntdMin, Data data, double preco);
        public boolean guardarAlojamento();
    public String getAlojamento();
}
