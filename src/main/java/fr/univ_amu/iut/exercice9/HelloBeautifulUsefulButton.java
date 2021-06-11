package fr.univ_amu.iut.exercice9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloBeautifulUsefulButton extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        EcouteurSimple ecouteur = new EcouteurSimple();
        Image image = new Image("https://raw.githubusercontent.com/IUTInfoAix-M2105/Syllabus/master/assets/logo.png");
        ImageView view = new ImageView(image);

        Button myButton = new Button("Hello !");
        myButton.setId("buttonHello");
        myButton.setGraphic(view);
        myButton.setPrefSize(150,150);
        myButton.setOnAction(ecouteur);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(myButton);

        Scene scene = new Scene (borderPane,248,221);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("DarkTheme.css").toExternalForm());

        primaryStage.setTitle("Hello !");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}