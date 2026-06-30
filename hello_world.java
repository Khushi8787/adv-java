import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Driver Class
public class AWT_Example {
    // main function
    public static void main(String[] args)
    {
        // Declaring a Frame and Label
        Frame frame = new Frame("Basic Program");
        Label label = new Label("Hello World!");
        Label label2 = new Label("Khushi");

        // Aligning the label to CENTER
        label.setBounds(10,200,100,100);
        label2.setBounds(10,40,100,100);
        label.setBackground(Color.RED);
        label2.setBackground(Color.green);

        // Adding Label and Setting the Size of the Frame
        // frame.add(label);
        // frame.add(label2);
        frame.setSize(500, 500);

        // Making the Frame visible
        frame.setVisible(true);

        // Using WindowListener for closing the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}