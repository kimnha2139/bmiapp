package com.mycompany.bimapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtHeight;
    @FXML private TextField txtWeight;
    @FXML private Button btnbmi;
    @FXML private Label lbResults;
    
    
    public void bmiHandler(ActionEvent event)
    {
        double height = Double.parseDouble(this.txtHeight.getText());
        double  weight = Double.parseDouble(this.txtWeight.getText());
        double bmi = weight / Math.pow(height, 2);
        
        
        
    }
    
}
