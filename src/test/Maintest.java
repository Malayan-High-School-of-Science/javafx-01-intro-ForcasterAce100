package com.example;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

public class MainTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        new Main().start(stage);
    }

    @Test
    public void shouldContainHelloJavaFX() {
        // Check if the label contains the expected text
        verifyThat(".label", (Node node) -> ((Label) node).getText().equals("Hello, JavaFX!"));
    }
}