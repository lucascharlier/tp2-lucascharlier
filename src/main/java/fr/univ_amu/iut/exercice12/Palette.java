package fr.univ_amu.iut.exercice12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Palette extends Application {

    private int nbVert = 0;
    private int nbRouge = 0;
    private int nbBleu = 0;

    private Label label;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private HBox haut;
    private Pane panneau;
    private HBox bas;

    @Override
    public void start(Stage primaryStage) throws Exception {
        EventHandler<ActionEvent> vButtonEcouteur = event -> {
            panneau.setStyle("-fx-background-color: green");
            nbVert++;
            label.setText("Bouton vert actionné " + Integer.toString(nbVert) + " fois");
        };

        EventHandler<ActionEvent> rButtonEcouteur = event -> {
            panneau.setStyle("-fx-background-color: red");
            nbRouge++;
            label.setText("Bouton rouge actionné " + Integer.toString(nbRouge) + " fois");
        };

        EventHandler<ActionEvent> bButtonEcouteur = event -> {
            panneau.setStyle("-fx-background-color: dodgerblue");
            nbBleu++;
            label.setText("Bouton bleu actionné " + Integer.toString(nbBleu) + " fois");
        };

        label = new Label();

        vert = new Button("Vert");
        vert.setId("vButton");
        vert.setOnAction(vButtonEcouteur);

        rouge = new Button("Rouge");
        rouge.setId("rButton");
        rouge.setOnAction(rButtonEcouteur);

        bleu = new Button("Bleu");
        bleu.setId("bButton");
        bleu.setOnAction(bButtonEcouteur);

        haut = new HBox();
        haut.setPrefSize(400,50);
        haut.setStyle("-fx-border-style: solid inside;" +
                "-fx-border-width: 1;" +
                "-fx-border-color: black;");
        haut.getChildren().addAll(vert, rouge, bleu);
        haut.setAlignment(Pos.CENTER);
        haut.setMargin(vert ,new Insets(10,10,0,0));
        haut.setMargin(rouge ,new Insets(10,10,0,0));
        haut.setMargin(bleu ,new Insets(10,10,0,0));

        panneau = new Pane();
        panneau.setPrefSize(400,200);
        panneau.setStyle(" -fx-background-color : grey");

        bas = new HBox();
        bas.setPrefSize(400,50);
        bas.setStyle("-fx-border-style: solid inside;" +
                "-fx-border-width: 1;" +
                "-fx-border-color: black;");
        bas.getChildren().add(label);
        bas.setAlignment(Pos.CENTER);

        root = new BorderPane();
        root.resize(400,300);
        root.setTop(haut);
        root.setCenter(panneau);
        root.setBottom(bas);

        Scene scene = new Scene(root);

        primaryStage.setTitle("Palette");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}