package domain;

import java.util.*;

public class Organizacao {
    private List<TipoAlojamento> alojamentoList=new ArrayList<>();
    private List<Local> localList=new ArrayList<>();
    private List<TipoAtividade> atividadeList=new ArrayList<>();
     public Organizacao(){
         this.alojamentoList=new ArrayList<>();
         this.localList=new ArrayList<>();
         this.atividadeList=new ArrayList<>();
     }

    public List<TipoAlojamento> getAlojamentoList() {
        return alojamentoList;
    }
    public List<Local> getLocalList() {return localList;}
    public List<TipoAtividade> getAtividadeList() {return atividadeList;}

    public void setAlojamentoList(List<TipoAlojamento> alojamentoList) {
        this.alojamentoList = alojamentoList;
    }

    @Override
    public String toString() {
    return String.format("A Organização contem %s\n%s\n%s",alojamentoList,localList,atividadeList);
    }

    public TipoAlojamento novoAlojamento(String desc){return new TipoAlojamento(desc);}
    public TipoAtividade novaAtividade(String desc){return new TipoAtividade(desc);}
    public Local novoLocal(String cid , String pais){return new Local(cid,pais);}
     public boolean validaAlujamento(TipoAlojamento obj1) {
         boolean flag=true;
         for (TipoAlojamento x : alojamentoList
         ) {
             if (obj1.getDescricao().equalsIgnoreCase(x.getDescricao()));
             flag=false;
         }
        return flag;
     }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organizacao that = (Organizacao) o;
        return Objects.equals(alojamentoList, that.alojamentoList) && Objects.equals(localList, that.localList);
    }

}
