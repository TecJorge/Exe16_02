package domain;

import java.util.*;

public class Organizacao {
    private List<TipoAlojamento> alojamentoList=new ArrayList<>();
    private List<Local> localList=new ArrayList<>();
    private List<TipoAtividade> atividadeList=new ArrayList<>();
    public List<Alojamento> oalojamentoList=new ArrayList<>();
    public List<Atividade>atividades=new ArrayList<>();
    public List<Pacote>pacoteList=new ArrayList<>();
     public Organizacao(){
         this.alojamentoList=new ArrayList<>();
         this.localList=new ArrayList<>();
         this.atividadeList=new ArrayList<>();
         this.oalojamentoList=new ArrayList<>();
         this.atividades=new ArrayList<>();
         this.pacoteList=new ArrayList<>();

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

    public TipoAlojamento novoAlojamento(String desc){return new TipoAlojamento(desc);}

    public Pacote novoPacote(String desc){return new Pacote(desc);}

    public TipoAtividade novaAtividade(String desc){return new TipoAtividade(desc);}

    public Local novoLocal(String cid , String pais){return new Local(cid,pais);}

    public Alojamento novoOAlojamento(String denominação,TipoAlojamento tipoAlojamento,Local local,int qntdMax,int qntdMin,Date data, double preco){return new Alojamento(denominação,tipoAlojamento,local,qntdMax,qntdMin,data,preco);}

    public Atividade novoOAtividade(String denominação,TipoAtividade tipoAtividade,Local localc,Local localp,Date data, double preco,Tempo tempoi,Tempo tempof){return new Atividade(denominação,tipoAtividade,localc,localp,data,preco,tempoi,tempof);}

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

}
