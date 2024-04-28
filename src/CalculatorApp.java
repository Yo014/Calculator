import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    public void start(Stage primaryStage) {
        Pane aPane= new Pane();

        //text field

        TextField numberDisplay= new TextField();
        numberDisplay.relocate(90,100);
        numberDisplay.setPrefSize(235,75);
        numberDisplay.setFont(Font.font(20));
        //Button plan

        ButtonPane Buttons= new ButtonPane();
        Buttons.relocate(0,0);



        aPane.getChildren().addAll(numberDisplay, Buttons);

        Scene scene = new Scene(aPane, 400, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {launch(args);
}

}
