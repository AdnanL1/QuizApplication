package quizapplication;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener {
    JLabel qno,question;
    String q[][]=new String[10][5];
    public static int count=0;
    public static int timer=15;
    String pa[][]=new String[10][1];
    JButton next,submit,lifeline;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup options;
    public static int ans_given=0;
    String qa[][]=new String[10][2];
    public static int score=0;
    String username;
    Login(String username)
    {
        this.username=username;
        setBounds(250,50,1440,950);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("quizapplication/images/Logo1.jpg"));
        JLabel l1=new JLabel(il);
        l1.setBounds(0,0,1440,392);
        add(l1);
        qno=new JLabel("");
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        qno.setBounds(100,450,40,30);
        add(qno);
        question=new JLabel("");
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        question.setBounds(150,450,700,30);
        add(question);
	q[0][0] = "Given number is -3?";
        q[0][1] = "Whole Number";
        q[0][2] = "Natural Number";
        q[0][3] = "Integer";
        q[0][4] = "None of the above";

        q[1][0] = "Evaluate (3)*(-2)";
        q[1][1] = "-6";
        q[1][2] = "-5";
        q[1][3] = "+5";
        q[1][4] = "+6";

        q[2][0] = "What is the Value of 77*10?";
        q[2][1] = "707";
        q[2][2] = "770";
        q[2][3] = "077";
        q[2][4] = "070";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "Evaluate -2-2";
        q[4][1] = "0";
        q[4][2] = "-4";
        q[4][3] = "+4";
        q[4][4] = "-2";

        q[5][0] = "Division by zero is";
        q[5][1] = "can't say";
        q[5][2] = "Not Possible";
        q[5][3] = "Possible";
        q[5][4] = "None of The Above";

        q[6][0] = "Evaluate the following -2212+2212";
        q[6][1] = "0";
        q[6][2] = "-2212";
        q[6][3] = "+2212";
        q[6][4] = "-4424";

        q[7][0] = "Area Of Rectangle With length and Breadth?";
        q[7][1] = "Length+Breadth";
        q[7][2] = "Length*Breadth";
        q[7][3] = "2*(Length+Breadth)";
        q[7][4] = "2*Length+Breadth";

        q[8][0] = "How many points does a line segment has?";
        q[8][1] = "2";
        q[8][2] = "1";
        q[8][3] = "No End Points";
        q[8][4] = "Infinite";

        q[9][0] = "What is square power of 12?";
        q[9][1] = "144";
        q[9][2] = "1212";
        q[9][3] = "169";
        q[9][4] = "2121";
        
	qa[0][1] = "Integer";
        qa[1][1] = "-6";
        qa[2][1] = "770";
        qa[3][1] = "Marker Insterface";
        qa[4][1] = "-4";
        qa[5][1] = "Not Possible";
        qa[6][1] = "0";
        qa[7][1] = "Length*Breadth";
        qa[8][1] = "2";
        qa[9][1] = "144";
        opt1=new JRadioButton("");
        opt1.setBounds(170,520,700,30);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        opt2=new JRadioButton("");
        opt2.setBounds(170,560,700,30);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        opt3=new JRadioButton("");
        opt3.setBounds(170,600,700,30);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        opt4=new JRadioButton("");
        opt4.setBounds(170,640,700,30);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        options=new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        next=new JButton("Next");
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(30,144,254));
        next.setForeground(Color.WHITE);
        next.setBounds(1100,550,200,40);
        add(next);
        next.addActionListener(this);
        submit=new JButton("submit");
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,254));
        submit.setForeground(Color.WHITE);
        submit.setBounds(1100,630,200,40);
        add(submit);
        submit.setEnabled(false);
        submit.addActionListener(this);
        lifeline=new JButton("50-50 lifeline");
        lifeline.setFont(new Font("Tahoma",Font.PLAIN,22));
        lifeline.setBackground(new Color(30,144,254));
        lifeline.setForeground(Color.WHITE);
        lifeline.setBounds(1100,710,200,40);
        add(lifeline);
        lifeline.addActionListener(this);
        start(0);
        setVisible(true);
    }
    public void start(int count)
    {
       
        qno.setText(""+(count+1)+".");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==next)
        {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given=1;
            if(options.getSelection()==null)
            {
                pa[count][0]="";
            }
            else
            {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            if(count==8)
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }
        else if(ae.getSource()==lifeline)
        {
         if(count==1 || count==6 || count==8 || count==9)
         {
             opt2.setEnabled(false);
             opt3.setEnabled(false);
         }
         else
         {
             opt1.setEnabled(false);
             opt4.setEnabled(false);
         }
         lifeline.setEnabled(false);
        }
        else if(ae.getSource()==submit)
        { 
            ans_given=1;
            if(options.getSelection()==null)
            {
               pa[count][0]="";
            }
            else
            {
                pa[count][0]=options.getSelection().getActionCommand();
            }
            for(int i=0;i<pa.length;i++)
            {
                if(pa[i][0].equals(qa[i][1]))
                        {
                            score+=10;
                        }
                else
                {
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username,score).setVisible(true);
            
        }
    }
    public static void main(String[] args)
    {
        new Login("");
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        String time="Time Left -- " + timer;
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
        
        if(timer>0)
        {
            g.drawString(time,1100,500);
        
        }
        else{
            g.drawString("Times Up",1100,500);
        }
        timer--;
        try
        {
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e)
        {
        
        }
        if(ans_given==1)
        {
            ans_given=0;
            timer=15;
        }
        else if(timer<0)
        {
            timer=15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if(count==8)
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9)
            {
                if(options.getSelection()==null)
                {
                    pa[count][0]="";
                }
                else
                {
                    pa[count][0]=options.getSelection().getActionCommand();
                }
                for(int i=0;i<pa.length;i++)
                {
                    if(pa[i][0].equals(qa[i][1]))
                    {
                        score+=10;
                    }
                    else
                    {
                        score+=0;
                    }
        
            }
                this.setVisible(false);
                new Score(username,score).setVisible(true);
        }
            else
            {
                if(options.getSelection()==null)
                {
                    pa[count][0]="";
                }
                else
                {
                    pa[count][0]=options.getSelection().getActionCommand();
                } 
            }
            count++;
            start(count);
        }
    }
}
