import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalculatorApp extends Application {


    private String operator;

    public void start(Stage primaryStage) {
        Pane aPane = new Pane();
        TextField numberDisplay= new TextField();
        numberDisplay.relocate(50,100);
        numberDisplay.setPrefSize(300,95);
        numberDisplay.setFont(Font.font(20));


        ButtonPane lol=new ButtonPane(numberDisplay);
        lol.relocate(0,0);




        aPane.getChildren().addAll(lol,numberDisplay);
        Scene scene = new Scene(aPane, 400, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }

}