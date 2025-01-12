Java GUI Calculator
This project is a Graphical User Interface (GUI) Calculator built using Java and JavaFX. It provides basic arithmetic operations like addition, subtraction, multiplication, and division, with an intuitive and user-friendly interface.

Features
-  Basic Arithmetic Operations: Perform addition, subtraction, multiplication, and division.
-  Negative Number Conversion: A +/- button to toggle the sign of a number.
-  Clear Display: AC button to reset the calculator.
-  Decimal Support: Use a decimal point for precise calculations.
-  Immediate Feedback: Live updates to the display as buttons are pressed.

Interface Overview
-  Numeric Buttons: 0–9 for number inputs.
-  Operator Buttons: +, -, *, / for arithmetic operations.
-  Special Buttons:
 - -  AC: Clears all inputs and resets the state.
 - -  +/-: Toggles the sign of the current number.
 - -  .: Adds a decimal point.
- -  =: Computes the result of the entered operation.
    
Code Overview
The project is structured with two main classes:

 1.ButtonPane:

  -  Contains the buttons and their layout.
  -  Handles event-driven actions for number and operator buttons.
  -  Updates the display (TextField) based on user interaction.
  -  Performs calculations using the calculate method, which determines the result based on the operator.
    
 2.CalculatorApp:

  -  The main entry point of the application.
  -  Sets up the JavaFX Stage and Scene.
  -  Integrates the ButtonPane and display field into the application window.
    
How to Run

-  Ensure you have JavaFX set up on your system.
-  Compile and run the application:
 - -  javac CalculatorApp.java
 - -  java CalculatorApp
     

