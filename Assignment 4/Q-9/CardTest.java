import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CardTest implements ActionListener
{
    JFrame myFrame;
    JLabel label;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button1;
    JButton button2;
    JButton button3;

    CardLayout crd;
    JPanel panel;
    public void initGUI()
    {
        myFrame = new JFrame();
        panel = new JPanel();
        button11 = new JButton("button1");
        button12 = new JButton("button2");
        button13 = new JButton("button3");

        button1 = new JButton("Card1");
        button2 = new JButton("Card2");
        button3 = new JButton("Card3");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        // JPanel panel3 = new JPanel();
        // JPanel panel4 = new JPanel();
        BoxLayout BX = new BoxLayout(panel1, BoxLayout.LINE_AXIS);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setAlignmentY(Component.CENTER_ALIGNMENT);

        panel1.add(button11);
        panel1.add(button12);
        panel1.add(button13);

        panel1.setLayout(BX);
        panel2.add(button1);
        panel2.setLayout(new FlowLayout());
        panel1.add(panel2);
        crd = new CardLayout();
        panel.setLayout(crd);
        panel.add("a",panel1);
        panel.add("b",button2);
        panel.add("c",button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);


        myFrame.add(panel);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        myFrame.setSize(500,500);


    }
    public void actionPerformed(ActionEvent ae)
    {
        crd.next(panel);
    }
    public CardTest()
    {
        initGUI();
    }
    public static void main(String[] args) {
        CardTest ap = new CardTest();
    }
}