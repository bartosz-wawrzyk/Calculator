package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PaintController {

    @FXML
    private Label wall, wall1, wall2, wall3, wall4;

    @FXML
    private Label unpainted, totalarea, painted, painting, cost;

    @FXML
    private TextField wallWidth1, wallWidth2, wallWidth3, wallWidth4;

    @FXML
    private TextField wallHeight1, wallHeight2, wallHeight3, wallHeight4;

    @FXML
    private TextField doorWidth1, doorWidth2, doorHeight1, doorHeight2;

    @FXML
    private TextField windowWidth1, windowWidth2, windowHeight1, windowHeight2;

    @FXML
    private TextField covering, price;

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

        double coverings = Double.parseDouble(covering.getText());
        double surfaceCovering = surface3 / coverings;

        double prices = Double.parseDouble(price.getText());
        double surfacePrices = prices * surfaceCovering;

        wall.setText("Powierzchnia ścian");
        wall1.setText("Ściana 1 - " + Math.round(surfaceWall1*100.0)/100.0 + " m2");
        wall2.setText("Ściana 2 - " + Math.round(surfaceWall2*100.0)/100.0 + " m2");
        wall3.setText("Ściana 3 - " + Math.round(surfaceWall3*100.0)/100.0 + " m2");
        wall4.setText("Ściana 4 - " + Math.round(surfaceWall4*100.0)/100.0 + " m2");

        unpainted.setText("Powierzchnia niemalowana - " + Math.round(surface*100.0)/100.0 + " m2");

        totalarea.setText("Całkowita powierzchnia z powierzchnią okien i drzwi - " + Math.round(surface2*100.0)/100.0 + " m2");

        painted.setText("Powierzchnia do pomalowania (po odjęciu dżwi i okien) - " + Math.round(surface3*100.0)/100.0 + " m2");

        painting.setText("Na pomalowanie całej powierzchni potrzebujesz " + Math.round(surfaceCovering*100.0)/100.0 + " pojemniki z farbą");

        cost.setText("Koszt zakupu farby wyniesie - " + Math.round(surfacePrices*100.0)/100.0 + " zł");

    }

}
