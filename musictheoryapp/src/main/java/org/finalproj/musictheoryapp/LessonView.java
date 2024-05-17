package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.List;

public class LessonView {

    AppModel appModel = AppModel.getInstance();
    Lesson lesson;
    int textNo = 0;

    public LessonView(Lesson lesson) {
        this.lesson = lesson;
    }

    public Group showLessonView() {
//        int textNo = 0; //Tracks which text in the array to display
        Group root = new Group();

        Label title = new Label(lesson.getTitle());
        title.setFont(AppView.titleFont); title.setLayoutX(870.00); title.setLayoutY(100.00);

        Text text = new Text();
        text.setText(showText(textNo));
        text.setFont(AppView.textFont);
        text.setWrappingWidth(1000); text.setLayoutX(570.00); text.setLayoutY(880.00);

        Button next = new Button("Next");
        next.setFont(AppView.buttonFont);
        next.setLayoutX(1770.00); next.setLayoutY(980.00);
        next.setOnAction( e -> {
            textNo++;
            text.setText(showText(textNo));
        } );

        Button prev = new Button("Prev");
        prev.setFont(AppView.buttonFont);
        prev.setLayoutX(100.00); prev.setLayoutY(980.00);
        prev.setOnAction( e -> {
            textNo--;
            text.setText(showText(textNo));
        } );

        Button play = new Button("Play");
        play.setFont(AppView.buttonFont);
        play.setLayoutX(1780.00); play.setLayoutY(500.00);
        play.setOnAction( e -> appModel.soundModel.handleSound(lesson.bar));

        root.getChildren().addAll(showStaff().getChildren());
        root.getChildren().addAll(showNotes().getChildren());
        root.getChildren().addAll(title, text, next, prev, play);

        return root;
    }

    private Group showStaff() {
        Group root = new Group();

        Line line1 = new Line(500, 400, 1420, 400);
        Line line2 = new Line(500, 440, 1420, 440);
        Line line3 = new Line(500, 480, 1420, 480);
        Line line4 = new Line(500, 520, 1420, 520);
        Line line5 = new Line(500, 560, 1420, 560);
        Line line6 = new Line(500, 600, 1420, 600);


        root.getChildren().addAll(line1, line2, line3, line4, line5, line6);
        return root;
    }

    private Group showNotes() {
        Group root = new Group();
        int xCoor = 540;
        List<Note> notes = lesson.notes;
        for(Note note : notes) {
            Circle circle = new Circle();
            circle.setCenterX(xCoor+= 80); circle.setCenterY(660 - note.getPitch()); circle.setRadius(15);
            root.getChildren().add(circle);
        }

        return root;
    }

    private String showText(int i) {
        return lesson.getText().get(i);
    }

}
