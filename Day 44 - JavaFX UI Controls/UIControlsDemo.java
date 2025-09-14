/**
 * Day 44 - UIControlsDemo.java
 * Demonstrates JavaFX UI controls
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UIControlsDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create controls
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button button = new Button("Click Me!");
        CheckBox checkBox = new CheckBox("I agree to terms");
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Option 1", "Option 2", "Option 3");
        
        // Create layout
        VBox root = new VBox(10);
        root.getChildren().addAll(label, textField, button, checkBox, comboBox);
        
        // Create scene
        Scene scene = new Scene(root, 300, 250);
        
        // Set up stage
        primaryStage.setTitle("UI Controls Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
} 