package org.example.UI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
    @FXML
    private String[] conversao = {"Celsius para Fahrenheit","Celsius para Kelvin","Celsius para Rankine","Farhenheit para Celsius", "Fahrenheit para Kelvin", "Fahrenheit para Rankine","Kelvin para Celsius","Kelvin para Fahrenheit", "Rankine para Kelvin","Kelvin para rankine","Celsius para Fahrenheit","Rankine para Fahrenheit", "Rankine para Kelvin"};


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        controller=new ApplicationController();
        listaConversores.getItems().addAll(conversao);
    }

    @FXML
    public void btnClearAction(ActionEvent actionEvent) {
    }

    @FXML
    public void btnSairAction(ActionEvent actionEvent) {
       this.sairApp();
    }

    @FXML
    public void btnConverterAction(ActionEvent actionEvent) {
            int option=listaConversores.getSelectionModel().getSelectedIndex();
                this.txtTempConvert.setText(controller.converter(option, String.valueOf(txtTempBase)));

    }
    private void sairApp(){
        Alert leave =new Alert(Alert.AlertType.CONFIRMATION);
        leave.setTitle("Aplicação");
        leave.setContentText("Deseja mesmo sair da Aplicação");
        leave.setHeaderText("Confirmação da ação");
        leave.showAndWait();
        if(leave.showAndWait().get()==ButtonType.OK)
            System.exit(0);
    }
}
