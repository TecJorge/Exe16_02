package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    private static int count=0;

    @FXML
    private Button button;
    @FXML
    private Label counter;
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        count++;
        System.out.println("AI!");
        counter.setText(String.valueOf(count));
        label.setText(String.valueOf(count));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
