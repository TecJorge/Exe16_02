package org.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private TextField txtcelsius;
    @FXML
    private TextField txtfar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnLimparAction(ActionEvent actionEvent) {
        System.out.println("Carregou Limpar");
        txtfar.clear();
        txtcelsius.clear();
    }

    @FXML
    private void btnSairAction(ActionEvent actionEvent) {
        System.out.println("Carregou Sair");
        Alert alertaconfirma = new Alert(Alert.AlertType.CONFIRMATION);
        alertaconfirma.setTitle("Aplicação");
        alertaconfirma.setHeaderText("Confirmação da ação");
        alertaconfirma.setContentText("Deseja mesmo sair da aplicação");
        if (alertaconfirma.showAndWait().get().equals(ButtonType.OK))
        Platform.exit();
        else
            alertaconfirma.close();
    }

    @FXML
    private void btnconverterAction(ActionEvent actionEvent) {
        System.out.println("Vamos proceder a conversão");
        try{
        double tempc= Double.valueOf(txtcelsius.getText());
        txtfar.setText(String.valueOf(1.8*tempc+32));}
        catch (NumberFormatException e){
            System.out.println(e);
            Alert alertaErro = new Alert(Alert.AlertType.ERROR);
            alertaErro.setTitle("Celsius");
            alertaErro.setHeaderText("Erro na temperatura Celsius");
            alertaErro.setContentText("Não foi introduzido nenhum valor numerico");
            alertaErro.show();

        }
    }
}
