package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;

import java.util.ArrayList;

public class BarModel {
    Line line1 = new Line(200, 200, 1760, 200);
    Line line2 = new Line(200, 220, 1760, 220);
    Line line3 = new Line(200, 240, 1760, 240);
    Line line4 = new Line(200, 260, 1760, 260);
    Line line5 = new Line(200, 280, 1760, 280);
    Line line6 = new Line(200, 300, 1760, 300);

    Group root = new Group(line1, line2, line3, line4, line5, line6);

    public BarModel() {
    }

    public Group getBarModel(){
        return root;
    }

}
