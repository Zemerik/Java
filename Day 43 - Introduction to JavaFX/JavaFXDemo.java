/**
 * Day 43 - JavaFXDemo.java
 * Demonstrates basic JavaFX application
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label label = new Label("Hello, JavaFX!");
        
        // Create layout container
        VBox root = new VBox(10); // 10 pixels spacing
        root.getChildren().add(label);
        
        // Create scene
        Scene scene = new Scene(root, 300, 200);
        
        // Set up stage
        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
} 