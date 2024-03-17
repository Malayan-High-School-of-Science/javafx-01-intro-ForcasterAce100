package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX!");
        StackPane root = new StackPane(label);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.setTitle("JavaFX Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}