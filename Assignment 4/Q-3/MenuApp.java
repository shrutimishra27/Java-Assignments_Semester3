import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
class MenuApp implements ActionListener
{
    JFrame mFrame;
    JLabel label;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem1;
    JMenuItem menuItem2;
    JMenuItem menuItem3;
    JMenuItem menuItem4;
    JMenuItem menuItem5;
    Calendar calendar = Calendar.getInstance();
    public void initGUI()
    {
        mFrame = new JFrame();
        label = new JLabel("Default");
        menuBar = new JMenuBar();
        menu = new JMenu("Format");
        menuItem1 = new JMenuItem("Date");
        menuItem2 = new JMenuItem("DayOfMonth");
        menuItem3 = new JMenuItem("WeekNumber");
        menuItem4 = new JMenuItem("Hours");
        menuItem5 = new JMenuItem("DayofYear");
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        menu.add(menuItem5);
        menuBar.add(menu);
        mFrame.add(menuBar);
        mFrame.add(label);
        mFrame.setLayout(new FlowLayout());
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setSize(500,500);
        mFrame.setVisible(true);
        menuItem1.addActionListener(this);
        menuItem2.addActionListener(this);
        menuItem3.addActionListener(this);
        menuItem4.addActionListener(this);
        menuItem5.addActionListener(this);



    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == menuItem1)
        {
            int month = calendar.get(Calendar.MONTH)+1;
            String data = calendar.get(Calendar.DATE)+"-"+month+"-"+calendar.get(Calendar.YEAR);
            label.setText(data);

        }
        if(ae.getSource() == menuItem2)
        {
            String data=  calendar.get(Calendar.DAY_OF_MONTH)+"";
            label.setText(data);
        }
        if(ae.getSource() == menuItem3)
        {
            String data = calendar.get(Calendar.WEEK_OF_YEAR)+"";
            label.setText(data);
        }
        if(ae.getSource() == menuItem4)
        {
            String data = calendar.get(Calendar.HOUR_OF_DAY)+"";
            label.setText(data);
        }
        if(ae.getSource() == menuItem5)
        {
            String data = calendar.get(Calendar.DAY_OF_YEAR)+"";
            label.setText(data);
        }
    }
    public MenuApp()
    {
        initGUI();
    }
    public static void main(String[] args) {
        MenuApp ap  = new MenuApp();
    }
}