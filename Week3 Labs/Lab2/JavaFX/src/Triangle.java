/*
 *  triangle
 */

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Arc; 
import javafx.scene.shape.ArcType; 
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font; 
import javafx.scene.text.Text; 
import javafx.stage.Stage;



public class Triangle extends Application {
	public void start (Stage stage)
	{
		//make lines
		Line line1 = new Line(100, 70, 100, 250);
		line1.setStroke(Color.BLUE);
		Line line2 = new Line(100, 250, 400, 250);
		line2.setStroke(Color.GREEN);
		Line line3 = new Line(400, 250, 100, 70);
		line3.setStroke(Color.YELLOW);
		
		//make group
		Group tri = new Group(line1, line2, line3);
		
		//make new scene
		Scene scene = new Scene(tri, 500, 400, Color.PINK);
		
		//add to stage
		stage.setScene(scene);
		stage.setTitle("Triangle");
		
		//show the stage
		stage.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
