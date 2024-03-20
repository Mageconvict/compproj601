package org.finalproj.musictheoryapp;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;

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
}
