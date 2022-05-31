package org.UiSprint.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.UiSprint.controller.AplicacaoController;

import java.net.URL;
import java.util.ResourceBundle;

    public class AdicionarNovaProposta implements Initializable {
        private JanelaPrincipalUI janelaPrincipalUI;

        @FXML
        private TextField txtTituloProposta;

        @FXML
        private TextField txtProblema;
        @FXML
        private TextField txtObjetivo;
        @FXML
        private ComboBox listEmpresaID;
        @FXML
        private ComboBox listEdicao;
        @FXML
        private TextField txtUserID;

        @Override
        public void initialize(URL url, ResourceBundle rb) {
        }

        public void relateParentUI(JanelaPrincipalUI janelaPrincipalUI) {
            this.janelaPrincipalUI = janelaPrincipalUI;
        }

        @FXML
        private void btnAdicionarPropostaAction(ActionEvent event) {
            try {
                AplicacaoController appController = janelaPrincipalUI.getAplicacaoController();

                boolean adicionou = appController.addProposta(Integer.valueOf(txtUserID.getText()), Integer.valueOf(listEmpresaID.getSelectionModel().getSelectedIndex()), txtTituloProposta.getText(),txtProblema.getText(),txtObjetivo.getText(),Integer.valueOf(listEdicao.getSelectionModel().getSelectedIndex()));
                AlertaUI.criarAlerta(Alert.AlertType.INFORMATION, MainApp.TITULO_APLICACAO, "Criar Proposta.",
                        adicionou ? "Proposta Criada com sucesso."
                                : "Não foi possível criar a Proposta").show();

                encerrarNovaPropostaUI(event);
            } catch (NumberFormatException nfe) {
                AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                        "Introduza um valor numérico!").show();
            } catch (IllegalArgumentException iae) {
                AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                        iae.getMessage()).show();
            }
        }

        @FXML
        private void btnCancelarPropostaAction(ActionEvent event) {
            encerrarNovaPropostaUI(event);
        }

        private void encerrarNovaPropostaUI(ActionEvent event) {
            this.txtObjetivo.clear();
            this.txtProblema.clear();
            this.txtTituloProposta.clear();
            ((Node) event.getSource()).getScene().getWindow().hide();
        }
  }

