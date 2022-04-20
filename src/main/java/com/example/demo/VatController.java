package com.example.demo;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VatController {

    @FXML
    private ComboBox cashID, vatID;

    @FXML
    private TextField moneyID;

    @FXML
    private Label resultBruttoID, resultNettoID, resultVATID;

    @FXML
    public void initialize() {
        cashID.getItems().removeAll(cashID.getItems());
        cashID.getItems().addAll("brutto", "netto");
        vatID.getItems().removeAll(vatID.getItems());
        vatID.getItems().addAll("23%", "8%", "5%", "22%", "7%", "3%");
    }


    public void handleButtonCalculate(){
        calculate();
    }

    public void calculate(){
        Alert wrong = new Alert(Alert.AlertType.INFORMATION);
        double money = Double.parseDouble(moneyID.getText());


        if(cashID.getSelectionModel().isEmpty() || vatID.getSelectionModel().isEmpty()){
            wrong.setAlertType((Alert.AlertType.INFORMATION));
            wrong.setContentText("Wybierz opcje");
            wrong.show();
        }else{

            if(cashID.getSelectionModel().getSelectedItem() == "brutto"){
                if(vatID.getSelectionModel().getSelectedItem() == "23%"){
                    double result = calculateMoney(money,1);
                    double vat = money - result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(money*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(result*100.0)/100.0);
                    resultVATID.setText("Kwota VAT " + Math.round(vat*100.0)/100.0);
                } else if(vatID.getSelectionModel().getSelectedItem() == "8%"){
                    double result = calculateMoney(money,3);
                    double vat = money - result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(money*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(result*100.0)/100.0);
                    resultVATID.setText("Kwota VAT " + Math.round(vat*100.0)/100.0);
                } else if(vatID.getSelectionModel().getSelectedItem() == "5%"){
                    double result = calculateMoney(money,5);
                    double vat = money - result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(money*100.0)/100.0 + "zł");
                    resultNettoID.setText("Kwota netto: " + Math.round(result*100.0)/100.0 + "zł");
                    resultVATID.setText("Kwota VAT " + Math.round(vat*100.0)/100.0 + "zł");
                } else if(vatID.getSelectionModel().getSelectedItem() == "22%"){
                    double result = calculateMoney(money,7);
                    double vat = money - result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(money*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(result*100.0)/100.0);
                    resultVATID.setText("Kwota VAT " + Math.round(vat*100.0)/100.0);
                } else if(vatID.getSelectionModel().getSelectedItem() == "7%"){
                    double result = calculateMoney(money,9);
                    double vat = money - result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(money*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(result*100.0)/100.0);
                    resultVATID.setText("Kwota VAT " + Math.round(vat*100.0)/100.0);
                } else if(vatID.getSelectionModel().getSelectedItem() == "3%"){
                    double result = calculateMoney(money,11);
                    double vat = money - result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(money*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(result*100.0)/100.0);
                    resultVATID.setText("Kwota VAT " + Math.round(vat*100.0)/100.0);
                }
            } else if(cashID.getSelectionModel().getSelectedItem() == "netto"){
                if(vatID.getSelectionModel().getSelectedItem() == "23%"){
                    double result = calculateMoney(money,2);
                    double brutto = money + result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(brutto*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(money*100.0)/100.0);
                    resultVATID.setText("Kwota VAT: " + Math.round(result*100.0)/100.0);
                } else if(vatID.getSelectionModel().getSelectedItem() == "8%"){
                    double result = calculateMoney(money,4);
                    double brutto = money + result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(brutto*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(money*100.0)/100.0);
                    resultVATID.setText("Kwota VAT: " + Math.round(result*100.0)/100.0);
                } else if(vatID.getSelectionModel().getSelectedItem() == "5%"){
                    double result = calculateMoney(money,6);
                    double brutto = money + result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(brutto*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(money*100.0)/100.0);
                    resultVATID.setText("Kwota VAT: " + Math.round(result*100.0)/100.0);
                } else if(vatID.getSelectionModel().getSelectedItem() == "22%"){
                    double result = calculateMoney(money,8);
                    double brutto = money + result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(brutto*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(money*100.0)/100.0);
                    resultVATID.setText("Kwota VAT: " + Math.round(result*100.0)/100.0);
                } else if(vatID.getSelectionModel().getSelectedItem() == "7%"){
                    double result = calculateMoney(money,10);
                    double brutto = money + result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(brutto*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(money*100.0)/100.0);
                    resultVATID.setText("Kwota VAT: " + Math.round(result*100.0)/100.0);
                } else if(vatID.getSelectionModel().getSelectedItem() == "3%"){
                    double result = calculateMoney(money,12);
                    double brutto = money + result;
                    resultBruttoID.setText("Kwota brutto: " + Math.round(brutto*100.0)/100.0);
                    resultNettoID.setText("Kwota netto: " + Math.round(money*100.0)/100.0);
                    resultVATID.setText("Kwota VAT: " + Math.round(result*100.0)/100.0);
                }
            }

        }
    }


    protected double calculateMoney(double money, int i) {
        if (i == 1) { // brutto 23
            return money/1.23;
        } else if(i == 2) { // netto 23
            return money * 0.23;
        } else if(i == 3) { // brutto 8
            return money/1.08;
        } else if(i == 4) { // netto 8
            return money * 0.08;
        } else if(i == 5) { // brutto 5
            return money/1.05;
        } else if(i == 6) { // netto 5
            return money * 0.05;
        } else if(i == 7) { // brutto 22
            return money/1.22;
        } else if(i == 8) { // netto 22
            return money * 0.22;
        } else if(i == 9) { // brutto 7
            return money/1.07;
        } else if(i == 10) { // netto 7
            return money * 0.07;
        } else if(i == 11) { // brutto 3
            return money/1.03;
        } else if(i == 12) { // netto 3
            return money * 0.03;
        }

        return 0;
    }

}
