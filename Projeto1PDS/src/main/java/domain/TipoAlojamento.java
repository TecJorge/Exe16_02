package domain;

import domain.DTO.Dto_TipoAlojamento;

import java.util.Objects;

public class TipoAlojamento {
    private String descricao;
    private final String descricaoDefault="Indefinido";
    public TipoAlojamento(String descricao){
        this.descricao=descricao;
    }
    public TipoAlojamento(){
        this.descricao=descricaoDefault;
    }
    public TipoAlojamento(Dto_TipoAlojamento dto_tipoAlojamento){
        this.descricao=dto_tipoAlojamento.getsDtoDescricao();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
       return String.format("Tipo de Alojamento: %s \n",descricao);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoAlojamento that = (TipoAlojamento) o;
        return Objects.equals(descricao, that.descricao) && Objects.equals(descricaoDefault, that.descricaoDefault);
    }


}
