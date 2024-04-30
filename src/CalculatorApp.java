import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CalculatorApp extends Application {


    public void start(Stage primaryStage) {
        Pane aPane = new Pane();

        //text field
        TextField numberDisplay= new TextField();
        numberDisplay.relocate(10,20);
        numberDisplay.setPrefSize(407,115);
        numberDisplay.setFont(Font.font(30));
        numberDisplay.setAlignment(Pos.BOTTOM_RIGHT);

        ButtonPane lol=new ButtonPane(numberDisplay);
        lol.relocate(0,0);

        aPane.getChildren().addAll(lol,numberDisplay);

        Scene scene = new Scene(aPane, 430, 650);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }

}