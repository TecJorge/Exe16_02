package ui.controllerInterface;

import domain.Data;
import domain.Local;
import domain.Tempo;
import domain.TipoAtividade;

public interface iControllerOAtividade {
    public void CriarAtividade(String denominação, TipoAtividade tipoAtividade, Local localc, Local localp , Data data, double preco, Tempo tempoinicio, Tempo tempofim);
    public boolean guardarAtividade();
    public String getAtividade();
}
