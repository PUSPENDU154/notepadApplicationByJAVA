import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About(){
        setBounds(100,100,500,400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon=new ImageIcon(getClass().getResource("notepad.png"));
        setIconImage(icon.getImage());

        setLayout(null);

        ImageIcon icon1=new ImageIcon(getClass().getResource("notepad_37173.jpg"));
        Image img=icon1.getImage();
        Image imgScale=img.getScaledInstance(80,80,Image.SCALE_SMOOTH);
        JLabel iconLabel=new JLabel(new ImageIcon(imgScale));
        iconLabel.setBounds(100,50,80,80);
        add(iconLabel);

        JLabel textLabel=new JLabel("<html>Welcome to Notepad<br>Notepad is a Simple text editor or Microsoft Windows and a basic test-editing program which enables computer users to create document<br>All rights reserved@2022</html>");
        textLabel.setBounds(100,50,350,300);
        textLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,12));
        add(textLabel);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }


}
