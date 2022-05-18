package com.example.graafika;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage pealava) throws IOException, InterruptedException {
        Group juur = new Group(); // luuakse juur
        Canvas lõuend = new Canvas(535, 535); // luuakse lõuend
        juur.getChildren().add(lõuend);  // lõuend lisatakse juure alluvaks
        Scene stseen1, stseen2;

        Text väljastatavTekst = new Text();
        väljastatavTekst.setX(10);
        väljastatavTekst.setY(10);
        String tekst = "Tekstikatse on parim katse.";
        väljastatavTekst.setText(tekst);

        Label küsimus = new Label("Sisesta enda nimi: ");
        küsimus.setLayoutX(10);
        küsimus.setLayoutY(20);
        TextField tekstiala = new TextField();
        VBox sisestamisKastike = new VBox();
        sisestamisKastike.setLayoutX(10);
        sisestamisKastike.setLayoutY(40);
        Button nupp = new Button("Valisin nime ära!");
        nupp.setLayoutX(10);
        nupp.setLayoutY(70);
        sisestamisKastike.getChildren().addAll(küsimus, tekstiala, nupp);
        String nimi = tekstiala.getText();
        stseen1 = new Scene(sisestamisKastike, 200, 200);

        Mängija mängija = new Mängija(nimi);
        Text mängijaInfo = new Text(mängija.toString());
        mängijaInfo.setX(10);
        mängijaInfo.setY(80);
        VBox lehekülg2 = new VBox(mängijaInfo);
        lehekülg2.getChildren().add(lehekülg2);
        stseen2 = new Scene(lehekülg2, 200, 200);
        nupp.setOnAction(event -> {
            pealava.setScene(stseen2);
        });

        pealava.setTitle("Seiklus!!");  // lava tiitelribale pannakse tekst
        pealava.setScene(stseen1);  // lavale lisatakse stseen
        pealava.show();  // lava tehakse nähtavaks
    }

    public static void main(String[] args) {
        launch();
    }
}