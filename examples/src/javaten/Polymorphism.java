package javaten;

import javax.swing.*;

public class Polymorphism {
  public static void main(String[] args) {
    var formattedTextField = new JFormattedTextField("some text");
    var textField = new JTextField("other text");
    textField = formattedTextField;
    System.out.println(textField.getText());
  }
}
