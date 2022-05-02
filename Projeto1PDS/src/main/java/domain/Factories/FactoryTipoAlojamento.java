package domain.Factories;

import domain.TipoAlojamento;

public class FactoryTipoAlojamento {
    public TipoAlojamento criaTipoAlojamento(String descricao){
        return new TipoAlojamento(descricao);
    }
}
