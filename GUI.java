import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        //set width and height
        frame.setSize(400,400);
         frame.setLayout(null);
         frame.setVisible(true);
        //  JLabel l1 = new JLabel("Click the button");
        //  l1.setBounds(123,65,100,30);
        //  frame.add(l1);
       // JButton b1 = new JButton(new ImageIcon("D:\\Java Advance\\image.png"));
//         JButton b1 = new JButton("Click me");
//          b1.setBounds(120,100,100,50);
//          frame.add(b1);
//     JTextField t1 = new JTextField("User Name");
//     t1.setBounds(100,100,100,30);
//     JPasswordField p1 = new JPasswordField();
//     p1.setBounds(100,150,100,30);
//     JTextArea ta1 = new JTextArea("Tell me something about yourself");
//     ta1.setBounds(100,200,100,60);
//     frame.add(ta1);
//     frame.add(p1);
//     frame.add(t1);
//     String columns[] = {"ID","Name","Salary"};
//         String data[][] = {{"101","Mala","50000"},
//         {"102","Deepak","60000"},
//         {"103","Rajesh","100000"}};
//         JTable tb1 = new JTable(data,columns);
//         tb1.setBounds(30,50,300,400);
//         frame.add(tb1);
        // JLabel l1 = new JLabel("Which one is your favourite language ?");
        // l1.setBounds(50,30,300,30);
        // frame.add(l1);
        // JCheckBox chkBox1 = new JCheckBox("C++");
        // chkBox1.setBounds(50,60,60,30);
        // frame.add(chkBox1);
        // JCheckBox chkbox2 = new JCheckBox("Java");
        // chkbox2.setBounds(50,90,60,30);
        // frame.add(chkbox2);
        // JRadioButton rb1 = new JRadioButton("pyhton");
        // rb1.setBounds(50,120,80,30);
        // frame.add(rb1);
        // JRadioButton rb2 = new JRadioButton("Java Script");
        // rb2.setBounds(50,150,100,30);
        // frame.add(rb2);
        // String data[] = {"c++","pyhton","Java Script","Java"};
        // JComboBox<String> combobox1 = new JComboBox<>(data);
        // combobox1.setBounds(50,180,100,30);
        // frame.add(combobox1);
       // JOptionPane.showMessageDialog(frame, "Welcome to Hoshiyarpur", "Alert", JOptionPane.WARNING_MESSAGE);
        // String name = JOptionPane.showInputDialog(frame,"Enter your name");
        // System.out.println(name);
    //   JMenuBar mb = new JMenuBar();
    //   JMenu menu,submenu;
    //   JMenuItem i1,i2,i3,i4,i5;
    //   menu = new JMenu("Menu");
    //   submenu = new JMenu("Sub Menu");
    //   i1 = new JMenuItem("Item 1"); 
    //   i2 = new JMenuItem("Item 2"); 
    //   i3 = new JMenuItem("Item 3"); 
    //   i4 = new JMenuItem("Item 4"); 
    //   i5 = new JMenuItem("Item 5");
    //   menu.add(i1);
    //   menu.add(i2);
    //   menu.add(i3);
    //  submenu.add(i4);
    //   submenu.add(i5);
    //   menu.add(submenu);
    //   mb.add(menu);
    //   frame.setJMenuBar(mb);

    // ########################color changer
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //#######################create a panel whose background will change
    JPanel panel = new JPanel();
    panel.setBounds(50,50,300,150);
    panel.setBackground(Color.LIGHT_GRAY);
    frame.add(panel);

    //#######################create buttons
    JButton redButton = new JButton("Red");
    JButton greenButton = new JButton("Green");
    JButton blueButton = new JButton("Blue");

    //######################Add buttons to frame
    frame.add(redButton);
    frame.add(greenButton);
    frame.add(blueButton);

    //###################Add action listeners
    redButton.addActionListener(e -> panel.setBackground(Color.RED));

    greenButton.addActionListener(e -> panel.setBackground(Color.GREEN));

     blueButton.addActionListener(e -> panel.setBackground(Color.BLUE));



       


   }

 }
