import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.event.*;

import javafx.scene.control.TextInputControl;

public class ButtonPane extends Pane {

    private Button num0;
    private Button addbut;
    private Button subbut;
    private Button multbut;
    private Button divbut;
    private Button equabut;
    private Button resbut;

    private Button[][] buttons;

    public ButtonPane(TextField numberDisplay) {







        String[] buttonLabels = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < buttonLabels.length; i++) {
            Button button = new Button(buttonLabels[i]);
            int col = i % 3;
            int row = i / 3;
            button.relocate(45 + col * 110, 300 + row * 100);
            button.setPrefSize(95, 90);
            button.setOnAction(event -> {
                numberDisplay.setText(numberDisplay.getText() + button.getText());
            });
            this.getChildren().add(button);
        }




            num0=new Button("0");
            num0.relocate(155,600);
            num0.setPrefSize(95,86);

//
            addbut = new Button("+");
            addbut.relocate(0, 210);
            addbut.setPrefSize(90, 80);
            addbut.setFont(Font.font(20));
        addbut.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"+");
        });

            subbut = new Button("-");
            subbut.relocate(100, 210);
            subbut.setPrefSize(90, 80);
            subbut.setFont(Font.font(30));
        subbut.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"-");
        });

            multbut = new Button("*");
            multbut.relocate(200, 210);
            multbut.setPrefSize(100, 80);
            multbut.setFont(Font.font(30));
        multbut.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"*");
        });

            divbut = new Button("/");
            divbut.relocate(310, 210);
            divbut.setPrefSize(90, 80);
            divbut.setFont(Font.font(20));
            divbut.setOnAction(event->{
            numberDisplay.setText(numberDisplay.getText()+"/");
        });

            equabut = new Button("=");
            equabut.relocate(270, 690);
            equabut.setPrefSize(100, 80);
            equabut.setFont(Font.font(25));

            resbut = new Button("AC");
            resbut.relocate(30, 690);
            resbut.setPrefSize(100, 80);
            resbut.setFont(Font.font(20));
        resbut.setOnAction(event->{
            numberDisplay.setText("");
        });


            this.getChildren().addAll(num0, addbut, subbut, multbut, divbut, equabut, resbut);

        }

    }

