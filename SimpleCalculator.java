import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Labels
        JLabel label1 = new JLabel("Number 1");
        label1.setBounds(30,30,100,25);
        frame.add(label1);

        JLabel label2 = new JLabel("Number 2");
        label2.setBounds(30,70,100,25);
        frame.add(label2);

        JLabel label3 = new JLabel("Number 3");
        label3.setBounds(30,150,100,25);
        frame.add(label3);

        //Text Field
        JTextField num1 = new JTextField();
        num1.setBounds(120,70,150,25);
        frame.add(num1);

        JTextField num2 = new JTextField();
        num2.setBounds(120,30,150,25);
        frame.add(num2);

        JTextField result = new JTextField();
        result.setBounds(120,150,150,25);
       result.setEditable(false);
       frame.add(result);

       //Buttons
       JButton add = new JButton("+");
       add.setBounds(30,110,50,25);
       frame.add(add);

       JButton sub = new JButton("-");
       sub.setBounds(90,110,50,25);
       frame.add(sub);

       JButton mul = new JButton("*");
       mul.setBounds(150,110,50,25);
       frame.add(mul);

       JButton div = new JButton("/");
       div.setBounds(210,110,50,25);
       frame.add(div);

       //Event handling
       ActionListener listener = new ActionListener() {
        public void actionPerformed(ActionEvent e){
            try{
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                double res = 0;

                if(e.getSource() == add){
                    res = a + b;
                }else if (e.getSource() == sub){
                    res = a - b;
                }else if (e.getSource() == mul){
                    res = a * b;
                } else if (e.getSource() == div){
                    if(b == 0){
                        JOptionPane.showMessageDialog(frame, "Cannot divide by zero" );
                        return;
                    }res = a / b;
                }
                result.setText(String.valueOf(res));
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Please enter valid number");
            }
        }
    };
       add.addActionListener(listener);
        sub.addActionListener(listener);
        mul.addActionListener(listener);
        div.addActionListener(listener);

        frame.setVisible(true);

    }

    
}
