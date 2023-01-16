import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;



public class On_Offgui {

    void frame1(){
        JFrame f1 = new JFrame("frame 1 ");
        f1.setSize(600,300);
        f1.setLayout(null);
        
        JButton on = new JButton("ON");
        on.setBounds(20,50,100,20);
        f1.add(on);

        JButton off = new JButton("OFF");
        off.setBounds(140,50,100,20);
        f1.add(off);

        f1.setVisible(true);

        JFrame f2 = new JFrame("FRAME 2");
        f2.setSize(500,350);
        f2.setLayout(null);
        f2.setLocation(600,10);
        
       
        JLabel label = new JLabel();
        label.setBounds(20,50,100,100);
        label.setBackground(Color.red);
        f2.add(label);
         

       JLabel image = new JLabel();
       image.setBounds(10,0,400,400);
       

        
       
        f2.setVisible(true);
        ActionListener action = new ActionListener(){

           

            public void actionPerformed (ActionEvent e) {
                 
               Object obj = e.getSource();
               if(obj==on){label.setText("ON");
               image.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\on.png"));
            }
               
               else if(obj==off){label.setText("OFF");
               image.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\off.gif"));}
              
                
                

            }};

           f2.add(image);
           on.addActionListener(action);
            off.addActionListener(action);
    }
    
    public static void main(String[] args) throws IOException {
        
       On_Offgui g = new On_Offgui();
       g.frame1();
    
}
}