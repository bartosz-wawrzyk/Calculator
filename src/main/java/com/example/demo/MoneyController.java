package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MoneyController {

    @FXML
    private TextField cashID;

    @FXML
    private ComboBox currencyID;

    @FXML
    private ComboBox convertToID;

    @FXML
    private Label convertedID;

    @FXML
    private Label resultID;

    @FXML
    private Label courseResultID;

    protected final double euro = 0.2118;
    protected final double dolar = 0.2326;
    protected final double dolarnazl = 4.2624;
    protected final double euronazl = 4.6841;



    @FXML
    public void initialize() {
        currencyID.getItems().removeAll(currencyID.getItems());
        currencyID.getItems().addAll("zł", "euro", "dolar");
        convertToID.getItems().removeAll(convertToID.getItems());
        convertToID.getItems().addAll("zł", "euro", "dolar");
    }

    public void convert(){
        Alert wrong = new Alert(Alert.AlertType.INFORMATION);
        double cash = Double.parseDouble(cashID.getText());

        if(currencyID.getSelectionModel().isEmpty() || convertToID.getSelectionModel().isEmpty()){
            wrong.setAlertType((Alert.AlertType.INFORMATION));
            wrong.setContentText("Wybierz waluty");
            wrong.show();
        }else{

            if(currencyID.getSelectionModel().getSelectedItem() == "zł" && convertToID.getSelectionModel().getSelectedItem() == "euro"){
                double result = calculateMoney(cash,1);
                resultID.setText(String.valueOf(Math.round(result*100.0)/100.0));
                convertedID.setText("Kurs : " + euro);
            }else if(currencyID.getSelectionModel().getSelectedItem() == "zł" && convertToID.getSelectionModel().getSelectedItem() == "dolar"){
                double result = calculateMoney(cash,2);
                resultID.setText(String.valueOf(Math.round(result*100.0)/100.0));
                convertedID.setText("Kurs : " + dolar);
            }else if(currencyID.getSelectionModel().getSelectedItem() == "dolar" && convertToID.getSelectionModel().getSelectedItem() == "zł"){
                double result = calculateMoney(cash,3);
                resultID.setText(String.valueOf(Math.round(result*100.0)/100.0));
                convertedID.setText("Kurs : " + dolarnazl);
            }else if(currencyID.getSelectionModel().getSelectedItem() == "euro" && convertToID.getSelectionModel().getSelectedItem() == "zł"){
                double result = calculateMoney(cash,4);
                resultID.setText(String.valueOf(Math.round(result*100.0)/100.0));
                convertedID.setText("Kurs : " + euronazl);
            } else if (currencyID.getSelectionModel().getSelectedItem() == "zł" && convertToID.getSelectionModel().getSelectedItem() == "zł"){
                wrong.setAlertType(Alert.AlertType.INFORMATION);
                wrong.setContentText("Błąd - te same waluty");
                wrong.show();
            } else if (currencyID.getSelectionModel().getSelectedItem() == "dolar" && convertToID.getSelectionModel().getSelectedItem() == "dolar"){
                wrong.setAlertType(Alert.AlertType.INFORMATION);
                wrong.setContentText("Błąd - te same waluty");
                wrong.show();
            } else if (currencyID.getSelectionModel().getSelectedItem() == "euro" && convertToID.getSelectionModel().getSelectedItem() == "euro"){
                wrong.setAlertType(Alert.AlertType.INFORMATION);
                wrong.setContentText("Błąd - te same waluty");
                wrong.show();
            }

        }
    }

    public void ButtonConvert() {
            convert();
    }

    protected double calculateMoney(double cash, int i){
        if (i == 1) {
            return cash * euro;
        }else if(i == 2){
            return cash * dolar;
        }else if(i == 3){
            return cash * dolarnazl;
        }else if(i == 4){
            return cash * euronazl;
        }

        return 0;
    }

}
