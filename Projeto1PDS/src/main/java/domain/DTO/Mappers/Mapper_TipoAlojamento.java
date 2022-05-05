package domain.DTO.Mappers;

import domain.DTO.Dto_TipoAlojamento;
import domain.TipoAlojamento;
import domain.TipoAtividade;

public class Mapper_TipoAlojamento {
    //Fazer um Dto apartir de um Alojamento
    public Dto_TipoAlojamento MakeADtoTipoAlojamento(TipoAlojamento tipoAlojamento){
        return new Dto_TipoAlojamento(tipoAlojamento);
    }
    //Fazer um TipoAlojamento apartir de um DTO
    public TipoAlojamento MakeATipoAlojamento(Dto_TipoAlojamento dto_tipoAlojamento){
        return new TipoAlojamento(dto_tipoAlojamento);
    }
}
