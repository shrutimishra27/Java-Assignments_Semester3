//3. Write a program to accept a line and check how many consonants and vowels are there in line. 
import java.util.Scanner;

class Program_10_Consonents_and_Vowels{

	public static int Count(String line){
		int Vcount = 0;
		int Ccount = 0;
		String line1 = line.toLowerCase();
		int len = line1.length();
		

		for (int i = 0; i < len; i++) {
			char alpha = line1.charAt(i);
			if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
				Vcount++;
			}
			else if(alpha == ' '){
				continue;
			}
			else {
				Ccount++;
			}
		}
		System.out.println("The number of vowels in the statement are : " + Vcount);
		System.out.println("The number of Consonents in the statement are : " + Ccount);
		return 0;
	}

	public static void main(String[] args){
		
		System.out.println("Input the statement :");
		
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();

		System.out.println("The statement is : " + line);

		Count(line);



	}	

}