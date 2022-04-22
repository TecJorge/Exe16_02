package domain;

import java.util.ArrayList;
import java.util.List;

public class Pacote {
    private List<Atividade> listaAtividades;
    private List<Alojamento> listaAlojamento;
    private double preco;
    private String descricao;
    Pacote (String descricao ){
        this.descricao=descricao;
        this.listaAlojamento=new ArrayList<>();
        this.listaAtividades=new ArrayList<>();
        this.preco=0;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Alojamento> getListaAlojamento() {
        return listaAlojamento;
    }

    public List<Atividade> getListaAtividades() {
        return listaAtividades;
    }

    public double getPreco() {
        return preco;
    }
    public boolean addAlojamento(Alojamento alojamento){
        if (this.listaAlojamento.contains(alojamento))
            return false;
        else {
        this.preco+=alojamento.getPreco();
        return this.listaAlojamento.add(alojamento);
    }}
    public boolean addAtividade(Atividade atividade){
        if (this.listaAtividades.contains(atividade))
            return false;
        else {
        this.preco+=atividade.getPreco();
        return this.listaAtividades.add(atividade);
    }
    }
    public boolean removerAlojamento(Alojamento alojamento){
        return this.listaAlojamento.remove(alojamento);
    }
    public boolean removerAtividade(Atividade atividade){
        return this.listaAtividades.remove(atividade);
    }

    @Override
    public String toString() {
       return String.format("O Pacote %s é composto por : %s \n\nPreço total de %.2f EUR",descricao,listar(),preco);
    }
    public StringBuilder listar(){
        StringBuilder str = new StringBuilder();
        if (this.listaAlojamento.isEmpty());
        else {
            str.append("\nAlojamentos:\n");
        for (Alojamento alojamento :this.listaAlojamento) {
            str.append(alojamento);
        }}
        if (this.listaAtividades.isEmpty());
        else {
            str.append("\nAtividades:\n");
        for (Atividade atividade:this.listaAtividades
             ) {
           str.append(atividade);
        }}
    return str;}
}
