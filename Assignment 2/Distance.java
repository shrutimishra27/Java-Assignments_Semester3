

import java.util.*;

public class Distance {
    int feet;
    int inches;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        feet = sc.nextInt();
        System.out.print("Enter distance in inches: ");
        inches = sc.nextInt();

        if(inches >= 12) {
            feet += inches / 12;
            inches %= 12;
        }
    }

    void display() {
        System.out.println("Distance : " + feet + "'" + inches);
    }

    void add(Distance d) {
        feet += d.feet;
        inches += d.inches;

        if(inches >= 12) {
            inches -= 12;
            feet += 1;
        }
    }

    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        System.out.println("For first object");
        d1.getData();
        d1.display();
        System.out.println("For second object");
        d2.getData();
        d2.display();
        System.out.println("Addition");
        d1.add(d2);
        d1.display();
    }
}