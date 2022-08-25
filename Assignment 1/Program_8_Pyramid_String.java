// 8. Write an interactive program to print a string entered in a pyramid form.
// For instance, the string “stream” has to be displayed as follows:
//       S
//      S t
//     S t r
//    S t r e
//   S t r e a
//  S t r e a m

import java.util.Scanner;

public class Program_8_Pyramid_String {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String str = sc.nextLine();
        sc.close();

        int i, j, row =str.length() ;
        for (i = 0; i < row; i++) 
        {
            for (j = row - i; j > 1; j--) 
            {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) 
            {
               
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
