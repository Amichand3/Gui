import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class On_Offgui {

    void frame1(){
        JFrame f1 = new JFrame("frame 1 ");
        f1.setSize(600,450);
        f1.setLayout(null);
        
        JButton bt = new JButton("ON");
        bt.setBounds(20,50,100,20);
        f1.add(bt);

        JButton bt1 = new JButton("OFF");
        bt1.setBounds(140,50,100,20);
        f1.add(bt1);

        f1.setVisible(true);

        JFrame f2 = new JFrame("FRAME 2");
        f2.setSize(500,350);
        f2.setLayout(null);

        
       
        JLabel label = new JLabel();
        label.setBounds(20,50,100,20);
        label.setBackground(Color.red);
        f2.add(label);
        f2.setLocation(300,10);
        
       
        f2.setVisible(true);
        ActionListener action = new ActionListener(){

            public void actionPerformed (ActionEvent e) {
               Object obj = e.getSource();
               
               if(obj==bt){label.setText("ON");}
               
               else if(obj==bt1){label.setText("OFF");}
                
                
                

            }};

           
            bt.addActionListener(action);
            bt1.addActionListener(action);
    }
    
    public static void main(String[] args) {
        
       On_Offgui g = new On_Offgui();
       g.frame1();
    
}
}