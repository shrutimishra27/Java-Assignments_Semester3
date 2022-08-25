//4. Write a program which will print result of student according to marks
// like A grade – marks 90 to 100, B grade – marks 80 to 90, 
// C grade- marks 60 to 80.D grade – marks 45 to 60.E grade – marks 35 to 45. 
// Fail – marks below 35.(Use Else-if ladder).

import java.util.Scanner;
public class Program_4_Student_Result{
    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks of student : ");

        int marks = input.nextInt();
        input.close();

        if(marks<=100 && marks>=90){
            System.out.println("A grade");
        }
        else if(marks<90 && marks>=80){
            System.out.println("B grade");
        }
        else if(marks<80 && marks>=60){
            System.out.println("C grade");
        }
        else if(marks<60 && marks>=45){
            System.out.println("D grade");
        }
        else if(marks<45 && marks>=35){
            System.out.println("E grade");
        }
        else if(marks<35){
            System.out.println("FAIL");
        }   
    }
}


