import java.util.*;

 class Distance {
    public int feet, inch;

    public Distance() {
        this.feet = 4;
        this.inch = 3;
    }

    public Distance(int feet, int inch) {
        this.inch = inch % 12;
        this.feet = feet + inch / 12;
    }

    public Distance(Distance d) {
        this.feet = d.feet;
        this.inch = d.inch;
    }

    public void display() {
        System.out.println(this.feet + "'" + this.inch);
    }

    public void sum(Distance d) {
        this.inch = (this.inch + d.inch) % 12;
        this.feet = (this.feet + d.feet) + d.inch / 12;
    }

}

public class MainDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Default constructor:");
        Distance d1 = new Distance();
        d1.display();

        System.out.println("Parameterized constructor:");
        System.out.println("Enter distances in feet and inches respectively: ");
        Distance d2 = new Distance(sc.nextInt(), sc.nextInt());
        d2.display();

        System.out.println("Copy constructor:");
        Distance d3 = new Distance(d2);
        d3.display();

    }
}