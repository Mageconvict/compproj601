package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;

import java.util.ArrayList;

public class BarModel {
    Line line1 = new Line(200, 500, 1760, 500);
    Line line2 = new Line(200, 520, 1760, 520);
    Line line3 = new Line(200, 540, 1760, 540);
    Line line4 = new Line(200, 560, 1760, 560);
    Line line5 = new Line(200, 580, 1760, 580);
    Line line6 = new Line(200, 600, 1760, 600);

    Group root = new Group(line1, line2, line3, line4, line5, line6);

    public BarModel() {
    }

    public Group getBarModel(){
        return root;
    }

}
