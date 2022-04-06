package org.example.UI;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.example.Controller.ApplicationController;

public class SceneUI implements Initializable {
    private ApplicationController controller;
    @FXML
    private ChoiceBox listaConversores;
    @FXML
    private TextField txtTempBase;
    @FXML
    private TextField txtTempConvert;

    private String[] conversao = {"Celsius para Fahrenheit","Celsius para Kelvin","Celsius para Rankine","Farhenheit para Celsius", "Fahrenheit para Kelvin", "Fahrenheit para Rankine","Kelvin para Celsius","Kelvin para Fahrenheit", "Kelvin para Rankine","Rankine para Celsius","Rankine para Fahrenheit","Rankine para Kelvin"};
    @FXML
    private Button btnClear;
    @FXML
    private Button btnConverter;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        controller=new ApplicationController();
        listaConversores.getItems().addAll(conversao);
        btnClear.setDisable(true);
        btnConverter.setDisable(true);
        listaConversores.setDisable(true);


    }

    @FXML
    public void btnClearAction(ActionEvent actionEvent) {
        txtTempBase.setText("");
        txtTempConvert.setText("");
        if (txtTempBase.getText().equalsIgnoreCase("")){
            btnClear.setDisable(true);
            btnConverter.setDisable(true);
        }
    }

    @FXML
    public void btnSairAction(ActionEvent actionEvent) {
       this.sairApp();
    }

    @FXML
    public void btnConverterAction(ActionEvent actionEvent) {
            int option=listaConversores.getSelectionModel().getSelectedIndex();
            try {
                this.txtTempConvert.setText(controller.converter(option,txtTempBase.getText()));
            }catch (NumberFormatException e){
                dispultaAlerta(e);
            }
    }
    private void sairApp(){
        Alert leave =new Alert(Alert.AlertType.CONFIRMATION);
        leave.setTitle("Aplicação");
        leave.setContentText("Deseja mesmo sair da Aplicação");
        leave.setHeaderText("Confirmação da ação");
        if(leave.showAndWait().get()==ButtonType.OK)
            System.exit(0);
    }
    private void dispultaAlerta(Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(e.getMessage());
            alert.show();
        }

    @FXML
    public void clickChangeStatus(Event event) {
        if (!txtTempBase.getText().equals("")){
            btnConverter.setDisable(false);
            btnClear.setDisable(false);
        }
    }

    @FXML
    public void btnStatusChange(Event event) {
        if (txtTempBase.getText().equals("")){
            btnConverter.setDisable(true);
            btnClear.setDisable(true);
            listaConversores.setDisable(true);
    }
}

    @FXML
    public void listStatusChange(Event event) {
        if(!txtTempBase.getText().equals(""))
        listaConversores.setDisable(false);
    }

}
