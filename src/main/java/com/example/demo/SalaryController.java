package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class SalaryController {

    @FXML
    private Pane paneSalary;



    public void handleButtonWork() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("salaryFXML/work.fxml"));
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

    public void handleButtonOrder() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("salaryFXML/order.fxml"));
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

    public void handleButtonJob() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("salaryFXML/job.fxml"));
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
