//5 Write a program which demonstrate conditional operator, 
// compound assignment operator, pre-post increment-decrement 
// operator bitwise operator and logical short circuit operator.

public class Program_5_Operators{
    public static void main(String args[]) {

        // conditional operators
        int x=5, y=4, z=7;  
        System.out.println(x>y && x>z);
        System.out.println(x>z || y<z); 

        // compound assignment opeator

        int a = 10;
        int c= 15 ;
  
        c += a ;
        System.out.println("c += a  = " + c );
  
        c -= a ;
        System.out.println("c -= a = " + c );
  
        c *= a ;
        System.out.println("c *= a = " + c );
  
        c /= a ;
        System.out.println("c /= a = " + c );
  
        c %= a ;
        System.out.println("c %= a  = " + c );

        // post and pre increment

        int i = 0;
        System.out.println("Post-Increment");
        System.out.println(i++);
  
        int j = 0;
        System.out.println("Pre-Increment");
        System.out.println(++j);

        // post and pre decrement

        i = 0;
        System.out.println("Post-Decrement");
        System.out.println(i++);
  
        j = 0;
        System.out.println("Pre-Decrement");
        System.out.println(++j);

        //bitwise operator

        x = 5;
        y = 7;

        System.out.println("a&b = " + (x & y));
 
        System.out.println("a|b = " + (x | y));
 
        System.out.println("a^b = " + (x ^ y));

        System.out.println("~a = " + ~x);

        
    }


    
}
