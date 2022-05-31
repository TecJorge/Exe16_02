package org.UiSprint.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import org.UiSprint.controller.AplicacaoController;
import org.UiSprint.model.NewUnidadeCurricularDTO;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class ConsultarUCUI implements Initializable {

        private JanelaPrincipalUI janelaPrincipalUI;

        @FXML
        private Button btnConsultar ;
        @FXML
        private Button btnVoltar;

        @FXML
        private ComboBox listUC;
        @FXML
        private TextArea txtlistarUC;

        @Override
        public void initialize(URL url, ResourceBundle rb) {
        }

        public void relateParentUI(JanelaPrincipalUI janelaPrincipalUI) {
            this.janelaPrincipalUI = janelaPrincipalUI;
        }

        @FXML
        private void btnConsultarUCAction(ActionEvent event) {
            try {
                AplicacaoController appController = janelaPrincipalUI.getAplicacaoController();

                Optional<NewUnidadeCurricularDTO> info = appController.getUCbyID(listUC.getSelectionModel().getSelectedIndex());
                if (info != null) {
                       txtlistarUC.setText(info.toString());
                }

                AlertaUI.criarAlerta(Alert.AlertType.INFORMATION, MainApp.TITULO_APLICACAO, "Adicionar novo A Letivo.",
                        (info!=null) ? "Ano Letivo adicionado com sucesso."
                                : "Não foi adicionar o Ano Letivo ao sistema").show();

                encerrarNovoAnoLetivoUI(event);
            } catch (NumberFormatException nfe) {
                AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                       "Introduza um valor numérico !").show();
            } catch (IllegalArgumentException iae) {
      AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                        iae.getMessage()).show();
            } catch (Exception e) {
                AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro não foi possivel obter a informação.",
                        "A Unidade curricular selecionada não foi encontrada!").show();
            }
        }

        @FXML
        private void btnVoltarAction(ActionEvent event) {
            encerrarNovoAnoLetivoUI(event);
        }


        private void encerrarNovoAnoLetivoUI(ActionEvent event) {
            ((Node) event.getSource()).getScene().getWindow().hide();
        }
}
