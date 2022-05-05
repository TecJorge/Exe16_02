package domain.Factories;

import domain.DTO.Dto_TipoAlojamento;
import domain.TipoAlojamento;

public class FactoryTipoAlojamento {
    public Dto_TipoAlojamento criaTipoAlojamento(String descricao){
        return new Dto_TipoAlojamento(descricao);
    }
}
