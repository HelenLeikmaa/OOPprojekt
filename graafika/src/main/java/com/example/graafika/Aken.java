package com.example.graafika;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Aken extends Application {
    @Override
    public void start(Stage aken) {

        //esimene aken//
        Label küsinSuvaliselt = new Label("Sisesta vabalt valitud sõna (et saaksid mängimise jaoks sõrmed soojaks): ");
        TextField vastabSuvaliselt = new TextField();

        //teine aken//
        Label küsinEkstistentsiaalseKüsimuse = new Label("Miks oled siin?");
        final ToggleGroup nupugrupp = new ToggleGroup();
        RadioButton vastus1 = new RadioButton("Tahan hirmsasti mängida ^^.");
        vastus1.setSelected(true);
        vastus1.setToggleGroup(nupugrupp);
        RadioButton vastus2 = new RadioButton("Juhendaja sunnib:/");
        vastus2.setToggleGroup(nupugrupp);
        RadioButton vastus3 = new RadioButton("Mul on igav.");
        vastus3.setToggleGroup(nupugrupp);
        RadioButton vastus4 = new RadioButton("Mind sunnitakse õpilaste töid parandama.");
        vastus4.setToggleGroup(nupugrupp);
        RadioButton vastus5 = new RadioButton("Miks üldse keegi siin on? Eksistents on kannatus.");
        vastus5.setToggleGroup(nupugrupp);

        VBox teineLeht = new VBox();
        teineLeht.setSpacing(2);
        teineLeht.setPadding(new Insets(5));
        teineLeht.getChildren().addAll(küsinEkstistentsiaalseKüsimuse, vastus1, vastus2, vastus3, vastus4, vastus5);

        Button nupp1 = new Button("Valmis!");
        nupp1.setOnMouseClicked(event -> {
            String suvalineSõna = vastabSuvaliselt.getText();
            aken.setScene(new Scene(teineLeht));
        });

        vastabSuvaliselt.setOnKeyPressed(k -> {
            if (k.getCode().equals(KeyCode.ENTER)) {
                RadioButton valitudTunked = (RadioButton) nupugrupp.getSelectedToggle();
                String tunked = valitudTunked.getText();
                aken.setScene(new Scene(teineLeht));
            }
        });

        GridPane esimeneLeht = new GridPane();
        esimeneLeht.add(küsinSuvaliselt, 0, 0);
        esimeneLeht.add(vastabSuvaliselt, 1, 0);
        esimeneLeht.add(nupp1, 0, 2);
        esimeneLeht.setHgap(5);
        esimeneLeht.setVgap(5);
        esimeneLeht.setPadding(new Insets(15));

        Scene stseen1 = new Scene(esimeneLeht);
        aken.setScene(stseen1);
        aken.show();

    }

    public static void main(String[] args) {
        launch();
    }
}