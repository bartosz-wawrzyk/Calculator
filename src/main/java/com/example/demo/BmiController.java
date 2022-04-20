package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class BmiController {

    @FXML
    private RadioButton womanID, manID;

    @FXML
    private TextField libraID, growthID;

    @FXML
    private Label resultID, valueID;

    @FXML
    private ToggleGroup toggleSex;


    public void handleButtonCalculate(MouseEvent mouseEvent) {
        double libra;
        double growth;
      //  try {
            libra = Double.parseDouble(libraID.getText());
            growth = Double.parseDouble(growthID.getText());
    //    } catch (NumberFormatException e){
      //      System.out.println("blad");
     //   }
        double result = calculateBmi(libra, growth);
        resultID.setText(String.valueOf(Math.round(result*100.0)/100.0));
        showMessage(result);
    }

    protected double calculateBmi(double libra, double growth){
        return libra / Math.pow(growth/100, 2);
    }

    protected void showMessage(double result){

        if(result < 16.0){
            valueID.setText("wygłodzenie");
        } else if(16.0 < result && result < 16.99){
            valueID.setText("wychudzenie");
        } else if(17.0 < result && result < 18.49){
            valueID.setText("niedowaga");
        } else if(18.5 < result && result < 24.99){
            valueID.setText("waga prawidłowa");
        } else if(25.0 < result && result < 29.99){
            valueID.setText("nadwaga");
        } else if(30.0 < result && result < 34.99){
            valueID.setText("I stopień otyłości");
        } else if(35.0 < result && result < 39.99){
            valueID.setText("II stopień otyłości");
        } else if(40.0 < result){
            valueID.setText("III stopień otyłości");
        }

    }
}
