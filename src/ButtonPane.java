import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.geometry.Pos;

public class ButtonPane extends Pane {

    private final Button num0;
    private final Button dot;
    private final Button addbut;
    private final Button subbut;
    private final Button multbut;
    private final Button divbut;
    private final Button equabut;
    private final Button resbut;
    private final Button negbut;
    //private final Button
    private String operator = "";
    private double num1 = 0;


    public ButtonPane(TextField numberDisplay) {

//creat the key pad

        String[] buttonLabels = {"7", "8", "9", "4", "5", "6", "1", "2", "3"};
        for (int i = 0; i < buttonLabels.length; i++) {
            Button button = new Button(buttonLabels[i]);
            int col = i % 3;
            int row = i / 3;
            button.relocate(10 + col * 105, 250 + row * 100);
            button.setPrefSize(95, 90);
            button.setFont(Font.font(20));
            //eventhandling
            button.setOnAction(event -> {
                numberDisplay.setText(numberDisplay.getText() + button.getText());
            });
            this.getChildren().add(button);
        }

            num0=new Button("0");
            num0.relocate(10,550);
            num0.setPrefSize(200,86);
            num0.setFont(Font.font(20));
        //eventhandling
            num0.setOnAction(event->{
                numberDisplay.setText(numberDisplay.getText()+"0");
            });

            dot=new Button(".");
            dot.relocate(220,550);
            dot.setPrefSize(95,90);
            dot.setAlignment(Pos.CENTER);
            dot.setFont(Font.font(30));
        //eventhandling
            dot.setOnAction(event->{
                numberDisplay.setText(numberDisplay.getText()+".");
            });

//create operator buttons and set teh configuration that goes with each one of them

            addbut = new Button("+");
            addbut.relocate(325, 450);
            addbut.setPrefSize(95, 90);
            addbut.setFont(Font.font(20));
            addbut.setStyle("-fx-font: 20 arial; -fx-base: rgb(192,192,192); " + "-fx-text-fill: rgb(0,0,0);");
            addbut.setOnAction(event->{String inputext= numberDisplay.getText();
                if(!inputext.isEmpty()) {
                    numberDisplay.setText(inputext + "+");
                    num1 = Double.parseDouble(inputext);
                    numberDisplay.clear();
                    operator = "+";
                }
            });

            subbut = new Button("-");
            subbut.relocate(325, 350);
            subbut.setPrefSize(95, 90);
            subbut.setFont(Font.font(30));
            subbut.setStyle("-fx-font: 30 arial; -fx-base: rgb(192,192,192); " + "-fx-text-fill: rgb(0,0,0);");
            //eventhandling
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
            multbut.relocate(325, 250);
            multbut.setPrefSize(95, 90);
            multbut.setFont(Font.font(30));
            multbut.setStyle("-fx-font: 20 arial; -fx-base: rgb(192,192,192); " + "-fx-text-fill: rgb(0,0,0);");
            //eventhandling
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
            divbut.relocate(325, 550);
            divbut.setPrefSize(95, 90);
            divbut.setFont(Font.font(20));
            divbut.setStyle("-fx-font: 20 arial; -fx-base: rgb(192,192,192); " + "-fx-text-fill: rgb(0,0,0);");
            //eventhandling
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
            equabut.relocate(290, 150);//550
            equabut.setPrefSize(130, 90);
            equabut.setFont(Font.font(25));
            equabut.setStyle("-fx-font: 20 arial; -fx-base: rgb(192,192,192); " + "-fx-text-fill: rgb(0,0,0);");
            //eventhandling
            equabut.setOnAction(event->{
                String input=numberDisplay.getText();
                if(input.isEmpty()){
                    numberDisplay.setText(input);
                }else {
                    double num3=0.0;
                    double num2 = Double.parseDouble(numberDisplay.getText());
                    double result = calculate(num1,num2, operator);
                    numberDisplay.setText(Double.toString(result));
                    num1 = result;
                    operator = "";
                }
            });

            resbut = new Button("AC");
            resbut.relocate(10, 150);
            resbut.setPrefSize(410/3, 90);
            resbut.setFont(Font.font(20));
            resbut.setStyle("-fx-font: 20 arial; -fx-base: rgb(192,192,192); " + "-fx-text-fill: rgb(0,0,0);");
            //eventhandling
            resbut.setOnAction(event->{
                numberDisplay.setText("");
                num1=0;
                operator="";
            });

            negbut= new Button("+/-");
            negbut.relocate(150,150);
            negbut.setPrefSize(410/3,90);
            negbut.setFont(Font.font(100));
            negbut.setStyle("-fx-font: 20 arial; -fx-base: rgb(192,192,192); " + "-fx-text-fill: rgb(0,0,0);");
            negbut.setOnAction(event -> {
                String input= numberDisplay.getText();
                if(input.isEmpty()){
                    numberDisplay.setText(input);
                }else{
                    num1 = Double.parseDouble(input);
                    double result=num1*-1 ;
                    numberDisplay.setText(Double.toString(result));
                    num1 = result;
                }
            });

            this.getChildren().addAll(num0, addbut, subbut, multbut, divbut, equabut, resbut,dot, negbut);

        }
        //calculate the answer depending on which operator was selected

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
                        return 0;
                    }
                    return num1 / num2;
                default:
                    return 0;
            }

        }


    }