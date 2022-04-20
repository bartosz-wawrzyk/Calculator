package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoanController {

    @FXML
    private TextField cashID, periodID, interestID;

    @FXML
    private Label installmentID, sumID;

    public void handleButtonCalculate(){
        calculate();
    }

    public void calculate() {
        Alert wrong = new Alert(Alert.AlertType.INFORMATION);
        double cash = Double.parseDouble(cashID.getText());
        double period = Double.parseDouble(periodID.getText());
        double interest = Double.parseDouble(interestID.getText());


        if (cashID.getText().isEmpty() || periodID.getText().isEmpty() || interestID.getText().isEmpty()) {
            wrong.setAlertType((Alert.AlertType.INFORMATION));
            wrong.setContentText("Uzupełnij dane");
            wrong.show();
        } else {
            double installment = calculateInstallment(cash, period, interest);
            double sum = cash + installment;
            installmentID.setText("Wysokość raty: " + Math.round(installment*100.0)/100.0 + "zł");
            sumID.setText("Całkowita kwota do spłaty: " + Math.round(sum*100.0)/100.0 + "zł");
        }
    }

    protected double calculateInstallment(double money, double period, double interest) {
        interest = (interest/100)/12;
        period = period * 12;
        return (money * interest) / (1 - Math.pow(1 + interest, -period));
    }


}
