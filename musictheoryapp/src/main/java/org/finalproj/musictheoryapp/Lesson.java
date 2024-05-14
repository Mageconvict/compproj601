package org.finalproj.musictheoryapp;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class Lesson {
    /*
    title
    staff
    text
     */

    private String title;
    private List<String> text;
    private Dictionary<String, Object> lessonInfo;

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
    }
}