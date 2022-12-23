import javax.swing.*;
import java.awt.*;
import java.util.*; 

class DrawOvalTest extends JFrame
{
    Random rnd = new Random();

    public DrawOvalTest()
    {
        setTitle("Oval Drawing");
        setSize(300,300);
        setContentPane(new PaintPanel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class PaintPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
            g.fillOval((getWidth()-200)/2,(getHeight()-100)/2, 200, 100);
        }
    }


    public static void main(String args[]) throws Exception
    {
        DrawOvalTest s = new DrawOvalTest();

        Runnable r = new Runnable() {
            public void run()
            {
                s.repaint();
            }
        };

        while(true)
        {
            Thread.sleep(1000);
            SwingUtilities.invokeLater(r);
        }
    }
}