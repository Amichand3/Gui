import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class One_one_off {
        static int flag = 0;
    void button(){

        JFrame frame = new JFrame("first");
        frame.setSize(200,100);
        frame.setLayout(null);

        JButton on_off = new JButton();
        on_off.setFont(new Font("Times New Roman",Font.BOLD,20));
        on_off.setBounds(10,10,100,20);
        on_off.setBackground(Color.YELLOW);
        frame.add(on_off);


        frame.setVisible(true);

        JFrame f2 = new JFrame("REPLYING");
        f2.setSize(670,300);
        f2.setLocation(200,100);
        f2.setLayout(null);

       JLabel p = new JLabel();
        p.setSize(200,200);
        p.setBounds(10,15,400,200);
      
        f2.add(p);
        ActionListener action = new ActionListener(){
            public void actionPerformed (ActionEvent e ){
                flag++;
               
                

                if(flag%2==0){
                    on_off.setText("OFF");
                    p.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\on.png"));
                }
               else if(flag%2!=0){
                on_off.setText("ON");
                p.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\off.gif"));
               }
              
            

        }};

        on_off.addActionListener(action);
        f2.setVisible(true);

    }
    
    public static void main(String[] args) {
        
            One_one_off obj = new One_one_off();
            obj.button();

    }
}
