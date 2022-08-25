//12.Create a class which ask the user to enter a sentence, and it should display count of each 
//vowel type in the sentence. Display the total count of each vowel and digits for all sentences.

import java.util.Scanner;

class Program_12_Vowels_in_Sentence{

	public static int Count(String line){
		int Acount= 0,Ecount= 0,Icount= 0,Ocount= 0,Ucount= 0,Numcount = 0;
		String line1 = line.toLowerCase();
		int len = line1.length();
	
		for (int i = 0; i < len; i++) {
			char alpha = line1.charAt(i);
			
			if (alpha == 'a') {Acount++;}
			else if(alpha == 'e') {Ecount++;}
			else if(alpha == 'i') {Icount++;}
			else if(alpha == 'o') {Ocount++;}
			else if(alpha == 'u') {Ucount++;}
			else if(alpha >= 48 && alpha <= 57) {Numcount++;}
			else if(alpha == ' ') {continue;}
		else { /*nothing*/ }
		}
		System.out.println("The number of a in the statement are : " + Acount);
		System.out.println("The number of e in the statement are : " + Ecount);
		System.out.println("The number of i in the statement are : " + Icount);
		System.out.println("The number of o in the statement are : " + Ocount);
		System.out.println("The number of u in the statement are : " + Ucount);
		System.out.println("The number of digits in the statement are : " + Numcount);
		return 0;
	}

	public static void main(String[] args){
		
		System.out.println("Input the statement :");
		
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();

		//System.out.println("The statement is : " + line);

		Count(line);



	}	

}