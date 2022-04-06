package org.upskill.listatarefas.model;

import java.util.*;

public class ListaTarefas {

    public enum ORDENACAO  {INSERCAO, PRIORIDADE};
    
    private List<Tarefa> listaTarefas;
    ORDENACAO ordenacao;

    public ListaTarefas(){
        this.listaTarefas=new ArrayList<>();
    }

    public void setListaTarefas(List<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public void setOrdenacao(ORDENACAO ordenacao) {
        this.ordenacao = ordenacao;
    }

    public ORDENACAO getOrdenacao() {
        return ordenacao;
    }
    public void ordenaList(ORDENACAO ordenacao){
        //listaTarefas;

    }

    public String toString() {
        Collections.sort(listaTarefas);
        final StringBuilder sb = new StringBuilder("\n");
        sb.append(listaTarefas);;
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaTarefas that = (ListaTarefas) o;
        return Objects.equals(listaTarefas, that.listaTarefas) && ordenacao == that.ordenacao;
    }

    public boolean addTarefa(Tarefa tarefa) throws Exception {
        if (!listaTarefas.contains(tarefa))
       return this.listaTarefas.add(tarefa);
        else throw new Exception ("A lista já contem esta Tarefa");}


    public void removeTarefa(Tarefa tarefa) throws Exception {
        if (listaTarefas.contains(tarefa))
            this.listaTarefas.remove(tarefa);
        else throw new Exception ("A lista não contem esta Tarefa");
    }
    public void eliminarTarefas(){
        listaTarefas.clear();
    }
    public boolean eliminarUltimaTarefa(){
        if(listaTarefas.isEmpty())
            return false;
        else
            return listaTarefas.remove(listaTarefas.get(listaTarefas.lastIndexOf(listaTarefas)));
    }
    public boolean isEmpty(){
        return listaTarefas.isEmpty();
    }
    public String OrdemDecrescente() {
        Collections.reverse(listaTarefas);
        final StringBuilder sb = new StringBuilder("\n");
        sb.append(listaTarefas);;
        sb.append("\n");
        return sb.toString();
    }
    public String[] getPrioridades(){

        String[]arr=new String[Prioridade.values().length];
        for (int i = 0; i < Prioridade.values().length ; i++) {
            arr[i] = String.valueOf(ORDENACAO.PRIORIDADE.name().indexOf(i));
        }
        return arr;
    }
}
