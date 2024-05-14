module org.finalproj.musictheoryapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires org.yaml.snakeyaml;

    opens org.finalproj.musictheoryapp to javafx.fxml;
    exports org.finalproj.musictheoryapp;
}