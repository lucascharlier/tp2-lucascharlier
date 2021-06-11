package fr.univ_amu.iut.exercice6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloLabel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label1 = new Label ("Hello !");
        label1.setId("labelhello");

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(label1);

        primaryStage.setTitle("Hello !");
        primaryStage.setScene(new Scene(borderPane, 250, 100));
        primaryStage.show();
    }
}