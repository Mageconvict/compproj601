package org.finalproj.musictheoryapp;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class Lesson {
    /*
    title
    staff
    text
     */

    private String title;
    private ArrayList<String> text;
    private Dictionary<String, Object> lessonInfo;

    public void read(int i) {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("lessoninfo.yaml");
        lessonInfo = yaml.load(inputStream);

        title = (String) lessonInfo.get(title);

        System.out.println(lessonInfo);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getText() {
        return text;
    }
}
