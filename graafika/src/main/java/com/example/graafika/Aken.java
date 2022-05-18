package com.example.graafika;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Aken extends Application {
    @Override
    public void start(Stage aken) {
        Label küsinNime = new Label("Sisesta enda tegelase nimi: ");
        TextField sisestaNimi = new TextField();

        Label küsinTunked = new Label("Milliseid tunkesid tahad?");
        final ToggleGroup nupugrupp = new ToggleGroup();
        RadioButton tunked1 = new RadioButton("lillelisi");
        tunked1.setSelected(true);
        tunked1.setToggleGroup(nupugrupp);
        RadioButton tunked2 = new RadioButton("triibulisi");
        tunked2.setToggleGroup(nupugrupp);
        RadioButton tunked3 = new RadioButton("oranže");
        tunked3.setToggleGroup(nupugrupp);
        RadioButton tunked4 = new RadioButton("mummulisi");
        tunked4.setToggleGroup(nupugrupp);
        RadioButton tunked5 = new RadioButton("laigulisi");
        tunked5.setToggleGroup(nupugrupp);
        RadioButton tunked6 = new RadioButton("üllata mind!");
        tunked6.setToggleGroup(nupugrupp);

        VBox teineLeht = new VBox();
        teineLeht.setSpacing(2);
        teineLeht.setPadding(new Insets(5));
        teineLeht.getChildren().addAll(küsinTunked, tunked1, tunked2, tunked3, tunked4, tunked5, tunked6);

        Button nupp1 = new Button("Valmis!");
        nupp1.setOnMouseClicked(event -> {
            String nimi = sisestaNimi.getText();
            RadioButton valitudTunked = (RadioButton) nupugrupp.getSelectedToggle();
            String tunked = valitudTunked.getText();
            aken.setScene(new Scene(teineLeht));

        });

        GridPane esimeneLeht = new GridPane();
        esimeneLeht.add(küsinNime, 0, 0);
        esimeneLeht.add(sisestaNimi, 1, 0);
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