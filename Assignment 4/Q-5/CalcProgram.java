import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalcProgram implements ActionListener
{
    JFrame myFrame;
    JButton add;
    JButton sub;
    JButton mul;
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JLabel L1;
    JLabel L2;
    JLabel L3;
    JPanel p1;
    JPanel p2;
    JPanel panel;
    JButton clear;
    public void initGUI()
    {
        myFrame = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        panel = new JPanel();
        sub = new JButton("-");
        Container c = myFrame.getContentPane();
        add = new JButton("+");
        mul = new JButton("*");
        clear = new JButton("CLEAR");
        tf1 = new JTextField(15);
        tf2 = new JTextField(15);
        tf3 = new JTextField(15);

        L1 = new JLabel("Number1:");
        L2 = new JLabel("Number2:");
        L3 = new JLabel("Answer:");

        p1.add(L1);
        p1.add(tf1);
        p1.add(L2);
        p1.setLayout(new GridLayout(3,2));
        p1.add(tf2);
        p1.add(L3);
        p1.add(tf3);

        p2.add(add);
        p2.add(sub);
        p2.add(mul);
        p2.add(clear);

        p2.setLayout(new FlowLayout());
        c.add(panel);
        panel.setLayout(new BorderLayout());
        panel.add(p1,BorderLayout.NORTH);
        panel.add(p2,BorderLayout.SOUTH);

        myFrame.setSize(500,500);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        add.addActionListener(this);
        mul.addActionListener(this);
        sub.addActionListener(this);
        clear.addActionListener(this);


    }
    public void actionPerformed(ActionEvent ae)
    {
        String oper,result;
        int num1,num2,res;
        if(ae.getSource()==add)
        {
            oper = tf1.getText();
            num1 = Integer.parseInt(oper);

            oper = tf2.getText();
            num2 = Integer.parseInt(oper);

            res = num1 + num2;
            result = res+"";
            tf3.setText(result);


        }
        if(ae.getSource() == mul)
        {
            oper = tf1.getText();
            num1 = Integer.parseInt(oper);

            oper = tf2.getText();
            num2 = Integer.parseInt(oper);

            res = num1 * num2;
            result = res+"";
            tf3.setText(result);

        }
        if(ae.getSource() == sub)
        {
            oper = tf1.getText();
            num1 = Integer.parseInt(oper);

            oper = tf2.getText();
            num2 = Integer.parseInt(oper);

            res = num1 - num2;
            result = res+"";
            tf3.setText(result);
        }
        if(ae.getSource() == clear)
        {
            tf1.setText(" ");
            tf2.setText(" ");
            tf3.setText(" ");
        }

    }
    public CalcProgram()
    {
        initGUI();
    }
    public static void main(String[] args) {
        CalcProgram ap = new CalcProgram();
    }


}