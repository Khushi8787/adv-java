import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class calculator{
public static void main(String[] args){
    
    Frame frame = new Frame("calculation");
    frame.setsize(300,200);
    Lable label1= new Lable("**CALCULATOR**");
    label1.setBounds(40, 10,100,100);


    frame.add(label1);
    frame.setLayout(null);
    frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}