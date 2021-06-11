package fr.univ_amu.iut.exercice7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class HelloButton extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button myButton = new Button("Hello !");
        myButton.setId("buttonHello");

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(myButton);

        primaryStage.setTitle("Hello !");
        primaryStage.setScene(new Scene(borderPane,248,71));
        primaryStage.show();
    }
}