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
public class Score extends JFrame implements ActionListener {
    JButton b1,b2;
    String username;
    int score;
Score(String username,int score)
{
    this.username=username;
    this.score=score;
    setBounds(600,150,750,550);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    ImageIcon li=new ImageIcon(ClassLoader.getSystemResource("quizapplication/images/R.png"));
    Image i2=li.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel i1=new JLabel(i3);
    i1.setBounds(0,200,300,250);
    add(i1);
    JLabel l2=new JLabel("Thank You " +username+" For Playing With Us");
    l2.setFont(new Font("Raleway",Font.PLAIN,26));
    
    l2.setBounds(45,30,700,30);
    add(l2);
    JLabel l3=new JLabel("Your Score is "+score);
    l3.setFont(new Font("Jokerman",Font.PLAIN,26));
    l3.setBounds(350,200,300,30);
    add(l3);
    b1=new JButton("Play Again");
    b1.setBackground(Color.BLUE);
    b1.setForeground(Color.WHITE);
    b1.setBounds(400,270,120,30);
    add(b1);
    b1.addActionListener(this);
    b2=new JButton("EXIT");
    b2.setBackground(Color.BLUE);
    b2.setForeground(Color.WHITE);
    b2.setBounds(570,270,120,30);
    add(b2);
    b2.addActionListener(this);
    
}
public static void main(String []args)
{
    new Score("",0).setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b1)
    {
    this.setVisible(false);
    new QuizApplication().setVisible(true);
    }
    else
    {
        System.exit(0);
    }
}
}
