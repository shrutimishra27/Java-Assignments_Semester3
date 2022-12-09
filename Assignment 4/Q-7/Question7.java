import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question7 extends JFrame implements MouseListener {
    Label l;

    Question7() {
        addMouseListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question7();
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
        System.out.println("Mouse clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
        System.out.println("Mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
        System.out.println("Mouse exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
        System.out.println("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
        System.out.println("Mouse released");
    }

}
