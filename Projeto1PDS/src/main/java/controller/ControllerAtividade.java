package controller;

import domain.Organizacao;
import domain.TipoAtividade;

public class ControllerAtividade implements ui.controllerInterface.iControllerAtividade {
        private TipoAtividade tipoAtividade;
        private Organizacao organizacao;

        public ControllerAtividade(Organizacao organizacao) {
            this.organizacao = organizacao;
        }

        public void CriarTipoAtividade(String desc) {
            tipoAtividade = organizacao.novaAtividade(desc);
            organizacao.validaAtividade(tipoAtividade);
        }

        public boolean guardarTipoAtividade() {
            return this.organizacao.guardaTipoAtividade(tipoAtividade);
        }

        public String getTipoAtividade() {
            return String.format(tipoAtividade.toString());
        }
}
