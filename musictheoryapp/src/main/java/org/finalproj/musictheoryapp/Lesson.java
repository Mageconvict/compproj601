package org.finalproj.musictheoryapp;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class Lesson {
    private String title = "";
    private List<String> text = new ArrayList<String>();
    private Dictionary<String, Object> lessonInfo;
    private Cleff cleff = Cleff.TREBLECLEFF;

    private StaffModel staffModel;

    public Lesson(String title, List<String> text, Cleff cleff) {
        this.title = title;
        this.text = text;
        this.cleff = cleff;
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
}