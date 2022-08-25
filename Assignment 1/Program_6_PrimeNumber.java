//6. Write a program to print first N prime numbers.

import java.util.Scanner;

public class Program_6_PrimeNumber {
    static void isPrime(int n) {
        int p = 2;
        int i = 1;
        while (i <= n) {
            int flag = 1;
            for (int count = 2; count <= p - 1; count++) {
                if (p % count == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(p + " ");
                i++;
            }
            p++;

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number of prime terms you want: ");
        int N = sc.nextInt();
        System.out.println("First " + N + " prime numbers are :-");

        isPrime(N);
    }
}