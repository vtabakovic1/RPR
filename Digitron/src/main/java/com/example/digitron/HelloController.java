package com.example.digitron;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btn0;

    @FXML
    private Button modBtn;

    @FXML
    private Button timesBtn;

    @FXML
    private Button plusBtn;

    @FXML
    private Button minusBtn;

    @FXML
    private Button divideBtn;

    @FXML
    private Button dotBtn;

    @FXML
    private Button equalsBtn;

    @FXML
    private TextField display;
    private Float rezultat = 0f;
    private int operacija = -1;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btn1) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "1");
        } else if (event.getSource() == btn2) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "2");
        } else if (event.getSource() == btn3) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "3");
        } else if (event.getSource() == btn4) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "4");
        } else if (event.getSource() == btn5) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "5");
        } else if (event.getSource() == btn6) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "6");
        } else if (event.getSource() == btn7) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "7");
        } else if (event.getSource() == btn8) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "8");
        } else if (event.getSource() == btn9) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "9");
        } else if (event.getSource() == btn0) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + "0");
        } else if (event.getSource() == dotBtn) {
            if (operacija == 0) {
                display.setText("");
                operacija = -1;
            }
            display.setText(display.getText() + ".");
        } else if (event.getSource() == equalsBtn) {
            Float operand = Float.parseFloat(display.getText());
            if (operacija == 1) {
                rezultat += operand;
                display.setText(String.valueOf(rezultat));
            } else if (operacija == 2) {
                rezultat -= operand;
                display.setText(String.valueOf(rezultat));
            } else if (operacija == 3) {
                rezultat *= operand;
                display.setText(String.valueOf(rezultat));
            } else if (operacija == 4) {
                rezultat /= operand;
                display.setText(String.valueOf(rezultat));
            } else if (operacija == 5) {
                rezultat %= operand;
                display.setText(String.valueOf(rezultat));
            }
            operacija = 0;
        } else if (event.getSource() == plusBtn) {
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 1;
        } else if (event.getSource() == minusBtn) {
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 2;
        } else if (event.getSource() == timesBtn) {
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 3;
        } else if (event.getSource() == divideBtn) {
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 4;
        } else if (event.getSource() == modBtn) {
            rezultat = Float.parseFloat(display.getText());
            display.setText("");
            operacija = 5;
        }
    }
}