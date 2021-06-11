package fr.univ_amu.iut.exercice8;

import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class HelloBeautifulButton extends Application {
    @Override
    public void start(Stage primaryStage) {

        Image image = new Image("https://raw.githubusercontent.com/IUTInfoAix-M2105/Syllabus/master/assets/logo.png");
        ImageView view = new ImageView(image);

        Button myButton = new Button("Hello !");
        myButton.setId("buttonHello");
        myButton.setGraphic(view);
        myButton.setPrefSize(150,150);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(myButton);

        Scene scene = new Scene (borderPane,248,221);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("DarkTheme.css").toExternalForm());

        primaryStage.setTitle("Hello !");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}