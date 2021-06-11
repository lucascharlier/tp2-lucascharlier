package fr.univ_amu.iut.exercice11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloBeautifulUsefulButton extends Application {
    private int nbAction = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        EventHandler<ActionEvent> ecouteur = event -> {
            nbAction++;
            System.out.println("Bouton actionné " + nbAction + " fois");
        };

        Image img = new Image("https://raw.githubusercontent.com/IUTInfoAix-M2105/Syllabus/master/assets/logo.png");
        ImageView view = new ImageView(img);

        Button myButtton = new Button("Hello !");
        myButtton.setId("buttonHello");
        myButtton.setPrefSize(150,150);
        myButtton.setGraphic(view);
        myButtton.setOnAction(ecouteur);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(myButtton);

        Scene scene = new Scene(borderPane);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("DarkTheme.css").toExternalForm());

        primaryStage.setTitle("Hello !");
        primaryStage.setHeight(250);
        primaryStage.setWidth(250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}