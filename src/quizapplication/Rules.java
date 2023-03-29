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
public class Rules extends JFrame implements ActionListener {
    JButton b1,b2;
    String username;
    Rules(String username)
    {
        this.username=username;
        setBounds(600,200,900,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel l1=new JLabel("Welcome " + username + " to My First Java Project");
        l1.setFont(new Font("Viner Hind ITC",Font.BOLD,25));
        l1.setBounds(50,20,700,30);
        add(l1);
        JLabel l2=new JLabel("");
        l2.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,16));
        l2.setBounds(20,70,600,350);
        l2.setText(
                "<html>"+
                     "1. You are trained to be a programmer not a story teller, answer point to point" + "<br><br>" +
                     "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                     "3. You may have lot of options in life but here all questions are compulsary" + "<br><br>" +
                     "4. Crying is allowed but please do it silently" + "<br><br>" +
                     "5. Only a fool asks and a wise answers" + "<br><br>" +
                     "6. Be wise, not Otherwise" + "<br><br>" +
                     "7. brace Yourself, this paper is not for faint hearted" + "<br><br>" +
                "</html>"
                );
        add(l2);
        b1=new JButton("Start");
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.setBounds(35,400,100,30);
        add(b1);
        b2=new JButton("Back");
        b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,400,100,30);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            this.setVisible(false);
            new Login(username);
        }
        else 
        {
            this.setVisible(false);
            new QuizApplication().setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        new Rules("");
    }
}
