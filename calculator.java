import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class calculator{
public static void main(String[] args){
    
    Frame frame = new Frame("calculation");
    frame.setSize(500,500);
    Label label1= new Label("**CALCULATOR**");
    label1.setBounds(230, 10,100,50);
    label1.setBackground(Color.pink);
    Label la_2= new Label("enter first number=");
    la_2.setBounds(100, 100,150,30);
    la_2.setBackground(Color.GREEN);
    TextField txt_1 = new TextField();
    txt_1.setBounds(100,150,70,20);
    Label la_3= new Label("enter second number=");
    la_3.setBounds(100, 250,150,30);
    la_3.setBackground(Color.GREEN);
    TextField txt_2 = new TextField();
    txt_2.setBounds(100,300,70,20);
    Button bt_1= new Button("Add");
    bt_1.setBounds(100,450,50,20);
    bt_1.setBackground(Color.blue);



    frame.add(bt_1);
    frame.add(txt_2);
    frame.add(la_3);
    frame.add(txt_1);
    frame.add(la_2);
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