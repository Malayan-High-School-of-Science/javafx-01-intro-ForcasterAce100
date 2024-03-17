import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label with the text "Hello, World!"
        Label label = new Label("Hello, World!");

        // Create a layout pane (stack pane) and add the label to it
        StackPane root = new StackPane(label);

        // Create a scene with the layout pane as the root node
        Scene scene = new Scene(root, 300, 200);

        // Set the scene for the primary stage (window) and show it
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
