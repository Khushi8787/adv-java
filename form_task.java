import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class form_task{
    public static void main(String[] args) {
        JFrame f_1= new JFrame("Form");
        
        JLabel l_1= new JLabel("First name");
        l_1.setBounds(30,30,75,30);
        l_1.setBackground(Color.GREEN);

        JTextField txt_1= new JTextField();
        txt_1.setBounds(30,65,100,30);
        txt_1.setBackground(Color.ORANGE);

           JLabel l_2= new JLabel("Middle name");
        l_2.setBounds(180,30,70,30);
        l_2.setBackground(Color.GREEN);

        JTextField txt_2= new JTextField();
        txt_2.setBounds(180,65,130,30);
        txt_2.setBackground(Color.ORANGE);

        JLabel l_3= new JLabel("Last name");
        l_3.setBounds(330,30,70,30);
        l_3.setBackground(Color.GREEN);

        JTextField txt_3= new JTextField();
        txt_3.setBounds(330,65,100,30);
        txt_3.setBackground(Color.ORANGE);

        
        JLabel l_4= new JLabel("Class");
        l_4.setBounds(30,100,70,25);
        l_4.setBackground(Color.GREEN);

        JTextField txt_4= new JTextField();
        txt_4.setBounds(30,130,70,30);
        txt_4.setBackground(Color.ORANGE);

        
        JLabel l_5= new JLabel("EMAIL");
        l_5.setBounds(180,100,70,30);
        l_5.setBackground(Color.GREEN);

        JTextArea txt_5= new JTextArea();
        txt_5.setBounds(180,130,250,30);
        txt_5.setBackground(Color.ORANGE);

         JLabel l_6= new JLabel("Adress");
        l_6.setBounds(30,150,100,30);
        l_6.setBackground(Color.GREEN);

        JTextArea txt_6= new JTextArea();
        txt_6.setBounds(30,200,400,70);
        txt_6.setBackground(Color.ORANGE);

        JButton btn= new JButton("CANCEL");
        btn.setBounds(228, 280, 90, 30);
        btn.setBackground(Color.green);

        JButton btn1= new JButton("SUBMIT");
        btn1.setBounds(320, 280, 80, 30);
        btn1.setBackground(Color.green);







     f_1.add(txt_6);
     f_1.add(l_6);
     f_1.add(btn);
     f_1.add(btn1);
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
     
     btn.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e){
        txt_1.setText("");
        txt_2.setText("");
        txt_3.setText("");
        txt_4.setText("");
        txt_5.setText("");
        txt_6.setText("");
        
       } 
     });
    }
}
