// Write a program which will create an array of 
// integers and perform following calculations
// 1.Sum 2.Product 3.NumDivBy15 4.MaxValue 5.MinValue 6.Sort

import java.util.Scanner;
import java.util.Arrays;

public class Program_7_Operations_on_Array {

	// Functions
	// 1.Sum
	public static int Sum(int Array[]) {
		int sum = 0;
		int n = Array.length;
		for (int i = 0; i < n; i++) {
			sum = sum + Array[i];
		}
		return sum;

	}

	// 2.Product
	public static int Product(int Array[]) {
		int product = 1;
		int n = Array.length;
		for (int i = 0; i < n; i++) {
			product = product * Array[i];
		}
		return product;
	}

	// 3.NumDivBy15
	/*
	 * public static int NumDivBy15(int Array[]){
	 * int[] tempArray = {};
	 * for (int i = 0; i < Array.length ; i++) {
	 * if (Array[i] % 3 == 0 && Array[i] % 5 == 0) {
	 * tempArray[i] = Array[i];
	 * }
	 * }
	 * for (int j = 0; j < tempArray.length; j++) {
	 * System.out.print(tempArray[j] + " ");
	 * }
	 * return 0;
	 * }
	 */

	// 4.MaxValue
	public static int MaxValue(int Array[]) {
		int maxNum = Array[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] > maxNum)
				maxNum = Array[i];
		}
		return maxNum;
	}

	// 5.MinValue
	public static int MinValue(int Array[]) {
		int minNum = Array[0];

		for (int i = 0; i < Array.length; i++) {
			if (Array[i] < minNum)
				minNum = Array[i];
		}
		return minNum;
		// Arrays.sort(Array);
		// System.out.println("Array after sorting: " + Arrays.toString(Array));
		// int maxNum = Array[Array.length - 1];
	}

	// 6.Sort
	public static int Sort(int Array[]) {
		Arrays.sort(Array);
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
		return 0;
	}

	public static void main(String[] args) {

		System.out.println("Input the length of array : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] MyArray = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter number at index " + i + ": ");
			MyArray[i] = scan.nextInt();
		}

		System.out.println("The Array is : ");

		for (int i = 0; i < n; i++) {
			System.out.print(MyArray[i] + " ");
		}
		System.out.println("\n");
		System.out.println("\n");

		System.out.println("Select the Operation\n1. Sum \n2. Product \n3. division \n4. MaxValue \n5. MinValue \n6. Sort \n");
		int choice = scan.nextInt();
    	int option = 1;

		// while(option == 0 || option == 1){
			switch (choice) 
			{
				case 1:
					// System.out.println("\n");
					System.out.println("The Sum of Array is :");
					System.out.println(Sum(MyArray));
					break;
				case 2:
					System.out.println("The Product of Array is :");
					System.out.println(Product(MyArray));
					break;
	
				case 3:
					System.out.println("The Array containing numbers divisible by 15 is :");
					// NumDivBy15(MyArray);
					break;
	
				case 4:
					System.out.println("The Maximum Value in Array is :");
					System.out.println(MaxValue(MyArray));
					break;
	
				case 5:
					System.out.println("The Minimum Value in Array is :");
					System.out.println(MinValue(MyArray));
					break;
	
				case 6:
					System.out.println("The Sorted Array is :");
					Sort(MyArray);
					break;
		
			}
		// 	scan.close();
		// 	System.out.print("\nDo you want to continue(Type 0 or 1)? : \n");
		// 	option = scan.nextInt();
		// }

	}
}
