import java.util.*;

class ABC {
    public int age;
    public int mark;
    public  int x = 5;

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        age = sc.nextInt();

        System.out.println("Enter mark: ");
        mark = sc.nextInt();
    }

    public void disp() {
        System.out.println("Age: " + age + "\nMark: " + mark + "\nX: " + x);
    }

    public void incr(int y) {
        System.out.println("Passed by value: " + ++y);
    }

    public void incr(ABC t) {
        System.out.println("Passed by reference: " + ++t.mark);
    }
}

public class MainAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ABC o1 = new ABC();
        ABC o2 = new ABC();

        try {
            o1.mark = sc.nextInt();
            o1.age = sc.nextInt();
        } catch(Exception e) {System.out.println(e);}
        
        o2.setData();

        o1.disp();
        o2.disp();

        int y = 8;
        o1.incr(y);
        System.out.println("y: " + y);

        o1.incr(o2);
        System.out.println("Mark: " + o2.mark);

        try {
            o1.x = 69;
        } catch(Exception e) {System.out.println(e);}
    }
}