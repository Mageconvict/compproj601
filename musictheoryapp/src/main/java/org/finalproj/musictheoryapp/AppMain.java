package org.finalproj.musictheoryapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AppMain extends Application {

    SystemModel sysmod = SystemModel.getInstance();
    AppModel appModel = AppModel.getInstance();
    AppView appView = new AppView();

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = appView.mainscene;
        appView.showMenu();
        stage.setTitle("Music Theory Application");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}