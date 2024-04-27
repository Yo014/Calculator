import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CalculatorApp extends Application {
    public void start(Stage primaryStage) {
        Pane aPane= new Pane();
        Scene scene = new Scene(aPane, 400, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {launch(args);
}

}
