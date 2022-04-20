package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComponentController {

    @FXML
    private TextField capitalID, interestID, numberID;

    @FXML
    private Label resultID, textID, textNumberID, text2ID, textCapitalID;

    @FXML
    private Label text3ID, text4ID, textInterestID, text5ID;

    @FXML
    public void initialize() {


    }

    protected double calculate(double capital, double interest, double number){

        return capital * Math.pow((1+interest/100),number);
    }

    public void handleButtonCalculate() {
        double capital;
        double interest;
        double number;

        capital = Double.parseDouble(capitalID.getText());
        interest = Double.parseDouble(interestID.getText());
        number = Double.parseDouble(numberID.getText());

        double result = calculate(capital, interest, number);
        resultID.setText(Math.round(result*100.0)/100.0 + " zł");
        showMessage(capital, interest, number);

    }

    public void showMessage(double capital, double interest, double number){
        textID.setText("Stan konta po");
        textNumberID.setText(String.valueOf(number));
        text2ID.setText("latach jeśli wpłacimy");
        textCapitalID.setText(capital + " zł");
        text3ID.setText("zł na lokatę oprocentowaną");
        textInterestID.setText(interest + "%");
        text4ID.setText("w skali roku.");
        text5ID.setText("wynosi");
    }
}
