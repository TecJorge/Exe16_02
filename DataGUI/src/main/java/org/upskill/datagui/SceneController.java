/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.upskill.datagui;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.upskill.datagui.model.Data;
import org.upskill.datagui.model.DiaInvalidoException;
import org.upskill.datagui.model.MesInvalidoException;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * 
 */
public class SceneController implements Initializable {

    @FXML
    private Label txtResposta;
    @FXML
    private TextField txtFieldDia;
    @FXML
    private TextField txtFieldData;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnDiaSemanaAction(ActionEvent actionEvent) {
        try {
            String[] temp;
            temp = txtFieldData.getText().split("/");
            Data data = new Data(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]), Integer.valueOf(temp[2]));
            txtFieldDia.setText(data.diaDaSemana());
        } catch (DiaInvalidoException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(e.getMessage());
            alert.show();
        } catch (MesInvalidoException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(e.getMessage());
            alert.show();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("A Data deve de ser separada por /");
            alert.show();
        }
    }

    @FXML
    private void btnLimparAction(ActionEvent actionEvent) {
        System.out.println("Campos de Data Limpos");
        txtFieldData.clear();
        txtFieldDia.clear();
        txtResposta.setText("");

    }

    @FXML
    private void btnDataExtensoAction(ActionEvent actionEvent) {
        try {
            String[] temp;
            temp = txtFieldData.getText().split("/");
            Data data = new Data(Integer.valueOf(temp[0]), Integer.valueOf(temp[1]), Integer.valueOf(temp[2]));
            txtResposta.setText(data.toString());
        } catch (DiaInvalidoException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(e.getMessage());
            alert.show();
        } catch (MesInvalidoException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(e.getMessage());
            alert.show();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("A Data deve de ser separada por /");
            alert.show();
        }
    }

    @FXML
    private void keyEnterAction(KeyEvent event) {
        KeyCode input=event.getCode();
        if (input.equals(KeyCode.ENTER)) {
            btnDataExtensoAction(null);
            btnDiaSemanaAction(new ActionEvent());
        }

    }
}
