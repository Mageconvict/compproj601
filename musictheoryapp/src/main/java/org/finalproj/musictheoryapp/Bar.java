package org.finalproj.musictheoryapp;

import javafx.scene.Group;
import javafx.scene.shape.Line;

import java.util.List;

public class Bar {
    private int noOfBars = 0;
    private List<Note> notes;

    public Bar(int num, List<Note> notes) {
        this.noOfBars = num;
        this.notes = notes;
    }

    public int getNoOfBars() {
        return noOfBars;
    }

    public void setNoOfBars(int noOfBars) {
        this.noOfBars = noOfBars;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
