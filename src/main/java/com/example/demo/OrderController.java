package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class OrderController {

    @FXML
    private ComboBox ComboBoxWork;

    @FXML
    public void initialize() {
        ComboBoxWork.getItems().removeAll(ComboBoxWork.getItems());
        ComboBoxWork.getItems().addAll("brutto", "netto", "koszty pracodawcy");

    }

}
