package domain.Factories;

import domain.Alojamento;
import domain.Data;
import domain.Local;
import domain.TipoAlojamento;

public class FactoryAlojamento {
    public Alojamento criaAlojamento(String denominacao, TipoAlojamento tipoAlojamento, Local local, int qntdMax, int qntdMin, Data data, double preco){
        return new Alojamento(denominacao, tipoAlojamento, local, qntdMax, qntdMin, data, preco);
    }
}
