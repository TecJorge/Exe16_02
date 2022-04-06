package org.upskill.listatarefas.controller;

import org.upskill.listatarefas.model.ListaTarefas;
import org.upskill.listatarefas.model.Prioridade;
import org.upskill.listatarefas.model.Tarefa;

import java.util.Arrays;

public class AplicacaoController {

    private ListaTarefas lista;

    //inicia atributos
    public AplicacaoController() {
        this.lista=new ListaTarefas();
    }

    public boolean adicionarTarefa(String descricao, String prioridade) throws Exception {
         return lista.addTarefa(new Tarefa(descricao, Prioridade.valueOf(prioridade)));
    }

    //elimina de lista todas as tarefas
    public void eliminarTarefas() {
        lista.eliminarTarefas();
    }
    public boolean eliminarUltimaTarefa(){
       return lista.eliminarUltimaTarefa();
    }

    public boolean listaVazia() {
        return lista.isEmpty();
    }

    //retorna os elementos da lista, por ordem de inserção
    public String getListaTarefas() {
        return lista.toString();
    }

    //retorna os elementos da lista, por decrescente de prioridade
    public String getListaTarefasPorPrioridade() {
       return lista.OrdemDecrescente();
    }

    //retorna um array com todos os valores de Prioridade
    public String[] getPrioridades() {
        return lista.getPrioridades();
    }
}
