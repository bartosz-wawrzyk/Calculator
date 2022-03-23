package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    private ComboBox courseID;

    @FXML
    private Label courseResultID;

    private double euro = 4.86;



    @FXML
    public void initialize() {
        currencyID.getItems().removeAll(currencyID.getItems());
        currencyID.getItems().addAll("zł", "euro", "dolar","1");
        convertToID.getItems().removeAll(convertToID.getItems());
        convertToID.getItems().addAll("zł", "euro", "dolar","2");
        courseID.getItems().removeAll(currencyID.getItems());
        courseID.getItems().addAll("zł", "euro", "dolar");
    }

    public void  convert(){
        Alert wrong = new Alert(Alert.AlertType.INFORMATION);
      //  String cash = cashID.getSelectedText();



        if(currencyID.getSelectionModel().isEmpty() || convertToID.getSelectionModel().isEmpty()){
            wrong.setAlertType((Alert.AlertType.INFORMATION));
            wrong.setContentText("Wybierz waluty");
            wrong.show();
        }else{
        //    cashID.getSelectedText();
            if(currencyID.getSelectionModel().getSelectedItem() == "zł" && currencyID.getSelectionModel().getSelectedItem() == "euro"){
               // Double wynik = number * euro;
             //   System.out.println(wynik);
            }else{
                System.out.println("cos ineog");
            }


        }
    }

    public void ButtonConvert() {
       convert();


    }
}
