package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SimpleController {

    @FXML
    private Label result;

    @FXML
    private Label numbers;

    private float number1 = 0;
    private String operator = "";
    private boolean start = true;
    private Model model = new Model();

    public void processNumbers(ActionEvent event) {
        if(start){
            numbers.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        numbers.setText(numbers.getText()+value);
    }

    public void processOperators(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if(!value.equals("=")){
            if(!operator.isEmpty()){
                return;
            }
            operator = value;
            number1 = Float.parseFloat(numbers.getText());
            numbers.setText("");
        }else{
            if(operator.isEmpty()){
                return;
            }
            float number2 = Float.parseFloat(numbers.getText());
            float output = model.calculate(number1, number2, operator);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }

    public void processUnaryOperators(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

            if(!operator.isEmpty()){
                return;
            }
            operator = value;
            number1 = Float.parseFloat(numbers.getText());
            numbers.setText("");


            float output = model.calculateUnary(number1, operator);
            result.setText(String.valueOf(output));
            operator = "";
             start = true;
    }

    public void processDelete(ActionEvent event) {
        operator = "";
        start = true;
        numbers.setText("");
        result.setText("");
    }
}
