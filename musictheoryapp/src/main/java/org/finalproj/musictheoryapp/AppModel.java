package org.finalproj.musictheoryapp;

public class AppModel {
    private static AppModel appModel = null;
    SoundModel soundModel = new SoundModel();
    private AppModel() {}

    public static AppModel getInstance() {
        if (appModel == null) {
            appModel = new AppModel();
        }
        return appModel;
    }

}
