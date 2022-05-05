package domain.DTO;

import domain.TipoAlojamento;

public class Dto_TipoAlojamento {
    private String sDtoDescricao;
    public Dto_TipoAlojamento(TipoAlojamento tipoAlojamento){
        this.sDtoDescricao=tipoAlojamento.getDescricao();
    }
    public Dto_TipoAlojamento (String sDtoDescricao){
        this.sDtoDescricao=sDtoDescricao;
    }

    public String getsDtoDescricao() {
        return sDtoDescricao;
    }

}
