package org.finalproj.musictheoryapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {
    @FXML
    private Label welcomeText;

    AppModel model;
    AppView view;


    public AppController(){}
    public AppController(AppModel model, AppView view){
        this.model = model;
        this.view = view;
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
//    protected void onPlayButtonClick(){ view.play.setOnAction(e -> AppMain.stage.setScene());}
    protected void onSettingsButtonClick(){}
    protected void onQuitButtonClick(){ System.exit(0); }
}