package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;

import java.util.ArrayList;

public class BarModel {
    ArrayList<Line> arrLines;

    Line line1 = new Line(200, 200, 880, 200);
    Line line2 = new Line(200, 220, 880, 220);
    Line line3 = new Line(200, 240, 880, 240);
    Line line4 = new Line(200, 260, 880, 260);
    Line line5 = new Line(200, 280, 880, 280);
    Line line6 = new Line(200, 300, 880, 300);

    Group bar = new Group();
    bar.getChildren().addAll(line1, line2, line3, line4, line5, line6);

    public BarModel(int bars) {

    }

}
