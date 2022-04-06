package org.upskill.listatarefas.ui;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import org.upskill.listatarefas.controller.AplicacaoController;

public class AdicionarTarefaUI implements Initializable {

    @FXML
    private Button btnCriarTarefa;
    @FXML
    private Button btnCancelar;
    @FXML
    private Label lblTarefa;
    @FXML
    private Label lblPrioridade;
    @FXML
    private TextField txtTarefa;
    @FXML
    private ComboBox<String> cmbPrioridade;
   private AplicacaoController controller;
   private JanelaPrincipalUI janelaPrincipalUI;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] prio=controller.getPrioridades();
        cmbPrioridade.getItems().addAll(prio);
        // TODO
    }
    public void associarParentUI(JanelaPrincipalUI janelaPrincipalUI) {
        this.janelaPrincipalUI = janelaPrincipalUI;
    }
    @FXML
    private void criarTarefaAction(ActionEvent event) throws Exception {
        try {
        controller.adicionarTarefa(lblTarefa.getText(),lblPrioridade.getText());}

        catch (Exception e){
            alertaErro(e);
        }
    }

    @FXML
    private void cancelarAction(ActionEvent event) {
        if(alertaConfirm().get()==ButtonType.OK){
        lblPrioridade.setText("");
        lblTarefa.setText("");
            ((Node) event.getSource()).getScene().getWindow().hide();
        }
    }
    private Optional<ButtonType> alertaConfirm(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Aplicação");
        alert.setHeaderText("Confirmar Ação");
        alert.setContentText("Deseja mesmo Cancelar a Criação da nova Tarefa");
        return alert.showAndWait();
    }
    private void alertaErro(Exception e){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Aplicação");
        alert.setHeaderText("Erro de Aplicação");
        alert.setContentText(e.getMessage());
        alert.show();
    }
}
