
package teht4;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Isto Koulu
 */
public class Teht4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        StackPane paneeli = new StackPane();
        Polygon polygon = new Polygon();
        Polygon polygon2 = new Polygon();
        polygon2.setStroke(Color.BLACK);
        polygon.setStrokeType(StrokeType.OUTSIDE);
        polygon2.setStrokeWidth(3);
        polygon2.setFill(null);
        polygon.setFill(Color.RED);
        polygon.setRotate(22.5);
        polygon2.setRotate(22.5);
        paneeli.getChildren().add(polygon);
        paneeli.getChildren().add(polygon2);
        
      
        
        ObservableList<Double> list = polygon.getPoints();
        double WIDTH = 200;
        double HEIGHT = 200;
        double centerX = WIDTH / 2;
        double centerY = HEIGHT / 2;
        double radius = Math.min(WIDTH, HEIGHT) * 0.4;
        
        for(int i = 0; i < 8; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            list.add(centerX + radius * Math.sin(2 * i * Math.PI / 8));
        }
       
        // getPoints().
       polygon2.getPoints().addAll(polygon.getPoints());
       polygon2.setScaleX(1.1);
       polygon2.setScaleY(1.1);
        
        Text text = new Text("STOP");
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Arial", FontWeight.BOLD, 46));
        paneeli.getChildren().add(text);
        
        Scene kehys = new Scene(paneeli, 300, 250);
        
        primaryStage.setTitle("Stop");
        primaryStage.setScene(kehys);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
