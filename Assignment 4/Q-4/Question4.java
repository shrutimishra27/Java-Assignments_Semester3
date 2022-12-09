import javax.swing.*;
import java.awt.*;
import java.util.*;

class Student {
    JLabel L1, L2, L3;
    JTextField tf1, tf2, tf3;
    
    public Student() { initGui(); }

    public void initGui() {
        Scanner sc = new Scanner(System.in);

        JFrame frame = new JFrame("Student Information");

        this.L1 = new JLabel("Roll Number: ");
        this.L2 = new JLabel("Name of the student: ");
        this.L3 = new JLabel("Branch: ");

        this.tf1 = new JTextField(20);
        this.tf2 = new JTextField(20);
        this.tf3 = new JTextField(20);

        System.out.print("Enter roll number: ");
        String rollNumber = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter branch: ");
        String branch = sc.nextLine();

        this.tf1.setText(rollNumber);
        this.tf2.setText(name);
        this.tf3.setText(branch);

        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(3, 2));
          container.setLayout(null);

        container.add(this.L1);
        container.add(this.tf1);
        container.add(this.L2);
        container.add(this.tf2);
        container.add(this.L3);
        container.add(this.tf3);
        
        frame.setSize(350, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Question4 {
    public static void main(String[] args) {
        new Student();
    }
}
