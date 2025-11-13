import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(50, 50, 300, 150);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");

        redButton.setBounds(50, 220, 80, 30);
        greenButton.setBounds(160, 220, 80, 30);
        blueButton.setBounds(270, 220, 80, 30);

        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);

        redButton.addActionListener(e -> panel.setBackground(Color.RED));
        greenButton.addActionListener(e -> panel.setBackground(Color.GREEN));
        blueButton.addActionListener(e -> panel.setBackground(Color.BLUE));

        frame.setVisible(true);
    }
}
