/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapplication;

/**
 *
 * @author MOHAMMED ADNAN
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class QuizApplication extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1;
    JButton b1,b2;
    QuizApplication()
    {
        setBounds(400,200,1200,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("quizapplication/images/Logo.jpg"));
        l1=new JLabel(i1);
        l1.setBounds(0,0,600,500);
        add(l1);
        l2=new JLabel("Java Project");
        l2.setFont(new Font("OCR A Extended",Font.BOLD,30));
        l2.setForeground(Color.blue);
        l2.setBounds(750,40,300,30);
        add(l2);
        l3=new JLabel("Enter Your Name:");
        l3.setFont(new Font("Mongolian Bouti",Font.BOLD,18));
        l3.setForeground(new Color(30,44,254));
        l3.setBounds(800,150,300,20);
        add(l3);
        t1=new JTextField();
        t1.setBounds(735,200,300,25);
        t1.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(t1);
        b1=new JButton("Rules");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(30,44,254));
        b1.setBounds(700,250,100,30);
        add(b1);
        b2=new JButton("Exit");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(30,44,254));
        b2.setBounds(960,250,100,30);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new QuizApplication();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2)
        {
           System.exit(0); 
        }
        else
        {
            String name=t1.getText();
            this.setVisible(false);
            new Rules(name);
        }
    }
}
