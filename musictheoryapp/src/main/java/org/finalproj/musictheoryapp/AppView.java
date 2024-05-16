package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppView {
    SystemModel sysmod = SystemModel.getInstance();
    Font titleFont = new Font("Ubuntu", 40.0);
    Font buttonFont = new Font("Ariel", 20.0);
//    Image backArrow = new Image("resources/org/finalproj/musictheoryapp/arrow.png");
//    ImageView backArrowView = new ImageView(backArrow);
    Group root = new Group();
    Group rootPrev = new Group();
    Scene mainscene = new Scene(root);

    //Test Lesson
    List<String> lessonText = Arrays.asList("one", "two", "three");
    Lesson testLesson = new Lesson("The Staff", lessonText, Cleff.TREBLECLEFF);

    LessonView lessonView = new LessonView(testLesson);

    public void showMenu(){
        rootPrev.getChildren().addAll(root.getChildren());
        root.getChildren().clear();

        Label title = new Label("Lydear");
        title.setFont(titleFont);   title.setLayoutX(970.00);  title.setLayoutY(sysmod.getScreenHeight()/2.8);

        Button play = new Button("Play");
        play.setMinSize(200.0, 60.0);   play.setLayoutX(500.0); play.setLayoutY(380.0); play.setFont(buttonFont);   play.setOnAction(e -> showLessonList());

        Button settings = new Button("Settings");
        settings.setMinSize(200.0, 60.0);   settings.setLayoutX(480.0); settings.setLayoutY(480.0); settings.setFont(buttonFont);   settings.setOnAction(e -> showSettings());

        Button quit = new Button("Quit");
        quit.setMinSize(200.0, 60.0);
        quit.setLayoutX(460.0);
        quit.setLayoutY(580.0);
        quit.setFont(buttonFont);
        quit.setOnAction(e -> System.exit(0));

        root.getChildren().addAll(title, play, settings, quit);
    }

    public void showLesson(int i){
        rootPrev.getChildren().addAll(root.getChildren());
        root.getChildren().clear();

        Button back = new Button("Back");
        back.setLayoutX(100);   back.setLayoutY(100);
        back.setOnAction(e -> {
            root.getChildren().clear();
            root.getChildren().addAll(rootPrev.getChildren());
            rootPrev.getChildren().clear();
        });

        Button settings = new Button("Settings");
        settings.setLayoutX(1770);  settings.setLayoutY(100);   settings.setOnAction(e -> showSettings());

        root.getChildren().addAll(lessonView.showLessonView(), back, settings);
    }

    public void showLessonList(){
        rootPrev.getChildren().addAll(root.getChildren());
        root.getChildren().clear();

        Label title = new Label("Lessons");
        title.setFont(titleFont); title.setLayoutX(970.00); title.setLayoutY(sysmod.getScreenHeight()/10.0);

        Button back = new Button("Back");
        back.setLayoutX(100);
        back.setLayoutY(100);
        back.setOnAction(e -> {
            root.getChildren().clear();
            root.getChildren().addAll(rootPrev.getChildren());
            rootPrev.getChildren().clear();
        });

        Button lesson1 = new Button("Lesson One");
        lesson1.setLayoutX(400);
        lesson1.setLayoutY(400);
        lesson1.setOnAction(e -> showLesson(0));

        root.getChildren().addAll(title, back, lesson1);
    }

    public void showSettings(){
        rootPrev.getChildren().addAll(root.getChildren());
        root.getChildren().clear();

        Label title = new Label("Settings");
        title.setFont(titleFont); title.setLayoutX(970.00); title.setLayoutY(sysmod.getScreenHeight()/10.0);

        Button back = new Button("Back");
        back.setLayoutX(100);
        back.setLayoutY(100);
//        back.setGraphic(backArrowView);
        back.setOnAction(e -> {
            root.getChildren().clear();
            root.getChildren().addAll(rootPrev.getChildren());
            rootPrev.getChildren().clear();
        });

        Slider volume = new Slider(0.0, 100.0, 50.0);
        volume.setLayoutX(sysmod.getScreenWidth()/2.0);
        volume.setLayoutY(sysmod.getScreenHeight()/3.0);

        root.getChildren().addAll(title, back, volume);
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
