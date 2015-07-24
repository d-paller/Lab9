import java.util.*;
import javafx.application.Application;
import javafx.scene.shape.Line;
import javafx.geometry.Point2D;
import javafx.scene.shape.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.layout.Pane;


public class Lab9Circles extends Application{
    
    public void start(Stage primaryStage){
        
        Pane pane = new Pane();
        
        int width = 250;
        int height = 250;
        
        double x1 = Math.random()*(width -12);
        double x2 = Math.random()*(width -12);
        double y1 = Math.random()*(width -12);
        double y2 = Math.random()*(width -12);
        
        Circle c1 = new Circle(x1, y1, 15);
        Circle c2 = new Circle(x2, y2, 15);
        
        Line l = new Line(x1, y1, x2, y2);
        Text t = new Text((x1 + x2)/2, (y1 + y2)/2, new Point2D(x1, y1).distance(x2, y2) + "");
        
        pane.getChildren().addAll(c1, c2, l, t);
        
        Scene scene = new Scene(pane, 260, 260);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
    
}//cirlce class