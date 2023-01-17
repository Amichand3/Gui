import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CalculatorGui {
static int num1 ,num2,result;
    public static void main(String[] args) {
        
        JFrame fm = new JFrame("CALCULATOR");
        fm.setSize(600,400);
        fm.setLayout(null);

        JTextField text = new JTextField();
        text.setSize(250,400);
        text.setBounds(100,50,100,40);
        fm.add(text);

        JPanel panel = new JPanel();
        panel.setSize(200,200);
        panel.setBounds(50,100,400,200);
        panel.setLayout(new GridLayout(5,4));
        fm.add(panel);
        JButton b = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2= new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("00");
        JButton ba = new JButton("+");
        JButton bs = new JButton("-");
        JButton bm = new JButton("*");
        JButton bd = new JButton("/");
        JButton bequ = new JButton("=");
        JButton bdel = new JButton("Delete");
        JButton clr = new JButton("clr");
       



   
    panel.add(b);
    panel.add(b1);
    panel.add(b2);
    panel.add(b3);
    panel.add(b4);
    panel.add(b5);
    panel.add(b6);
    panel.add(b7);
    panel.add(b8);
    panel.add(b9);
    panel.add(b10);
    panel.add(ba);
    panel.add(bs);
    panel.add(bm);
    panel.add(bd);
    panel.add(bequ);
    panel.add(bdel);
    panel.add(clr);


        ActionListener action = new ActionListener(){
            public void actionPerformed (ActionEvent e){
                
                text.setText(b.getText());
                //Integer.parseInt(b1.getText());
        } };
        ActionListener action1 = new ActionListener(){
            public void actionPerformed (ActionEvent e){
                text.setText(b1.getText());
        } };
        ActionListener action2 = new ActionListener(){
            public void actionPerformed (ActionEvent e){
                text.setText(b2.getText());
        } };

        b.addActionListener(action);
        b1.addActionListener(action1);
        b2.addActionListener(action2);
    
    fm.setVisible(true);

    }
    
}
