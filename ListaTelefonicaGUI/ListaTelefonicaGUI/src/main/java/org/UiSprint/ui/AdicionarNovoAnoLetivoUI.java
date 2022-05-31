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

public class AdicionarNovoAnoLetivoUI implements Initializable {
    private JanelaPrincipalUI janelaPrincipalUI;

    @FXML
    private TextField txtAnoLetivoInicial;
    
    @FXML
    private TextField txtAnoLetivoFinal;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void relateParentUI(JanelaPrincipalUI janelaPrincipalUI) {
        this.janelaPrincipalUI = janelaPrincipalUI;
    }

    @FXML
    private void btnAdicionarAction(ActionEvent event) {
        try {
            AplicacaoController appController = janelaPrincipalUI.getAplicacaoController();
            
            boolean adicionou = appController.addAnoLetivo(Integer.valueOf(txtAnoLetivoInicial.getText()), Integer.valueOf(txtAnoLetivoFinal.getText()));
            if (adicionou) {

            }
            
            AlertaUI.criarAlerta(Alert.AlertType.INFORMATION, MainApp.TITULO_APLICACAO, "Adicionar novo Ano Letivo.",
                    adicionou ? "Ano Letivo adicionado com sucesso."
                    : "Não foi adicionar o Ano Letivo ao sistema").show();

            encerrarNovoAnoLetivoUI(event);
        } catch (NumberFormatException nfe) {
            AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                    "Apenas são aceites valores numéricos!").show();
        } catch (IllegalArgumentException iae) {
            AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro nos dados.",
                    iae.getMessage()).show();
        }
    }

    @FXML
    private void btnCancelarAction(ActionEvent event) {
        encerrarNovoAnoLetivoUI(event);
    }

    private void encerrarNovoAnoLetivoUI(ActionEvent event) {
        this.txtAnoLetivoFinal.clear();
        this.txtAnoLetivoInicial.clear();
        
        ((Node) event.getSource()).getScene().getWindow().hide();
    }
}