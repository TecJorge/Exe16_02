package org.UiSprint.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.UiSprint.controller.AplicacaoController;

import java.net.URL;
import java.util.ResourceBundle;

public class AdicionarNovaEdicaoUC implements  Initializable{
        private JanelaPrincipalUI janelaPrincipalUI;

        @FXML
        private ComboBox listUC;

        @FXML
        private ComboBox listAnoLetivo;

        @Override
        public void initialize(URL url, ResourceBundle rb) {
        }

        public void relateParentUI(JanelaPrincipalUI janelaPrincipalUI) {
            this.janelaPrincipalUI = janelaPrincipalUI;
        }

        @FXML
        private void btnAdicionarEdicaoUCAction(ActionEvent event) {
            try {
                AplicacaoController appController = janelaPrincipalUI.getAplicacaoController();

                boolean adicionou = appController.addEdicaoUC(listUC.getSelectionModel().getSelectedIndex(),listAnoLetivo.getSelectionModel().getSelectedIndex());
                if (adicionou) {

                }

                AlertaUI.criarAlerta(Alert.AlertType.INFORMATION, MainApp.TITULO_APLICACAO, "Adicionar novo A Letivo.",
                        adicionou ? "Ano Letivo adicionado com sucesso."
                                : "Não foi adicionar o Ano Letivo ao sistema").show();

                encerrarNovoAnoLetivoUI(event);
            } catch (NumberFormatException nfe) {
                AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                        "Introduza um valor numérico para telefone!").show();
            } catch (IllegalArgumentException iae) {
                AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                        iae.getMessage()).show();
            }
        }

        @FXML
        private void btnCancelarEdicaoUCAction(ActionEvent event) {
            encerrarNovoAnoLetivoUI(event);
        }

        private void encerrarNovoAnoLetivoUI(ActionEvent event) {
            ((Node) event.getSource()).getScene().getWindow().hide();
        }
}
