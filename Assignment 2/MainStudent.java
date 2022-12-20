import java.util.*;

 class Student {
    private int rollNo;
    private String name;
    private float cgpa;

    public static int count = 0;

    public Student() {
        this.rollNo = 0;
        this.name = null;
        this.cgpa = 0.0f;
        count++;
    }

    public Student(int rollNo, String name, float cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
        count++;
    }

    public Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
        this.cgpa = s.cgpa;
        count++;
    }

    public void display() {
        System.out.println("Roll number: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.cgpa);
    }
}



public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1, s2, s3;

        System.out.println("Default constructor for s1:");
        s1 = new Student();
        s1.display();

        System.out.println("Parameterized constructor for s2:");
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter name of the student: ");
        String name = sc.next();
        System.out.print("Enter CGPA: ");
        float cgpa = sc.nextFloat();
        s2 = new Student(roll, name, cgpa);
        s2.display();
        
        System.out.println("Copy constructor for s3:");
        s3 = new Student(s2);
        s3.display();
    }
}