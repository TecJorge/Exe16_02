package domain.DTO.Mappers;

import domain.DTO.Dto_Atividade;
import domain.DTO.Dto_TipoAtividade;
import domain.TipoAtividade;

public class Mapper_TipoAtividade {
    private Dto_TipoAtividade tipoAtividade;
    //Fazer um Dto apartir de um objeto Tipo Atividade ou seja Domain para UI
    public Dto_TipoAtividade MakeADtoTipoAtividade(TipoAtividade atividade){
        return new Dto_TipoAtividade(atividade);
    }
    // Fazer um Tipo Atividade apartir de um DTO ou seja UI para Domain
    public TipoAtividade MakeATipoAtividade(Dto_TipoAtividade dto_tipoAtividade){
        return new TipoAtividade(dto_tipoAtividade);
    }
}
