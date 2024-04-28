import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.control.TextInputControl;

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
    private Button addbut;
    private Button subbut;
    private Button multbut;
    private Button divbut;
    private Button equabut;
    private Button resbut;

    public ButtonPane(){


        TextField numberDisplay= new TextField();
        numberDisplay.relocate(90,100);
        numberDisplay.setPrefSize(235,75);
        numberDisplay.setFont(Font.font(20));


        num1 =new Button("1");
        num1.relocate(30,300);
        num1.setPrefSize(100,80);
        num1.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"1");
        });

        num2 =new Button("2");
        num2.relocate(150,300);
        num2.setPrefSize(100,80);
        num2.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"2");
        });

        num3= new Button("3");
        num3.relocate(270,300);
        num3.setPrefSize(100,80);
        num3.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"3");
        });

        num4=new Button("4");
        num4.relocate(30,390);
        num4.setPrefSize(100,80);
        num4.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"4");
        });


        num5=new Button("5");
        num5.relocate(150,390);
        num5.setPrefSize(100,80);
        num5.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"5");
        });

        num6=new Button("6");
        num6.relocate(270,390);
        num6.setPrefSize(100,80);
        num6.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"6");
        });

        num7=new Button("7");
        num7.relocate(30,480);
        num7.setPrefSize(100,80);
        num7.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"7");
        });

        num8=new Button("8");
        num8.relocate(150,480);
        num8.setPrefSize(100,80);
        num8.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"8");
        });

        num9=new Button("9");
        num9.relocate(270,480);
        num9.setPrefSize(100,80);
        num9.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"9");
        });

        num0=new Button("0");
        num0.relocate(150,570);
        num0.setPrefSize(100,80);
        num0.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"0");
        });

        addbut= new Button("+");
        addbut.relocate(0,210);
        addbut.setPrefSize(90,80);
        addbut.setFont(Font.font(20));
        addbut.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"+");
        });

        subbut= new Button("-");
        subbut.relocate(100,210);
        subbut.setPrefSize(90,80);
        subbut.setFont(Font.font(30));
        subbut.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"-");
        });

        multbut= new Button("*");
        multbut.relocate(200,210);
        multbut.setPrefSize(100,80);
        multbut.setFont(Font.font(30));
        multbut.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"*");
        });

        divbut= new Button("/");
        divbut.relocate(310,210);
        divbut.setPrefSize(90,80);
        divbut.setFont(Font.font(20));
        divbut.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"/");
        });

        equabut= new Button("=");
        equabut.relocate(270,670);
        equabut.setPrefSize(100,80);
        equabut.setFont(Font.font(25));

        resbut= new Button("AC");
        resbut.relocate(30,670);
        resbut.setPrefSize(100,80);
        resbut.setFont(Font.font(20));
        resbut.setOnAction(event->{
            numberDisplay.setText("");
        });



        this.getChildren().addAll( num1, num2, num3, num4, num5, num6, num7, num8,num9,num0,
                addbut, subbut, multbut,divbut, equabut, resbut, numberDisplay);

    }

}
