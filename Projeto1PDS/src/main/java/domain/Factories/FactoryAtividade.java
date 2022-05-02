package domain.Factories;

import domain.*;

public class FactoryAtividade {
    public Atividade criaAtividade(String denominação, TipoAtividade tipoAtividade, Local localc, Local localp, Data data, double preco, Tempo tempoInicio, Tempo tempoFim) {
        return new Atividade(denominação, tipoAtividade, localc, localp, data, preco, tempoInicio, tempoFim);
    }
}
