package domain.DTO;

import domain.TipoAtividade;

public class Dto_TipoAtividade {
    private String sDtoDescricao;
    public Dto_TipoAtividade(TipoAtividade tipoAtividade){
        this.sDtoDescricao=tipoAtividade.getDescricao();
    }

    public String getsDtoDescricao() {
        return sDtoDescricao;
    }
}
