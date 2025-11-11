import java.util.Scanner;
import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        //set width and height
        frame.setSize(400,400);
         frame.setLayout(null);
         frame.setVisible(true);
         JLabel l1 = new JLabel("Click the button");
         l1.setBounds(123,65,100,30);
         frame.add(l1);
        JButton b1 = new JButton(new ImageIcon("D:\\Java Advance\\image.png"));
        JButton b1 = new JButton("Click me");
         b1.setBounds(120,100,100,50);
         frame.add(b1);
    JTextField t1 = new JTextField("User Name");
    t1.setBounds(100,100,100,30);
    JPasswordField p1 = new JPasswordField();
    p1.setBounds(100,150,100,30);
    JTextArea ta1 = new JTextArea("Tell me something about yourself");
    ta1.setBounds(100,200,100,60);
    frame.add(ta1);
    frame.add(p1);
    frame.add(t1);
    String columns[] = {"ID","Name","Salary"};
        String data[][] = {{"101","Mala","50000"},
        {"102","Deepak","60000"},
        {"103","Rajesh","100000"}};
        JTable tb1 = new JTable(data,columns);
        tb1.setBounds(30,50,300,400);
        frame.add(tb1);

    }
}
