/**
 * Day 45 - EventHandlingDemo.java
 * Demonstrates event handling in JavaFX
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlingDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create controls
        Label label = new Label("Click the button!");
        Button button = new Button("Click Me!");
        TextField textField = new TextField("Type something...");
        
        // Event handling with lambda expressions
        button.setOnAction(event -> {
            label.setText("Button was clicked!");
            System.out.println("Button clicked at: " + event.getSource());
        });
        
        textField.setOnKeyPressed(event -> {
            System.out.println("Key pressed: " + event.getCode());
        });
        
        // Create layout
        VBox root = new VBox(10);
        root.getChildren().addAll(label, button, textField);
        
        // Create scene
        Scene scene = new Scene(root, 300, 200);
        
        // Set up stage
        primaryStage.setTitle("Event Handling Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
} 