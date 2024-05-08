package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;

public class AppView {

    SystemModel sysmod = SystemModel.getInstance();

    public Scene showMenu(){
        Group root = new Group();
        Scene menu = new Scene(root, sysmod.getScreenWidth(), sysmod.getScreenHeight());

        Label title = new Label("Lydear");
        title.setLayoutX(sysmod.getScreenWidth()/1.3);
        title.setLayoutY(sysmod.getScreenHeight()/3);
        root.getChildren().add(title);

        addButton(root, "Play", 500.00, 380.00);
        addButton(root, "Settings", 500.00, 480.00);
        addButton(root, "Exit", 500.00, 580.00);

        return menu;
    }

    private void addButton(Group root, String label, Double x, Double y){
        Font font = new Font("Ariel", 20.0);

        Button button = new Button(label);
        button.setMinSize(200, 60);
        button.setLayoutX(x);
        button.setLayoutY(y);
        button.setFont(font);

        root.getChildren().add(button);
    }

}
