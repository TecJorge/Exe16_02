package domain;

import domain.Factories.*;
import domain.filters.AlojamentoFilter;
import domain.filters.AlojamentoFilterNumerico;
import domain.filters.TipoAlojamentoFilter;

import java.util.*;
import java.util.List;

public class Organizacao {
    private List<TipoAlojamento> alojamentoList=new ArrayList<>();
    private List<Local> localList=new ArrayList<>();
    private List<TipoAtividade> atividadeList=new ArrayList<>();
    public List<Alojamento> oalojamentoList=new ArrayList<>();
    public List<Atividade>atividades=new ArrayList<>();
    public List<Pacote>pacoteList=new ArrayList<>();
    public FactoryAlojamento factoryAlojamento;
    public FactoryAtividade factoryAtividade;
    public FactoryPacote factoryPacote;
    public FactoryLocal factoryLocal;
    public FactoryTipoAtividade factoryTipoAtividade;
    public FactoryTipoAlojamento factoryTipoAlojamento;
    private final List<TipoAlojamentoFilter> m_listaTipoAlojamentoFilters;
    private final List<AlojamentoFilter> m_listaAlojamentoFilters;
    public FactoryAlojamentoFilters factoryAlojamentoFilters;
    public FactoryTipoAlojamentoFilter factoryTipoAlojamentoFilter;


    public Organizacao(List<String> listaStringClassesTipoAlojamentoFilters, List<String> listaStringClassesAlojamentoFilters, FactoryTipoAlojamento factoryTipoAlojamento, FactoryTipoAtividade factoryTipoAtividade, FactoryAtividade factoryAtividade, FactoryAlojamento factoryAlojamento, FactoryLocal factoryLocal,FactoryPacote factoryPacote, FactoryTipoAlojamentoFilter factoryTipoAlojamentoFilter,FactoryAlojamentoFilters factoryAlojamentoFilters)
    {   this.alojamentoList=new ArrayList<>();
        this.localList=new ArrayList<>();
        this.atividadeList=new ArrayList<>();
        this.oalojamentoList=new ArrayList<>();
        this.atividades=new ArrayList<>();
        this.pacoteList=new ArrayList<>();
        if (factoryAlojamento !=null)
            this.factoryAlojamento=factoryAlojamento;
        else
            throw new NullPointerException("A Factory do Alojamento não pode ser null!");
        if (factoryAtividade !=null)
            this.factoryAtividade=factoryAtividade;
        else
            throw new NullPointerException("A Factory da Atividade não pode ser null!");
        if (factoryPacote!=null)
            this.factoryPacote=factoryPacote;
        else
            throw new NullPointerException("A Factory do Pacote não pode ser null!");
        if (factoryLocal!=null)
            this.factoryLocal=factoryLocal;
        else
            throw new NullPointerException("A Factory do Local não pode ser null!");
        if (factoryTipoAtividade!= null)
            this.factoryTipoAtividade=factoryTipoAtividade;
        else
            throw new NullPointerException("A Factory do Tipo Atividade não pode ser null!");
        if(factoryTipoAlojamento!=null)
            this.factoryTipoAlojamento=factoryTipoAlojamento;
        else
            throw new NullPointerException("A Factory do Tupi de Alojamento não pode ser null!");
        if( listaStringClassesTipoAlojamentoFilters != null )
            this.m_listaTipoAlojamentoFilters = createInstancesOfTipoAlojamentoFilters( listaStringClassesTipoAlojamentoFilters );
        else
            throw new IllegalArgumentException("TipoAlojamentoFilters não pode ser null.");
        if( listaStringClassesAlojamentoFilters != null )
            this.m_listaAlojamentoFilters= createInstancesOfAlojamentoFilters( listaStringClassesAlojamentoFilters );
        else
            throw new IllegalArgumentException("AlojamentoFilters não pode ser null.");
        if (factoryAlojamentoFilters!=null)
            this.factoryAlojamentoFilters=factoryAlojamentoFilters;
        else
            throw new NullPointerException("A Factory AlojamentoFilters não pode ser Null!");
        if (factoryTipoAlojamentoFilter!=null)
            this.factoryTipoAlojamentoFilter=factoryTipoAlojamentoFilter;
        else
            throw new NullPointerException("A Factory TipoAlojamento Filters não pode ser null!");
    }

    private List<TipoAlojamentoFilter> createInstancesOfTipoAlojamentoFilters( List<String> listaStringClassesTipoAlojamentoFilters ) {
        return factoryTipoAlojamentoFilter.createInstancesOfTipoAlojamentoFilters(listaStringClassesTipoAlojamentoFilters);
    }
    private List<AlojamentoFilter> createInstancesOfAlojamentoFilters(List<String> listaStringClassesAlojamentoFilters ) {
    return factoryAlojamentoFilters.createInstancesOfAlojamentoFilters(listaStringClassesAlojamentoFilters);
    }

