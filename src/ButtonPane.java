import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ButtonPane extends Pane {
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;

    public ButtonPane(){
        num1 =new Button("1");
        num1.relocate(30,300);
        num1.setPrefSize(100,80);

        num2 =new Button("2");
        num2.relocate(150,300);
        num2.setPrefSize(100,80);

        num3= new Button("3");
        num3.relocate(270,300);
        num3.setPrefSize(100,80);

        num4=new Button("4");
        num4.relocate(30,390);
        num4.setPrefSize(100,80);

        num5=new Button("5");
        num5.relocate(150,390);
        num5.setPrefSize(100,80);

        num6=new Button("6");
        num6.relocate(270,390);
        num6.setPrefSize(100,80);

        num7=new Button("7");
        num7.relocate(30,480);
        num7.setPrefSize(100,80);

        num8=new Button("8");
        num8.relocate(150,480);
        num8.setPrefSize(100,80);

        num9=new Button("9");
        num9.relocate(270,480);
        num9.setPrefSize(100,80);

        num0=new Button("0");
        num0.relocate(150,570);
        num0.setPrefSize(100,80);
        this.getChildren().addAll( num1, num2, num3, num4, num5, num6, num7, num8,num9,num0);

    }

}
