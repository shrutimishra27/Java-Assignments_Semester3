import java.util.*;

abstract class Shape {
    public abstract void area();
}

class Circle extends Shape {
    private float radius;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        this.radius = sc.nextFloat();
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of circle: " + Math.PI * this.radius * this.radius);
    }
}

class Rectangle extends Shape {
    private float length, breadth;

    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle: ");
        this.length = sc.nextFloat();
        this.breadth = sc.nextFloat();
    }

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of rectangle: " + this.length * this.breadth);
    }
}

class Triangle extends Shape {
    private float side1, side2, side3;

    public Triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle: ");
        this.side1 = sc.nextFloat();
        this.side2 = sc.nextFloat();
        this.side3 = sc.nextFloat();
    }

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void area() {
        float s = (side1 + side2 + side3) / 2;
        System.out.println("Area of triangle: " + Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
    }
}

public class Main13 {
    public static void main(String[] args) {
        Circle obj1 = new Circle(1);
        Rectangle obj2 = new Rectangle(3, 4);
        Triangle obj3 = new Triangle(3, 4, 5);

        obj1.area();
        obj2.area();
        obj3.area();
    }
}