package smileyFace;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class smileyFaceClass extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        //Create head object
        Circle head = new Circle();
        head.setCenterX(220.0);
        head.setCenterY(220.0);
        head.setRadius(190.0);
        
        //Create color of head
        head.setFill(Color.YELLOW);
        head.setStrokeWidth(2.0);
        head.setStroke(Color.BLACK);
 
        //Create left eye object
        Circle leftEye = new Circle();
        leftEye.setCenterX(220.0 - 80.0);
        leftEye.setCenterY(220.0 - 90.0);
        leftEye.setRadius(25.0);
        //Create color of eye
        leftEye.setFill(Color.BLACK);
        
        //Create right eye object
        Circle rightEye = new Circle();
        rightEye.setCenterX(220.0 + 80.0);
        rightEye.setCenterY(220.0 - 90.0);
        rightEye.setRadius(25.0);
        //Create color of eye
        rightEye.setFill(Color.BLACK);
        
        //Create nose object
        Circle nose = new Circle();
        nose.setCenterX(220.0);
        nose.setCenterY(220.0 - 50.0);
        nose.setRadius(20.0);
        //Create color for nose
        nose.setFill(Color.ORANGE);
        
        //Create mouth object
        Rectangle mouth = new Rectangle();
        mouth.setX(175.0);
        mouth.setY(220.0 + 50.0);
        mouth.setWidth(100);
        mouth.setHeight(10);
        mouth.setArcWidth(10);
        mouth.setArcHeight(10);
        //Create color of mouth
        mouth.setFill(Color.BLACK);
        
        //Create root and scene
        Group root = new Group(head, leftEye, rightEye, nose, mouth);
        Scene scene = new Scene(root, 450, 450);
        
        //EXTRA CREDIT!!!
        //Bind the scene's width and height to the scaling parameters on the group
        root.scaleXProperty().bind( scene.widthProperty().divide(450));
        root.scaleYProperty().bind( scene.heightProperty().divide(450));
        
        //Create title of page
        primaryStage.setTitle("This is how I feel about not being able to see my friends:");
        //add the scene to the stage
        primaryStage.setScene(scene);
        //show the contents of the stage 
        primaryStage.show();
    }
    
    //launch program
    public static void main(String[] args) {
        launch(args);
    }
}
