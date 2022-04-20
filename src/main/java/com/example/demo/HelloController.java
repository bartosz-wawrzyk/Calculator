package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class HelloController {

    @FXML
    private Pane mainPane;

    @FXML
    private Button buttonSimple;

//    @FXML
//    private void initialize(){
//        buttonSimple.setOnMouseEntered(e -> buttonSimple.setStyle("-fx-border-color: green;-fx-background-color: #999999"));
//        buttonSimple.setOnMouseExited(e -> buttonSimple.setStyle("-fx-border-color:  #999999; -fx-background-color: #999999"));
//    }

    public void handleButtonSimple() {
        try{
                FXMLLoader loader = new FXMLLoader(this.getClass().getResource("simple.fxml"));
                Pane pane = null;
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
        this.mainPane.getChildren().clear();
        this.mainPane.getChildren().add(pane);
    }

    public void handleButtonHome() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("home.fxml"));
            Pane pane = null;
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

    public void handleButtonConvert() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("money.fxml"));
            Pane pane = null;
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

    public void handleButtonSalary() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("finances.fxml"));
            Pane pane = null;
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

    public void handleButtonBMI() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("bmi.fxml"));
            Pane pane = null;
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

    public void handleButtonRenovation() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("renovations.fxml"));
            Pane pane = null;
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
}