package org.finalproj.musictheoryapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppMain extends Application {

    SystemModel sysmod = SystemModel.getInstance();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppMain.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), sysmod.getScreenWidth(), sysmod.getScreenHeight());
        stage.setTitle("Music Theory Application");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}