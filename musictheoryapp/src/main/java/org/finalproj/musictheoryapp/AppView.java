package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;

public class AppView {
    SystemModel sysmod = SystemModel.getInstance();
    Font titleFont = new Font("Ubuntu", 40.0);
    Font buttonFont = new Font("Ariel", 20.0);
    Group root = new Group();
    Scene mainscene = new Scene(root);

    public void showMenu(){
        root.getChildren().clear();

        Label title = new Label("Lydear");
        title.setFont(titleFont);
        title.setLayoutX(sysmod.getScreenWidth()/1.5);
        title.setLayoutY(sysmod.getScreenHeight()/2.8);
        root.getChildren().add(title);

        Button play = new Button("Play");
        play.setMinSize(200.0, 60.0);
        play.setLayoutX(500.0);
        play.setLayoutY(380.0);
        play.setFont(buttonFont);
        play.setOnAction(e -> showLessonList());
        root.getChildren().add(play);

        Button settings = new Button("Settings");
        settings.setMinSize(200.0, 60.0);
        settings.setLayoutX(480.0);
        settings.setLayoutY(480.0);
        settings.setFont(buttonFont);
        settings.setOnAction(e -> showSettings());
        root.getChildren().add(settings);

        Button quit = new Button("Quit");
        quit.setMinSize(200.0, 60.0);
        quit.setLayoutX(460.0);
        quit.setLayoutY(580.0);
        quit.setFont(buttonFont);
        quit.setOnAction(e -> System.exit(0));
        root.getChildren().add(quit);
    }

    public void showLesson(){
        root.getChildren().clear();

    }

    public void showLessonList(){
        root.getChildren().clear();

        Label title = new Label("Lessons");
        title.setFont(titleFont);
        title.setLayoutX(sysmod.getScreenWidth()/2.0);
        title.setLayoutY(sysmod.getScreenHeight()/10.0);
        root.getChildren().add(title);

        Button back = new Button("Back");
        back.setLayoutX(100);
        back.setLayoutY(100);
        back.setOnAction(e -> showMenu());
        root.getChildren().add(back);
    }

    public void showSettings(){
        root.getChildren().clear();

        Label title = new Label("Settings");
        title.setFont(titleFont);
        title.setLayoutX(sysmod.getScreenWidth()/2.0);
        title.setLayoutY(sysmod.getScreenHeight()/10.0);
        root.getChildren().add(title);

        Button back = new Button("Back");
        back.setLayoutX(100);
        back.setLayoutY(100);
        back.setOnAction(e -> showMenu());
        root.getChildren().add(back);
    }

//    private void addButton(Group root, String label, Double x, Double y){
//        Font font = new Font("Ariel", 20.0);
//
//        Button button = new Button(label);
//        button.setMinSize(200, 60);
//        button.setLayoutX(x);
//        button.setLayoutY(y);
//        button.setFont(font);
//
//        root.getChildren().add(button);
//    }

}
