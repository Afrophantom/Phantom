import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

public class Test extends Application {
	private Rectangle rectangle = new Rectangle(50,50);
	private double newY, newX = 0;
    @Override
    public void start(Stage primaryStage) {
    	
    	
        
        
        

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(rectangle);

        Scene scene = new Scene(borderPane, 200, 200);      
        primaryStage.setTitle("Ball"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show();

        scene.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.RIGHT){
                newX = newX + 10;
                rectangle.setTranslateX(newX);
            }
            else if(e.getCode() == KeyCode.LEFT){
                newX = newX - 10;
                rectangle.setTranslateX(newX);
            }
            else if(e.getCode() == KeyCode.UP){
                newY = newY - 10;  
                rectangle.setTranslateY(newY);
            }
            else if(e.getCode() == KeyCode.DOWN){
                newY = newY + 10;
                rectangle.setTranslateY(newY);
            }
        });
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}