//3. Write a program which will print properties like size, min-value and maxvalue of each primitive number types in java.
//(Use appropriate wrapper class).

import java.util.Scanner;

public class Program_3_Properties_of_Numbers{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 : Byte");
        System.out.println("2 : Short");
        System.out.println("3 : Int");
        System.out.println("4 : float");
        System.out.println("5 : Long");
        System.out.println("6 : Double");
        System.out.println("7 : Character");

        System.out.print(" enter number : ");
        int dh = sc.nextInt();
        // float f = sc.nextFloat();
        if (dh == 1) {
            System.out.println("Properties Of Byte : \nSize = " + Byte.SIZE + "\nMininum Value = " + Byte.MIN_VALUE
                    + "\nMaximum Value = " + Byte.MAX_VALUE);
        } 
        else if (dh == 2) {
            System.out.println("Properties Of Short : \nSize = " + Short.SIZE
                    + "\nMininum Value = " + Short.MIN_VALUE
                    + "\nMaximum Value = " + Short.MAX_VALUE);
        } 
        else if (dh == 3) {
            System.out.println("Properties Of Integer : \nSize = " + Integer.SIZE
                    + "\nMininum Value = " + Integer.MIN_VALUE
                    + "\nMaximum Value = " + Integer.MAX_VALUE);

        } 
        else if (dh == 4) {
            System.out.println("Properties Of Float : \nSize = " + Float.SIZE
                    + "\nMininum Value = " + Float.MIN_VALUE
                    + "\nMaximum Value = " + Float.MAX_VALUE);

        } 
        else if (dh == 5) {
            System.out.println("Properties Of Long : \nSize = " + Long.SIZE
                    + "\nMininum Value = " + Long.MIN_VALUE 
                    + "\nMaximum Value = " + Long.MAX_VALUE);
        } 
        else if (dh == 6) {
            System.out.println("Properties Of Double : \nSize = " + Double.SIZE
                    + "\nMininum Value = " + Double.MIN_VALUE
                    + "\nMaximum Value = " + Short.MAX_VALUE);
        } 
        else if (dh == 7) {
            System.out.println("Properties Of Character : \nSize = " + Character.SIZE);
        }

        sc.close();
    }
}
