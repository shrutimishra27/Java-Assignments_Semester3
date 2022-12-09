import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Question8 implements KeyListener, ActionListener {
    static JFrame frame;
    static JTextField input, output;

    public static void main(String[] args) {
        frame = new JFrame("Question 8");
        frame.setSize(500, 500);
        frame.setLayout(null);
        output = new JTextField();
        output.setBounds(0, 0, 500, 50);
        frame.add(output);
        input = new JTextField();
        input.setBounds(0, 400, 500, 50);
        frame.add(input);
        JButton exit = new JButton("Exit");
        exit.setBounds(220, 200, 60, 30);
        frame.add(exit);
        Question8 obj = new Question8();
        input.addKeyListener(obj);
        exit.addActionListener(obj);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        frame.dispose();
    }
    
    public void keyReleased(KeyEvent e) {
        output.setText("");
        output.setText("Key Released : "+e.getKeyCode());
        if(Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if(Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }
    
    public void keyPressed(KeyEvent e) {
        output.setText("");
        output.setText("Key Pressed : "+e.getKeyCode());
        if(Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if(Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }

    public void keyTyped(KeyEvent e) {
        output.setText("");
        output.setText("Key Typed : "+e.getKeyChar());
    }
}
