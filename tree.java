//import java.util.Scanner;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;



public class tree {
    public static void main(String[] args) {
        JFrame f = new JFrame("Main");
        f.setSize(400,400);
        f.setVisible(true);
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode white = new DefaultMutableTreeNode("White");
        color.add(red);
        color.add(blue);
        color.add(green);
        color.add(white);
        DefaultMutableTreeNode simple = new DefaultMutableTreeNode("Simple");
        DefaultMutableTreeNode medium = new DefaultMutableTreeNode("Medium");
        DefaultMutableTreeNode hard = new DefaultMutableTreeNode("Hard");
        font.add(simple);
        font.add(medium);
        font.add(hard);
       

        JTree jt = new JTree(style);
        f.add(jt);

    }
    
}
