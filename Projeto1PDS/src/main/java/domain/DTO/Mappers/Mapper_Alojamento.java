package domain.DTO.Mappers;

import domain.Alojamento;
import domain.DTO.Dto_Alojamento;

import java.util.ArrayList;
import java.util.List;

public class Mapper_Alojamento {
    public Dto_Alojamento MakeADtoAlojamento(Alojamento alojamento){
        return new Dto_Alojamento(alojamento);
    }
    public Alojamento MakeAalojamento(Dto_Alojamento dto_alojamento){

        return new Alojamento(dto_alojamento);
    }
    public List<Dto_Alojamento> makeADTOAlojamentoList(List<Alojamento>lista){
        List<Dto_Alojamento> dtoList=new ArrayList<>();
        for (Alojamento alojamento:lista) {
            dtoList.add(MakeADtoAlojamento(alojamento));
        }
        return dtoList;
    }
}
