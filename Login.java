import java.awt.Color;
import java.awt.Font;

import javax.swing.JComponent.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Login {
        public static void main(String[] args) {
            JFrame f = new JFrame("login for Register ");
            f.setLayout(null);
            f.setSize(600,450);

            JLabel label = new JLabel("Login form  ");
            label.setBounds(160,7,100,30);
            label.setBackground(Color.RED);
            f.add(label);

            JLabel name = new JLabel("User_name : ");
            name.setBounds(20,40,100,20);;
            f.add(name);
            JTextField field = new JTextField();        /// user  name 
            field.setBounds(140,40,150,20);
            f.add(field);

            JLabel pass = new JLabel("Password : ");
            pass.setBounds(20,70,100,20);
            f.add(pass);
            JPasswordField field1 = new JPasswordField();
            field1.setBounds(140,70,150,20); // password
            f.add(field1);

            JButton b = new JButton("Submit");
            b.setBounds(90,120,100,20);  // button 
            b.setBackground(Color.green);
            f.add(b);
            JButton b1 = new JButton("Save & Next");
            b1.setBounds(200,120,140,20);
            b1.setBackground(Color.gray);
            f.add(b1);


            JLabel label3 = new JLabel();
           label3.setBounds(40,160,450,30);
           label3.setFont(new Font ("Times New Roman", Font.BOLD,25));


           
            

            ActionListener submit = new ActionListener(){

                public void actionPerformed (ActionEvent e) {

                    String nam = field.getText();
                  String pwd =  field1.getText();
                   System.out.println(nam+"\n"+pwd);
                 
                   if(nam.equals("amichand")&&pwd.equals("123")){
                    label3.setText("sucessfully logged on ... "+nam+"\t"+pwd);
                   }
                   else{
                    label3.setText("try again");
                   }
                 
                }};
                f.add(label3);
                
              






                b.addActionListener(submit);

            f.setVisible(true);
        }
}
