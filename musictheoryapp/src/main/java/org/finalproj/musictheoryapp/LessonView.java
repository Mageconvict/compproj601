package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class LessonView {

    Lesson lesson;
    int textNo = 0;

    public LessonView(Lesson lesson) {
        this.lesson = lesson;
    }

    public Group showLessonView() {
//        int textNo = 0; //Tracks which text in the array to display
        Group root = new Group();

        Label title = new Label(lesson.getTitle());
        Font titleFont = new Font("Ubuntu", 40.0);
        title.setFont(titleFont); title.setLayoutX(970.00); title.setLayoutY(100.00);

        Text text = new Text();
        text.setText(showText(textNo));
        text.setLayoutX(970.00); text.setLayoutY(880.00);

        Button next = new Button("Next");
        next.setLayoutX(1770.00); next.setLayoutY(980.00);
        next.setOnAction( e -> {
            textNo++;
            text.setText(showText(textNo));
        } );

        Button prev = new Button("Prev");
        prev.setLayoutX(100.00); prev.setLayoutY(980.00);
        prev.setOnAction( e -> {
            textNo--;
            text.setText(showText(textNo));
        } );

        Button play = new Button("Play");
        play.setLayoutX(880.00); play.setLayoutY(500.00);
        play.setOnAction( e -> );

        root.getChildren().addAll(title, text, next, prev, play);

        return root;
    }

    private String showText(int i) {
        return lesson.getText().get(i);
    }

}
