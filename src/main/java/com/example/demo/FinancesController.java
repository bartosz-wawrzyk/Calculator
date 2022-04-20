package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class FinancesController {

    @FXML
    private Pane paneSalary;



    public void handleButtonComponent() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("financesFXML/component.fxml"));
            Pane pane = new Pane();
            try {
                pane = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            setScreen(pane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handleButtonVat() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("financesFXML/vat.fxml"));
            Pane pane = new Pane();
            try {
                pane = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            setScreen(pane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handleButtonLoan() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("financesFXML/loan.fxml"));
            Pane pane = new Pane();
            try {
                pane = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            setScreen(pane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void setScreen(Pane pane) {
        this.paneSalary.getChildren().clear();
        this.paneSalary.getChildren().add(pane);
    }
}
