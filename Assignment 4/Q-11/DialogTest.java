import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DialogTest implements ActionListener {
    JFrame myFrame;
    JMenuBar menubar;
    JMenu menu;
    JMenuItem menuitem;

    public void initGUI() {
        myFrame = new JFrame();
        menubar = new JMenuBar();
        menuitem = new JMenuItem("Dialog");
        menu = new JMenu("MenuItem");
        menu.add(menuitem);
        menubar.add(menu);
        myFrame.add(menubar);
        myFrame.setSize(500, 500);
        myFrame.setLayout(new FlowLayout());
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        menuitem.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String choice;
        choice = JOptionPane.showInputDialog(myFrame, "Do you want to exit: ");
        if (choice.equals("yes")) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(myFrame, "Happy to see u here");
        }

    }

    public DialogTest() {
        initGUI();
    }

    public static void main(String[] args) {
        DialogTest ap = new DialogTest();
    }

}