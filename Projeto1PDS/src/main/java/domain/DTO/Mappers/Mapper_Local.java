package domain.DTO.Mappers;

import domain.DTO.Dto_Local;
import domain.Local;

public class Mapper_Local {
    public Dto_Local MakeADtoLocal(Local local){
        return new Dto_Local(local);
    }
    public Local MakeLocal(Dto_Local dto_local){

        return new Local(dto_local);
    }
}
