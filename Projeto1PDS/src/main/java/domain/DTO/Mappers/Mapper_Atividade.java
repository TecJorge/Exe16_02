package domain.DTO.Mappers;

import domain.*;
import domain.DTO.Dto_Atividade;

import java.util.ArrayList;
import java.util.List;

public class Mapper_Atividade {

    public Dto_Atividade MakeADtoAtividade(Atividade atividade){
        return new Dto_Atividade(atividade);
    }
    public Atividade MakeAtividade(Dto_Atividade dto_atividade){

        return new Atividade(dto_atividade);
}
public List<Dto_Atividade> makeADTOAtividadeList(List<Atividade>lista){
        List<Dto_Atividade> dtoList=new ArrayList<>();
    for (Atividade atividade:lista) {
        dtoList.add(MakeADtoAtividade(atividade));
    }
    return dtoList;
}

}
