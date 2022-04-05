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
import org.upskill.datagui.controller.ApplicationController;
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

    private ApplicationController controller;

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
       controller=new ApplicationController();
    }

    @FXML
    private void btnDiaSemanaAction(ActionEvent actionEvent) {
        try {
            txtFieldDia.setText(controller.diaSemana(txtFieldData.getText()));
        } catch (DiaInvalidoException e) {
            criarAlerta(e);
        } catch (MesInvalidoException e) {
            criarAlerta(e);
        } catch (NumberFormatException e) {
            criarAlerta(e);
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
            txtResposta.setText(controller.dataExtenso(txtFieldData.getText()));
        } catch (DiaInvalidoException e) {
            criarAlerta(e);
        } catch (MesInvalidoException e) {
            criarAlerta(e);
        } catch (NumberFormatException e) {
            criarAlerta(e);
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
    private void criarAlerta(Exception e){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText(e.getMessage());
        alert.show();
    }
}
