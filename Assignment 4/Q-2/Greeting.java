import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;

class Myframe extends JFrame implements ActionListener {
    Container c;
    JButton btn;
    Label l;
    Calendar calendar = Calendar.getInstance();

    public Myframe() {

        c = this.getContentPane();
        c.setLayout(null);
        btn = new JButton("GREET");
        l = new Label();
        btn.setBounds(135, 200, 100, 30);
        l.setBounds(100, 150, 300, 50);
        l.setText("Message");
        l.setFont(new Font("MV Boli",Font.BOLD,40));
        btn.addActionListener(this);
        c.add(btn);
        c.add(l);
    }

    public void actionPerformed(ActionEvent e) {


        int timeComp = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(timeComp);
        if(timeComp>=4 && timeComp<12)
        {
            l.setText("Good morning");
        }
        if(timeComp>=12 && timeComp<17)
        {
            l.setText("Good Afternoon");
        }
        if(timeComp>=17 && timeComp<20)
        {
            l.setText("Good Evening");
        }
        if((timeComp>=20 && timeComp<=24) || (timeComp>=0 && timeComp<4))
        {
            l.setText("Good Night");
        }


    }
}

class Greeting {
    public static void main(String[] args) {
        Myframe myFrame = new Myframe();
        myFrame.setSize(400, 400);
        myFrame.setLocation(100, 100);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}