package com.example.demo;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class RenovationController {

    @FXML
    private Pane paneRenovation;

    public void handleButtonPaint() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("renovationFXML/paint.fxml"));
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

    public void handleButtonWallpaper() {
        try{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("renovationFXML/wallpaper.fxml"));
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
        this.paneRenovation.getChildren().clear();
        this.paneRenovation.getChildren().add(pane);
    }
}
