package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class WallpaperController {

    @FXML
    private Label numberRolls1, areaRolls1, cost1;

    @FXML
    private Label numberRolls2, areaRolls2, cost2;

    @FXML
    private Label stockRolls, text;

    @FXML
    private TextField wallWidth1, wallWidth2, wallWidth3, wallWidth4;

    @FXML
    private TextField wallHeight1, wallHeight2, wallHeight3, wallHeight4;

    @FXML
    private TextField doorWidth1, doorWidth2, doorHeight1, doorHeight2;

    @FXML
    private TextField windowWidth1, windowWidth2, windowHeight1, windowHeight2;

    @FXML
    private TextField rollWidth, rollHeight;

    @FXML
    private TextField stock, price;

    public void handleButtonCalculate() {
        calculate();
    }

    public void calculate(){

        double wallW1 = Double.parseDouble(wallWidth1.getText());
        double wallW2 = Double.parseDouble(wallWidth2.getText());
        double wallW3 = Double.parseDouble(wallWidth3.getText());
        double wallW4 = Double.parseDouble(wallWidth4.getText());

        double wallH1 = Double.parseDouble(wallHeight1.getText());
        double wallH2 = Double.parseDouble(wallHeight2.getText());
        double wallH3 = Double.parseDouble(wallHeight3.getText());
        double wallH4 = Double.parseDouble(wallHeight4.getText());

        double surfaceWall1 = wallW1 * wallH1;
        double surfaceWall2 = wallW2 * wallH2;
        double surfaceWall3 = wallW3 * wallH3;
        double surfaceWall4 = wallW4 * wallH4;

        double doorW1 = Double.parseDouble(doorWidth1.getText());
        double doorW2 = Double.parseDouble(doorWidth2.getText());
        double doorH1 = Double.parseDouble(doorHeight1.getText());
        double doorH2 = Double.parseDouble(doorHeight2.getText());

        double surfaceDoor = doorW1 * doorH1 + doorW2 * doorH2;

        double windowW1 = Double.parseDouble(windowWidth1.getText());
        double windowW2 = Double.parseDouble(windowWidth2.getText());
        double windowH1 = Double.parseDouble(windowHeight1.getText());
        double windowH2 = Double.parseDouble(windowHeight2.getText());

        double surfaceWindow = windowW1 * windowH1 + windowW2 * windowH2;
        double surface = surfaceWindow + surfaceDoor;
        double surface2 = surfaceWall1 + surfaceWall2 + surfaceWall3 + surfaceWall4 + surface;
        double surface3 = surfaceWall1 + surfaceWall2 + surfaceWall3 + surfaceWall4 - surface;

        double rollW = Double.parseDouble(rollWidth.getText());
        double rollH = Double.parseDouble(rollHeight.getText());

        double surfaceRoll = rollH * rollW;
        double surfaceRolls1 = surface2 / surfaceRoll;
        double surfaceRolls2 = surface3 / surfaceRoll;

        double stocks = Double.parseDouble(stock.getText());

        double runningMeter = (wallW1 / rollW) * (wallH1 + stocks) + (wallW2 / rollW) * (wallH2 + stocks) + (wallW3 / rollW) * (wallH3 + stocks) + (wallW4 / rollW) * (wallH4 + stocks);
        double runningMeter2 = (doorW1 / rollW) * (doorH1 - stocks) + (doorW2 / rollW) * (doorH2 - stocks) + (windowW1 / rollW) * (windowH1 - stocks) + (windowW2 / rollW) * (windowH2 - stocks);
        double runningMeter3 = runningMeter - runningMeter2;

        double prices = Double.parseDouble(price.getText());
        double cost = prices * Math.round(surfaceRolls1);
        double costs = prices * Math.round(surfaceRolls2);

        numberRolls1.setText("Ilość rolek tapety bez odjęcia powierzchni okien i drzwi: " + Math.round(surfaceRolls1));
        areaRolls1.setText("Ilość potrzebnej tapety w mb: " + Math.round(runningMeter*100.0)/100.0);
        cost1.setText("Koszt: " + Math.round(cost*100.0)/100.0 + " zł");

        numberRolls2.setText("Ilość rolek tapety po odjęciu powierzchni okien i drzwi: " + Math.round(surfaceRolls2));
        areaRolls2.setText("Ilość potrzebnej tapety w mb: " + Math.round(runningMeter3*100.0)/100.0);
        cost2.setText("Koszt: " + Math.round(costs*100.0)/100.0 + " zł");

        stockRolls.setText("Do każdego pasa tapety dodano " + stocks + " cm zapasu .");

        text.setText("Jeśli tapeta posiada wzory i istnieje konieczność ich dopasowania należy pamiętać o uwzględnieniu większych zapasów.");

    }
}
