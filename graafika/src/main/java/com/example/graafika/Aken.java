package com.example.graafika;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

import static javafx.scene.layout.BackgroundRepeat.NO_REPEAT;


public class Aken extends Application {
    @Override
    public void start(Stage aken) throws FileNotFoundException {

        //taustapilt, mille ma vb tööle saan//
        Image taustapilt = new Image(Objects.requireNonNull(getClass().getResourceAsStream("pardid.png")));
        Background taust = new Background (new BackgroundImage(taustapilt, NO_REPEAT, NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT));


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

        //teise akna kujundus//
        VBox teineLeht = new VBox();
        Button nupp2 = new Button("Nii on.");
        teineLeht.setSpacing(2);
        teineLeht.setPadding(new Insets(5));
        teineLeht.getChildren().addAll(küsinEkstistentsiaalseKüsimuse, vastus1, vastus2, vastus3, vastus4, vastus5, nupp2);


        //esimesest aknast teise liikumine: mouse event//
        Button nupp1 = new Button("Valmis!");
        nupp1.setOnMouseClicked(event -> {
            String suvalineSõna = vastabSuvaliselt.getText();
            try {
                if (suvalineSõna.isEmpty()) {
                    throw new TühiSisendErind(); //viskame erindi, woop!!//
                }
            }
            catch (TühiSisendErind e) {
                System.out.printf("Originaalne.");
            }
            Scene stseen2 = new Scene(teineLeht);

            aken.setScene(stseen2);
        });

        //esimesest aknast teise liikumine: key event//
        vastabSuvaliselt.setOnKeyPressed(k -> {
            if (k.getCode().equals(KeyCode.ENTER)) {
                String valitudSõna = vastabSuvaliselt.getText();
                aken.setScene(new Scene(teineLeht));
            }
        });

        //kolmas aken//
        Label viimneSoovitus1 = new Label("Su lemmiksõna on nats kahtlane ja ma ei ole kindel, kas su motiivid on ausad.. ");
        Label viimneSoovitus2 = new Label("..aga mängida võid ikka, i guess. ");
        Label viimneSoovitus3 = new Label("Käivita nüüd klass TegelaseLoomine. (a)");
        Button nupp3 = new Button("Vau, see oli antiklimaatiline.");


        //kolmanda akna kujundus//
        VBox kolmasLeht = new VBox();
        kolmasLeht.setPadding(new Insets(15));
        kolmasLeht.getChildren().addAll(viimneSoovitus1, viimneSoovitus2, viimneSoovitus3, nupp3);
        kolmasLeht.setBackground(taust);

        // teisest aknast kolmandasse liikumine: mouse//
        nupp2.setOnMouseClicked(event -> {
            RadioButton vastabEksistentsiaalselt = (RadioButton) nupugrupp.getSelectedToggle();
            String valitudSiinOlemisePõhjus = vastabEksistentsiaalselt.getText();
            aken.setScene(new Scene(kolmasLeht));
        });

        //teisest aknast kolmandasse liikumine: key//
        teineLeht.setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.ENTER))  {
                aken.setScene(new Scene(kolmasLeht));
            }
        });

        //viimase akna sulgemine//
        nupp3.setOnMouseClicked(event -> aken.close());

        GridPane esimeneLeht = new GridPane();
        esimeneLeht.add(küsinSuvaliselt, 0, 0);
        esimeneLeht.add(vastabSuvaliselt, 1, 0);
        esimeneLeht.add(nupp1, 0, 2);
        esimeneLeht.setHgap(5);
        esimeneLeht.setVgap(5);
        esimeneLeht.setPadding(new Insets(15));
        esimeneLeht.setBackground(taust);

        aken.setScene(new Scene(esimeneLeht));
        aken.show();
    }

    public static void main(String[] args) {
        launch();
    }
}