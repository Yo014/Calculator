import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class ButtonPane extends Pane {

    private Button num0;
    private Button addbut;
    private Button subbut;
    private Button multbut;
    private Button divbut;
    private Button equabut;
    private Button resbut;
    private String operator = "";
    private double num1 = 0;


    public ButtonPane(TextField numberDisplay) {

//creat the key pad

        String[] buttonLabels = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < buttonLabels.length; i++) {
            Button button = new Button(buttonLabels[i]);
            int col = i % 3;
            int row = i / 3;
            button.relocate(45 + col * 110, 300 + row * 100);
            button.setPrefSize(95, 90);
            button.setFont(Font.font(20));
            button.setOnAction(event -> {
                numberDisplay.setText(numberDisplay.getText() + button.getText());
            });
            this.getChildren().add(button);
        }





            num0=new Button("0");
            num0.relocate(155,600);
            num0.setPrefSize(95,86);
            num0.setFont(Font.font(20));
            num0.setOnAction(event->{
                numberDisplay.setText(numberDisplay.getText()+"0");
            });

//create operator buttons and set teh conguration that goes with each one of them

            addbut = new Button("+");
            addbut.relocate(0, 210);
            addbut.setPrefSize(90, 80);
            addbut.setFont(Font.font(20));
            addbut.setOnAction(event->{String inputext= numberDisplay.getText();
            if(!inputext.isEmpty()) {
                numberDisplay.setText(inputext + "+");
                num1 = Double.parseDouble(inputext);
                numberDisplay.clear();
                operator = "+";
            }
        });

            subbut = new Button("-");
            subbut.relocate(100, 210);
            subbut.setPrefSize(90, 80);
            subbut.setFont(Font.font(30));
            subbut.setOnAction(event->{
                String inputText= numberDisplay.getText();
                if (!inputText.isEmpty()) {
                    numberDisplay.setText(inputText + "-");
                    num1 = Double.parseDouble(inputText); // Parse the number before adding the operator
                    numberDisplay.clear();
                    operator = "-";
                }
            });

            multbut = new Button("*");
            multbut.relocate(200, 210);
            multbut.setPrefSize(100, 80);
            multbut.setFont(Font.font(30));
            multbut.setOnAction(event-> {
                String inputText = numberDisplay.getText();
                if (!inputText.isEmpty()){
                    numberDisplay.setText(inputText+ "*");
                    numberDisplay.clear();
                    num1 = Double.parseDouble(inputText);
                    operator = "*";
                }
        });

            divbut = new Button("/");
            divbut.relocate(310, 210);
            divbut.setPrefSize(90, 80);
            divbut.setFont(Font.font(20));
            divbut.setOnAction(event->{
                String inputText= numberDisplay.getText();
                if (!inputText.isEmpty()) {
                    numberDisplay.setText(inputText + "/");
                    numberDisplay.clear();
                    num1 = Double.parseDouble(inputText);
                    operator = "/";
                }
        });

            equabut = new Button("=");
            equabut.relocate(270, 690);
            equabut.setPrefSize(100, 80);
            equabut.setFont(Font.font(25));
            equabut.setOnAction(event->{
                double num2 = Double.parseDouble(numberDisplay.getText());
                double result = calculate(num1, num2, operator);
                numberDisplay.setText(Double.toString(result));
                num1=result;
                operator="";
            });

            resbut = new Button("AC");
            resbut.relocate(30, 690);
            resbut.setPrefSize(100, 80);
            resbut.setFont(Font.font(20));
            resbut.setOnAction(event->{
                numberDisplay.setText("");
                num1=0;
                operator="";
            });






            this.getChildren().addAll(num0, addbut, subbut, multbut, divbut, equabut, resbut);

        }
        //calculate the answer depending oon witch operator was selected

        private double calculate(double num1, double num2, String operator) {
            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1*num2;
                case "/":
                    if (num2 == 0) {
                        return 0; // Handling division by zero
                    }
                    return num1 / num2;
                default:
                    return 0;
            }

        }



    }

