package domain.Factories;

import domain.TipoAtividade;

public class FactoryTipoAtividade {
    public TipoAtividade criaTipoAtividade (String sDenominacao){
        return new TipoAtividade(sDenominacao);
    }
}
