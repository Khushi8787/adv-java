import java.awt.Color;
import javax.swing.*;

public class form_task{
    public static void main(String[] args) {
        JFrame f_1= new JFrame("Form");
        
        JLabel l_1= new JLabel("First name");
        l_1.setBounds(30,30,70,30);
        l_1.setBackground(Color.GREEN);

        JTextField txt_1= new JTextField();
        txt_1.setBounds(30,65,70,30);
        txt_1.setBackground(Color.ORANGE);

           JLabel l_2= new JLabel("Middle name");
        l_2.setBounds(130,30,100,30);
        l_2.setBackground(Color.GREEN);

        JTextField txt_2= new JTextField();
        txt_2.setBounds(130,65,70,30);
        txt_2.setBackground(Color.ORANGE);

        JLabel l_3= new JLabel("Last name");
        l_3.setBounds(230,30,70,30);
        l_3.setBackground(Color.GREEN);

        JTextField txt_3= new JTextField();
        txt_3.setBounds(230,65,70,30);
        txt_3.setBackground(Color.ORANGE);

        
        JLabel l_4= new JLabel("Class");
        l_4.setBounds(30,90,70,30);
        l_4.setBackground(Color.GREEN);

        JTextField txt_4= new JTextField();
        txt_4.setBounds(30,90,70,30);
        txt_4.setBackground(Color.ORANGE);

        
        JLabel l_5= new JLabel("EMAIL");
        l_5.setBounds(130,90,70,30);
        l_5.setBackground(Color.GREEN);

        JTextField txt_5= new JTextField();
        txt_5.setBounds(130,90,70,30);
        txt_5.setBackground(Color.ORANGE);

     f_1.add(l_4);
     f_1.add(l_5);
     f_1.add(txt_4);
     f_1.add(txt_5);
     f_1.add(l_3);
     f_1.add(txt_3);
     f_1.add(txt_2);
     f_1.add(l_2);  
     f_1.add(txt_1);
     f_1.add(l_1);   
     f_1.setSize(500,500);
     f_1.setLayout(null);
     f_1.setVisible(true);
    }
}
