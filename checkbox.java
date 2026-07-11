import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class checkbox{
    public static void main(String[] args) {
        Frame frame = new Frame("check box");
    frame.setSize(500,500);
  
    Label la_1= new Label("Check");
    la_1.setBounds(100,100,70,30);

    Checkbox ch_1= new Checkbox("click");
    ch_1.setBounds(100,150,40,20);


    frame.add(la_1);
    frame.add(ch_1);
    frame.setLayout(null);
    frame.setVisible(true);

    ch_1.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                la_1.setText("C++ Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });    

    frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
}
}