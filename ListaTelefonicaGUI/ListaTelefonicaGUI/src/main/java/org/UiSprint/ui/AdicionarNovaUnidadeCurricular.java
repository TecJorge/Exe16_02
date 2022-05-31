package org.UiSprint.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.UiSprint.controller.AplicacaoController;

import java.net.URL;
import java.util.ResourceBundle;

public class AdicionarNovaUnidadeCurricular implements Initializable  {
    private JanelaPrincipalUI janelaPrincipalUI;

    @FXML
    private TextField txtSigla;

    @FXML
    private TextField txtDenominacao;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void relateParentUI(JanelaPrincipalUI janelaPrincipalUI) {
        this.janelaPrincipalUI = janelaPrincipalUI;
    }

    @FXML
    private void btnAdicionarUCAction(ActionEvent event) {
        try {
            AplicacaoController appController = janelaPrincipalUI.getAplicacaoController();

            boolean adicionou = appController.addUnidadeCurricular(txtSigla.getText(),txtDenominacao.getText());
            if (adicionou) {

            }

            AlertaUI.criarAlerta(Alert.AlertType.INFORMATION, MainApp.TITULO_APLICACAO, "Adicionar Nova Unidade Curricular.",
                    adicionou ? "Unidade Curricular adicionada com sucesso."
                            : "Não foi adicionar a Unidade Curricular ao sistema").show();

            encerrarNovoAnoLetivoUI(event);
        } catch (NumberFormatException nfe) {
            AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                    "Introduza um valor numérico").show();
        } catch (IllegalArgumentException iae) {
            AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                    iae.getMessage()).show();
        }
    }

    @FXML
    private void btnCancelarUCAction(ActionEvent event) {
        encerrarNovoAnoLetivoUI(event);
    }

    private void encerrarNovoAnoLetivoUI(ActionEvent event) {
        this.txtDenominacao.clear();
        this.txtSigla.clear();

        ((Node) event.getSource()).getScene().getWindow().hide();
    }
}
