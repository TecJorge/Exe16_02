package org.upskill.listatarefas.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.upskill.listatarefas.controller.AplicacaoController;
import org.upskill.listatarefas.model.ListaTarefas;

public class JanelaPrincipalUI implements Initializable {
    private static final String LEGENDA_BOTAO_ADICIONAR_TAREFA= "Adicionar Tarefa";
    private static final String LEGENDA_BOTAO_LIMPAR_TAREFAS= "Limpar Tarefas";

    @FXML
    private Button btnAdicionarTarefas;
    @FXML
    private Button btnLimparTarefas;
    @FXML
    private TextArea txtAreaTarefas;
    private Stage novaTarefaStage;
    final KeyCodeCombination cZ=new KeyCodeCombination(KeyCode.Z,KeyCombination.CONTROL_DOWN);
    final KeyCodeCombination cO=new KeyCodeCombination(KeyCode.O,KeyCombination.CONTROL_DOWN);
    final KeyCodeCombination cP=new KeyCodeCombination(KeyCode.P,KeyCombination.CONTROL_DOWN);
    AplicacaoController controller;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AdicionarTarefaScene.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        novaTarefaStage = new Stage();
        novaTarefaStage.initModality(Modality.APPLICATION_MODAL);
        novaTarefaStage.setTitle("Nova Tarefa");
        novaTarefaStage.setResizable(false);
        novaTarefaStage.setScene(scene);
            controller=new AplicacaoController();

            AdicionarTarefaUI novaTarefaUI = loader.getController();
            novaTarefaUI.associarParentUI(this);
        }catch (IOException ex) {
            System.out.println(ex);
        }


    }    

    @FXML
    private void adicionarTarefaAction(ActionEvent event) {
        novaTarefaStage.show();
    }

    @FXML
    private void limparTarefasAction(ActionEvent event) {
        novaTarefaStage.show();
    }

    @FXML
    private void teclaPressionadaAction(KeyEvent event) {
        if(cZ.match(event))
            controller.eliminarUltimaTarefa();
        else if(cO.match(event))
            controller.getListaTarefas();
        else if (cP.match(event))
            controller.getListaTarefasPorPrioridade();

    }
    
}
