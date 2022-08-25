//1.Write a program which will greet you with your name.

/*
public class Program_1_Greeting{
	public static void main(String[] args){
		System.out.println("No. Of Commznd Line" + args.length);
		if(args.length > 0){
			System.out.println("Welcome to the world of Java " + args[0] +" " + args[1]);
		}
		else{
			System.out.println("Please input the CL Argument.");
		}
	}
}
*/

// OR
import java.util.Scanner;
public class Program_1_Greeting{
	public static void main(String[] args){
		
		System.out.println("Input name : ");

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		System.out.println("Welcome to the world of Java " + name +".");	
	}
}
