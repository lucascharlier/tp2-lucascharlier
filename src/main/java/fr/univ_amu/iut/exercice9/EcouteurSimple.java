package fr.univ_amu.iut.exercice9;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;


public class EcouteurSimple implements EventHandler<ActionEvent> {

    public void handle(ActionEvent event) {
        System.out.println("Bouton actionné");
    }
};