//import javax.swing.JFileChooser;
//import javax.swing.filechooser.*;
import javax.swing.*;
import java.awt.*;

public class FileChooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(400,400);
       
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\linkedin icon image.jpg");
        frame.setIconImage(icon);
         frame.setVisible(true);
       //  File f = new File("D:\\linkedin icon image.jpg");
//System.out.println(f.exists());



        
    
    // JFileChooser jf = new JFileChooser("D:");
    // jf.showSaveDialog(null);


}
}
