package org.finalproj.musictheoryapp;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

// Contains lesson information which should be read in from yaml file,
// which is passed on to handle screen display and sound handling

public class LessonConfig {
    private String title = "";
    private List<String> text;
    private Dictionary<String, Object> lessonInfo;
    private Cleff cleff = Cleff.TREBLECLEFF;
    public List<Note> notes = new ArrayList<>();
    public Bar bar = new Bar(1, notes);

    public StaffModel staffModel = new StaffModel(cleff, 4, bar);

    public LessonConfig(String title, List<String> text, Cleff cleff, List<Note> notes) {
        this.title = title;
        this.text = text;
        this.cleff = cleff;
        this.notes = notes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public Dictionary<String, Object> getLessonInfo() {
        return lessonInfo;
    }

    public void setLessonInfo(Dictionary<String, Object> lessonInfo) {
        this.lessonInfo = lessonInfo;
        title = (String) lessonInfo.get("title");
        text = (List<String>) lessonInfo.get("text");
    }
    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
    //    public void populateNotes() {
//        notes.add(new Note(60, 90));
//        notes.add(new Note(80, 90));
//        notes.add(new Note(40, 90));
//
//        bar = new Bar(1, notes);
//    }
}