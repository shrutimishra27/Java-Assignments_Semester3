//14.Perform addition and multiplication of two matrix.
import java.util.Scanner;

class Program_14_Matrix_Operation{

	static void printMatrix(int M[][],int row,int col){

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(M[i][j] + " ");
			
			}
		System.out.println();
		}
	} 

	static int[][] addMatrix(int a[][], int b[][],int row,int col){

		int c[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	static int[][] intoMatrix(int a[][], int b[][],int row,int col){

		int d[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				for (int k = 0; k < row; k++) {
					d[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return d;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number of rows in 1st matrix : ");
		int row1 = sc.nextInt();
		System.out.print("Input number of coloumns in 1st matrix : ");
		int col1 = sc.nextInt();
		System.out.print("Input number of rows in 2nd matrix : ");
		int row2 = sc.nextInt();
		System.out.print("Input number of coloumns in 2nd matrix : ");
		int col2 = sc.nextInt();
		System.out.println("\n");

		if (row1 == row2 && col1 == col2) {

			int row = row1;//since both same
			int col = col1;//since both same

			int a[][] = new int[row1][col1];
			int b[][] = new int[row2][col2];
			
			//Taking Input in 1st Matrix
			for (int i = 1; i < row1+1; i++) {
				
				for (int j = 1; j < col1+1; j++) {
					
					System.out.print("For 1st Matrix :- Input element of row " + i + " column "+ j +" : ");
					a[i-1][j-1] = sc.nextInt();
				}
			}
			System.out.println("");

			//Taking Input in 2nd Matrix
			for (int i = 1; i < row2+1; i++) {
				
				for (int j = 1; j < col2+1; j++) {
					
					System.out.print("For 2nd Matrix :- Input element of row " + i + " column "+ j +" : ");
					b[i-1][j-1] = sc.nextInt();
				}
			}
			System.out.println("");

			//int row = row1;//since both same
			//int col = col1;//since both same

			//Printing Matrix 1
			System.out.println("MATRIX 1 \n");
			printMatrix(a,row,col);
			System.out.println("\n");

			//Printing Matrix 2
			System.out.println("MATRIX 2 \n");
			printMatrix(b,row,col);
			System.out.println("\n");

			//Performing Addition
			int c[][] = addMatrix(a,b,row,col);

		 	//Performing Multiplication
			int d[][] = intoMatrix(a,b,row,col);
			
			//Printing Addition Matrix
			System.out.println("Resultant Added Matrix is : \n");
			printMatrix(c,row,col);
			System.out.println("\n");

	 		//Printing Multiplied Matrix
			System.out.println("Resultant Multiplied Matrix is : \n");
			printMatrix(d,row,col); 
			System.out.println("\n");

		} else {
			System.out.println("Matrix sizes doesn't match");
			System.out.println("Task Not Possible");
		}

		
	}	

}