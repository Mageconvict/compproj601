package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Region;
import javafx.scene.text.Font;

public class AppView {
    SystemModel sysmod = SystemModel.getInstance();
    Lesson lesson = new Lesson();
    Font titleFont = new Font("Ubuntu", 40.0);
    Font buttonFont = new Font("Ariel", 20.0);
    Group root = new Group();
    Group rootPrev = new Group();
    Scene mainscene = new Scene(root);

    public void showMenu(){
        rootPrev.getChildren().addAll(root.getChildren());
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

    public void showLesson(int i){
        rootPrev.getChildren().addAll(root.getChildren());
        root.getChildren().clear();

        try {
            lesson.setLessonInfo(sysmod.readLesson(i));
            System.out.println(lesson.getLessonInfo());
            System.out.println(lesson.getTitle());
            System.out.println(lesson.getText());
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Can't read lessoninfo");
        }

        Label title = new Label(lesson.getTitle());
        title.setFont(titleFont);
        title.setLayoutX(sysmod.getScreenWidth()/2.0);
        title.setLayoutY(sysmod.getScreenHeight()/10.0);

        Button back = new Button("Back");
        back.setLayoutX(100);
        back.setLayoutY(100);
        back.setOnAction(e -> {
            root.getChildren().clear();
            root.getChildren().addAll(rootPrev.getChildren());
            rootPrev.getChildren().clear();
        });

        Button settings = new Button("Settings");
        settings.setLayoutX(1770);
        settings.setLayoutY(100);
        settings.setOnAction(e -> showSettings());


        root.getChildren().addAll(title, back);
    }

    public void showLessonList(){
        rootPrev.getChildren().addAll(root.getChildren());
        root.getChildren().clear();

        Label title = new Label("Lessons");
        title.setFont(titleFont);
        title.setLayoutX(sysmod.getScreenWidth()/2.0);
        title.setLayoutY(sysmod.getScreenHeight()/10.0);

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
        title.setFont(titleFont);
        title.setLayoutX(sysmod.getScreenWidth()/2.0);
        title.setLayoutY(sysmod.getScreenHeight()/10.0);

        Button back = new Button("Back");
        back.setLayoutX(100);
        back.setLayoutY(100);
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
