// 16. Write a program which will demonstrate the java.util.Arrays class methods 
// like sort, copyOf, copyOfRange, fill, binarySearch, equals, toString etc.

import java.util.Arrays;

public class Program_16_java_util_Arrays {

    public static void main(String args[]) {

        int[] marks = { 20, 1, 11, 22, 77, 50, 0, 100 };

        Arrays.sort(marks);

        System.out.println(Arrays.toString(marks));

        Arrays.binarySearch(marks, 1);

        System.out.println(Arrays.toString(marks));

        int arr[] = Arrays.copyOf(marks, 10);

        System.out.println(Arrays.toString(marks));

        Arrays.toString(Arrays.copyOfRange(marks, 1, 3));

        Arrays.equals(marks, arr);

        Arrays.fill(marks, 5);

        System.out.println(Arrays.toString(marks));

        Arrays.copyOfRange(marks, 1, 3);

        System.out.println(Arrays.toString(marks));
    }
}
