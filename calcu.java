import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class calcul{
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

    Label la_4= new Label("Result:");
    la_4.setBounds(100,350,70,30);
    la_4.setBackground(Color.MAGENTA);
    Label txt_3 = new Label("");
     txt_3.setBounds(100,400,70,30);
    
    Button bt_1= new Button("Add");
    bt_1.setBounds(100,450,50,20);
    bt_1.setBackground(Color.orange);

    Button bt_2= new Button("sub");
    bt_2.setBounds(150,450,50,20);
    bt_2.setBackground(Color.orange);

    Button bt_3= new Button("mult");
    bt_3.setBounds(200,450,50,20);
    bt_3.setBackground(Color.orange);

    Button bt_4= new Button("div");
    bt_4.setBounds(250,450,50,20);
    bt_4.setBackground(Color.orange);

     Button bt_5= new Button("clear all");
    bt_5.setBounds(300,450,50,20);
    bt_5.setBackground(Color.orange);

    frame.add(bt_5);
    frame.add(bt_2);
    frame.add(bt_3);
    frame.add(bt_4);
    frame.add(la_4);
    frame.add(txt_3);
    frame.add(bt_1);
    frame.add(txt_2);
    frame.add(la_3);
    frame.add(txt_1);
    frame.add(la_2);
    frame.add(label1);
    frame.setLayout(null);
    frame.setVisible(true);

    bt_1.addActionListener(new ActionListener (){
        @Override
        public void actionPerformed(ActionEvent e){
            int num1 = Integer.parseInt(txt_1.getText());
            int num2 = Integer.parseInt(txt_2.getText());
            int sum = num1 + num2;
            txt_3.setText(String.valueOf(sum));
           }
    });
     bt_2.addActionListener(new ActionListener (){
        @Override
        public void actionPerformed(ActionEvent e){
            int num1 = Integer.parseInt(txt_1.getText());
            int num2 = Integer.parseInt(txt_2.getText());
            int sub = num1 - num2;
            txt_3.setText(String.valueOf(sub));
           }
    });
     bt_3.addActionListener(new ActionListener (){
        @Override
        public void actionPerformed(ActionEvent e){
            int num1 = Integer.parseInt(txt_1.getText());
            int num2 = Integer.parseInt(txt_2.getText());
            int mult = num1 * num2;
            txt_3.setText(String.valueOf(mult));
           }
    });
     bt_4.addActionListener(new ActionListener (){
        @Override
        public void actionPerformed(ActionEvent e){
            int num1 = Integer.parseInt(txt_1.getText());
            int num2 = Integer.parseInt(txt_2.getText());
            int div = num1 / num2;
            txt_3.setText(String.valueOf(div));
           }
    });

    bt_5.addActionListener(new ActionListener (){
        @Override
        public void actionPerformed(ActionEvent e){
            txt_1.setText("");
            txt_2.setText("");
            txt_3.setText("");
            
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
