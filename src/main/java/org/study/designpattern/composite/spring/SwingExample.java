package org.study.designpattern.composite.spring;

// desktop app lib
import javax.swing.*;

// Component : Component
// JFrame : Composite
// JTextField, JButton : Leaf
public class SwingExample {

    public static void main(String[] args) {
        // Composite
        // JFrame 타고 가다보면 Component 까지 도달
        JFrame frame = new JFrame();

        // JTextField 도 타고 가다보면 Component 까지 도달
        JTextField textField = new JTextField();
        textField.setBounds(200, 200, 200, 40);
        frame.add(textField);

        // button 도 마찬가지
        JButton button = new JButton("click");
        button.setBounds(200, 100, 60, 40);
        button.addActionListener(e -> textField.setText("Hello Swing"));
        frame.add(button);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
