//15.Write a program which will overload method calculateArea which
// calculates area of different shapes like circle, rectangle and square.
 


public class Program_15_Area_Of_Shapes{

    public static void main(String args[]) 
	{
	   area(5);
	   area(11,12);
	   area(2.5);
    }

    static void area(int x)
    {
        System.out.println("the area of the square is "+ x*x +" sq units");
    }
    static void area(float x , float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    static void area(double x)
    {
        // double x = 3.
        double z =  x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }

}
