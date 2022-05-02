package domain.Factories;

import domain.Pacote;

public class FactoryPacote {
    public Pacote criaPacote(String descricao ){
        return new Pacote(descricao);
    }
}
