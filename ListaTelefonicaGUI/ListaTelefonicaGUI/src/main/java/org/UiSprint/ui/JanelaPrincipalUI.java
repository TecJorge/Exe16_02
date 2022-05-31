package org.UiSprint.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import org.UiSprint.controller.AplicacaoController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class JanelaPrincipalUI implements Initializable {
    private AplicacaoController appController;
    private Stage novoAnoLetivoStage;
    private Stage novoPropostaStage;
    private Stage novoUnidadeCurricularStage;
    private Stage novoEdicaoStage;
    private Stage consultarUCStage;

    @FXML
    private TextArea txtMainWindow;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            FXMLLoader loaderAnoLetivo = new FXMLLoader(getClass().getResource("/fxml/AdicionarNovoAnoLetivo.fxml"));
            Parent rootAnoLetivo = loaderAnoLetivo.load();
            FXMLLoader loaderProposta = new FXMLLoader(getClass().getResource("/fxml/AdicionarNovaProposta.fxml"));
            Parent rootProposta=loaderProposta.load();
            Scene sceneProposta=new Scene(rootProposta);
            Scene sceneAnoLetivo = new Scene(rootAnoLetivo);
            FXMLLoader loaderEdicaoUC = new FXMLLoader(getClass().getResource("/fxml/AdicionarNovaEdicaoUC.fxml"));
            Parent rootEdicaoUC=loaderEdicaoUC.load();
            Scene sceneEdicaoUC=new Scene(rootEdicaoUC);


            FXMLLoader loaderUC = new FXMLLoader(getClass().getResource("/fxml/AdicionarNovaUnidadeCurricular.fxml"));
            Parent rootUC=loaderUC.load();
            Scene sceneUC=new Scene(rootUC);

            FXMLLoader loaderConsultarUC = new FXMLLoader(getClass().getResource("/fxml/ConsultarUC.fxml"));
            Parent rootConsultarUC=loaderConsultarUC.load();
            Scene sceneConsultarUC=new Scene(rootConsultarUC);
            appController = new AplicacaoController();
            novoPropostaStage = new Stage();
            novoPropostaStage.initModality(Modality.APPLICATION_MODAL);
            novoPropostaStage.setTitle("Nova Proposta");
            novoPropostaStage.setResizable(false);
            novoPropostaStage.setScene(sceneProposta);
            novoAnoLetivoStage = new Stage();
            novoAnoLetivoStage.initModality(Modality.APPLICATION_MODAL);
            novoAnoLetivoStage.setTitle("Novo Ano Letivo");
            novoAnoLetivoStage.setResizable(false);
            novoAnoLetivoStage.setScene(sceneAnoLetivo);
           novoEdicaoStage = new Stage();
            novoEdicaoStage.initModality(Modality.APPLICATION_MODAL);
            novoEdicaoStage.setTitle("Nova Edição Unidade Curricular");
            novoEdicaoStage.setResizable(false);
           novoEdicaoStage.setScene(sceneEdicaoUC);
            novoUnidadeCurricularStage = new Stage();
            novoUnidadeCurricularStage.initModality(Modality.APPLICATION_MODAL);
            novoUnidadeCurricularStage.setTitle("Nova  Unidade Curricular");
            novoUnidadeCurricularStage.setResizable(false);
            consultarUCStage = new Stage();
            consultarUCStage.initModality(Modality.APPLICATION_MODAL);
            consultarUCStage.setTitle("Consultar Unidade Curricular");
            consultarUCStage.setResizable(false);
            consultarUCStage.setScene(sceneConsultarUC);
            AdicionarNovoAnoLetivoUI novoAnoUI = loaderAnoLetivo.getController();
            novoAnoUI.relateParentUI(this);

        } catch (IOException ex) {
            AlertaUI.criarAlerta(Alert.AlertType.ERROR, MainApp.TITULO_APLICACAO, "Erro.", ex.getMessage());
        }
    }

    public AplicacaoController getAplicacaoController() {
        return appController;
    }

    @FXML
    private void mnuNewAnoLetivoAction(ActionEvent event) throws IOException {
        novoAnoLetivoStage.show();
    }
    @FXML
    private void mnuNewPropostaAction(ActionEvent event) throws IOException {
        novoPropostaStage.show();
    }
    @FXML
    private void mnuNewEdicaoUCAction(ActionEvent event) throws IOException {
        novoEdicaoStage.show();
    }
    @FXML
    private void mnuNewUCAction(ActionEvent actionEvent) {
        novoUnidadeCurricularStage.show();
    }
    @FXML
    private void mnuConsultarUCAction(ActionEvent actionEvent){
        consultarUCStage.show();
    }

    @FXML
    private void mnuContactosSairAction(ActionEvent event) {
        Window window = txtMainWindow.getScene().getWindow();
        window.fireEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSE_REQUEST));
    }

    @FXML
    private void mnuOpcoesAcercaAction(ActionEvent event) {
        AlertaUI.criarAlerta(Alert.AlertType.INFORMATION, MainApp.TITULO_APLICACAO, "Acerca.",
                "@Copyright\nUPskill 2022").show();
    }


}