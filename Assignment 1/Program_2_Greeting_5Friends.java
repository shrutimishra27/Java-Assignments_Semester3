//2. Write a program which will print greeting message for your 5 friends. 
//Friends name should be entered as command line arguments.

public class Program_2_Greeting_5Friends{
	public static void main(String[] args){
		System.out.println("No. Of Commznd Line : " + args.length);
		if(args.length > 0){
			System.out.println("Welcome to the world of Java " + args[0] + ", " + args[1] + ", " + args[2] + ", " + args[3] + " and " + args[4] + ".");
		}
		else{
			System.out.println("Please input the CL Argument.");
		}
	}
}
