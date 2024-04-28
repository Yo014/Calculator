import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class CalculatorApp extends Application {

    Button[][] buttons;

    public void start(Stage primaryStage) {
        Pane aPane = new Pane();
        TextField numberDisplay= new TextField();
        numberDisplay.relocate(90,100);
        numberDisplay.setPrefSize(235,75);
        numberDisplay.setFont(Font.font(20));

//        buttons = new Button[3][3];
//        String[] buttonLabels = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 3; col++) {
//                buttons[row][col] = new Button(buttonLabels[row*3+col]);
//                buttons[row][col] = new Button(buttonLabels[row * 3 + col]);
//                buttons[row][col].relocate(45 + col * 110, 30 + row * 90);
//                buttons[row][col].setPrefSize(90, 80);
//                aPane.getChildren().add(buttons[row][col]);
//            }
//        }

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