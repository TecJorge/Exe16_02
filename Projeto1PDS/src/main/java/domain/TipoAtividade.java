package domain;

import java.util.Objects;

public class TipoAtividade {
        private String descricao;
        private final String descricaoDefault="Indefinido";
        public TipoAtividade(String descricao){
            this.descricao=descricao;
        }
        public TipoAtividade(){
            this.descricao=descricaoDefault;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        @Override
        public String toString() {
            return String.format("Tipo de Atividade: %s \n",descricao);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoAtividade that = (TipoAtividade) o;
        return Objects.equals(descricao, that.descricao) && Objects.equals(descricaoDefault, that.descricaoDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, descricaoDefault);
    }
}
