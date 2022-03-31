package controller;

import domain.Organizacao;

import java.util.List;

public class ControllerListarAtividade {

        private List tipoAtividadelist;
        private Organizacao organizacao;
        public ControllerListarAtividade(Organizacao organizacao){
            this.tipoAtividadelist=organizacao.getAtividadeList();
        }
        public void ListarAlojamentos(){
            if (this.tipoAtividadelist.isEmpty())
                System.out.println("Não existem Alojamentos criados");
            else
                System.out.printf("A Organização tem: %s",tipoAtividadelist);
        }
}
