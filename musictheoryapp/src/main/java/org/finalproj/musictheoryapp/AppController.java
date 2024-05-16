package org.finalproj.musictheoryapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {
    AppModel model;
    AppView view;

    public AppController(){}
    public AppController(AppModel model, AppView view){
        this.model = model;
        this.view = view;
    }
}