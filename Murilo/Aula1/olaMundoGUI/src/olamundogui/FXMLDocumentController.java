/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package olamundogui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 16.03378-7
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;
    
    private double resultado;
    
    @FXML
    private void handleButtonSomarAction(ActionEvent event) {
        resultado = Double.parseDouble(textField1.getText()) + Double.parseDouble(textField2.getText());
        label.setText("= " + resultado);
    }
    
    @FXML
    private void handleButtonSubtrairAction(ActionEvent event) {
        resultado = Double.parseDouble(textField1.getText()) - Double.parseDouble(textField2.getText());
        label.setText("= " + resultado);
    }
    @FXML
    private void handleButtonDividirAction(ActionEvent event) {
        resultado = Double.parseDouble(textField1.getText()) / Double.parseDouble(textField2.getText());
        label.setText("= " + resultado);
    }
    @FXML
    private void handleButtonMultiplicarAction(ActionEvent event) {
        resultado = Double.parseDouble(textField1.getText()) * Double.parseDouble(textField2.getText());
        label.setText("= " + resultado);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
