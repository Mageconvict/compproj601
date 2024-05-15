package org.finalproj.musictheoryapp;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Dictionary;
import java.util.Objects;

public final class SystemModel {

    private static SystemModel sysmod_instance = null;
    private SystemModel() {}

    public static SystemModel getInstance() {
        if (sysmod_instance == null) {
            sysmod_instance = new SystemModel();
        }
        return sysmod_instance;
    }

    public int getScreenHeight() {
        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        return (int)screenBounds.getHeight();
    }

    public int getScreenWidth() {
        Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        return (int)screenBounds.getWidth();
    }

    public Dictionary<String, Object> readLesson(int i) {
        Yaml yaml = new Yaml();
        Dictionary<String, Object> a;
        try {
            InputStream inputStream = this.getClass()
                    .getClassLoader()
                    .getResourceAsStream("org.finalproj.musictheoryapp/lessoninfo.yaml");
            a = yaml.loadAs(inputStream, Dictionary.class);
        } catch (Exception e){
            e.printStackTrace();
            a = null;
        }
        return a;
    }
}
