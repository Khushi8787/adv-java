import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args)
    {
        Frame frame = new Frame("Button");
        // Label label = new Label("Hello World!");
        // Label label2 = new Label("Khushi");

        // label.setBounds(10,200,100,100);
        // label2.setBounds(100,40,100,100);
        // label.setBackground(Color.RED);
        // label2.setBackground(Color.green);

        // frame.add(label);
        // frame.add(label2);
        
        Button btn1 = new Button("Login");
        btn1.setBounds(10, 40, 70, 30);
        btn1.setBackground(Color.pink);

        TextField txtar1 = new TextField();
        txtar1.setBounds(10, 80,500, 30);
        
        
        frame.add(btn1);
        frame.add(txtar1);
        frame.setSize(700, 500);
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