    public List<TipoAlojamento> getAlojamentoList() {
        return alojamentoList;
    }
    public List<Local> getLocalList() {return localList;}
    public List<TipoAtividade> getAtividadeList() {return atividadeList;}
    public List<Alojamento> getOalojamentoList(){return oalojamentoList;}
    public List<Atividade> getAtividades() {return atividades;}
    public List<Pacote> getPacoteList() {return pacoteList;}

    public void setAlojamentoList(List<TipoAlojamento> alojamentoList) {
        this.alojamentoList = alojamentoList;
    }

    @Override
    public String toString() {
    return String.format("A Organização contem %s\n%s\n%s\n%s\n%s",alojamentoList,localList,atividadeList,oalojamentoList,atividades);
    }

    public TipoAlojamento novoAlojamento(String desc){return factoryTipoAlojamento.criaTipoAlojamento(desc);}

    public Pacote novoPacote(String desc){return factoryPacote.criaPacote(desc);}

    public TipoAtividade novaAtividade(String desc){return factoryTipoAtividade.criaTipoAtividade(desc);}

    public Local novoLocal(String cid , String pais){return factoryLocal.criaLocal(cid,pais);}

    public Alojamento novoOAlojamento(String denominação,TipoAlojamento tipoAlojamento,Local local,int qntdMax,int qntdMin,Data data, double preco){return factoryAlojamento.criaAlojamento(denominação, tipoAlojamento, local, qntdMax, qntdMin, data, preco);}

    public Atividade novoOAtividade(String denominação,TipoAtividade tipoAtividade,Local localc,Local localp,Data data, double preco,Tempo tempoi,Tempo tempof){return factoryAtividade.criaAtividade(denominação, tipoAtividade, localc, localp, data, preco, tempoi, tempof);}

     public boolean validaAlujamento(TipoAlojamento obj1) {

        return true;
     }
     public boolean validaPacote(Pacote obj1){return true;}
    public boolean validaLocal(Local obj1){
         return !localList.contains(obj1);}
    public boolean validaAtividade(TipoAtividade obj1){
        return !atividadeList.contains(obj1);}
    public boolean guardaLocal(Local obj1){
         if(this.validaLocal(obj1))
             return localList.add(obj1);
         else
             return false;
    }
    public boolean validaoAlujamento(Alojamento obj1){return  true;}
    public boolean validaOAtividade(Atividade obj1){return  true;}
    public boolean guardaTipoAlojamento(TipoAlojamento obj1){
         if(this.validaAlujamento(obj1))
             return alojamentoList.add(obj1);
         else
             return false;
     }
    public boolean guardaTipoAtividade(TipoAtividade obj1){
        if(this.validaAtividade(obj1))
            return atividadeList.add(obj1);
        else
            return false;
    }
    public boolean guardaTipoOAlojamento(Alojamento obj1){
        if(this.validaoAlujamento(obj1))
            return oalojamentoList.add(obj1);
        else
            return false;
    }
    public boolean guardaAtividade(Atividade obj1){
        if(this.validaOAtividade(obj1))
            return atividades.add(obj1);
        else
            return false;
    }
    public boolean guardaAtividadenoPacote(Atividade obj1){
    return true; }
    public boolean guardaAlojamentonoPacote(Alojamento obj1){return true;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organizacao that = (Organizacao) o;
        return Objects.equals(alojamentoList, that.alojamentoList) && Objects.equals(localList, that.localList);
    }
    public List<TipoAlojamentoFilter> getTipoAlojamentoFilters() {
        return this.m_listaTipoAlojamentoFilters;
    }

    public List<AlojamentoFilter> getlistaAlojamentoFilters() {
        return this. m_listaAlojamentoFilters;
    }

    public List<TipoAlojamento> filtrarTiposAlojamento(TipoAlojamentoFilter filtro, String string ) {

        List<TipoAlojamento> listaFiltrada = new ArrayList<TipoAlojamento>();

        for (TipoAlojamento oTipoAlojamento :alojamentoList) {

            if( filtro.complies( oTipoAlojamento, string ) )
                listaFiltrada.add( oTipoAlojamento );
        }
        return listaFiltrada;
    }
    public List<Alojamento> filtrarAlojamento(AlojamentoFilter filtro, String string ) throws Exception {

        List<Alojamento> listaFiltrada = new ArrayList<Alojamento>();

        for (Alojamento oAlojamento : oalojamentoList) {

            if( filtro.complies( oAlojamento, string ) )
                listaFiltrada.add( oAlojamento );
        }
        return listaFiltrada;
    }

}
